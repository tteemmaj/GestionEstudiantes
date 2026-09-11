package app;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import UI.GestionVentana; 


import Modelo.*;

public class Gestion_Estudiante {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            // Instanciar tu panel del paquete UI
            GestionVentana gestionVentana = new GestionVentana();

            // Crear el JFrame contenedor
            JFrame ventana = new JFrame("Gestión");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.add(gestionVentana);
            ventana.pack();
            ventana.setLocationRelativeTo(null); // Centrar en pantalla
            ventana.setVisible(true);
        });
                
        
    }
}