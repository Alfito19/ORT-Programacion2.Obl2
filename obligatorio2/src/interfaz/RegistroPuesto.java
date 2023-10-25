package interfaz;
import dominio.*;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)


public class RegistroPuesto extends javax.swing.JFrame {
    private Sistema sistema;
    /**
     * Creates new form RegistroPuesto
     */
    public RegistroPuesto() {
        initComponents();
    }
    public RegistroPuesto(Sistema unSistema) {
        this.sistema = unSistema;
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

        lblRegistroPuestoTitulo = new javax.swing.JLabel();
        lblNombrePuesto = new javax.swing.JLabel();
        textNombrePuesto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTemas = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaTemasSelect = new javax.swing.JList();
        lblTemasDisp = new javax.swing.JLabel();
        lblTemasSel = new javax.swing.JLabel();
        btnAddRemove = new javax.swing.JToggleButton();
        radioPresencial = new javax.swing.JRadioButton();
        radioMixto = new javax.swing.JRadioButton();
        radioRemoto = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        lblRegistroPuestoTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblRegistroPuestoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistroPuestoTitulo.setText("Registro de puesto");
        getContentPane().add(lblRegistroPuestoTitulo);
        lblRegistroPuestoTitulo.setBounds(6, 6, 488, 30);

        lblNombrePuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePuesto.setText("Nombre del puesto:");
        getContentPane().add(lblNombrePuesto);
        lblNombrePuesto.setBounds(39, 57, 150, 16);
        getContentPane().add(textNombrePuesto);
        textNombrePuesto.setBounds(195, 54, 266, 22);

        listaTemas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTemas.setMaximumSize(new java.awt.Dimension(46, 90));
        jScrollPane1.setViewportView(listaTemas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(39, 116, 150, 130);

        listaTemasSelect.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTemasSelect.setMaximumSize(new java.awt.Dimension(46, 90));
        jScrollPane2.setViewportView(listaTemasSelect);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(311, 116, 150, 130);

        lblTemasDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemasDisp.setText("Temas disponibles");
        getContentPane().add(lblTemasDisp);
        lblTemasDisp.setBounds(39, 94, 150, 16);

        lblTemasSel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemasSel.setText("Temas seleccionados");
        getContentPane().add(lblTemasSel);
        lblTemasSel.setBounds(311, 94, 150, 16);

        btnAddRemove.setText("Agregar/Quitar");
        btnAddRemove.setPreferredSize(new java.awt.Dimension(108, 23));
        getContentPane().add(btnAddRemove);
        btnAddRemove.setBounds(195, 239, 110, 23);

        radioPresencial.setText("Presencial");
        getContentPane().add(radioPresencial);
        radioPresencial.setBounds(279, 297, 74, 21);

        radioMixto.setText("Mixto");
        getContentPane().add(radioMixto);
        radioMixto.setBounds(371, 297, 53, 21);

        radioRemoto.setText("Remoto");
        getContentPane().add(radioRemoto);
        radioRemoto.setBounds(195, 297, 66, 21);

        lblTipo.setText("Tipo de trabajo:");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(39, 299, 150, 16);

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(39, 350, 120, 25);

        btnRegistrar.setText("Registrar");
        btnRegistrar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(341, 350, 120, 25);

        setSize(new java.awt.Dimension(514, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
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
