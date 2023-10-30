package interfaz;
import dominio.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)


public class ConsultaPorTematica extends javax.swing.JFrame {
    private Sistema sistema;

    public ConsultaPorTematica() {
        initComponents();
    }
    public ConsultaPorTematica(Sistema unSistema) {
        this.sistema = unSistema;
        initComponents();
        objetoAPantalla();
    }
    
    public void objetoAPantalla(){
        listTematicas.setListData(this.sistema.getListaTematicas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTematicas = new javax.swing.JList();
        btnConsulta = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblTemasDisp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 215, 201));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA POR TEMÁTICA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 600, 29);

        jScrollPane1.setBorder(null);

        listTematicas.setBackground(new java.awt.Color(63, 78, 79));
        listTematicas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listTematicas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listTematicas.setForeground(new java.awt.Color(220, 215, 201));
        listTematicas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listTematicas.setSelectionBackground(new java.awt.Color(220, 215, 201));
        listTematicas.setSelectionForeground(new java.awt.Color(63, 78, 79));
        jScrollPane1.setViewportView(listTematicas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 100, 330, 130);

        btnConsulta.setBackground(new java.awt.Color(63, 78, 79));
        btnConsulta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnConsulta.setForeground(new java.awt.Color(220, 215, 201));
        btnConsulta.setText("Consultar");
        btnConsulta.setBorderPainted(false);
        btnConsulta.setFocusPainted(false);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsulta);
        btnConsulta.setBounds(400, 145, 150, 40);

        lblResultado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(220, 215, 201));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Seleccione un tema.");
        jPanel1.add(lblResultado);
        lblResultado.setBounds(50, 250, 500, 90);

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
        btnSalir.setBounds(190, 360, 220, 40);

        lblTemasDisp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblTemasDisp.setForeground(new java.awt.Color(220, 215, 201));
        lblTemasDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemasDisp.setText("TEMAS DISPONIBLES");
        jPanel1.add(lblTemasDisp);
        lblTemasDisp.setBounds(60, 70, 320, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(616, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
        try{
            Habilidad unaT = (Habilidad)listTematicas.getSelectedValue();
            lblResultado.setText(sistema.consultaTematica(unaT));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar una tematica",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaPorTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPorTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPorTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPorTematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPorTematica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTemasDisp;
    private javax.swing.JList listTematicas;
    // End of variables declaration//GEN-END:variables
}
