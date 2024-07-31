
import InterfazGrafica.RegistoUserUI;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Iniciando registro");
                RegistoUserUI registoUserUI = new RegistoUserUI();
                registoUserUI.setVisible(true);
            }
        });
    }
}