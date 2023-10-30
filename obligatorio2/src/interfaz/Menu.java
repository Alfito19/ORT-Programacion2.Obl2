package interfaz;

import dominio.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class Menu extends javax.swing.JFrame implements Serializable {
    private Sistema sistema;

    public Menu() {
        initComponents();
    }
    public Menu(Sistema unSistema) {
        this.sistema = unSistema;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBajaPostulante = new javax.swing.JToggleButton();
        btnIngresoEntrevista = new javax.swing.JToggleButton();
        btnConsultaPuesto = new javax.swing.JToggleButton();
        btnFin = new javax.swing.JToggleButton();
        btnHistoriaPostulante = new javax.swing.JToggleButton();
        btnRegistroPuesto = new javax.swing.JToggleButton();
        btnRegistroEvaluador = new javax.swing.JToggleButton();
        btnAltaPostulante = new javax.swing.JToggleButton();
        lblMenuTitulo = new javax.swing.JLabel();
        btnRegistroTematica = new javax.swing.JButton();
        btnConsultaTematica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 715));
        jPanel1.setLayout(null);

        btnBajaPostulante.setBackground(new java.awt.Color(63, 78, 79));
        btnBajaPostulante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnBajaPostulante.setForeground(new java.awt.Color(220, 215, 201));
        btnBajaPostulante.setText("Baja de postulante");
        btnBajaPostulante.setBorderPainted(false);
        btnBajaPostulante.setFocusPainted(false);
        btnBajaPostulante.setMaximumSize(new java.awt.Dimension(215, 40));
        btnBajaPostulante.setMinimumSize(new java.awt.Dimension(215, 40));
        btnBajaPostulante.setPreferredSize(new java.awt.Dimension(215, 40));
        btnBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaPostulanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBajaPostulante);
        btnBajaPostulante.setBounds(450, 230, 220, 40);

        btnIngresoEntrevista.setBackground(new java.awt.Color(63, 78, 79));
        btnIngresoEntrevista.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnIngresoEntrevista.setForeground(new java.awt.Color(220, 215, 201));
        btnIngresoEntrevista.setText("Ingreso de entrevista");
        btnIngresoEntrevista.setBorderPainted(false);
        btnIngresoEntrevista.setFocusPainted(false);
        btnIngresoEntrevista.setMaximumSize(new java.awt.Dimension(150, 25));
        btnIngresoEntrevista.setMinimumSize(new java.awt.Dimension(150, 25));
        btnIngresoEntrevista.setPreferredSize(new java.awt.Dimension(150, 25));
        btnIngresoEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoEntrevistaActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresoEntrevista);
        btnIngresoEntrevista.setBounds(130, 470, 220, 40);

        btnConsultaPuesto.setBackground(new java.awt.Color(63, 78, 79));
        btnConsultaPuesto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnConsultaPuesto.setForeground(new java.awt.Color(220, 215, 201));
        btnConsultaPuesto.setText("Consulta para puesto");
        btnConsultaPuesto.setBorderPainted(false);
        btnConsultaPuesto.setFocusPainted(false);
        btnConsultaPuesto.setMaximumSize(new java.awt.Dimension(150, 25));
        btnConsultaPuesto.setMinimumSize(new java.awt.Dimension(150, 25));
        btnConsultaPuesto.setPreferredSize(new java.awt.Dimension(150, 25));
        btnConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPuestoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultaPuesto);
        btnConsultaPuesto.setBounds(450, 390, 220, 40);

        btnFin.setBackground(new java.awt.Color(63, 78, 79));
        btnFin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnFin.setForeground(new java.awt.Color(220, 215, 201));
        btnFin.setText("Fin");
        btnFin.setBorderPainted(false);
        btnFin.setFocusPainted(false);
        btnFin.setMaximumSize(new java.awt.Dimension(150, 25));
        btnFin.setMinimumSize(new java.awt.Dimension(150, 25));
        btnFin.setPreferredSize(new java.awt.Dimension(150, 25));
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });
        jPanel1.add(btnFin);
        btnFin.setBounds(450, 470, 220, 40);

        btnHistoriaPostulante.setBackground(new java.awt.Color(63, 78, 79));
        btnHistoriaPostulante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnHistoriaPostulante.setForeground(new java.awt.Color(220, 215, 201));
        btnHistoriaPostulante.setText("Historia de postulante");
        btnHistoriaPostulante.setBorderPainted(false);
        btnHistoriaPostulante.setFocusPainted(false);
        btnHistoriaPostulante.setMaximumSize(new java.awt.Dimension(150, 25));
        btnHistoriaPostulante.setMinimumSize(new java.awt.Dimension(150, 25));
        btnHistoriaPostulante.setPreferredSize(new java.awt.Dimension(150, 25));
        btnHistoriaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaPostulanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnHistoriaPostulante);
        btnHistoriaPostulante.setBounds(450, 310, 220, 40);

        btnRegistroPuesto.setBackground(new java.awt.Color(63, 78, 79));
        btnRegistroPuesto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistroPuesto.setForeground(new java.awt.Color(220, 215, 201));
        btnRegistroPuesto.setText("Registro de puesto");
        btnRegistroPuesto.setBorderPainted(false);
        btnRegistroPuesto.setFocusPainted(false);
        btnRegistroPuesto.setMaximumSize(new java.awt.Dimension(150, 25));
        btnRegistroPuesto.setMinimumSize(new java.awt.Dimension(150, 25));
        btnRegistroPuesto.setPreferredSize(new java.awt.Dimension(150, 25));
        btnRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPuestoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroPuesto);
        btnRegistroPuesto.setBounds(130, 390, 220, 40);

        btnRegistroEvaluador.setBackground(new java.awt.Color(63, 78, 79));
        btnRegistroEvaluador.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistroEvaluador.setForeground(new java.awt.Color(220, 215, 201));
        btnRegistroEvaluador.setText("Registro de evaluador");
        btnRegistroEvaluador.setBorderPainted(false);
        btnRegistroEvaluador.setFocusPainted(false);
        btnRegistroEvaluador.setMaximumSize(new java.awt.Dimension(150, 25));
        btnRegistroEvaluador.setMinimumSize(new java.awt.Dimension(150, 25));
        btnRegistroEvaluador.setPreferredSize(new java.awt.Dimension(150, 25));
        btnRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEvaluadorActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroEvaluador);
        btnRegistroEvaluador.setBounds(130, 310, 220, 40);

        btnAltaPostulante.setBackground(new java.awt.Color(63, 78, 79));
        btnAltaPostulante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnAltaPostulante.setForeground(new java.awt.Color(220, 215, 201));
        btnAltaPostulante.setText("Registro de postulante");
        btnAltaPostulante.setBorderPainted(false);
        btnAltaPostulante.setFocusPainted(false);
        btnAltaPostulante.setMaximumSize(new java.awt.Dimension(150, 25));
        btnAltaPostulante.setMinimumSize(new java.awt.Dimension(150, 25));
        btnAltaPostulante.setPreferredSize(new java.awt.Dimension(150, 25));
        btnAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaPostulanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAltaPostulante);
        btnAltaPostulante.setBounds(130, 230, 220, 40);

        lblMenuTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblMenuTitulo.setForeground(new java.awt.Color(220, 215, 201));
        lblMenuTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuTitulo.setText("NOMBRE DE APP");
        jPanel1.add(lblMenuTitulo);
        lblMenuTitulo.setBounds(10, 40, 790, 29);

        btnRegistroTematica.setBackground(new java.awt.Color(63, 78, 79));
        btnRegistroTematica.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistroTematica.setForeground(new java.awt.Color(220, 215, 201));
        btnRegistroTematica.setText("Registro de temática");
        btnRegistroTematica.setBorderPainted(false);
        btnRegistroTematica.setFocusPainted(false);
        btnRegistroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroTematicaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroTematica);
        btnRegistroTematica.setBounds(130, 150, 220, 40);

        btnConsultaTematica.setBackground(new java.awt.Color(63, 78, 79));
        btnConsultaTematica.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnConsultaTematica.setForeground(new java.awt.Color(220, 215, 201));
        btnConsultaTematica.setText("Consulta por temática");
        btnConsultaTematica.setBorderPainted(false);
        btnConsultaTematica.setFocusPainted(false);
        btnConsultaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaTematicaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultaTematica);
        btnConsultaTematica.setBounds(450, 150, 220, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(814, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaPostulanteActionPerformed
        // TODO add your handling code here:
        AltaPostulante vent = new AltaPostulante(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_btnAltaPostulanteActionPerformed

    private void btnBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaPostulanteActionPerformed
        // TODO add your handling code here:
        BajaPostulante vent = new BajaPostulante(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_btnBajaPostulanteActionPerformed

    private void btnRegistroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEvaluadorActionPerformed
        // TODO add your handling code here:
        RegistroEvaluador vent = new RegistroEvaluador(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_btnRegistroEvaluadorActionPerformed

    private void btnIngresoEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoEntrevistaActionPerformed
        // TODO add your handling code here:
        IngresoEntrevista vent = new IngresoEntrevista(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_btnIngresoEntrevistaActionPerformed

    private void btnRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPuestoActionPerformed
        // TODO add your handling code here:
        RegistroPuesto vent = new RegistroPuesto(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_btnRegistroPuestoActionPerformed

    private void btnConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaPuestoActionPerformed
        // TODO add your handling code here:
        ConsultaParaPuesto vent = new ConsultaParaPuesto(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_btnConsultaPuestoActionPerformed

    private void btnHistoriaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaPostulanteActionPerformed
        // TODO add your handling code here:
        HistoriaPostulante vent = new HistoriaPostulante(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_btnHistoriaPostulanteActionPerformed

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnFinActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        try {
            ObjectOutputStream out = new
            ObjectOutputStream(
            Files.newOutputStream(Paths.get("datos.ser")));
            out.writeObject(sistema);
            out.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error al guardar el archivo",
            "Error al guardar el archivo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_formWindowClosed

    private void btnRegistroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroTematicaActionPerformed
        RegistroTematica vent = new RegistroTematica(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_btnRegistroTematicaActionPerformed

    private void btnConsultaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaTematicaActionPerformed
        ConsultaPorTematica vent = new ConsultaPorTematica(sistema);
        vent.setVisible(true);
    }//GEN-LAST:event_btnConsultaTematicaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAltaPostulante;
    private javax.swing.JToggleButton btnBajaPostulante;
    private javax.swing.JToggleButton btnConsultaPuesto;
    private javax.swing.JButton btnConsultaTematica;
    private javax.swing.JToggleButton btnFin;
    private javax.swing.JToggleButton btnHistoriaPostulante;
    private javax.swing.JToggleButton btnIngresoEntrevista;
    private javax.swing.JToggleButton btnRegistroEvaluador;
    private javax.swing.JToggleButton btnRegistroPuesto;
    private javax.swing.JButton btnRegistroTematica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMenuTitulo;
    // End of variables declaration//GEN-END:variables
}
