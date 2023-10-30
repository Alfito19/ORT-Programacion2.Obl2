package interfaz;
import dominio.*;
import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class IngresoEntrevista extends javax.swing.JFrame implements Serializable {
    private Sistema sistema;

    public IngresoEntrevista() {
        initComponents();
    }
    public IngresoEntrevista(Sistema unSistema) {
        this.sistema = unSistema;
        initComponents();
        objetoAPantalla();
    }
    public void objetoAPantalla(){
        listEvaluador.setListData(sistema.getListaEvaluadores().toArray());
        listPostulante.setListData(sistema.getListaPostulantes().toArray());
        textPuntaje.setText("");
        textComentarios.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIngresoEntrevistaTitulo = new javax.swing.JLabel();
        listaPostulante = new javax.swing.JScrollPane();
        listPostulante = new javax.swing.JList();
        lblPostulante = new javax.swing.JLabel();
        listaEvaluador = new javax.swing.JScrollPane();
        listEvaluador = new javax.swing.JList();
        lblEvaluador = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textComentarios = new javax.swing.JTextArea();
        lblComentarios = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        textPuntaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 54, 57));
        jPanel1.setLayout(null);

        lblIngresoEntrevistaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblIngresoEntrevistaTitulo.setForeground(new java.awt.Color(220, 215, 201));
        lblIngresoEntrevistaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresoEntrevistaTitulo.setText("INGRESO DE ENTREVISTA");
        jPanel1.add(lblIngresoEntrevistaTitulo);
        lblIngresoEntrevistaTitulo.setBounds(0, 20, 800, 29);

        listaPostulante.setBorder(null);

        listPostulante.setBackground(new java.awt.Color(63, 78, 79));
        listPostulante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listPostulante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listPostulante.setForeground(new java.awt.Color(220, 215, 201));
        listPostulante.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listPostulante.setMaximumSize(new java.awt.Dimension(46, 90));
        listPostulante.setSelectionForeground(new java.awt.Color(63, 78, 79));
        listaPostulante.setViewportView(listPostulante);

        jPanel1.add(listaPostulante);
        listaPostulante.setBounds(460, 100, 250, 180);

        lblPostulante.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPostulante.setForeground(new java.awt.Color(220, 215, 201));
        lblPostulante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostulante.setText("POSTULANTE");
        jPanel1.add(lblPostulante);
        lblPostulante.setBounds(460, 80, 250, 20);

        listaEvaluador.setBorder(null);

        listEvaluador.setBackground(new java.awt.Color(63, 78, 79));
        listEvaluador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        listEvaluador.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listEvaluador.setForeground(new java.awt.Color(220, 215, 201));
        listEvaluador.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listEvaluador.setToolTipText("");
        listEvaluador.setMaximumSize(new java.awt.Dimension(46, 90));
        listEvaluador.setPreferredSize(new java.awt.Dimension(46, 90));
        listEvaluador.setSelectionBackground(new java.awt.Color(220, 215, 201));
        listEvaluador.setSelectionForeground(new java.awt.Color(63, 78, 79));
        listaEvaluador.setViewportView(listEvaluador);

        jPanel1.add(listaEvaluador);
        listaEvaluador.setBounds(90, 100, 250, 180);

        lblEvaluador.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblEvaluador.setForeground(new java.awt.Color(220, 215, 201));
        lblEvaluador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEvaluador.setText("EVALUADOR");
        jPanel1.add(lblEvaluador);
        lblEvaluador.setBounds(90, 80, 250, 20);

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
        btnRegistrar.setBounds(500, 520, 220, 40);

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
        btnCancelar.setBounds(80, 520, 220, 40);

        jScrollPane3.setBorder(null);

        textComentarios.setBackground(new java.awt.Color(63, 78, 79));
        textComentarios.setColumns(20);
        textComentarios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        textComentarios.setForeground(new java.awt.Color(220, 215, 201));
        textComentarios.setRows(4);
        textComentarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jScrollPane3.setViewportView(textComentarios);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(150, 390, 500, 90);

        lblComentarios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblComentarios.setForeground(new java.awt.Color(220, 215, 201));
        lblComentarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComentarios.setText("COMENTARIOS");
        jPanel1.add(lblComentarios);
        lblComentarios.setBounds(200, 360, 400, 20);

        lblPuntaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblPuntaje.setForeground(new java.awt.Color(220, 215, 201));
        lblPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntaje.setText("PUNTAJE DE ENTREVISTA ( 0 - 100 )");
        jPanel1.add(lblPuntaje);
        lblPuntaje.setBounds(0, 300, 800, 25);

        textPuntaje.setBackground(new java.awt.Color(63, 78, 79));
        textPuntaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        textPuntaje.setForeground(new java.awt.Color(220, 215, 201));
        textPuntaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 123, 92), 1, true));
        jPanel1.add(textPuntaje);
        textPuntaje.setBounds(325, 330, 150, 25);

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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try{
            Evaluador unEval = (Evaluador)listEvaluador.getSelectedValue();
            Postulante unPost = (Postulante)listPostulante.getSelectedValue();
            String puntaje = textPuntaje.getText().trim();
            String comentarios = textComentarios.getText().trim();
            if(unEval == null || unPost == null || puntaje.length()==0 || comentarios.length()==0){
                JOptionPane.showMessageDialog(new JFrame(), "No deje campos vacios",
               "Error de input", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    Integer.parseInt(puntaje);
                    //Una vez chequeado que puntaje es numero, se genera la entrevista
                    this.objetoAPantalla();
                    dispose();
                }    
                //En caso de que puntaje no sea un numero entrara en la siguiente excepcion
                catch(Exception e){
                    //Ventana de error
                    JOptionPane.showMessageDialog(new JFrame(), "El puntaje ingresado debe ser un número",
                    "Error de input", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "Error de input",
            "", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(IngresoEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoEntrevista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JLabel lblEvaluador;
    private javax.swing.JLabel lblIngresoEntrevistaTitulo;
    private javax.swing.JLabel lblPostulante;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JList listEvaluador;
    private javax.swing.JList listPostulante;
    private javax.swing.JScrollPane listaEvaluador;
    private javax.swing.JScrollPane listaPostulante;
    private javax.swing.JTextArea textComentarios;
    private javax.swing.JTextField textPuntaje;
    // End of variables declaration//GEN-END:variables
}
