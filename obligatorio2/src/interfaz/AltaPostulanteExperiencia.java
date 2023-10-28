package interfaz;
import dominio.*;
import java.io.Serializable;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)
public class AltaPostulanteExperiencia extends javax.swing.JFrame implements Serializable{

     private Sistema sistema;
     private Postulante postulante;
     
    public AltaPostulanteExperiencia() {
        initComponents();
    }
    
    public AltaPostulanteExperiencia(Sistema unSistema, Postulante unPostulante) {
        this.sistema = unSistema;
        this.postulante = unPostulante;
        initComponents();
        mostrarTematicas();
    }
    
    private void mostrarTematicas(){
        //Muestra las habilidades en el combo
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

        lblTema = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        spinnerNivel = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JToggleButton();
        comboTemas = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        lblExperiencia = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaExperiencia = new javax.swing.JList();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTema.setText("Tema:");

        lblNivel.setText("Nivel:");

        spinnerNivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblExperiencia.setText("Experiencia");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        listaExperiencia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaExperiencia);

        btnRegistrar.setText("Registrar");
        btnRegistrar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNivel)
                                        .addComponent(lblTema))
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(spinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(69, 69, 69)
                                            .addComponent(btnAgregar))
                                        .addComponent(comboTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(lblExperiencia))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(btnEliminar)))
                                    .addGap(32, 32, 32)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTema)
                    .addComponent(comboTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNivel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblExperiencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        setSize(new java.awt.Dimension(529, 281));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                JOptionPane.showMessageDialog(new JFrame(), "Habilidad ya ingesada",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            //Ventana de error
            JOptionPane.showMessageDialog(new JFrame(), "Error al agregar",
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
            sistema.altaPostulante(postulante);
            JOptionPane.showMessageDialog(new JFrame(), "El postulante fue ingresado correctamente",
            "Postulante ingresado", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "Error al registrar el postulante",
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            //a ver si funca
            Habilidad h = (Habilidad)listaExperiencia.getSelectedValue();
            postulante.quitarHabilidad(h);
            mostrarExperiencia();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "Error al eliminar",
            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox comboTemas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExperiencia;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblTema;
    private javax.swing.JList listaExperiencia;
    private javax.swing.JSpinner spinnerNivel;
    // End of variables declaration//GEN-END:variables
}
