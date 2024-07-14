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

    public void realizarPedido(Usuario cliente, Negocio restaurante) {
        int nuevoId = pedidos.size() + 1;
        Pedido pedido = new Pedido(nuevoId, cliente, restaurante);
        pedidos.add(pedido);
        notifyPedidoRealizado(pedido);
    }

    public void actualizarEstado(int idPedido, String nuevoEstado) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == idPedido) {
                pedido.setEstado(nuevoEstado);
                // Notificar a los listeners que se actualizó el estado de un pedido
                notifyEstadoPedidoActualizado(pedido);
                break;
            }
        }
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
    public interface PedidoListener {
        void onPedidoRealizado(Pedido pedido);

        void onEstadoPedidoActualizado(Pedido pedido);
    }
}