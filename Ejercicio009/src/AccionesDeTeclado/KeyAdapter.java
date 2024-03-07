package AccionesDeTeclado;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class KeyAdapter extends JPanel implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Has pulsado y levantado");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Estas precionando la tecla con la letra/simbolo: " + e.getKeyChar() + " con el codigo: " + e.getKeyCode() );
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Has dejado de presionar la tecla");
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.setFont(new Font("Calibri",Font.ITALIC,30));
        g.drawString("Oprime cualquier tecla que gustes", 20, 20);
        
    }
    
}
