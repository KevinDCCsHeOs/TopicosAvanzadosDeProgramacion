package MiPrimerDibujoDeImagen;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Lamina extends JPanel{
    
    private Image imagen;
    
    File miImagen = new File("C:/Users/levij/Documents/NetBeansProjects/Ejercicio004/src/MiPrimerDibujoDeImagen/IronMaiden.png");
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.setFont(new Font("Calibri",Font.ITALIC,30));
        g.drawString("Prueba :)", 680, 90);
        
        try{
            imagen = ImageIO.read(miImagen);
        }catch(IOException e){
            System.out.print("No existe la imagen");
        }
        
        Color miColor = new Color(100,100,100);
        setBackground(miColor);
        g.drawImage(imagen, 100, 100, null);
        
    }
    
}
