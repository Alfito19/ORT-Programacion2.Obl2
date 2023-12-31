package interfaz;
import dominio.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.ImageIcon;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class ConsultaParaPuesto extends javax.swing.JFrame implements Serializable,PropertyChangeListener {
    private Sistema sistema;
    private ArrayList<Postulante> consultActual;
    /**
     * Creates new form ConsultaParaPuesto
     */
    public ConsultaParaPuesto() {
        initComponents();
    }
    public ConsultaParaPuesto(Sistema unSistema) {
        this.sistema = unSistema;
        this.consultActual = new ArrayList<>();
        this.sistema.addPropertyChangeListener(this);
        setIconImage(new ImageIcon(getClass().getResource("/Resources/icon.png")).getImage());
        initComponents();
        objetoAPantalla();
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        objetoAPantalla();
    }
    
    public void objetoAPantalla(){
        listaPuestos.setListData(sistema.getListaPuestos().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAltaPostulanteTitulo = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPuestos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        lblPostulantes = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        spinnerNivel = new javax.swing.JSpinner();
        lblPuestos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        lblAltaPostulanteTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblAltaPostulanteTitulo.setForeground(new java.awt.Color(220, 215, 201));
        lblAltaPostulanteTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAltaPostulanteTitulo.setText("CONSULTA PARA PUESTO");
        jPanel1.add(lblAltaPostulanteTitulo);
        lblAltaPostulanteTitulo.setBounds(0, 20, 800, 30);

        btnExportar.setBackground(new java.awt.Color(63, 78, 79));
        btnExportar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(220, 215, 201));
        btnExportar.setText("Exportar");
        btnExportar.setBorderPainted(false);
        btnExportar.setFocusPainted(false);
        btnExportar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnExportar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnExportar.setPreferredSize(new java.awt.Dimension(120, 25));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jPanel1.add(btnExportar);
        btnExportar.setBounds(500, 500, 220, 40);

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

        btnConsultar.setBackground(new java.awt.Color(63, 78, 79));
        btnConsultar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(220, 215, 201));
        btnConsultar.setText("Consultar");
        btnConsultar.setBorderPainted(false);
        btnConsultar.setFocusPainted(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar);
        btnConsultar.setBounds(460, 230, 150, 40);

        jScrollPane1.setBorder(null);

        listaPuestos.setBackground(new java.awt.Color(63, 78, 79));
        listaPuestos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listaPuestos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listaPuestos.setForeground(new java.awt.Color(220, 215, 201));
        listaPuestos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPuestos.setSelectionBackground(new java.awt.Color(220, 215, 201));
        listaPuestos.setSelectionForeground(new java.awt.Color(63, 78, 79));
        jScrollPane1.setViewportView(listaPuestos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(190, 100, 420, 110);

        jScrollPane2.setBorder(null);

        listaPostulantes.setBackground(new java.awt.Color(63, 78, 79));
        listaPostulantes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listaPostulantes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listaPostulantes.setForeground(new java.awt.Color(220, 215, 201));
        listaPostulantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPostulantes.setSelectionBackground(new java.awt.Color(220, 215, 201));
        listaPostulantes.setSelectionForeground(new java.awt.Color(63, 78, 79));
        jScrollPane2.setViewportView(listaPostulantes);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(190, 330, 420, 120);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 290, 760, 10);

        lblPostulantes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulantes.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostulantes.setText("POSTULANTES:");
        jPanel1.add(lblPostulantes);
        lblPostulantes.setBounds(190, 310, 420, 16);

        lblNivel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(220, 215, 201));
        lblNivel.setText("NIVEL:");
        jPanel1.add(lblNivel);
        lblNivel.setBounds(190, 240, 100, 25);

        spinnerNivel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        spinnerNivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spinnerNivel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(spinnerNivel);
        spinnerNivel.setBounds(320, 240, 103, 22);

        lblPuestos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPuestos.setForeground(new java.awt.Color(220, 215, 201));
        lblPuestos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuestos.setText("PUESTOS:");
        jPanel1.add(lblPuestos);
        lblPuestos.setBounds(190, 80, 420, 16);

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

        setSize(new java.awt.Dimension(814, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Puesto unPuesto = (Puesto) listaPuestos.getSelectedValue();
        if(unPuesto == null){
            JOptionPane.showMessageDialog(new JFrame(), "No deje campos vacios",
               "Error de input", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int nivel = (Integer)spinnerNivel.getValue();
            listaPostulantes.setListData(sistema.consultaPuesto(unPuesto, nivel).toArray());
            this.consultActual = sistema.consultaPuesto(unPuesto, nivel);
            //faltaria darle funcionalidad a btnExportar
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
        if (this.consultActual.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "No hay elementos para exportar",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ArchivoGrabacion arch = new ArchivoGrabacion("PostulantesAptos.txt");
            arch.grabarLinea(((Puesto)listaPuestos.getSelectedValue()).toString() + "\n");
            for(Postulante p : this.consultActual){
                arch.grabarLinea(p.toString());
            }
            arch.cerrar();
            JOptionPane.showMessageDialog(new JFrame(), "Datos exportados exitosamente",
                    "Éxito al exportar", JOptionPane.INFORMATION_MESSAGE);
            objetoAPantalla();
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        sistema.removePropertyChangeListener(this);
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
            java.util.logging.Logger.getLogger(ConsultaParaPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaParaPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaParaPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaParaPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaParaPuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnConsultar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAltaPostulanteTitulo;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblPostulantes;
    private javax.swing.JLabel lblPuestos;
    private javax.swing.JList listaPostulantes;
    private javax.swing.JList listaPuestos;
    private javax.swing.JSpinner spinnerNivel;
    // End of variables declaration//GEN-END:variables
}
