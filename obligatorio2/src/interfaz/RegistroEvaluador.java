package interfaz;
import dominio.*;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class RegistroEvaluador extends javax.swing.JFrame implements Serializable {
    private Sistema sistema;

    public RegistroEvaluador() {
        initComponents();
    }
    public RegistroEvaluador(Sistema unSistema) {
        this.sistema = unSistema;
        initComponents();
    }
    
    public void objetoAPantalla(){
        textNombre.setText("");
        textCedula.setText("");
        textDireccion.setText("");
        textTelefono.setText("");
        textIngreso.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAltaEvaluadorTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textCedula = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        textIngreso = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        lblAltaEvaluadorTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblAltaEvaluadorTitulo.setForeground(new java.awt.Color(220, 215, 201));
        lblAltaEvaluadorTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAltaEvaluadorTitulo.setText("ALTA EVALUADOR");
        jPanel1.add(lblAltaEvaluadorTitulo);
        lblAltaEvaluadorTitulo.setBounds(0, 20, 650, 29);

        lblNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(220, 215, 201));
        lblNombre.setText("NOMBRE:");
        jPanel1.add(lblNombre);
        lblNombre.setBounds(90, 90, 160, 25);

        lblCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(220, 215, 201));
        lblCedula.setText("CÉDULA:");
        jPanel1.add(lblCedula);
        lblCedula.setBounds(90, 140, 160, 25);

        textNombre.setBackground(new java.awt.Color(63, 78, 79));
        textNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textNombre.setForeground(new java.awt.Color(220, 215, 201));
        textNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textNombre);
        textNombre.setBounds(260, 90, 300, 25);

        textCedula.setBackground(new java.awt.Color(63, 78, 79));
        textCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textCedula.setForeground(new java.awt.Color(220, 215, 201));
        textCedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textCedula);
        textCedula.setBounds(260, 140, 300, 25);

        lblDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(220, 215, 201));
        lblDireccion.setText("DIRECCIÓN:");
        jPanel1.add(lblDireccion);
        lblDireccion.setBounds(90, 190, 160, 25);

        textDireccion.setBackground(new java.awt.Color(63, 78, 79));
        textDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textDireccion.setForeground(new java.awt.Color(220, 215, 201));
        textDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textDireccion);
        textDireccion.setBounds(260, 190, 300, 25);

        lblTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(220, 215, 201));
        lblTelefono.setText("TELÉFONO:");
        jPanel1.add(lblTelefono);
        lblTelefono.setBounds(90, 240, 160, 25);

        textTelefono.setBackground(new java.awt.Color(63, 78, 79));
        textTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textTelefono.setForeground(new java.awt.Color(220, 215, 201));
        textTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textTelefono);
        textTelefono.setBounds(260, 240, 300, 25);

        lblMail.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblMail.setForeground(new java.awt.Color(220, 215, 201));
        lblMail.setText("AÑO DE INGRESO:");
        jPanel1.add(lblMail);
        lblMail.setBounds(90, 290, 160, 25);

        textIngreso.setBackground(new java.awt.Color(63, 78, 79));
        textIngreso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textIngreso.setForeground(new java.awt.Color(220, 215, 201));
        textIngreso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textIngreso);
        textIngreso.setBounds(260, 290, 300, 25);

        btnCancelar.setBackground(new java.awt.Color(63, 78, 79));
        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(220, 215, 201));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(60, 360, 220, 40);

        btnRegistrar.setBackground(new java.awt.Color(63, 78, 79));
        btnRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(220, 215, 201));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(370, 360, 220, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(664, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    //agrega evaluador confirmando el correcto ingreso de datos y que este no este repetido 
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String unNombre = textNombre.getText().trim();
        String unaCedula = textCedula.getText().trim();
        String unaDireccion = textDireccion.getText().trim();
        String unTelefono = textTelefono.getText().trim();
        String unIngreso = textIngreso.getText().trim();
        if(unNombre.length()==0 || unaCedula.length()==0 || unaDireccion.length()==0 || unTelefono.length()==0 || unIngreso.length()==0){
            JOptionPane.showMessageDialog(new JFrame(), "No deje campos vacios",
               "Error de input", JOptionPane.ERROR_MESSAGE);
        }
        else{
             try{
                    Long.parseLong(unaCedula);
                    Long.parseLong(unIngreso);
                    //Una vez chequeado que cedula es numero, generamos el postulante y abrimos la ventana de habilidades/experiencia del usuario y cerramos la ventana de alta de postulante.
                    if(!sistema.agregarEvaluador(unNombre, unaCedula, unaDireccion, Long.parseLong(unIngreso))){
                        JOptionPane.showMessageDialog(new JFrame(), "El evaluador ingresado debe ser único",
                            "Evaluador repetido", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(new JFrame(), "El evaluador fue ingresado correctamente",
                            "Evaluador ingresado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    dispose();
                }
                //En caso de que Cedula no sea un numero entrara en la siguiente excepcion
            catch(Exception e){
                //Ventana de error
                JOptionPane.showMessageDialog(new JFrame(), "La cedula e ingreso deben ser numeros",
                            "Error", JOptionPane.ERROR_MESSAGE);
            }            
        }
        objetoAPantalla();
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEvaluador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEvaluador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAltaEvaluadorTitulo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textIngreso;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
