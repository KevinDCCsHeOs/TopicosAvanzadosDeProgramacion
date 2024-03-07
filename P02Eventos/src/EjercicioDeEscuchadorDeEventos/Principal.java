package EjercicioDeEscuchadorDeEventos;

public class Principal {
    
    public static void main(String[] args) {
        
        EscuchadorDeEventos escuchadorDeEventos = new EscuchadorDeEventos();
        escuchadorDeEventos.setSize(700,400);
        escuchadorDeEventos.setResizable(false);
        escuchadorDeEventos.setVisible(true);
        escuchadorDeEventos.setLocation(500, 400);
        escuchadorDeEventos.setTitle("Interfaz Grafica :)");
        
    }
    
}
