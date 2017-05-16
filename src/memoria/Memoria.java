/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoria;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Usuario
 */
public class Memoria extends JFrame{
    public Memoria() {
        add(new NewPanel());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Memoria frame=new Memoria();
        frame.setTitle("Memoria");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
