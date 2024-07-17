import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {
    private JButton searchButton;
    private JButton orderButton;
    private JTextArea displayArea;

    public Interface() {
        setTitle("Sistema de Pedidos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior para los botones
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        // Botón para buscar restaurantes
        searchButton = new JButton("Buscar Restaurantes");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarRestaurantes();
            }
        });

        // Botón para realizar pedidos
        orderButton = new JButton("Realizar Pedido");
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarPedido();
            }
        });

        // Añadir botones al panel superior
        topPanel.add(searchButton);
        topPanel.add(orderButton);

        // Área de texto para mostrar información
        displayArea = new JTextArea();
        displayArea.setFont(new Font("Arial", Font.PLAIN, 14));
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);

        // Scroll pane para la área de texto
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Añadir paneles al frame
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void buscarRestaurantes() {
        // Lógica para buscar restaurantes
        displayArea.setText("Lista de restaurantes disponibles...");
    }

    private void realizarPedido() {
        // Lógica para realizar un pedido
        displayArea.setText("Realizando pedido...");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Interface frame = new Interface();
                frame.setVisible(true);
            }
        });
    }
}
