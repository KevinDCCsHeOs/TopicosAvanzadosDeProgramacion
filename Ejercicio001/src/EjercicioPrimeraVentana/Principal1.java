
package EjercicioPrimeraVentana;

import javax.swing.JFrame;

public class Principal1 {
    
    public static void main(String[] args){
        
        Ventana1 obj1 = new Ventana1();
            obj1.setVisible(true);
            obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj1.setLocation(500, 200);
            obj1.setTitle("Ventana emergente.jpg:)");
            obj1.setResizable(true);
            obj1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    
}
