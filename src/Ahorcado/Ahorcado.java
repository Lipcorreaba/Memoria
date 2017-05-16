/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import javax.swing.*;
import java.awt.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Ahorcado extends JFrame{
    public Ahorcado() {
        add(new NewPanel());
    }
    public static void main(String[] args) {
        Ahorcado frame=new Ahorcado();
        frame.setTitle("Ahorcado");
        frame.setSize(830,600);
        frame.setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        String[] palabras={"hola","como","estas","yo","bien"};
//        Random random=new Random();
//        int x=0;
//        int ran=random.nextInt(palabras.length);
//        System.out.println(ran);
//        String palabra=palabras[ran];
//        for(int i=0;i<palabra.length();i++){
//            x++;
//        }
//        System.out.println(x);
    }

}
