package EjercicioAprendiendoSwingConFiguras;

import javax.swing.JFrame;

public class MarcoConTexto extends JFrame{
    
    public MarcoConTexto(){
        
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Primer texto :)");
        Lamina milamina = new Lamina();
        add(milamina);
        
    }
    
}
