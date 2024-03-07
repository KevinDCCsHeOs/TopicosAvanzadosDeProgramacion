package adicionandoBotones;

import javax.swing.JFrame;

public class MarcoConTexto extends JFrame{
    
    public MarcoConTexto(){
        
        setVisible(true);
        setSize(400,400);
        setLocation(500,300);
        setTitle("Primeros botones con eventos :)");
        LaminaBotones milamina = new LaminaBotones();
        add(milamina);
        
    }
    
}
