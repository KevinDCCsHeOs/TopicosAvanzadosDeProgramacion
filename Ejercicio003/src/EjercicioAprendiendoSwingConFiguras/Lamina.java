package EjercicioAprendiendoSwingConFiguras;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.setFont(new Font("Calibri",Font.ITALIC,30));
        g.drawString("Estamos aprendiendo swing :)", 100, 100);
        g.drawRect(100, 110, 70, 55);
        g.drawLine(150, 200, 400, 200);
        g.drawLine(275, 100, 275, 300);
        g.setColor(Color.red);
        g.fillRect(100, 250, 70, 55);
        
    }
    
}
