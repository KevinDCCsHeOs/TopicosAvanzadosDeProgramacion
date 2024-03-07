

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class EventosDeRaton extends MouseAdapter{
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.print("Has hecho clic");
        System.out.println("  Cordenadas en x:"+e.getX()+" Coordenadas en y:" + e.getY() + "  Numero de clicks: " + e.getClickCount());
    }
    
}
