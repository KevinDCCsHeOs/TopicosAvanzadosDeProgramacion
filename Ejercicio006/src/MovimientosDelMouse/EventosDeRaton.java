package MovimientosDelMouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosDeRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho clic");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de precionar");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Has entrado");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Has salido");
    }
    
    
    
}
