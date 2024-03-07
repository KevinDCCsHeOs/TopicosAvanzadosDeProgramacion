package Memorama;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

public class Contenedor extends javax.swing.JFrame {

    final int TOTALDECARTAS = 16;
    
    private Boton cartas[];
    private boolean asignada[];
    private int cartasVolteadas;
    private int numero1, numero2;
    private int carta1, carta2;
    private int clicksDados = 0;
    
    /**
     * Creates new form EscuchadorDeEventosMemorama
     */
    public Contenedor() {
        super("Memorama");
        initComponents();
        cartas = new Boton[16];
        cartas[0] = new Boton(jButton1);
        cartas[1] = new Boton(jButton2);
        cartas[2] = new Boton(jButton3);
        cartas[3] = new Boton(jButton4);
        cartas[4] = new Boton(jButton5);
        cartas[5] = new Boton(jButton6);
        cartas[6] = new Boton(jButton7);
        cartas[7] = new Boton(jButton8);
        cartas[8] = new Boton(jButton9);
        cartas[9] = new Boton(jButton10);
        cartas[10] = new Boton(jButton11);
        cartas[11] = new Boton(jButton12);
        cartas[12] = new Boton(jButton13);
        cartas[13] = new Boton(jButton14);
        cartas[14] = new Boton(jButton15);
        cartas[15] = new Boton(jButton16);
        asignada = new boolean[TOTALDECARTAS];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Memorama de bandas de Rock");
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador00(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador01(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador02(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador03(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador05(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador04(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador06(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador07(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador08(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador09(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador10(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador11(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador12(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador13(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador14(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Memorama/c00.jpg"))); // NOI18N
        jButton16.setActionCommand("jButton16");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuchador15(evt);
            }
        });
        jPanel1.add(jButton16);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        jButton17.setBackground(new java.awt.Color(0, 0, 0));
        jButton17.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Iniciar");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicio(evt);
            }
        });
        jPanel2.add(jButton17);

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 0, 0));
        jButton18.setText("Salir");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Salir(evt);
            }
        });
        jPanel2.add(jButton18);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjTextField1(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjTextField1(evt);
            }
        });
        jPanel2.add(jTextField1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Salir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salir
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Salir

    private void escuchador00(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador00
        // TODO add your handling code here:
        voltearCarta(0);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador00

    private void escuchador01(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador01
        // TODO add your handling code here:
        voltearCarta(1);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador01

    private void escuchador02(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador02
        // TODO add your handling code here:
        voltearCarta(2);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador02

    private void escuchador03(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador03
        // TODO add your handling code here:
        voltearCarta(3);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador03

    private void escuchador04(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador04
        // TODO add your handling code here:
        voltearCarta(4);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador04

    private void escuchador05(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador05
        // TODO add your handling code here:
        voltearCarta(5);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador05

    private void escuchador06(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador06
        // TODO add your handling code here:
        voltearCarta(6);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador06

    private void escuchador07(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador07
        // TODO add your handling code here:
        voltearCarta(7);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador07

    private void escuchador08(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador08
        // TODO add your handling code here:
        voltearCarta(8);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador08

    private void escuchador09(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador09
        // TODO add your handling code here:
        voltearCarta(9);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador09

    private void escuchador10(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador10
        // TODO add your handling code here:
        voltearCarta(10);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador10

    private void escuchador11(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador11
        // TODO add your handling code here:
        voltearCarta(11);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador11

    private void escuchador12(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador12
        // TODO add your handling code here:
        voltearCarta(12);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador12

    private void escuchador13(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador13
        // TODO add your handling code here:
        voltearCarta(13);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador13

    private void escuchador14(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador14
        // TODO add your handling code here:
        voltearCarta(14);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador14

    private void escuchador15(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuchador15
        // TODO add your handling code here:
        voltearCarta(15);
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_escuchador15

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void inicio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio
        // TODO add your handling code here:
        asignar();
        for(int i=0; i<16;i++){
            cartas[i].regresaCarta();
            cartas[i].setEstado(0);
        }
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_inicio

    private void mouseClickedjTextField1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjTextField1
        // TODO add your handling code here:
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_mouseClickedjTextField1

    private void mouseMovedjTextField1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjTextField1
        // TODO add your handling code here:
        interactuaClickedRaton(evt);
    }//GEN-LAST:event_mouseMovedjTextField1

    private void interactuaClickedRaton(java.awt.event.MouseEvent evt){
        clicksDados += evt.getClickCount();
        muestra(clicksDados);
    }
    
    private void muestra(int cuenta){
        jTextField1.setText(cuenta + " clicks dados");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private void asignar(){
        boolean existe;
        int ca, c1, c2;
        Random r = new Random();
        int cartasAJugar[] = new int[8];
        for(int i=0;i<8;i++){
            do{
                existe=false;
                ca=r.nextInt(TOTALDECARTAS);
                if(ca==0)
                    ca+=1;
                for(int j=0;j<8;j++)
                    if(cartasAJugar[j]==ca)
                        existe = true;
            }while(existe);
            cartasAJugar[i]=ca;
        }
        for(int i=0;i<8;i++){
            do{
                c1=r.nextInt(16);
            }while(asignada[c1]==true);
            asignada[c1]=true;
            do{
                c2=r.nextInt(16);
            }while(asignada[c2]==true);
            asignada[c2]=true;
            cartas[c1].setNumeroDeCarta(cartasAJugar[i]);
            cartas[c2].setNumeroDeCarta(cartasAJugar[i]);
        }
    }
    
    private void voltearCarta(int numero){
        /*if(cartas[numero].getEstado()==0){
            cartasVolteadas++;
            if(cartasVolteadas==1){
                cartas[numero].voltearCarta();
                cartas[numero].setEstado(1);
                carta1=cartas[numero].getNumeroDeCarta();
                numero1=numero;
            } 
            if(cartasVolteadas==2){
                cartas[numero].voltearCarta();
                cartas[numero].setEstado(1);
                carta2=cartas[numero].getNumeroDeCarta();
                numero2=numero;
                
            }
            if(carta1==carta2){
                    cartas[numero1].setEstado(2);
                    cartas[numero2].setEstado(2);
                } else {
                    cartas[numero1].setEstado(0);
                    cartas[numero2].setEstado(0);
                    cartas[numero1].regresaCarta();
                    cartas[numero2].regresaCarta();
                }
            
            cartas[numero].voltearCarta();
            cartas[numero].setEstado(1);
            carta1=cartas[numero].getNumeroDeCarta();
            numero1=numero;
        }*/
        if(cartas[numero].getEstado()==0){
            cartasVolteadas++;
            cartas[numero].voltearCarta();
            cartas[numero].setEstado(1);
            if(cartasVolteadas==1){
                carta1=cartas[numero].getNumeroDeCarta();
                numero1=numero;
            } else if(cartasVolteadas==2){
                carta2=cartas[numero].getNumeroDeCarta();
                numero2=numero;
                if(carta1==carta2){
                    cartas[numero].setEstado(2);
                } else {
                    Timer timer = new Timer(700,new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            cartas[numero1].setEstado(0);
                            cartas[numero1].regresaCarta();
                            cartas[numero2].setEstado(0);
                            cartas[numero2].regresaCarta();
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
                cartasVolteadas = 0;
            }
        }
    }
}
