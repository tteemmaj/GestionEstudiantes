package app;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import UI.GestionVentana; 


public class Gestion_Estudiante {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            GestionVentana gestionVentana = new GestionVentana();

            JFrame ventana = new JFrame("Gestión");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.add(gestionVentana);
            ventana.pack();
            ventana.setLocationRelativeTo(null); // Centrar en pantalla
            ventana.setVisible(true);
        });
                
        
    }
}