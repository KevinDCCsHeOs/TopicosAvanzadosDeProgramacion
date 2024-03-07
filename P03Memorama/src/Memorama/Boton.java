package Memorama;

import javax.swing.*;

public class Boton {
    
    private JButton casilla;
    private int numeroDeCarta;
    private int estado;
    
    public Boton(JButton casilla){
        this.casilla=casilla;
        this.numeroDeCarta=0;
        this.estado=0;
    }
    
    public void setAsigna(int numeroDeCarta){
        this.numeroDeCarta=numeroDeCarta;
    }
    
    public void voltearCarta(){
        String numero=String.valueOf(numeroDeCarta);
        if(numero.length()==1)
            numero="0"+numero;
        casilla.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/memorama/im" + numero + ".jpg")));
    }
    
    public int getEstado(){
        return estado;
    }
    
    public void setEstado(int estado){
        this.estado=estado;
    }
    
    public int getNumeroDeCarta(){
        return numeroDeCarta;
    }
    
    public void setNumeroDeCarta(int numeroDeCarta){
        this.numeroDeCarta = numeroDeCarta;
    }
    
    public void regresaCarta(){
        casilla.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/memorama/c00.jpg")));
    }
    
}
