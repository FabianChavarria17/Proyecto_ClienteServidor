package Modulos;

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
            restaurantes.add(new Restaurante("El sabor", " San José, Sabana", "elsabor@food.com", "Mexicana"));
            restaurantes.add(new Restaurante("Satay ", " Oxigeno segunda planta", "satay@food.com","China"));
            restaurantes.add(new Restaurante("Peperonni's ", "Heredias, San Isidro ", "peperoni's@food.com", "Pizzeria"));
        }

        public static List<Restaurante> getRestaurantes(){
            return restaurantes;
        }
    }
}