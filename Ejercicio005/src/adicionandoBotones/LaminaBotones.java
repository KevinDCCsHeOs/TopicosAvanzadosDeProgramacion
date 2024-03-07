package adicionandoBotones;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LaminaBotones extends JPanel implements ActionListener{
    
    JButton botonRojo = new JButton("Rojo");
    JButton botonVerde = new JButton("Verde");
    JButton botonAmarillo = new JButton("Amarillo");
    
    public LaminaBotones(){
        add(botonRojo);
        add(botonVerde);
        add(botonAmarillo);
        botonRojo.addActionListener(this);
        botonVerde.addActionListener(this);
        botonAmarillo.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object botonPulsado = e.getSource();
        if(botonPulsado==botonRojo)
            setBackground(Color.red);
        else if (botonPulsado == botonVerde)
            setBackground(Color.GREEN);
        else 
            setBackground(Color.YELLOW);
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        //Color miColor = new Color(100,100,100);
        //setBackground(miColor);
        
    }
    
}
