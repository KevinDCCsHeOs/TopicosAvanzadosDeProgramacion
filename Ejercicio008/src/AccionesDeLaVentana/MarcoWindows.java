package AccionesDeLaVentana;

import javax.swing.JFrame;

public class MarcoWindows extends JFrame{
    
    public MarcoWindows(){
        
        setVisible(true);
        setBounds(700,300,600,450);
        WindowsAdapter eventoWindows = new WindowsAdapter();
        addWindowListener(eventoWindows);
        
    }
    
}
