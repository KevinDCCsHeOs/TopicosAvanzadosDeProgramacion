package MovimientosDelMouse;

import javax.swing.JFrame;

public class MarcoRaton extends JFrame{
    
    public MarcoRaton(){
        
        setVisible(true);
        setBounds(700, 300, 600, 450);
        EventosDeRaton eventoRaton = new EventosDeRaton();
        addMouseListener(eventoRaton);
        
    }
    
}
