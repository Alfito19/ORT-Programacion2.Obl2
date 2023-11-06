package interfaz;
import dominio.*;
import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class RegistroTematica extends javax.swing.JFrame implements Serializable, Observer{
    private Sistema sistema;
    
    public RegistroTematica() {
        initComponents();
    }
    public RegistroTematica(Sistema unSistema) {
        this.sistema = unSistema;
        initComponents();
        sistema.addObserver(this);
        update(null, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegistoTematicaTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        textNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        lblRegistoTematicaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblRegistoTematicaTitulo.setForeground(new java.awt.Color(220, 215, 201));
        lblRegistoTematicaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistoTematicaTitulo.setText("REGISTRO DE TEMÁTICA");
        jPanel1.add(lblRegistoTematicaTitulo);
        lblRegistoTematicaTitulo.setBounds(0, 20, 650, 29);

        jScrollPane1.setBackground(new java.awt.Color(63, 78, 79));
        jScrollPane1.setBorder(null);

        txtDescripcion.setBackground(new java.awt.Color(63, 78, 79));
        txtDescripcion.setColumns(15);
        txtDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(220, 215, 201));
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 140, 320, 110);

        textNombre.setBackground(new java.awt.Color(63, 78, 79));
        textNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        textNombre.setForeground(new java.awt.Color(220, 215, 201));
        textNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        jPanel1.add(textNombre);
        textNombre.setBounds(230, 90, 320, 25);

        lblNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(220, 215, 201));
        lblNombre.setText("NOMBRE:");
        jPanel1.add(lblNombre);
        lblNombre.setBounds(80, 90, 140, 25);

        lblDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(220, 215, 201));
        lblDescripcion.setText("DESCRIPCIÓN:");
        jPanel1.add(lblDescripcion);
        lblDescripcion.setBounds(80, 140, 140, 25);

        btnRegistrar.setBackground(new java.awt.Color(63, 78, 79));
        btnRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(220, 215, 201));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setMaximumSize(new java.awt.Dimension(100, 25));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(100, 25));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(370, 320, 220, 40);

        btnCancelar.setBackground(new java.awt.Color(63, 78, 79));
        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(220, 215, 201));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 25));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(60, 320, 220, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(664, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = textNombre.getText().trim();
        String descripcion = txtDescripcion.getText().trim();
        boolean canDispose = false;
        if (nombre.equals("") || descripcion.equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "No deje campos vacios",
            "Error de input", JOptionPane.ERROR_MESSAGE);
        }
        else if(!sistema.agregarTematica(nombre, descripcion)){
            JOptionPane.showMessageDialog(new JFrame(), "La tematica ingresada debe ser única",
            "Tematica repetida", JOptionPane.ERROR_MESSAGE);
        }
        else{
            canDispose = true;
        }
        if(canDispose){
            dispose();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroTematica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistoTematicaTitulo;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
