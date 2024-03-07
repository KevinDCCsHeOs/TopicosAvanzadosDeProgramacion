package EjercicioCambiarIconoVentana;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;

public class MarcoCentrado extends JFrame{
    
    public MarcoCentrado(){
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamañoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamañoPantalla.height;
        int anchoPantalla = tamañoPantalla.width;
        
        setSize(anchoPantalla/2,alturaPantalla/2);
        setLocation(anchoPantalla/4,alturaPantalla/4);
        setTitle("Marco Centrado.jpg:)");
        Image miIcono = miPantalla.getImage("C:/Users/levij/Documents/NetBeansProjects/Ejercicios/src/Ejercicio2/LogoIto.png");
        setIconImage(miIcono);
        
    }
    
}
