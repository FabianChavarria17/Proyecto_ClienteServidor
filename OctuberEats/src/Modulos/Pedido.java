package Modulos;

/**
 * @Augusto M
 */
public class Pedido {
    private int id;
    private Usuario cliente;
    private Negocio restaurante;
    private String estado; // Puede ser "pendiente", "aceptado", "en camino", "entregado", etc.

    public Pedido(int id, Usuario cliente, Negocio restaurante) {
        this.id = id;
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.estado = "pendiente"; // Estado inicial del pedido
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Negocio getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Negocio restaurante) {
        this.restaurante = restaurante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}