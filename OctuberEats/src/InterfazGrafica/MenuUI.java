package InterfazGrafica;

import Modulos.Restaurante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
        String busqueda = barraBusqueda.getText();
        resultsPanel.removeAll();
        if(busqueda != null && !busqueda.trim().isEmpty()){
            List<Restaurante> resultados = Restaurante.datosRestaurantes.getRestaurantes().stream()
                    .filter(r -> r.getNombre().toLowerCase().contains(busqueda.toLowerCase())
                            || r.getCategoria().toLowerCase().contains(busqueda.toLowerCase()))
                    .toList();

            if(resultados.isEmpty()){
                resultsPanel.add(new JLabel("No se encontraron restaurantes"));
            }else {
                StringBuilder sb = new StringBuilder();
                for(Restaurante restaurante : resultados){
                    System.out.println("Cargando datos del restaurante...");
                    JTextArea restauranteInfo = new JTextArea();
                    restauranteInfo.setText("Nombre: "+ restaurante.getNombre() +"\n "+
                                            "Direccion: "+ restaurante.getDireccion()+"\n"+
                                            "Email: "+restaurante.getEmail()+"\n"+
                                            "Categoría: "+restaurante.getCategoria()+"\n");
                    restauranteInfo.setEditable(false);
                    resultsPanel.add(restauranteInfo);
                }
            }
        }else{
            resultsPanel.add(new JLabel("Input invalido"));
        }
        resultsPanel.revalidate();
        resultsPanel.repaint();
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
