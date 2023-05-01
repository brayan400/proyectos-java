package Ventana;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ventana extends JFrame {
   
    private JPanel panel;
    public JLabel etiqueta;
    public JLabel etiqueta2;
    public JButton boton;
    public JButton boton2;
    public JTextField texto;
    
    public ventana(){
        
        //establece ventana
        setSize (498,300);
        //titulo
        setTitle ("Hola Mundo");
        //ubicacion de la ventana
        setLocationRelativeTo(null);
        //cerrar ventana
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        //bloquea el tamaño de la ventana
        setResizable(false);
        
        PanelUno();
        
    }
    
    private void PanelUno(){
        
        panel = new JPanel();
        jlabel();
        boton();
        texto();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.BLACK);
        //llama el jlabel,jbutton,jtextfield.
        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(boton);
        panel.add(boton2);
        panel.add(texto);
    }
    
    private void jlabel(){
        
        etiqueta = new JLabel("etiqueta dos",SwingConstants.CENTER);
        etiqueta2 = new JLabel("etiqueta uno",SwingConstants.CENTER);
        
        etiqueta.setOpaque(true);
        etiqueta2.setOpaque(true);
        
        etiqueta.setFont(new Font("Montserrat",Font.BOLD,12));
        etiqueta2.setFont(new Font("Montserrat",Font.BOLD,12));
        
        etiqueta.setBounds(145,110,95,30);
        etiqueta2.setBounds(250,110,95,30);
        
        etiqueta.setForeground(Color.WHITE);
        etiqueta2.setForeground(Color.WHITE);
        etiqueta.setBackground(Color.MAGENTA);
        etiqueta2.setBackground(Color.BLUE);
        
    }
    
    private void boton(){
        
        boton = new JButton("bonton 1");
        boton2 = new JButton("boton 2");
        
        boton.setBounds(145,150,95,30);
        boton2.setBounds(250,150,95,30);
        
        boton.setFont(new Font("Montserrat",Font.BOLD,12));
        boton2.setFont(new Font("Montserrat",Font.BOLD,12));
    }
    
    private void texto(){
        
        texto = new JTextField();
        texto.setBounds(145,70,200,30);
    }
    
}
