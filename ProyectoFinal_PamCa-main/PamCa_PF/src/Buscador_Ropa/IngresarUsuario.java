
package Buscador_Ropa;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pardo
 */
public class IngresarUsuario extends javax.swing.JFrame {

    public static String usuname = "NOHAY";
    
    public IngresarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        Cerrar_Carrito.confirmarSalida(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        admin = new javax.swing.JRadioButton();
        cliente = new javax.swing.JRadioButton();
        nombre = new javax.swing.JTextField();
        acceder = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel1.setText("PamCa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 29, -1, -1));

        jLabel2.setText("Bienvenido a PamCa, para ingresar su cuenta  llene los siguientes campos con la"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 100, -1, -1));

        jLabel3.setText(" información corrspontiende, recuerde  que si se trata de una cuenta de administrador debe especificarlo.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 122, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/usuario_gris.png"))); // NOI18N
        jLabel4.setText("Nombre de usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 194, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/candado_gris.png"))); // NOI18N
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 243, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/tipo_cuenta.png"))); // NOI18N
        jLabel6.setText("Tipo de usuario:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 289, -1, -1));

        buttonGroup1.add(admin);
        admin.setText("Administrador");
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 291, -1, -1));

        buttonGroup1.add(cliente);
        cliente.setText("Cliente");
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 328, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 195, 167, -1));

        acceder.setText("Acceder");
        acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederActionPerformed(evt);
            }
        });
        getContentPane().add(acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 367, -1, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_regresar.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 419, -1, -1));
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 244, 167, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/fondoIngreso.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        CrearIngresar ci = new CrearIngresar();
        ci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederActionPerformed
        if (nombre.getText().isEmpty() | contra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos solicitados para poder continuar.");
        } else {

            if (admin.isSelected()) {

                String Nombre = nombre.getText();

                if (FileManager.comprobar(Nombre, "Usuarios/Administradores.txt")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                    Menú_Admin ma = new Menú_Admin();
                    ma.setVisible(true);
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró al usuario");

                }

            } else if (cliente.isSelected()) {
                String Nombre = nombre.getText();

                if (FileManager.comprobar(Nombre, "Usuarios/Clientes.txt")) {
                    usuname = Nombre;
                    JOptionPane.showMessageDialog(null, "Se accedió exitosamente.");

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró al usuario");

                }

            } else {
                JOptionPane.showMessageDialog(null, "No especificó el tipo de usuario con el que desea ingresar.");
            }

        }
    }//GEN-LAST:event_accederActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceder;
    private javax.swing.JRadioButton admin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cliente;
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
