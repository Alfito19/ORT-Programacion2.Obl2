package interfaz;
import dominio.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class BajaPostulante extends javax.swing.JFrame implements Serializable,PropertyChangeListener {
    private Sistema sistema;

    public BajaPostulante() {
        initComponents();
    }
    public BajaPostulante(Sistema unSistema) {
        this.sistema = unSistema;
        this.sistema.addPropertyChangeListener(this);
        initComponents();
        objetoAPantalla();
    }
    
    public void objetoAPantalla(){
        //Muestra todos los postulantes en la lista
        listaPostulantes.setListData(sistema.getListaPostulantes().toArray());
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        objetoAPantalla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBajaPostulanteTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        lblBajaPostulanteTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblBajaPostulanteTitulo.setForeground(new java.awt.Color(220, 215, 201));
        lblBajaPostulanteTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBajaPostulanteTitulo.setText("BAJA POSTULANTE");
        jPanel1.add(lblBajaPostulanteTitulo);
        lblBajaPostulanteTitulo.setBounds(0, 20, 650, 29);

        jScrollPane1.setBorder(null);

        listaPostulantes.setBackground(new java.awt.Color(63, 78, 79));
        listaPostulantes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listaPostulantes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listaPostulantes.setForeground(new java.awt.Color(220, 215, 201));
        listaPostulantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaPostulantes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 80, 450, 181);

        btnEliminar.setBackground(new java.awt.Color(63, 78, 79));
        btnEliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(220, 215, 201));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setMaximumSize(new java.awt.Dimension(100, 25));
        btnEliminar.setMinimumSize(new java.awt.Dimension(100, 25));
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(370, 300, 220, 40);

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
        btnCancelar.setBounds(60, 300, 220, 40);

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
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Intenta obtener el postulante seleccionado de la lista y eliminarlo
        try{
            Postulante unP = (Postulante)listaPostulantes.getSelectedValue();
            sistema.eliminarPostulante(unP);
        }
        //En caso de que no poder obtener el postulante o eliminarlo entra al siguiente catch
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "Error al eliminar el postulante",
            "Error", JOptionPane.ERROR_MESSAGE);
        }
        //Muestra nuevamente todos los postulantes (actualizado, sin el postulante eliminado)
        objetoAPantalla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //Cierra la ventana
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        sistema.removePropertyChangeListener(this);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(BajaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaPostulante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBajaPostulanteTitulo;
    private javax.swing.JList listaPostulantes;
    // End of variables declaration//GEN-END:variables
}
