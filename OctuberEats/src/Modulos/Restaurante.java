package Modulos;

import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;

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

    public class datosRestaurantes{
        private static List<Restaurante> restaurantes = new ArrayList<>();

        static {
            restaurantes.add(new Restaurante("Restaurante A", "Calle 1", "Res1@comida.com", "Mexicana"));
            restaurantes.add(new Restaurante("Restaurante B", "Calle 2", "Res2@comida.com","China"));
            restaurantes.add(new Restaurante("Restaurante 3", "Calle 3", "Res3@comida.com", "Pizzeria"));
        }

        public static List<Restaurante> getRestaurantes(){
            return restaurantes;
        }
    }
}