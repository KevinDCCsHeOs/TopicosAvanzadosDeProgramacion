/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EjercicioDeEscuchadorDeEventos;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

/**
 *
 * @author levij
 */
public class EscuchadorDeEventos extends javax.swing.JFrame implements WindowListener , KeyListener , MouseListener{

    /**
     * Creates new form EscuchadorDeEventos
     */
    public EscuchadorDeEventos() {
        super("Interfaz grafica :)");
        initComponents();
        this.addWindowListener(this);
        this.addKeyListener(this);
        this.addMouseListener(this);
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/levij/Documents/NetBeansProjects/P02Eventos/src/EjercicioDeEscuchadorDeEventos/Imagenes.jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setLayout(new java.awt.GridLayout(5, 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("I.D.");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjLabel1(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjLabel1(evt);
            }
        });
        jPanel1.add(jLabel1);

        jTextField1.setBackground(new java.awt.Color(255, 255, 51));
        jTextField1.setFont(new java.awt.Font("STZhongsong", 2, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 255));
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
        jPanel1.add(jTextField1);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Target:");
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjLabel2(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjLabel2(evt);
            }
        });
        jPanel1.add(jLabel2);

        jTextField2.setBackground(new java.awt.Color(255, 255, 51));
        jTextField2.setFont(new java.awt.Font("STZhongsong", 2, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 255));
        jTextField2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjTextField2(evt);
            }
        });
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjTextField2(evt);
            }
        });
        jPanel1.add(jTextField2);

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Coordenada X, Y:");
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjLabel3(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjLabel3(evt);
            }
        });
        jPanel1.add(jLabel3);

        jTextField3.setBackground(new java.awt.Color(255, 255, 51));
        jTextField3.setFont(new java.awt.Font("STZhongsong", 2, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 255));
        jTextField3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjTextField3(evt);
            }
        });
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjTextField3(evt);
            }
        });
        jPanel1.add(jTextField3);

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Clicks dados:");
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjLabel4(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjLabel4(evt);
            }
        });
        jPanel1.add(jLabel4);

        jTextField4.setBackground(new java.awt.Color(255, 255, 51));
        jTextField4.setFont(new java.awt.Font("STZhongsong", 2, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 255));
        jTextField4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjTextField4(evt);
            }
        });
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjTextField4(evt);
            }
        });
        jPanel1.add(jTextField4);

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Adicional:");
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjLabel5(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjLabel5(evt);
            }
        });
        jPanel1.add(jLabel5);

        jTextField5.setBackground(new java.awt.Color(255, 255, 51));
        jTextField5.setFont(new java.awt.Font("STZhongsong", 2, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 255));
        jTextField5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedjTextField5(evt);
            }
        });
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedjTextField5(evt);
            }
        });
        jPanel1.add(jTextField5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setFont(new java.awt.Font("STCaiyun", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Pulsar");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedPulsar(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedPulsar(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedPulsar(evt);
            }
        });
        jPanel2.add(jButton1);

        jComboBox1.setBackground(new java.awt.Color(255, 255, 51));
        jComboBox1.setFont(new java.awt.Font("Stencil", 2, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setSelectedIndex(3);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemStateChangedCombo(evt);
            }
        });
        jComboBox1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedCombo(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedCombo(evt);
            }
        });
        jPanel2.add(jComboBox1);

        jButton2.setBackground(new java.awt.Color(51, 0, 51));
        jButton2.setFont(new java.awt.Font("STCaiyun", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Salir");
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mouseMovedSalir(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Salir(evt);
            }
        });
        jPanel2.add(jButton2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Salir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salir
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Salir

    private void mouseClickedPulsar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedPulsar
        // TODO add your handling code here:
        interactuaClickedRaton("jButton1",evt);
    }//GEN-LAST:event_mouseClickedPulsar

    private void keyPressedPulsar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressedPulsar
        // TODO add your handling code here:
        interactuaTeclado("jButton1",evt);
    }//GEN-LAST:event_keyPressedPulsar

    private void mouseMovedPulsar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedPulsar
        // TODO add your handling code here:
        interactuaMovedRaton("jButton1",evt);
    }//GEN-LAST:event_mouseMovedPulsar

    private void mouseClickedCombo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedCombo
        // TODO add your handling code here:
        interactuaClickedRaton("jComboBox1",evt);
    }//GEN-LAST:event_mouseClickedCombo

    private void ItemStateChangedCombo(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemStateChangedCombo
        // TODO add your handling code here:
        cambioDeEstadoDeUnCombo("jComboBox1",evt);
    }//GEN-LAST:event_ItemStateChangedCombo

    private void mouseMovedjLabel1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjLabel1
        // TODO add your handling code here:
        interactuaMovedRaton("jLabel1",evt);
    }//GEN-LAST:event_mouseMovedjLabel1

    private void mouseClickedjLabel1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjLabel1
        // TODO add your handling code here:
        interactuaClickedRaton("jLabel1",evt);
    }//GEN-LAST:event_mouseClickedjLabel1

    private void mouseMovedjLabel2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjLabel2
        // TODO add your handling code here:
        interactuaMovedRaton("jLabel2",evt);
    }//GEN-LAST:event_mouseMovedjLabel2

    private void mouseClickedjLabel2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjLabel2
        // TODO add your handling code here:
        interactuaClickedRaton("jLabel2",evt);
    }//GEN-LAST:event_mouseClickedjLabel2

    private void mouseMovedjLabel3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjLabel3
        // TODO add your handling code here:
        interactuaMovedRaton("jLabel3",evt);
    }//GEN-LAST:event_mouseMovedjLabel3

    private void mouseClickedjLabel3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjLabel3
        // TODO add your handling code here:
        interactuaClickedRaton("jLabel3",evt);
    }//GEN-LAST:event_mouseClickedjLabel3

    private void mouseMovedjLabel4(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjLabel4
        // TODO add your handling code here:
        interactuaMovedRaton("jLabel4",evt);
    }//GEN-LAST:event_mouseMovedjLabel4

    private void mouseClickedjLabel4(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjLabel4
        // TODO add your handling code here:
        interactuaClickedRaton("jLabel4",evt);
    }//GEN-LAST:event_mouseClickedjLabel4

    private void mouseMovedjLabel5(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjLabel5
        // TODO add your handling code here:
        interactuaMovedRaton("jLabel5",evt);
    }//GEN-LAST:event_mouseMovedjLabel5

    private void mouseClickedjLabel5(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjLabel5
        // TODO add your handling code here:
        interactuaClickedRaton("jLabel5",evt);
    }//GEN-LAST:event_mouseClickedjLabel5

    private void mouseMovedSalir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedSalir
        // TODO add your handling code here:
        interactuaMovedRaton("jButton2",evt);
    }//GEN-LAST:event_mouseMovedSalir

    private void mouseMovedjTextField1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjTextField1
        // TODO add your handling code here:
        interactuaMovedRaton("jTextField1",evt);
    }//GEN-LAST:event_mouseMovedjTextField1

    private void mouseClickedjTextField1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjTextField1
        // TODO add your handling code here:
        interactuaClickedRaton("jTextField1",evt);
    }//GEN-LAST:event_mouseClickedjTextField1

    private void mouseMovedjTextField2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjTextField2
        // TODO add your handling code here:
        interactuaMovedRaton("jTextField2",evt);
    }//GEN-LAST:event_mouseMovedjTextField2

    private void mouseClickedjTextField2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjTextField2
        // TODO add your handling code here:
        interactuaClickedRaton("jTextField2",evt);
    }//GEN-LAST:event_mouseClickedjTextField2

    private void mouseMovedjTextField3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjTextField3
        // TODO add your handling code here:
        interactuaMovedRaton("jTextField3",evt);
    }//GEN-LAST:event_mouseMovedjTextField3

    private void mouseClickedjTextField3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjTextField3
        // TODO add your handling code here:
        interactuaClickedRaton("jTextField3",evt);
    }//GEN-LAST:event_mouseClickedjTextField3

    private void mouseClickedjTextField4(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjTextField4
        // TODO add your handling code here:
        interactuaClickedRaton("jTextField4",evt);
    }//GEN-LAST:event_mouseClickedjTextField4

    private void mouseMovedjTextField4(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjTextField4
        // TODO add your handling code here:
        interactuaMovedRaton("jTextField4",evt);
    }//GEN-LAST:event_mouseMovedjTextField4

    private void mouseMovedjTextField5(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedjTextField5
        // TODO add your handling code here:
        interactuaMovedRaton("jTextField5",evt);
    }//GEN-LAST:event_mouseMovedjTextField5

    private void mouseMovedCombo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseMovedCombo
        // TODO add your handling code here:
        interactuaMovedRaton("jComboBox1",evt);
    }//GEN-LAST:event_mouseMovedCombo

    private void mouseClickedjTextField5(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClickedjTextField5
        // TODO add your handling code here:
        interactuaClickedRaton("jTextField5",evt);
    }//GEN-LAST:event_mouseClickedjTextField5

    private void muestra(int id , String texto , String coordenada , String cuenta , String adicional){
        jTextField1.setText(String.valueOf(id));
        String cadena = "";
        int i = 0;
        while (texto.charAt(i)!='['){
            cadena += texto.charAt(i);
            i++;
        }
        jTextField2.setText(cadena);
        jTextField3.setText(coordenada);
        jTextField4.setText(cuenta);
        jTextField5.setText(adicional);
    }
    
    private void interactuaClickedRaton(String nombre, java.awt.event.MouseEvent evt){
        String posicion = "Click dado en " + nombre + " fue la posición: (" + String.valueOf(evt.getX()) + "," +
                String.valueOf(evt.getY())+")";
        String clicks = String.valueOf(evt.getClickCount());
        muestra(evt.getID(),evt.toString(),posicion,clicks,"Interactua el raton con la "+nombre);
    }
    
    private void cambioDeEstadoDeUnCombo(String nombre,java.awt.event.ItemEvent evt){
        String posicion = "No detectada";
        String clicks = "No contados";
        String adicional = "El" + nombre + " cambio.Item" + evt.getItem();
        muestra(evt.getID(),evt.toString(),posicion,clicks,adicional);
    }
    
    private void interactuaTeclado(String nombre, java.awt.event.KeyEvent evt){
        String posicion = "No detectada";
        String clicks = "No contados";
        String adicional = "Letra pulsada: " + String.valueOf(evt.getKeyChar()) + " " + nombre;
        muestra(evt.getID(),evt.toString(),posicion,clicks,adicional);
    }
    
    private void interactuaMovedRaton(String nombre, java.awt.event.MouseEvent evt){
        String posicion = "Click dado en " + nombre + " fue la posición: (" + String.valueOf(evt.getX()) + "," +
                String.valueOf(evt.getY())+")";
        String clicks = String.valueOf((char) evt.getClickCount());
        muestra(evt.getID(),evt.toString(),posicion,clicks,"Interactua el raton con la "+nombre);
    }
    
    private void interactuaVentana(String nombre, java.awt.event.WindowEvent evt){
        String posicion = "No detectada";
        String clicks = "No contados";
        String adicional = " Nada :) ";
        muestra(evt.getID(),evt.toString(),posicion,clicks,adicional);
    }
    
    private void interactuaKeyBoard(String nombre, java.awt.event.KeyEvent evt){
        String posicion = "No detectada";
        String clicks = "No contados";
        String adicional = " Nada :) ";
        muestra(evt.getID(),evt.toString(),posicion,clicks,adicional);
    }
    
    private void interactuaMouseE(String nombre, java.awt.event.MouseEvent evt){
        String posicion = "Entraste en la posicion x: "+evt.getX() + " , y: " + evt.getY();
        String clicks = "No contados";
        String adicional = " Nada :) ";
        muestra(evt.getID(),evt.toString(),posicion,clicks,adicional);
    }
    
    private void interactuaMouseS(String nombre, java.awt.event.MouseEvent evt){
        String posicion = "Saliste de la ventana";
        String clicks = "No contados";
        String adicional = " Nada :) ";
        muestra(evt.getID(),evt.toString(),posicion,clicks,adicional);
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
            java.util.logging.Logger.getLogger(EscuchadorDeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscuchadorDeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscuchadorDeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscuchadorDeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscuchadorDeEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {
        interactuaVentana("Ventana abierta", e);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        interactuaVentana("Ventana cerrando", e);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        interactuaVentana("Ventana cerrada", e);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        interactuaVentana("Ventana minimizada", e);
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        interactuaVentana("Ventana maximizada", e);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        interactuaVentana("Ventana activada", e);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        interactuaVentana("Ventana desactivada", e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        interactuaKeyBoard("Has pulsado y levantado", e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        interactuaKeyBoard("Has precionado la tecla: " + e.getKeyChar() + " con el codigo: " + e.getKeyCode(), e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        interactuaKeyBoard("Has dejado de presionar la tecla", e);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        interactuaMouseE("Has entrado", e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        interactuaMouseS("Has Salido", e);
    }
    
}
