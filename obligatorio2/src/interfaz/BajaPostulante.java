package interfaz;
import dominio.*;
import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class BajaPostulante extends javax.swing.JFrame implements Serializable {
    private Sistema sistema;

    public BajaPostulante() {
        initComponents();
    }
    public BajaPostulante(Sistema unSistema) {
        this.sistema = unSistema;
        initComponents();
        objetoAPantalla();
    }
    
    public void objetoAPantalla(){
        //Muestra todos los postulantes en la lista
        listaPostulantes.setListData(sistema.getListaPostulantes().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBajaPostulanteTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lblBajaPostulanteTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblBajaPostulanteTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBajaPostulanteTitulo.setText("Baja postulante");
        getContentPane().add(lblBajaPostulanteTitulo);
        lblBajaPostulanteTitulo.setBounds(6, 6, 488, 30);

        listaPostulantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaPostulantes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 68, 340, 181);

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 25));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(80, 299, 100, 25);

        btnEliminar.setText("Eliminar");
        btnEliminar.setMaximumSize(new java.awt.Dimension(100, 25));
        btnEliminar.setMinimumSize(new java.awt.Dimension(100, 25));
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(320, 299, 100, 25);

        setSize(new java.awt.Dimension(514, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Intenta obtener el postulante seleccionado de la lista y eliminarlo
        try{
            Postulante unP = (Postulante)listaPostulantes.getSelectedValue();
            sistema.eliminarPostulante(unP);
            JOptionPane.showMessageDialog(new JFrame(), "El postulante fue eliminado correctamente",
            "Postulante eliminado", JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBajaPostulanteTitulo;
    private javax.swing.JList listaPostulantes;
    // End of variables declaration//GEN-END:variables
}
