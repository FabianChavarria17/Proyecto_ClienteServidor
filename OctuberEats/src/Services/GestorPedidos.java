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

    public GestorPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void realizarPedido(Usuario cliente, Negocio restaurante) {
        int nuevoId = pedidos.size() + 1;
        Pedido pedido = new Pedido(nuevoId, cliente, restaurante);
        pedidos.add(pedido);
        System.out.println("Pedido realizado por " + cliente.getNombre() + " al restaurante " + restaurante.getNombre());
    }

    public void actualizarEstado(int idPedido, String nuevoEstado) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == idPedido) {
                pedido.setEstado(nuevoEstado);
                System.out.println("Estado actualizado del pedido #" + idPedido + ": " + nuevoEstado);
                // Aquí se debería conectar con la base de datos para actualizar el estado del pedido
                break;
            }
        }
    }
}