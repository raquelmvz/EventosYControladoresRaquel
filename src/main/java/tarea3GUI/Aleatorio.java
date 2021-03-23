/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author raquel
 */
public class Aleatorio extends JPanel {

    private JButton botonAleatorio;
    private JLabel etiqueta;

    public Aleatorio() {
        initComponents();
    }

    private void initComponents() {

        /* a. Incluye un botón nuevo, con el texto 
        "Generar Aleatorio". */
        botonAleatorio = new JButton("Generar aleatorio");
        /* b. Incluye una etiqueta (JLabel) en la que inicialmente 
        se muestre el texto "Número" */
        etiqueta = new JLabel("Número");

        this.setLayout(new FlowLayout());

        this.add(botonAleatorio);

        this.add(etiqueta);

        /* c. Añade al botón "Generar Aleatorio" un controlador 
        de eventos, usando clases internas anónimas, de forma 
        que al pulsar sobre él, se genere un número aleatorio 
        entre 0 y 10 y se muestre en la etiqueta (JLabel) */
        botonAleatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                etiqueta.setText(devuelveAleatorio(0, 10));
            }
        });

        botonAleatorio.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                botonAleatorio.setBackground(new Color(227, 170, 84));

            }

            @Override
            public void mouseExited(MouseEvent me) {
                botonAleatorio.setBackground(null);
            }
        });
    }

    /* Metodo que devuelve un aleatorio */
    private String devuelveAleatorio(int n, int m) {
        Random random = new Random();
        return String.valueOf(random.nextInt(m - n + 1) + n);
    }

    public static void main(String[] args) {

        // Construimos la ventana
        JFrame frame = new JFrame("Generar aleatorios");
        // La ventana no se puede redimensionar
        frame.setResizable(false);
        // Posición de la ventana
        frame.setLocationRelativeTo(null);
        // Incluimos el panel en la ventana
        frame.add(new Aleatorio());
        // Ajusta el frame al contenido
        frame.pack();
        // Hacemos visible la ventana
        frame.setVisible(true);
        //Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
