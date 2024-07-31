package Modulos;

public class Pedido {
    private int id;
    private Usuario cliente;
    private Negocio restaurante;
    private String estado;
    private double precio;

    public Pedido(int id, Usuario cliente, Negocio restaurante, double precio) {
        this.id = id;
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.estado = "pendiente"; // Estado inicial del pedido
        this.precio = precio;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public Usuario getCliente() {
        return cliente;
    }


    public Negocio getRestaurante() {
        return restaurante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

}