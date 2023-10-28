package interfaz;
import dominio.*;
import java.awt.Desktop;
import java.io.Serializable;
import java.net.URI;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)


public class HistoriaPostulante extends javax.swing.JFrame implements Serializable {
    private Sistema sistema;
    /**
     * Creates new form HistoriaPostulante
     */
    public HistoriaPostulante() {
        initComponents();
    }
    public HistoriaPostulante(Sistema unSistema) {
        this.sistema = unSistema;
        initComponents();
        cargarPostulantes();
    }
    
//    public void mostrarPostulante(){
//        cambiarDatosPostulantes();
//    }
    
    public void cargarPostulantes(){
        listaPostulantes.setListData(sistema.getListaPostulantes().toArray());
    }
    
    private void cambiarDatosPostulantes(Postulante post) {
        lblPostulanteNombre.setText(post.getNombre());
        lblPostulanteCedula.setText(post.getCedula());
        lblPostulanteDireccion.setText(post.getDireccion());
        lblPostulanteTelefono.setText(post.getTelefono());
        lblPostulanteMail.setText(post.getMail());
        lblPostulanteLinkedin.setText(post.getLinkedIn());
        lblPostulanteFormato.setText(post.getFormato());
        listaExperiencia.setListData(post.darHabilidades().toArray());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHistorialPostulanteTitulo = new javax.swing.JLabel();
        lblPostulantes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblFormato = new javax.swing.JLabel();
        lblExperiencia = new javax.swing.JLabel();
        lblPostulanteNombre = new javax.swing.JLabel();
        lblPostulanteCedula = new javax.swing.JLabel();
        lblPostulanteDireccion = new javax.swing.JLabel();
        lblPostulanteTelefono = new javax.swing.JLabel();
        lblPostulanteMail = new javax.swing.JLabel();
        lblPostulanteLinkedin = new javax.swing.JLabel();
        lblPostulanteFormato = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaExperiencia = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        lblBuscar = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();
        btnReset = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTabla = new javax.swing.JTable();
        btnSalir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lblHistorialPostulanteTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblHistorialPostulanteTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorialPostulanteTitulo.setText("Historial de postulante");
        getContentPane().add(lblHistorialPostulanteTitulo);
        lblHistorialPostulanteTitulo.setBounds(6, 6, 686, 30);

        lblPostulantes.setText("Postulantes:");
        getContentPane().add(lblPostulantes);
        lblPostulantes.setBounds(30, 48, 258, 16);

        listaPostulantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPostulantesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPostulantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 70, 258, 250);

        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(404, 70, 47, 16);

        lblCedula.setText("Cédula:");
        getContentPane().add(lblCedula);
        lblCedula.setBounds(411, 98, 40, 16);

        lblDireccion.setText("Dirección:");
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(398, 126, 53, 16);

        lblTelefono.setText("Teléfono:");
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(402, 154, 49, 16);

        lblMail.setText("Mail:");
        getContentPane().add(lblMail);
        lblMail.setBounds(425, 182, 26, 16);

        lblLinkedin.setText("Linkedin:");
        getContentPane().add(lblLinkedin);
        lblLinkedin.setBounds(403, 210, 48, 16);

        lblFormato.setText("Formato:");
        getContentPane().add(lblFormato);
        lblFormato.setBounds(403, 238, 48, 16);

        lblExperiencia.setText("Experiencia:");
        getContentPane().add(lblExperiencia);
        lblExperiencia.setBounds(388, 266, 63, 16);

        lblPostulanteNombre.setText("---");
        getContentPane().add(lblPostulanteNombre);
        lblPostulanteNombre.setBounds(469, 70, 199, 16);

        lblPostulanteCedula.setText("---");
        getContentPane().add(lblPostulanteCedula);
        lblPostulanteCedula.setBounds(469, 98, 199, 16);

        lblPostulanteDireccion.setText("---");
        getContentPane().add(lblPostulanteDireccion);
        lblPostulanteDireccion.setBounds(469, 126, 199, 16);

        lblPostulanteTelefono.setText("---");
        getContentPane().add(lblPostulanteTelefono);
        lblPostulanteTelefono.setBounds(469, 154, 199, 16);

        lblPostulanteMail.setText("---");
        getContentPane().add(lblPostulanteMail);
        lblPostulanteMail.setBounds(469, 182, 199, 16);

        lblPostulanteLinkedin.setText("---");
        lblPostulanteLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPostulanteLinkedinMouseClicked(evt);
            }
        });
        getContentPane().add(lblPostulanteLinkedin);
        lblPostulanteLinkedin.setBounds(469, 210, 199, 16);

        lblPostulanteFormato.setText("---");
        getContentPane().add(lblPostulanteFormato);
        lblPostulanteFormato.setBounds(469, 238, 199, 16);

        listaExperiencia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listaExperiencia);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(469, 266, 199, 54);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 332, 638, 10);

        lblBuscar.setText("Buscar:");
        getContentPane().add(lblBuscar);
        lblBuscar.setBounds(30, 351, 38, 16);
        getContentPane().add(textBuscar);
        textBuscar.setBounds(80, 348, 200, 22);

        btnBuscar.setText("Buscar");
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(314, 348, 65, 23);

        btnReset.setText("Resetear");
        getContentPane().add(btnReset);
        btnReset.setBounds(397, 348, 74, 23);

        tableTabla.setAutoCreateColumnsFromModel(false);
        tableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro.", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTabla.setShowGrid(false);
        jScrollPane3.setViewportView(tableTabla);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 383, 638, 300);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(30, 701, 52, 23);

        setSize(new java.awt.Dimension(714, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void listaPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPostulantesValueChanged
        Postulante post = (Postulante)listaPostulantes.getSelectedValue();
        cambiarDatosPostulantes(post);
    }//GEN-LAST:event_listaPostulantesValueChanged

    private void lblPostulanteLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostulanteLinkedinMouseClicked
//        try {
//            String url = lblPostulanteLinkedin.getText();
//            if (!url.startsWith("http://") && !url.startsWith("https://")) {
//                url = "http://" + url;
//            }
//            Desktop.getDesktop().browse(new URI(url));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_lblPostulanteLinkedinMouseClicked


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
            java.util.logging.Logger.getLogger(HistoriaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoriaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoriaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoriaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoriaPostulante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JToggleButton btnReset;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblExperiencia;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblHistorialPostulanteTitulo;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPostulanteCedula;
    private javax.swing.JLabel lblPostulanteDireccion;
    private javax.swing.JLabel lblPostulanteFormato;
    private javax.swing.JLabel lblPostulanteLinkedin;
    private javax.swing.JLabel lblPostulanteMail;
    private javax.swing.JLabel lblPostulanteNombre;
    private javax.swing.JLabel lblPostulanteTelefono;
    private javax.swing.JLabel lblPostulantes;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JList listaExperiencia;
    private javax.swing.JList listaPostulantes;
    private javax.swing.JTable tableTabla;
    private javax.swing.JTextField textBuscar;
    // End of variables declaration//GEN-END:variables
}
