package AccionesDeTeclado;

import javax.swing.JFrame;

public class MarcoLetra extends JFrame{
    
    public MarcoLetra(){
        
        setVisible(true);
        setBounds(700,600,450,500);
        KeyAdapter eventoLetras = new KeyAdapter();
        addKeyListener(eventoLetras);
        
    }
    
}
