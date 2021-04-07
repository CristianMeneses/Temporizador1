/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private int actividad, descanso, rondas;
    private RelojActividad relojA;

    public VentanaPrincipal() {
        this.initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LActividad = new javax.swing.JLabel();
        LRondas = new javax.swing.JLabel();
        LTexto = new javax.swing.JLabel();
        TRondas = new javax.swing.JTextField();
        TActividad = new javax.swing.JTextField();
        BIniciar = new javax.swing.JButton();
        LDescanso = new javax.swing.JLabel();
        TDescanso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LActividad.setText("Actividad");
        getContentPane().add(LActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 92, -1, -1));

        LRondas.setText("Rondas");
        getContentPane().add(LRondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        LTexto.setText("Vamos a introducir el tiempo (en segundos)");
        getContentPane().add(LTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 28, -1, -1));

        TRondas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRondasActionPerformed(evt);
            }
        });
        getContentPane().add(TRondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 257, -1));

        TActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActividadActionPerformed(evt);
            }
        });
        getContentPane().add(TActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 89, 257, -1));

        BIniciar.setText("Iniciar");
        BIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 148, -1));

        LDescanso.setText("Descanso");
        getContentPane().add(LDescanso, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 187, -1, -1));

        TDescanso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDescansoActionPerformed(evt);
            }
        });
        getContentPane().add(TDescanso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 184, 257, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TRondasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRondasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRondasActionPerformed

    private void TActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TActividadActionPerformed

    private void BIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIniciarActionPerformed
        int aux = 0;

        if (TActividad.getText() != null) {
            try {
                actividad = Integer.parseInt(TActividad.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa solo numeros");
                aux++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa algun valor");
            aux++;
        }

        if (TDescanso.getText() != null) {
            try {
                descanso = Integer.parseInt(TDescanso.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa solo numeros");
                aux++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa algun valor");
            aux++;
        }

        if (TRondas.getText() != null) {
            try {
                rondas = Integer.parseInt(TRondas.getText());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa solo numeros");
                aux++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa algun valor");
            aux++;
        }

        if (aux == 0) {
            for (int i = 0; i < rondas; i++) {
                relojA = new RelojActividad(actividad, descanso);
                try {
                    relojA.start(0, 1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_BIniciarActionPerformed

    private void TDescansoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDescansoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TDescansoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BIniciar;
    private javax.swing.JLabel LActividad;
    private javax.swing.JLabel LDescanso;
    private javax.swing.JLabel LRondas;
    private javax.swing.JLabel LTexto;
    private javax.swing.JTextField TActividad;
    private javax.swing.JTextField TDescanso;
    private javax.swing.JTextField TRondas;
    // End of variables declaration//GEN-END:variables
}
