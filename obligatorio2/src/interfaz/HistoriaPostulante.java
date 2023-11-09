package interfaz;
import dominio.*;
import java.awt.Color;
import java.awt.Desktop;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class HistoriaPostulante extends javax.swing.JFrame implements Serializable,PropertyChangeListener {
    private Sistema sistema;
    public HistoriaPostulante() {
        initComponents();
    }
    public HistoriaPostulante(Sistema unSistema) {
        this.sistema = unSistema;
        this.sistema.addPropertyChangeListener(this);
        initComponents();
        cargarPostulantes();
        llenarTabla(sistema.getListaEntrevistas(),"");
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        cargarPostulantes();
    }
    
    public void llenarTabla(ArrayList<Entrevista> list, String pal){        
        DefaultTableModel modeloDefault = new DefaultTableModel();
        modeloDefault.addColumn("Nro.");
        modeloDefault.addColumn("Evaluador");
        modeloDefault.addColumn("Puntaje");
        modeloDefault.addColumn("Comentarios");
        if(!(list.isEmpty())){
            pal = textBuscar.getText();
            for(int i = 0; i < list.size(); i++){
                Entrevista entrevista = list.get(i);
                String comentario = entrevista.getComentario();
                String comentarioFormateado = marcarPalabraHTML(comentario, pal);
                modeloDefault.addRow(new Object[]{
                    entrevista.getIdentificador(),
                    entrevista.getEvaluador(),
                    entrevista.getPuntaje(),
                    comentarioFormateado
                });
            }
        }
        tableTabla.setModel(modeloDefault);
    }
    
    public String marcarPalabraHTML(String texto, String palabraBuscada) {
        if (texto == null || palabraBuscada == null || palabraBuscada.isEmpty()) {
            return texto;
        }
        // Usamos HTML para aplicar formato al texto.
        // Se busca la palabra y se envuelve en una etiqueta de fuente con color rojo.
        String palabraMarcada = "<font color='red'>" + palabraBuscada + "</font>";
        String textoFormateado = texto.replaceAll("(?i)" + palabraBuscada, palabraMarcada);

        // Envuelve todo el texto en etiquetas HTML para asegurar el formato.
        return "<html>" + textoFormateado + "</html>";
    }

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
        lblPostulanteLinkedin.setForeground(new Color(51,102,255));
        lblPostulanteFormato.setText(post.getFormato());
        listaExperiencia.setListData(post.darHabilidades().toArray());
        this.llenarTabla(sistema.entrevistasPostulante(post),"");
        textBuscar.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHistorialPostulanteTitulo = new javax.swing.JLabel();
        lblPostulanteNombre = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblPostulanteCedula = new javax.swing.JLabel();
        lblPostulanteDireccion = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblPostulanteTelefono = new javax.swing.JLabel();
        lblPostulanteMail = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblPostulanteLinkedin = new javax.swing.JLabel();
        lblPostulanteFormato = new javax.swing.JLabel();
        lblFormato = new javax.swing.JLabel();
        lblExperiencia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaExperiencia = new javax.swing.JList();
        btnSalir = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTabla = new javax.swing.JTable();
        textBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList();
        lblPostulantes = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        lblHistorialPostulanteTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblHistorialPostulanteTitulo.setForeground(new java.awt.Color(220, 215, 201));
        lblHistorialPostulanteTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistorialPostulanteTitulo.setText("HISTORIAL DE POSTULANTE");
        jPanel1.add(lblHistorialPostulanteTitulo);
        lblHistorialPostulanteTitulo.setBounds(0, 20, 800, 29);

        lblPostulanteNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulanteNombre.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulanteNombre.setText("---");
        jPanel1.add(lblPostulanteNombre);
        lblPostulanteNombre.setBounds(500, 100, 250, 25);

        lblNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(220, 215, 201));
        lblNombre.setText("NOMBRE:");
        jPanel1.add(lblNombre);
        lblNombre.setBounds(380, 100, 100, 25);

        lblCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(220, 215, 201));
        lblCedula.setText("CÉDULA:");
        jPanel1.add(lblCedula);
        lblCedula.setBounds(380, 130, 100, 25);

        lblPostulanteCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulanteCedula.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulanteCedula.setText("---");
        jPanel1.add(lblPostulanteCedula);
        lblPostulanteCedula.setBounds(500, 130, 250, 25);

        lblPostulanteDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulanteDireccion.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulanteDireccion.setText("---");
        jPanel1.add(lblPostulanteDireccion);
        lblPostulanteDireccion.setBounds(500, 160, 250, 25);

        lblDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(220, 215, 201));
        lblDireccion.setText("DIRECCIÓN:");
        jPanel1.add(lblDireccion);
        lblDireccion.setBounds(380, 160, 100, 25);

        lblTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(220, 215, 201));
        lblTelefono.setText("TELÉFONO:");
        jPanel1.add(lblTelefono);
        lblTelefono.setBounds(380, 190, 100, 25);

        lblPostulanteTelefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulanteTelefono.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulanteTelefono.setText("---");
        jPanel1.add(lblPostulanteTelefono);
        lblPostulanteTelefono.setBounds(500, 190, 250, 25);

        lblPostulanteMail.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulanteMail.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulanteMail.setText("---");
        jPanel1.add(lblPostulanteMail);
        lblPostulanteMail.setBounds(500, 220, 250, 25);

        lblMail.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblMail.setForeground(new java.awt.Color(220, 215, 201));
        lblMail.setText("MAIL:");
        jPanel1.add(lblMail);
        lblMail.setBounds(380, 220, 100, 25);

        lblLinkedin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblLinkedin.setForeground(new java.awt.Color(220, 215, 201));
        lblLinkedin.setText("LINKEDIN:");
        jPanel1.add(lblLinkedin);
        lblLinkedin.setBounds(380, 250, 100, 25);

        lblPostulanteLinkedin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulanteLinkedin.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulanteLinkedin.setText("---");
        lblPostulanteLinkedin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPostulanteLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPostulanteLinkedinMouseClicked(evt);
            }
        });
        jPanel1.add(lblPostulanteLinkedin);
        lblPostulanteLinkedin.setBounds(500, 250, 250, 25);

        lblPostulanteFormato.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulanteFormato.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulanteFormato.setText("---");
        jPanel1.add(lblPostulanteFormato);
        lblPostulanteFormato.setBounds(500, 280, 250, 25);

        lblFormato.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblFormato.setForeground(new java.awt.Color(220, 215, 201));
        lblFormato.setText("FORMATO:");
        jPanel1.add(lblFormato);
        lblFormato.setBounds(380, 280, 100, 25);

        lblExperiencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblExperiencia.setForeground(new java.awt.Color(220, 215, 201));
        lblExperiencia.setText("EXPERIENCIA:");
        jPanel1.add(lblExperiencia);
        lblExperiencia.setBounds(380, 310, 120, 25);

        jScrollPane2.setBorder(null);

        listaExperiencia.setBackground(new java.awt.Color(63, 78, 79));
        listaExperiencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listaExperiencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listaExperiencia.setForeground(new java.awt.Color(220, 215, 201));
        listaExperiencia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaExperiencia.setSelectionBackground(new java.awt.Color(220, 215, 201));
        listaExperiencia.setSelectionForeground(new java.awt.Color(63, 78, 79));
        jScrollPane2.setViewportView(listaExperiencia);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(510, 310, 240, 80);

        btnSalir.setBackground(new java.awt.Color(63, 78, 79));
        btnSalir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(220, 215, 201));
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(50, 780, 220, 40);

        jScrollPane3.setBorder(null);

        tableTabla.setAutoCreateRowSorter(true);
        tableTabla.setBackground(new java.awt.Color(63, 78, 79));
        tableTabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        tableTabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        tableTabla.setForeground(new java.awt.Color(220, 215, 201));
        tableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nro.", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
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
        tableTabla.setToolTipText("");
        tableTabla.setGridColor(new java.awt.Color(63, 78, 79));
        tableTabla.setRowHeight(25);
        tableTabla.setSelectionBackground(new java.awt.Color(63, 78, 79));
        tableTabla.setSelectionForeground(new java.awt.Color(220, 215, 201));
        tableTabla.setShowGrid(true);
        jScrollPane3.setViewportView(tableTabla);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(50, 480, 700, 280);

        textBuscar.setBackground(new java.awt.Color(63, 78, 79));
        textBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        textBuscar.setForeground(new java.awt.Color(220, 215, 201));
        textBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textBuscar);
        textBuscar.setBounds(170, 440, 240, 25);

        lblBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(220, 215, 201));
        lblBuscar.setText("BUSCAR:");
        jPanel1.add(lblBuscar);
        lblBuscar.setBounds(70, 440, 80, 25);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 410, 780, 10);

        jScrollPane1.setBorder(null);

        listaPostulantes.setBackground(new java.awt.Color(63, 78, 79));
        listaPostulantes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listaPostulantes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listaPostulantes.setForeground(new java.awt.Color(220, 215, 201));
        listaPostulantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPostulantes.setSelectionBackground(new java.awt.Color(220, 215, 201));
        listaPostulantes.setSelectionForeground(new java.awt.Color(63, 78, 79));
        listaPostulantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPostulantesMouseClicked(evt);
            }
        });
        listaPostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPostulantesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPostulantes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 120, 290, 270);

        lblPostulantes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulantes.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostulantes.setText("POSTULANTES");
        jPanel1.add(lblPostulantes);
        lblPostulantes.setBounds(50, 90, 290, 25);

        btnBuscar.setBackground(new java.awt.Color(63, 78, 79));
        btnBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(220, 215, 201));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(440, 430, 150, 40);

        btnReset.setBackground(new java.awt.Color(63, 78, 79));
        btnReset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(220, 215, 201));
        btnReset.setText("Resetear");
        btnReset.setBorderPainted(false);
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(600, 430, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(814, 877));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void listaPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPostulantesValueChanged
    }//GEN-LAST:event_listaPostulantesValueChanged

    private void lblPostulanteLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPostulanteLinkedinMouseClicked
        try {
            String url = lblPostulanteLinkedin.getText();
            if (!url.startsWith("http://") && !url.startsWith("https://")) {
                url = "http://" + url;
            }
            Desktop.getDesktop().browse(new URI(url));
        } 
        catch (IOException | URISyntaxException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Hubo un error al abrir el link.",
            "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
                    //Ventana de error
                    JOptionPane.showMessageDialog(new JFrame(), "Ocurrio un error inesperado",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_lblPostulanteLinkedinMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            String pal = textBuscar.getText().trim();
            Postulante p = (Postulante)listaPostulantes.getSelectedValue();
            if(pal.length()==0 || listaPostulantes.getSelectedValue()==null){
                JOptionPane.showMessageDialog(new JFrame(), "Ningun campo debe quedar vacío",
                            "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                ArrayList<Entrevista> entrevistasPost = sistema.entrevistasPostulante(p);
                if (entrevistasPost.isEmpty()){
                    JOptionPane.showMessageDialog(new JFrame(), "El postulante no tiene entrevistas registradas",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    ArrayList<Entrevista> entFilter = sistema.entrevistasPal(entrevistasPost, pal);
                    this.llenarTabla(entFilter,pal);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "Error al mostrar",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.llenarTabla(sistema.getListaEntrevistas(),"");
        lblPostulanteNombre.setText("---");
        lblPostulanteCedula.setText("---");
        lblPostulanteDireccion.setText("---");
        lblPostulanteTelefono.setText("---");
        lblPostulanteMail.setText("---");
        lblPostulanteLinkedin.setText("---");
        lblPostulanteLinkedin.setForeground(new Color(220,215,201));
        lblPostulanteFormato.setText("---");
        listaExperiencia.setListData((new ArrayList<>()).toArray());
        listaPostulantes.setListData(sistema.getListaPostulantes().toArray());
        textBuscar.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        sistema.removePropertyChangeListener(this);
    }//GEN-LAST:event_formWindowClosed

    private void listaPostulantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPostulantesMouseClicked
        Postulante post = (Postulante)listaPostulantes.getSelectedValue();
        cambiarDatosPostulantes(post);
    }//GEN-LAST:event_listaPostulantesMouseClicked


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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReset;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JPanel jPanel1;
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
