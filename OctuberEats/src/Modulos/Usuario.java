package Modulos;

import Security.Seguridad;

import javax.imageio.ImageReadParam;

public class Usuario extends PersonaImpl
{
    private Rol rol;

    public enum Rol {
        CLIENTE,
        REPARTIDOR
    }

    public Usuario(String userID, String direccion, String contrasena, String nombre, String correo, Rol rol) {
        super(userID, direccion, contrasena, nombre, correo);
        this.rol = rol;
    }

    // Getter y Setter para el rol
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
