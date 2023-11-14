package interfaz;
import dominio.*;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class AltaPostulante extends javax.swing.JFrame implements Serializable{
    private Sistema sistema;

    public AltaPostulante() {
        initComponents();
    }

    public AltaPostulante(Sistema unSistema) {
        this.sistema = unSistema;
        setIconImage(new ImageIcon(getClass().getResource("/Resources/icon.png")).getImage());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoFormato = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblAltaPostulanteTitulo = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        textCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        radioMixto = new javax.swing.JRadioButton();
        radioRemoto = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        lblFormato = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        textLinkedin = new javax.swing.JTextField();
        textMail = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        lblAltaPostulanteTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblAltaPostulanteTitulo.setForeground(new java.awt.Color(220, 215, 201));
        lblAltaPostulanteTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAltaPostulanteTitulo.setText("ALTA POSTULANTE");
        jPanel1.add(lblAltaPostulanteTitulo);
        lblAltaPostulanteTitulo.setBounds(0, 20, 800, 29);

        textNombre.setBackground(new java.awt.Color(63, 78, 79));
        textNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textNombre.setForeground(new java.awt.Color(220, 215, 201));
        textNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        textNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(textNombre);
        textNombre.setBounds(290, 110, 325, 25);

        lblNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(220, 215, 201));
        lblNombre.setText("NOMBRE:");
        jPanel1.add(lblNombre);
        lblNombre.setBounds(180, 110, 100, 25);

        textCedula.setBackground(new java.awt.Color(63, 78, 79));
        textCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textCedula.setForeground(new java.awt.Color(220, 215, 201));
        textCedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textCedula);
        textCedula.setBounds(290, 160, 325, 25);

        lblCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(220, 215, 201));
        lblCedula.setText("CÉDULA:");
        jPanel1.add(lblCedula);
        lblCedula.setBounds(180, 160, 100, 25);

        textDireccion.setBackground(new java.awt.Color(63, 78, 79));
        textDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textDireccion.setForeground(new java.awt.Color(220, 215, 201));
        textDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textDireccion);
        textDireccion.setBounds(290, 210, 325, 25);

        btnSiguiente.setBackground(new java.awt.Color(63, 78, 79));
        btnSiguiente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(220, 215, 201));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setFocusPainted(false);
        btnSiguiente.setMaximumSize(new java.awt.Dimension(120, 25));
        btnSiguiente.setMinimumSize(new java.awt.Dimension(120, 25));
        btnSiguiente.setPreferredSize(new java.awt.Dimension(120, 25));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(500, 530, 220, 40);

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
        btnCancelar.setBounds(80, 530, 220, 40);

        radioMixto.setBackground(new java.awt.Color(44, 54, 57));
        grupoFormato.add(radioMixto);
        radioMixto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        radioMixto.setForeground(new java.awt.Color(220, 215, 201));
        radioMixto.setText("Mixto");
        jPanel1.add(radioMixto);
        radioMixto.setBounds(530, 410, 70, 25);

        radioRemoto.setBackground(new java.awt.Color(44, 54, 57));
        grupoFormato.add(radioRemoto);
        radioRemoto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        radioRemoto.setForeground(new java.awt.Color(220, 215, 201));
        radioRemoto.setText("Remoto");
        jPanel1.add(radioRemoto);
        radioRemoto.setBounds(310, 410, 90, 25);

        radioPresencial.setBackground(new java.awt.Color(44, 54, 57));
        grupoFormato.add(radioPresencial);
        radioPresencial.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        radioPresencial.setForeground(new java.awt.Color(220, 215, 201));
        radioPresencial.setText("Presencial");
        radioPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPresencialActionPerformed(evt);
            }
        });
        jPanel1.add(radioPresencial);
        radioPresencial.setBounds(410, 410, 110, 25);

        lblFormato.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblFormato.setForeground(new java.awt.Color(220, 215, 201));
        lblFormato.setText("FORMATO:");
        jPanel1.add(lblFormato);
        lblFormato.setBounds(180, 410, 100, 25);

        lblLinkedin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblLinkedin.setForeground(new java.awt.Color(220, 215, 201));
        lblLinkedin.setText("LINKEDIN:");
        jPanel1.add(lblLinkedin);
        lblLinkedin.setBounds(180, 360, 100, 25);

        textLinkedin.setBackground(new java.awt.Color(63, 78, 79));
        textLinkedin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textLinkedin.setForeground(new java.awt.Color(220, 215, 201));
        textLinkedin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textLinkedin);
        textLinkedin.setBounds(290, 360, 325, 25);

        textMail.setBackground(new java.awt.Color(63, 78, 79));
        textMail.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textMail.setForeground(new java.awt.Color(220, 215, 201));
        textMail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textMail);
        textMail.setBounds(290, 310, 325, 25);

        lblMail.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblMail.setForeground(new java.awt.Color(220, 215, 201));
        lblMail.setText("MAIL:");
        jPanel1.add(lblMail);
        lblMail.setBounds(180, 310, 100, 25);

        lblTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(220, 215, 201));
        lblTelefono.setText("TELÉFONO:");
        jPanel1.add(lblTelefono);
        lblTelefono.setBounds(180, 260, 100, 25);

        textTelefono.setBackground(new java.awt.Color(63, 78, 79));
        textTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        textTelefono.setForeground(new java.awt.Color(220, 215, 201));
        textTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textTelefono);
        textTelefono.setBounds(290, 260, 325, 25);

        lblDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(220, 215, 201));
        lblDireccion.setText("DIRECCIÓN:");
        jPanel1.add(lblDireccion);
        lblDireccion.setBounds(180, 210, 100, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(814, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        //Generamos un boolean para controlar si el formato esta marcado.
        boolean puede = false;
        //Intentamos obtener todos los datos sin error.
        try{
            String nombre = this.textNombre.getText().trim();
            String cedula = this.textCedula.getText().trim();
            String direccion = this.textDireccion.getText().trim();
            String telefono = this.textTelefono.getText().trim();
            String mail = this.textMail.getText().trim();
            String linkedin = this.textLinkedin.getText().trim();
            String formato = "";
            if(this.radioMixto.isSelected()){
                formato = "Mixto";
                puede = true;
            }
            else if(this.radioPresencial.isSelected()){
                formato = "Presencial";
                puede = true;
            }
            else if(this.radioRemoto.isSelected()){
                formato = "Remoto";
                puede = true;
            }
            
            //Si todos los datos estan completos intentaremos pasar a long la cedula, verificando asi si es numero.
            if(puede && !(nombre.isEmpty() || cedula.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || mail.isEmpty() || linkedin.isEmpty())){
                try{
                    Long.parseLong(cedula);
                    //Una vez chequeado que cedula es numero y unica en sistema, abrimos la ventana de habilidades/experiencia del usuario pasando los datos recopilados y cerramos la ventana de alta de postulante.
                    if(sistema.cedulaUnica(cedula)){
                        AltaPostulanteExperiencia vent = new AltaPostulanteExperiencia(sistema,new Postulante(nombre, (""+cedula), direccion, telefono, mail, linkedin, formato, new ArrayList<>()));
                        vent.setVisible(true);
                        dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(new JFrame(), "Ya existe un ingreso con esa cedula",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                //En caso de que Cedula no sea un numero entrara en la siguiente excepcion
                catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(new JFrame(), "La cedula debe ser un numero",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception e){
                    //Ventana de error
                    JOptionPane.showMessageDialog(new JFrame(), "Ocurrio un error inesperado",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            //En caso de que los datos no esten completos entrara en la siguiente excepcion
            else{
                //Ventana de error
                JOptionPane.showMessageDialog(new JFrame(), "Los datos estan incompletos",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            //Ventana de error
            JOptionPane.showMessageDialog(new JFrame(), "Ocurrio un error inesperado",
                "Error", JOptionPane.ERROR_MESSAGE);
        }               
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void radioPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPresencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPresencialActionPerformed

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
            java.util.logging.Logger.getLogger(AltaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaPostulante().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup grupoFormato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAltaPostulanteTitulo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JRadioButton radioMixto;
    private javax.swing.JRadioButton radioPresencial;
    private javax.swing.JRadioButton radioRemoto;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textLinkedin;
    private javax.swing.JTextField textMail;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
