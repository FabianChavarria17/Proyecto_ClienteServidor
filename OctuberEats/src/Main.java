
import InterfazGrafica.RegistoUserUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Iniciando registro");
                RegistoUserUI registoUserUI = new RegistoUserUI();
                registoUserUI.setVisible(true);
            }
        });


        /*Usuario cliente = new Usuario("1", "Dirección 1", "password123", "Cliente1", "cliente1@example.com", Usuario.Rol.CLIENTE);
        Negocio restaurante = new Restaurante("Mi Restaurante", "Dirección del Restaurante", "restaurante@example.com", "Comida Rápida");

        // Registrar el cliente y el restaurante (simulado)
        Registro registro = new Registro();
        registro.registrarUsuario(cliente);
        registro.registrarNegocio(restaurante);

        // Crear gestor de pedidos
        GestorPedidos gestorPedidos = new GestorPedidos();

        Interface grafico = new Interface();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Interface frame = new Interface();
                frame.setVisible(true);
            }
        });

        // Agregar listeners para manejar eventos de pedidos
        gestorPedidos.addPedidoListener(new GestorPedidos.PedidoListener() {
            @Override
            public void onPedidoRealizado(Pedido pedido) {
                // Lógica para manejar la notificación de pedido realizado
                System.out.println("Nuevo pedido realizado: #" + pedido.getId());
            }

            @Override
            public void onEstadoPedidoActualizado(Pedido pedido) {
                // Lógica para manejar la notificación de estado de pedido actualizado
                System.out.println("Estado del pedido #" + pedido.getId() + " actualizado a: " + pedido.getEstado());
            }
        });

        // Simulación de realizar y actualizar pedidos
        gestorPedidos.realizarPedido(cliente, restaurante);
        gestorPedidos.actualizarEstado(1, "aceptado");*/
    }
}