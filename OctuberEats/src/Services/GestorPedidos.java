package Services;
import Modulos.Negocio;
import Modulos.Pedido;
import Modulos.Usuario;
import java.util.ArrayList;
import java.util.List;


/**
 * @Augusto M
 */



public class GestorPedidos {
    private List<Pedido> pedidos;
    private List<PedidoListener> pedidoListeners;

    public GestorPedidos() {
        this.pedidos = new ArrayList<>();
        this.pedidoListeners = new ArrayList<>();
    }

    public void addPedidoListener(PedidoListener listener) {
        pedidoListeners.add(listener);
    }

    public void realizarPedido(Usuario cliente, Negocio restaurante, double precio) {
        int nuevoId = pedidos.size() + 1;
        Pedido pedido = new Pedido(nuevoId, cliente, restaurante, precio);
        pedidos.add(pedido);
        notifyPedidoRealizado(pedido);
        // Iniciar la simulación de la entrega del pedido
        simularProcesoEntrega(pedido);
    }

    public void actualizarEstado(int idPedido, String nuevoEstado) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == idPedido) {
                pedido.setEstado(nuevoEstado);
                notifyEstadoPedidoActualizado(pedido);
                break;
            }
        }
    }

    public List<Pedido> getPedidosUsuario(Usuario usuario) {
        List<Pedido> pedidosUsuario = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().equals(usuario)) {
                pedidosUsuario.add(pedido);
            }
        }
        return pedidosUsuario;
    }

    private void notifyPedidoRealizado(Pedido pedido) {
        for (PedidoListener listener : pedidoListeners) {
            listener.onPedidoRealizado(pedido);
        }
    }

    private void notifyEstadoPedidoActualizado(Pedido pedido) {
        for (PedidoListener listener : pedidoListeners) {
            listener.onEstadoPedidoActualizado(pedido);
        }
    }

    private void simularProcesoEntrega(Pedido pedido) {
        new Thread(() -> {
            try {
                String[] estados = {"aceptado", "en camino", "entregado"};
                for (String estado : estados) {
                    Thread.sleep(10000); // Esperar 10 segundos entre estados
                    actualizarEstado(pedido.getId(), estado);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public interface PedidoListener {
        void onPedidoRealizado(Pedido pedido);
        void onEstadoPedidoActualizado(Pedido pedido);
    }
}