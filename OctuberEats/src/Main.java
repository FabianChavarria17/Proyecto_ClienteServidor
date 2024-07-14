
import Modulos.Usuario;
import Modulos.Restaurante;
import Services.Registro;
import Services.GestorPedidos;

public class Main {
    public static void main(String[] args)
    {
        Usuario cliente = new Usuario("1", "Dirección 1", "password123", "Cliente1", "cliente1@example.com", Usuario.Rol.CLIENTE);
        Usuario repartidor = new Usuario("2", "Dirección 2", "password456", "Repartidor1", "repartidor1@example.com", Usuario.Rol.REPARTIDOR);

        Registro registro = new Registro();
        GestorPedidos gestorPedidos = new GestorPedidos();
        registro.registrarUsuario(cliente);
        registro.registrarUsuario(repartidor);
        Restaurante restaurante1 = new Restaurante("Restaurante A", "Dirección A", "restauranteA@example.com", "Comida rápida");
        Restaurante restaurante2 = new Restaurante("Restaurante B", "Dirección B", "restauranteB@example.com", "Pizzería");

        registro.registrarNegocio(restaurante1);
        registro.registrarNegocio(restaurante2);

        gestorPedidos.realizarPedido(cliente, restaurante1);
        gestorPedidos.realizarPedido(repartidor, restaurante2);

    }
}