/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.academico;

import com.mycompany.academico.ui.LoginFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Coder
 */
public class Academico {

    public static void main(String[] args) {
        System.out.println("Sistema Académico CodeUp iniciado correctamente");
        
        // La mejor práctica es ejecutar la interfaz gráfica en el EDT
        SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
        });
    }
}
