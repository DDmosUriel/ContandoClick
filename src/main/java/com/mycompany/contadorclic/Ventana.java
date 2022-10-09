 
package com.mycompany.contadorclic;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    //public MouseListener raton;
    public JButton boton;
    public JTextField cajaTxt;
    public Panel panel;
    public JLabel etiqueta;
    int i = 1;
    int j= 1;
    public Ventana(){
        setSize(500,500);
        setTitle("Contador clic");
        setLocationRelativeTo(null);
        colocarAccesorios();
        colocarCajaTexto();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
    private void colocarAccesorios(){    
        colocarPanel();
        colocarBoton();
        oyenteRaton();
        colocarEtiqueta();
    }
    
    private void colocarPanel(){
        panel = new Panel();
        panel.setBackground(Color.pink);
        panel.setLayout(null);
        getContentPane().add(panel);    
    }    
    private void colocarBoton(){
        boton = new JButton("¡Click aqui!");
        boton.setFont(new Font("arial",1,18));
        boton.setBackground(Color.red);
        boton.setBounds(160, 350, 150, 50);
        panel.add(boton);
    }  
    private void colocarEtiqueta(){
        etiqueta = new JLabel();
        etiqueta.setBounds(130, 100, 250, 30);
        etiqueta.setFont(new Font("arial",1,18));
        //etiqueta.setText("hola es la prueba ubicacion");
        panel.add(etiqueta);
    }
    private void colocarCajaTexto(){
        cajaTxt = new JTextField();
        cajaTxt.setFont(new Font("arial",1,20));
        cajaTxt.setBounds(130, 40, 200, 30);
        panel.add(cajaTxt);
    }
    private void oyenteRaton(){
        
        MouseListener raton = new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                
                cajaTxt.setText("has hecho click "+i+" veces ");
                i++;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                etiqueta.setText("has pulsado pressed "+j);
                j++;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseExited(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        
    }; 
        boton.addMouseListener(raton);
        
}
}

