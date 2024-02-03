/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.AuxiliarDatos.DatosUsuario;
import controlador.AuxiliarDatos.TipoSalonSeleccionado;
import controlador.Strategy.DescuentoQuinceStrategy;
import controlador.Strategy.DescuentoPorBodasStrategy;
import controlador.Strategy.DescuentoGraduacionStrategy;
import controlador.Strategy.DescuentoPorPrecioStrategy;
import controlador.Strategy.PrecioStrategy;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class DescuentosPago extends javax.swing.JFrame {

    /**
     * Creates new form DescuentosPago
     */
    public DescuentosPago() {
        initComponents();
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
        botonEstudiante = new javax.swing.JButton();
        botonCumpleaños = new javax.swing.JButton();
        botonBodas = new javax.swing.JButton();
        botonGranDescuento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarDatos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));

        botonEstudiante.setBackground(new java.awt.Color(102, 255, 204));
        botonEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonEstudiante.setText("Descuento Quince años");
        botonEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstudianteActionPerformed(evt);
            }
        });

        botonCumpleaños.setBackground(new java.awt.Color(153, 255, 153));
        botonCumpleaños.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonCumpleaños.setText("Descuento Graduación");
        botonCumpleaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCumpleañosActionPerformed(evt);
            }
        });

        botonBodas.setBackground(new java.awt.Color(51, 51, 255));
        botonBodas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonBodas.setText("Descuento Bodas");
        botonBodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBodasActionPerformed(evt);
            }
        });

        botonGranDescuento.setBackground(new java.awt.Color(255, 51, 51));
        botonGranDescuento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonGranDescuento.setText("Gran Descuento");
        botonGranDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGranDescuentoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));

        mostrarDatos.setColumns(20);
        mostrarDatos.setRows(5);
        jScrollPane1.setViewportView(mostrarDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Confirmar Transaccion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(botonBodas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEstudiante)
                            .addComponent(botonCumpleaños)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(botonGranDescuento)))
                .addGap(59, 59, 59)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(botonGranDescuento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCumpleaños)
                .addGap(18, 18, 18)
                .addComponent(botonBodas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEstudiante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstudianteActionPerformed

        PrecioStrategy estudiante = new DescuentoQuinceStrategy();
double precioBase = DatosUsuario.getTotalAcumulado();
double precioConDescuento = estudiante.calcularPrecio(precioBase);
DatosUsuario.setPrecioConDescuento(precioConDescuento);

StringBuilder detalles = new StringBuilder();
detalles.append("Espacio: ").append(DatosUsuario.getIdEpsacioSeleccionado()).append("\n");
detalles.append("Cliente: ").append(DatosUsuario.getIdUsuarioSeleccionado()).append("\n");

detalles.append("\nMenús seleccionados:\n");
for (TipoSalonSeleccionado tiposalonSeleccionado : DatosUsuario.getTipoSalonSeleccionados()) {
    detalles.append(tiposalonSeleccionado.getNombre()).append(" - $").append(tiposalonSeleccionado.getPrecio()).append("\n");
}

detalles.append("\nPrecio total con descuento: $").append(precioConDescuento);

mostrarDatos.setText(detalles.toString());        
        
    }//GEN-LAST:event_botonEstudianteActionPerformed

    private void botonGranDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGranDescuentoActionPerformed
       PrecioStrategy granDescuento = new DescuentoPorPrecioStrategy();
double precioBase = DatosUsuario.getTotalAcumulado();
double precioConDescuento = granDescuento.calcularPrecio(precioBase);
DatosUsuario.setPrecioConDescuento(precioConDescuento);

StringBuilder detalles = new StringBuilder();
detalles.append("Espacio: ").append(DatosUsuario.getIdEpsacioSeleccionado()).append("\n");
detalles.append("Cliente: ").append(DatosUsuario.getIdUsuarioSeleccionado()).append("\n");

detalles.append("\nMenús seleccionados:\n");
for (TipoSalonSeleccionado tpSeleccionado : DatosUsuario.getTipoSalonSeleccionados()) {
    detalles.append(tpSeleccionado.getNombre()).append(" - $").append(tpSeleccionado.getPrecio()).append("\n");
}

detalles.append("\nPrecio total con descuento: $").append(precioConDescuento);

mostrarDatos.setText(detalles.toString());

    }//GEN-LAST:event_botonGranDescuentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JOptionPane.showMessageDialog(null, "¡Transacción confirmada! Por favor, diríjase al panel de pedidos.");
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonCumpleañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCumpleañosActionPerformed
       PrecioStrategy cumpleaños = new DescuentoGraduacionStrategy();
double precioBase = DatosUsuario.getTotalAcumulado();
double precioConDescuento = cumpleaños.calcularPrecio(precioBase);
DatosUsuario.setPrecioConDescuento(precioConDescuento);

StringBuilder detalles = new StringBuilder();
detalles.append("Espacio: ").append(DatosUsuario.getIdEpsacioSeleccionado()).append("\n");
detalles.append("Cliente: ").append(DatosUsuario.getIdUsuarioSeleccionado()).append("\n");

detalles.append("\nMenús seleccionados:\n");
for (TipoSalonSeleccionado tpSeleccionado : DatosUsuario.getTipoSalonSeleccionados()) {
    detalles.append(tpSeleccionado.getNombre()).append(" - $").append(tpSeleccionado.getPrecio()).append("\n");
}

detalles.append("\nPrecio total con descuento: $").append(precioConDescuento);

mostrarDatos.setText(detalles.toString());        
        
    }//GEN-LAST:event_botonCumpleañosActionPerformed

    private void botonBodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBodasActionPerformed
          PrecioStrategy boda = new DescuentoPorBodasStrategy();
double precioBase = DatosUsuario.getTotalAcumulado();
double precioConDescuento = boda.calcularPrecio(precioBase);
DatosUsuario.setPrecioConDescuento(precioConDescuento);

StringBuilder detalles = new StringBuilder();
detalles.append("Espacio: ").append(DatosUsuario.getIdEpsacioSeleccionado()).append("\n");
detalles.append("Cliente: ").append(DatosUsuario.getIdUsuarioSeleccionado()).append("\n");

detalles.append("\nMenús seleccionados:\n");
for (TipoSalonSeleccionado tipSalonSeleccionado : DatosUsuario.getTipoSalonSeleccionados()) {
    detalles.append(tipSalonSeleccionado.getNombre()).append(" - $").append(tipSalonSeleccionado.getPrecio()).append("\n");
}

detalles.append("\nPrecio total con descuento: $").append(precioConDescuento);

mostrarDatos.setText(detalles.toString());        
      
    }//GEN-LAST:event_botonBodasActionPerformed

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
            java.util.logging.Logger.getLogger(DescuentosPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DescuentosPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DescuentosPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DescuentosPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescuentosPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBodas;
    private javax.swing.JButton botonCumpleaños;
    private javax.swing.JButton botonEstudiante;
    private javax.swing.JButton botonGranDescuento;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mostrarDatos;
    // End of variables declaration//GEN-END:variables
}