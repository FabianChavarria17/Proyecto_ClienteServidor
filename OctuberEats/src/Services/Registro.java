package Services;

import Modulos.Negocio;
import Modulos.Usuario;

public class Registro
{
    public void registrarUsuario(Usuario usuario){
        //Implementar la logica de registro
        System.out.println("Usuario registrado: "+ usuario.getNombre()+" Como: "+usuario.getRol());
        //Almacenar en lista o base de datos
    }

    public void registrarNegocio(Negocio negocio){
        System.out.println("Negocio registrado: ");
        //Pendiente registro de negocios
    }
}
