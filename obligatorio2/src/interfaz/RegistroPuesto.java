package interfaz;
import dominio.*;
import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class RegistroPuesto extends javax.swing.JFrame implements Serializable{
    private Sistema sistema;
    private ArrayList<Habilidad> seleccionados;

    public RegistroPuesto() {
        initComponents();
    }
    public RegistroPuesto(Sistema unSistema) {
        this.sistema = unSistema;
        this.seleccionados = new ArrayList<>();
        initComponents();
        objetoAPantalla();
    }
    
    public ArrayList<Habilidad> getSeleccionados(){
        ArrayList<Habilidad> vuelta = new ArrayList<>();
        Iterator <Habilidad> it = this.seleccionados.iterator();
        while(it.hasNext()){
            vuelta.add(it.next());
        }
        return vuelta;
    }
    
    public void objetoAPantalla(){
        listaTemasSelect.setListData(this.seleccionados.toArray());
        listaTemas.setListData(sistema.getListaTematicas().toArray());
    }
    
    public void usoSelect(Habilidad h){
        if(!seleccionados.contains(h)){
            this.seleccionados.add(h);    
        }
        else{
            this.seleccionados.remove(h);
        }
        objetoAPantalla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        textNombrePuesto = new javax.swing.JTextField();
        lblNombrePuesto = new javax.swing.JLabel();
        lblTemasDisp = new javax.swing.JLabel();
        lblTemasSel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaTemasSelect = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTemas = new javax.swing.JList();
        btnAddRemove = new javax.swing.JToggleButton();
        lblTipo = new javax.swing.JLabel();
        radioRemoto = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        radioMixto = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblRegistroPuestoTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        textNombrePuesto.setBackground(new java.awt.Color(63, 78, 79));
        textNombrePuesto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        textNombrePuesto.setForeground(new java.awt.Color(220, 215, 201));
        textNombrePuesto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textNombrePuesto);
        textNombrePuesto.setBounds(350, 100, 320, 25);

        lblNombrePuesto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblNombrePuesto.setForeground(new java.awt.Color(220, 215, 201));
        lblNombrePuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePuesto.setText("NOMBRE DEL PUESTO:");
        jPanel1.add(lblNombrePuesto);
        lblNombrePuesto.setBounds(140, 100, 200, 25);

        lblTemasDisp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblTemasDisp.setForeground(new java.awt.Color(220, 215, 201));
        lblTemasDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemasDisp.setText("TEMAS DISPONIBLES");
        jPanel1.add(lblTemasDisp);
        lblTemasDisp.setBounds(70, 170, 250, 25);

        lblTemasSel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblTemasSel.setForeground(new java.awt.Color(220, 215, 201));
        lblTemasSel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemasSel.setText("TEMAS SELECCIONADOS");
        jPanel1.add(lblTemasSel);
        lblTemasSel.setBounds(480, 170, 250, 25);

        jScrollPane2.setBorder(null);

        listaTemasSelect.setBackground(new java.awt.Color(63, 78, 79));
        listaTemasSelect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listaTemasSelect.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listaTemasSelect.setForeground(new java.awt.Color(220, 215, 201));
        listaTemasSelect.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTemasSelect.setMaximumSize(new java.awt.Dimension(46, 90));
        listaTemasSelect.setSelectionBackground(new java.awt.Color(220, 215, 201));
        listaTemasSelect.setSelectionForeground(new java.awt.Color(63, 78, 79));
        jScrollPane2.setViewportView(listaTemasSelect);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(480, 200, 250, 180);

        jScrollPane1.setBorder(null);

        listaTemas.setBackground(new java.awt.Color(63, 78, 79));
        listaTemas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listaTemas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listaTemas.setForeground(new java.awt.Color(220, 215, 201));
        listaTemas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTemas.setMaximumSize(new java.awt.Dimension(46, 90));
        listaTemas.setSelectionBackground(new java.awt.Color(220, 215, 201));
        listaTemas.setSelectionForeground(new java.awt.Color(63, 78, 79));
        jScrollPane1.setViewportView(listaTemas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 200, 250, 180);

        btnAddRemove.setBackground(new java.awt.Color(63, 78, 79));
        btnAddRemove.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnAddRemove.setForeground(new java.awt.Color(220, 215, 201));
        btnAddRemove.setText("Agregar / Quitar");
        btnAddRemove.setBorderPainted(false);
        btnAddRemove.setFocusPainted(false);
        btnAddRemove.setPreferredSize(new java.awt.Dimension(108, 23));
        btnAddRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddRemove);
        btnAddRemove.setBounds(325, 340, 150, 40);

        lblTipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(220, 215, 201));
        lblTipo.setText("TIPO DE TRABAJO:");
        jPanel1.add(lblTipo);
        lblTipo.setBounds(120, 420, 160, 25);

        radioRemoto.setBackground(new java.awt.Color(44, 54, 57));
        btnsTipo.add(radioRemoto);
        radioRemoto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        radioRemoto.setForeground(new java.awt.Color(220, 215, 201));
        radioRemoto.setText("Remoto");
        jPanel1.add(radioRemoto);
        radioRemoto.setBounds(310, 420, 90, 25);

        radioPresencial.setBackground(new java.awt.Color(44, 54, 57));
        btnsTipo.add(radioPresencial);
        radioPresencial.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        radioPresencial.setForeground(new java.awt.Color(220, 215, 201));
        radioPresencial.setText("Presencial");
        jPanel1.add(radioPresencial);
        radioPresencial.setBounds(410, 420, 110, 25);

        radioMixto.setBackground(new java.awt.Color(44, 54, 57));
        btnsTipo.add(radioMixto);
        radioMixto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        radioMixto.setForeground(new java.awt.Color(220, 215, 201));
        radioMixto.setText("Mixto");
        jPanel1.add(radioMixto);
        radioMixto.setBounds(530, 420, 70, 25);

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
        btnRegistrar.setBounds(500, 500, 220, 40);

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
        btnCancelar.setBounds(80, 500, 220, 40);

        lblRegistroPuestoTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblRegistroPuestoTitulo.setForeground(new java.awt.Color(220, 215, 201));
        lblRegistroPuestoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistroPuestoTitulo.setText("REGISTRO DE PUESTO");
        jPanel1.add(lblRegistroPuestoTitulo);
        lblRegistroPuestoTitulo.setBounds(0, 20, 800, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRemoveActionPerformed
        // TODO add your handling code here:
        //esto permite quitar elementos seleccionados teniendolos solo seleccionados desde la listaTemasSelect
        if (listaTemas.getSelectedValue()!=null && listaTemasSelect.getSelectedValue()==null){
            this.usoSelect((Habilidad)listaTemas.getSelectedValue());
        }
        else if (listaTemasSelect.getSelectedValue()!=null){
            this.usoSelect((Habilidad)listaTemasSelect.getSelectedValue());
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una tematica", "Error"
                , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddRemoveActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try{
            String nombre = textNombrePuesto.getText().trim();
            boolean rdbtnSelected = radioRemoto.isSelected() || radioPresencial.isSelected() || radioMixto.isSelected();
            if(nombre.length()==0 || this.seleccionados.size()==0 || !rdbtnSelected){
                JOptionPane.showMessageDialog(null, "Ningun campo puede quedar vacio", "Error"
                    , JOptionPane.ERROR_MESSAGE);
            }
            else{
                String tipo ="";
                //esto es para sacar el tipo de los radio button, si se encuentra algo mejor cambiarlo
                if (radioRemoto.isSelected()){
                    tipo = "Remoto";
                }
                else if(radioPresencial.isSelected()){
                    tipo = "Presencial";
                }
                else{
                    tipo = "Mixto";
                }
                //uso un if para marcar si el trabajo ingresado es valido o no
                if(sistema.agregarPuesto(nombre,tipo,this.getSeleccionados())){
                    JOptionPane.showMessageDialog(null, "Puesto ingresado correctamente"
                            , "Error", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Puesto de trabajo ya ingresado, intente denuevo"
                            , "Error", JOptionPane.ERROR_MESSAGE);
                }
                dispose();
            }
        }
        catch(Exception e){
            //Ventana de error
            JOptionPane.showMessageDialog(null, "Error al agregar"
                            , "Error", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(RegistroPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAddRemove;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup btnsTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNombrePuesto;
    private javax.swing.JLabel lblRegistroPuestoTitulo;
    private javax.swing.JLabel lblTemasDisp;
    private javax.swing.JLabel lblTemasSel;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JList listaTemas;
    private javax.swing.JList listaTemasSelect;
    private javax.swing.JRadioButton radioMixto;
    private javax.swing.JRadioButton radioPresencial;
    private javax.swing.JRadioButton radioRemoto;
    private javax.swing.JTextField textNombrePuesto;
    // End of variables declaration//GEN-END:variables
}
