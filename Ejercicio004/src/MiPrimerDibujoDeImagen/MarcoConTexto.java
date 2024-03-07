package MiPrimerDibujoDeImagen;

import javax.swing.JFrame;

public class MarcoConTexto extends JFrame{
    
    public MarcoConTexto(){
        
        setVisible(true);
        setSize(1400,1000);
        setLocation(200,100);
        setTitle("Primer texto :)");
        Lamina milamina = new Lamina();
        add(milamina);
        
    }
    
}
