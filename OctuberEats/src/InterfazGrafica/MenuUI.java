package InterfazGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUI extends JFrame
{
    //Codigo por Yulianaaf
    private JTextField barraBusqueda;
    private JButton searchButton;
    private JButton btnInicio;
    private JButton btnCarrito;
    private JButton btnPedidos;
    private JButton btnCuenta;
    private JPanel resultsPanel;
    private JTextArea displayArea;

    public MenuUI() {
        setTitle("October Eats - Menú Principal");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear panel principal
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Crear panel de búsqueda
        JPanel searchPanel = new JPanel();
        barraBusqueda = new JTextField(20);
        searchButton = new JButton("Buscar");
        searchPanel.add(new JLabel("Buscar restaurante:"));
        searchPanel.add(barraBusqueda);
        searchPanel.add(searchButton);

        // Crear panel de botones
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        btnInicio = new JButton("Inicio");
        btnCarrito = new JButton("Carrito");
        btnPedidos = new JButton("Pedidos");
        btnCuenta = new JButton("Cuenta");
        buttonPanel.add(btnInicio);
        buttonPanel.add(btnCarrito);
        buttonPanel.add(btnPedidos);
        buttonPanel.add(btnCuenta);

        // Crear panel de resultados
        resultsPanel = new JPanel();
        resultsPanel.setLayout(new BoxLayout(resultsPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(resultsPanel);

        // Añadir componentes al panel principal
        mainPanel.add(searchPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Añadir panel principal al frame
        add(mainPanel);

        // Añadir listeners a los botones
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarRestaurantes();
            }
        });

        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInicio();
            }
        });

        btnCarrito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCarrito();
            }
        });

        btnPedidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPedidos();
            }
        });

        btnCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarCuenta();
            }
        });
    }

    private void buscarRestaurantes() {
        JOptionPane.showMessageDialog(null, "Cargando...");
    }

    private void mostrarInicio() {
        JOptionPane.showMessageDialog(null, "Bienvenido al menu principal");
    }

    private void mostrarCarrito() {
        JOptionPane.showMessageDialog(null, "Cargando...");
    }

    private void mostrarPedidos() {
        JOptionPane.showMessageDialog(null, "Cargando...");
    }

    private void mostrarCuenta(){
        JOptionPane.showMessageDialog(null, "Cargando...");
    }

}
