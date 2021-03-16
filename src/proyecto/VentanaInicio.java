/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Dimension;

/**
 *
 * @author Moisés Navarro
 */
public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(240, 185));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonFutbolista = new javax.swing.JButton();
        botonKarateka = new javax.swing.JButton();
        botonBaskebolista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaTitulo.setText("Registro de atletas");
        jPanel1.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        botonSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 90, -1));

        botonFutbolista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonFutbolista.setText("Registar Futbolista");
        botonFutbolista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFutbolistaActionPerformed(evt);
            }
        });
        jPanel1.add(botonFutbolista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, -1));

        botonKarateka.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonKarateka.setText("Registar Karateka");
        jPanel1.add(botonKarateka, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, -1));

        botonBaskebolista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonBaskebolista.setText("Registar Baskelolista");
        jPanel1.add(botonBaskebolista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonFutbolistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFutbolistaActionPerformed
        VentanaFutbolista ventana =  new VentanaFutbolista();
        ventana.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonFutbolistaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBaskebolista;
    private javax.swing.JButton botonFutbolista;
    private javax.swing.JButton botonKarateka;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
