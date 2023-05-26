package Buscador_Ropa;

import javax.swing.JOptionPane;

/**
 * @author Juan Pardo
 */
public class CrearUsuario extends javax.swing.JFrame {

    public CrearUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        confirma.setVisible(false);
        Cerrar_Carrito.confirmarSalida(this);
    }
    private static String clavesegura = "12345";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        clave = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        admin = new javax.swing.JRadioButton();
        cliente = new javax.swing.JRadioButton();
        crear = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        confirma = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        confirmar = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("PamCa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Bienvenido a PamCa, para crear una cuenta llene los siguientes campos con la"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText(" información correspontiende, recuerde  que si se trata de una cuenta de administrador debe especificarlo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("y digitar la clave correspondiente."); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/usuario_gris.png"))); // NOI18N
        jLabel5.setText("Nombre de usuario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 212, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/correo_gris.png"))); // NOI18N
        jLabel6.setText("Correo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, 19));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/candado_gris.png"))); // NOI18N
        jLabel7.setText("Contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 324, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/candado_gris_abierto.png"))); // NOI18N
        jLabel8.setText("Confirmación de contraseña:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 383, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/llave_gris.png"))); // NOI18N
        jLabel9.setText("Clave (Administrador): ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 438, -1, -1));
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 171, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 171, -1));
        getContentPane().add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 171, -1));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 242));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/tipo_cuenta.png"))); // NOI18N
        jLabel10.setText("Tipo de cuenta:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 497, -1, -1));

        buttonGroup1.add(admin);
        admin.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        admin.setForeground(new java.awt.Color(242, 242, 242));
        admin.setText("Administrador");
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 499, -1, -1));

        buttonGroup1.add(cliente);
        cliente.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        cliente.setForeground(new java.awt.Color(242, 242, 242));
        cliente.setText("Cliente");
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        crear.setText("Crear cuenta");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 575, -1, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_regresar.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 656, -1, -1));

        confirma.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        confirma.setForeground(new java.awt.Color(242, 242, 242));
        confirma.setText("No coinciden");
        getContentPane().add(confirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 361, 79, -1));
        getContentPane().add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 176, -1));
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 171, -1));

        jLabel11.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(242, 242, 242));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/fondoInicio.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        CrearIngresar ci = new CrearIngresar();
        ci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        confirma.setVisible(false);
        if (nombre.getText().isEmpty() | contrasena.getText().isEmpty() | correo.getText().isEmpty() | confirmar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos solicitados para poder continuar.");
        } else {
            if (contrasena.getText().equals(confirmar.getText())) {
                if (admin.isSelected()) {
                    
                    String Clave = clave.getText();
                    if (Clave.equals(clavesegura)) {

                        String Nombre = nombre.getText();
                        String Correo = correo.getText();
                        String Contraseña = contrasena.getText();
                        Usuario usuario = new Usuario(Nombre, Contraseña, Correo);
                        FileManager.guardarUsuario(usuario, "Usuarios/Administradores.txt");

                    } else {
                        JOptionPane.showMessageDialog(null, "No Ingresó la clave correcta para crear una cuenta de administrador.");
                    }
                } else if (cliente.isSelected()) {
                    String Nombre = nombre.getText();
                        String Correo = correo.getText();
                        String Contraseña = contrasena.getText();
                        Usuario usuario = new Usuario(Nombre, Contraseña, Correo);
                        FileManager.guardarUsuario(usuario, "Usuarios/Clientes.txt");
                } else {
                    JOptionPane.showMessageDialog(null, "No especificó el tipo de usuario que desea crear.");
                }
            } else {
                confirma.setVisible(true);

            }
        }
    }//GEN-LAST:event_crearActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField clave;
    private javax.swing.JRadioButton cliente;
    private javax.swing.JLabel confirma;
    private javax.swing.JPasswordField confirmar;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JTextField correo;
    private javax.swing.JButton crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
