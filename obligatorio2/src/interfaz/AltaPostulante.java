package interfaz;
import dominio.*;
import java.io.Serializable;
import java.util.ArrayList;
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
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoFormato = new javax.swing.ButtonGroup();
        lblAltaPostulanteTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblFormato = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textCedula = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textMail = new javax.swing.JTextField();
        textLinkedin = new javax.swing.JTextField();
        radioRemoto = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        radioMixto = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblAltaPostulanteTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblAltaPostulanteTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAltaPostulanteTitulo.setText("Alta postulante");

        lblNombre.setText("Nombre:");

        lblCedula.setText("Cédula:");

        lblDireccion.setText("Dirección:");

        lblTelefono.setText("Teléfono:");

        lblMail.setText("Mail:");

        lblLinkedin.setText("Linkedin:");

        lblFormato.setText("Formato:");

        grupoFormato.add(radioRemoto);
        radioRemoto.setText("Remoto");

        grupoFormato.add(radioPresencial);
        radioPresencial.setText("Presencial");

        grupoFormato.add(radioMixto);
        radioMixto.setText("Mixto");

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.setMaximumSize(new java.awt.Dimension(120, 25));
        btnSiguiente.setMinimumSize(new java.awt.Dimension(120, 25));
        btnSiguiente.setPreferredSize(new java.awt.Dimension(120, 25));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAltaPostulanteTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioRemoto)
                                .addGap(30, 30, 30)
                                .addComponent(radioPresencial)
                                .addGap(30, 30, 30)
                                .addComponent(radioMixto)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textMail))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textTelefono))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textDireccion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textCedula))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textNombre))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textLinkedin))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAltaPostulanteTitulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(textCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMail)
                    .addComponent(textMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLinkedin)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFormato)
                            .addComponent(radioRemoto)
                            .addComponent(radioPresencial)
                            .addComponent(radioMixto))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(542, 464));
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
                catch(Exception e){
                    //Ventana de error
                    JOptionPane.showMessageDialog(new JFrame(), "La cedula debe ser un numero",
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
        //En caso de que los datos no esten completos entrara en la siguiente excepcion
        catch(Exception e){
            //Ventana de error
            JOptionPane.showMessageDialog(new JFrame(), "Datos incompletos",
            "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
