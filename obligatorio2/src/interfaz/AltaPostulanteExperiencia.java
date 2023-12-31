package interfaz;
import dominio.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class AltaPostulanteExperiencia extends javax.swing.JFrame implements Serializable,PropertyChangeListener{

     private Sistema sistema;
     private Postulante postulante;
     
    public AltaPostulanteExperiencia() {
        initComponents();
    }
    
    public AltaPostulanteExperiencia(Sistema unSistema, Postulante unPostulante) {
        initComponents();
        this.sistema = unSistema;
        this.sistema.addPropertyChangeListener(this);
        this.postulante = unPostulante;
        setIconImage(new ImageIcon(getClass().getResource("/Resources/icon.png")).getImage());
        lblPostulantes.setText("POSTULANTE: " + unPostulante.getNombre());
        mostrarTematicas();
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        mostrarTematicas();
    }
    
    private void mostrarTematicas(){
        //Muestra las habilidades en el combo
        DefaultComboBoxModel<Habilidad> nuevoModelo = new DefaultComboBoxModel<>();
        this.comboTemas.setModel(nuevoModelo);
        Iterator <Habilidad> it = sistema.getListaTematicas().iterator();     
        while(it.hasNext()){
            this.comboTemas.addItem(it.next());
        }
    }
    
    private void mostrarExperiencia(){
        //Muestra las habilidades del postulante en la lista
        listaExperiencia.setListData(postulante.darHabilidades().toArray());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaExperiencia = new javax.swing.JList();
        lblExperiencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        spinnerNivel = new javax.swing.JSpinner();
        lblNivel = new javax.swing.JLabel();
        comboTemas = new javax.swing.JComboBox();
        lblPostulantes = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblTema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de postulante");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

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
        btnRegistrar.setBounds(500, 370, 220, 40);

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
        btnCancelar.setBounds(80, 370, 220, 40);

        jScrollPane1.setBorder(null);

        listaExperiencia.setBackground(new java.awt.Color(63, 78, 79));
        listaExperiencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listaExperiencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listaExperiencia.setForeground(new java.awt.Color(220, 215, 201));
        listaExperiencia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaExperiencia.setSelectionBackground(new java.awt.Color(220, 215, 201));
        listaExperiencia.setSelectionForeground(new java.awt.Color(63, 78, 79));
        jScrollPane1.setViewportView(listaExperiencia);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 220, 350, 110);

        lblExperiencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblExperiencia.setForeground(new java.awt.Color(220, 215, 201));
        lblExperiencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExperiencia.setText("EXPERIENCIA");
        lblExperiencia.setToolTipText("");
        jPanel1.add(lblExperiencia);
        lblExperiencia.setBounds(110, 230, 150, 25);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 190, 760, 10);

        spinnerNivel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        spinnerNivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spinnerNivel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(spinnerNivel);
        spinnerNivel.setBounds(300, 130, 130, 25);

        lblNivel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(220, 215, 201));
        lblNivel.setText("NIVEL:");
        jPanel1.add(lblNivel);
        lblNivel.setBounds(180, 130, 100, 25);

        comboTemas.setBackground(new java.awt.Color(63, 78, 79));
        comboTemas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        comboTemas.setForeground(new java.awt.Color(220, 215, 201));
        comboTemas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(comboTemas);
        comboTemas.setBounds(300, 80, 320, 25);

        lblPostulantes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblPostulantes.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostulantes.setText("-");
        jPanel1.add(lblPostulantes);
        lblPostulantes.setBounds(180, 30, 440, 25);

        btnEliminar.setBackground(new java.awt.Color(63, 78, 79));
        btnEliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(220, 215, 201));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(110, 270, 150, 40);

        btnAgregar.setBackground(new java.awt.Color(63, 78, 79));
        btnAgregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(220, 215, 201));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(470, 130, 150, 40);

        lblTema.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblTema.setForeground(new java.awt.Color(220, 215, 201));
        lblTema.setText("TEMA:");
        jPanel1.add(lblTema);
        lblTema.setBounds(180, 80, 100, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(814, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        sistema.agregarPostulante(postulante);
        dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        sistema.removePropertyChangeListener(this);
    }//GEN-LAST:event_formWindowClosed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        postulante.quitarHabilidad((Habilidad)listaExperiencia.getSelectedValue());
        listaExperiencia.setListData(postulante.darHabilidades().toArray());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Tratamos de obtener la habilidad que esta seleccionada y el nivel marcado
        try{
            Habilidad laHab = (Habilidad) this.comboTemas.getSelectedItem();
            int nivel = ((int)this.spinnerNivel.getValue());
            //Si el postulante no tiene una habilidad con el mismo nombre  se le agrega con ese nivel
            if(postulante.habilidadNoEsta(laHab)){
                postulante.agregarHabilidad(laHab,nivel);
                mostrarExperiencia();
            }
            //En caso de que el postulante ya tenga la habilidad retorna el siguiente error
            else{
                //Ventana de error
                JOptionPane.showMessageDialog(new JFrame(), "Habilidad ya ingresada",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NullPointerException e){
            //Ventana de error
            JOptionPane.showMessageDialog(new JFrame(), "Debe agregar una habilidad.",
            "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            //Ventana de error
            JOptionPane.showMessageDialog(new JFrame(), "Error inesperado",
            "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(AltaPostulanteExperiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPostulanteExperiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPostulanteExperiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPostulanteExperiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaPostulanteExperiencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox comboTemas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExperiencia;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblPostulantes;
    private javax.swing.JLabel lblTema;
    private javax.swing.JList listaExperiencia;
    private javax.swing.JSpinner spinnerNivel;
    // End of variables declaration//GEN-END:variables
}
