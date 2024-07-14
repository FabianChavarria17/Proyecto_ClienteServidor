package Modulos;

/**
 * @Augusto M
 */
public class Restaurante implements Negocio {
    private String nombre;
    private String direccion;
    private String email;
    private String categoria;

    public Restaurante(String nombre, String direccion, String email, String categoria) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.categoria = categoria;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }
}