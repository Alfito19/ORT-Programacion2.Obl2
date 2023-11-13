package interfaz;
import dominio.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class PrimerConsulta extends javax.swing.JFrame implements Serializable{

    public PrimerConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRecuperarDatos = new javax.swing.JButton();
        btnNuevoArchivo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        btnRecuperarDatos.setBackground(new java.awt.Color(63, 78, 79));
        btnRecuperarDatos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRecuperarDatos.setForeground(new java.awt.Color(220, 215, 201));
        btnRecuperarDatos.setText("Recuperar datos");
        btnRecuperarDatos.setBorderPainted(false);
        btnRecuperarDatos.setFocusPainted(false);
        btnRecuperarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecuperarDatos);
        btnRecuperarDatos.setBounds(50, 160, 220, 40);

        btnNuevoArchivo.setBackground(new java.awt.Color(63, 78, 79));
        btnNuevoArchivo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnNuevoArchivo.setForeground(new java.awt.Color(220, 215, 201));
        btnNuevoArchivo.setText("Nuevo archivo");
        btnNuevoArchivo.setBorderPainted(false);
        btnNuevoArchivo.setFocusPainted(false);
        btnNuevoArchivo.setMaximumSize(new java.awt.Dimension(116, 23));
        btnNuevoArchivo.setMinimumSize(new java.awt.Dimension(116, 23));
        btnNuevoArchivo.setPreferredSize(new java.awt.Dimension(116, 23));
        btnNuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoArchivo);
        btnNuevoArchivo.setBounds(330, 160, 220, 40);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 215, 201));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("o recuperar datos anteriores");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 70, 580, 32);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 215, 201));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desea comenzar un nuevo archivo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 40, 600, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(614, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecuperarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarDatosActionPerformed
        try {
            ObjectInputStream in = new
            ObjectInputStream(
            Files.newInputStream(Paths.get("datos.ser")));
            Sistema controlador = (Sistema) in.readObject();
            Menu vent = new Menu(controlador);
            vent.setVisible(true);
            dispose();
            in.close();
        } catch (IOException|ClassNotFoundException e) {
            JOptionPane.showMessageDialog(new JFrame(), "No se pudo recuperar correctamente, se iniciará un sistema vacio",
            "Error de recuperación", JOptionPane.ERROR_MESSAGE);
            Sistema controlador = new Sistema();
            Menu vent = new Menu(controlador);
            vent.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnRecuperarDatosActionPerformed

    private void btnNuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoArchivoActionPerformed
        Sistema controlador = new Sistema();
        Menu vent = new Menu(controlador);
        vent.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNuevoArchivoActionPerformed

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
            java.util.logging.Logger.getLogger(PrimerConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimerConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimerConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimerConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimerConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoArchivo;
    private javax.swing.JButton btnRecuperarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
