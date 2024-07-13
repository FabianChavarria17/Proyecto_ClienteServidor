
import Modulos.Usuario;
import Services.Registro;

public class Main {
    public static void main(String[] args)
    {
        Usuario cliente = new Usuario("1", "Dirección 1", "password123", "Cliente1", "cliente1@example.com", Usuario.Rol.CLIENTE);
        Usuario repartidor = new Usuario("2", "Dirección 2", "password456", "Repartidor1", "repartidor1@example.com", Usuario.Rol.REPARTIDOR);

        Registro registro = new Registro();
        registro.registrarUsuario(cliente);
        registro.registrarUsuario(repartidor);

        // Continuar con la implementación del resto de la aplicación
    }
}