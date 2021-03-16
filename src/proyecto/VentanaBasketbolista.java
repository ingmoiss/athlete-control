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
public class VentanaBasketbolista extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBasketbolista
     */
    public VentanaBasketbolista() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(400, 380));
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
        etiquetaIdentificacion = new javax.swing.JLabel();
        cajaIdentificacion = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaFecha = new javax.swing.JLabel();
        spinnerFecha = new javax.swing.JSpinner();
        cajaEdad = new javax.swing.JTextField();
        etiquetaEdad = new javax.swing.JLabel();
        cajaPeso = new javax.swing.JTextField();
        etiquetaPeso = new javax.swing.JLabel();
        cajaEstatura = new javax.swing.JTextField();
        etiquetaEstatura = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        etiquetaSangre = new javax.swing.JLabel();
        etiquetaPromedio = new javax.swing.JLabel();
        cajaPromedio = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaTitulo.setText("Registrando Fustbolista");
        jPanel1.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        etiquetaIdentificacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaIdentificacion.setText("Identificación");
        jPanel1.add(etiquetaIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        cajaIdentificacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, -1));

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNombre.setText("Nombre Completo");
        jPanel1.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, -1));

        etiquetaFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaFecha.setText("Fecha de Nacimiento");
        jPanel1.add(etiquetaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        spinnerFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        spinnerFecha.setModel(new javax.swing.SpinnerDateModel());
        spinnerFecha.setEditor(new javax.swing.JSpinner.DateEditor(spinnerFecha, "dd-MM-yyyy"));
        jPanel1.add(spinnerFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, -1));

        cajaEdad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 110, -1));

        etiquetaEdad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaEdad.setText("Edad");
        jPanel1.add(etiquetaEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        cajaPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, -1));

        etiquetaPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaPeso.setText("Peso");
        jPanel1.add(etiquetaPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        cajaEstatura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, -1));

        etiquetaEstatura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaEstatura.setText("Estatura");
        jPanel1.add(etiquetaEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        comboTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+" }));
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, -1));

        etiquetaSangre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaSangre.setText("Tipo de Sangre");
        jPanel1.add(etiquetaSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        etiquetaPromedio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaPromedio.setText("Promedio de puntos");
        jPanel1.add(etiquetaPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        cajaPromedio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cajaPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 380, -1));

        botonAtras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonAtras.setText("Atras");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, 30));

        botonCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonCancelar.setText("Cancelar");
        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, 30));

        botonGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGuardar.setText("Guardar");
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        VentanaInicio ventana = new VentanaInicio();
        ventana.setVisible(true);

        dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaBasketbolista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBasketbolista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBasketbolista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBasketbolista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBasketbolista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaEstatura;
    private javax.swing.JTextField cajaIdentificacion;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPeso;
    private javax.swing.JTextField cajaPromedio;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel etiquetaEdad;
    private javax.swing.JLabel etiquetaEstatura;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaIdentificacion;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetaPromedio;
    private javax.swing.JLabel etiquetaSangre;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spinnerFecha;
    // End of variables declaration//GEN-END:variables
}
