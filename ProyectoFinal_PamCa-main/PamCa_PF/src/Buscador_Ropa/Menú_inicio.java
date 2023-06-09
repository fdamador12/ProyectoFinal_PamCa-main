package Buscador_Ropa;

/**
 *
 * @author Juan Pardo
 */
public class Menú_inicio extends javax.swing.JFrame {

    public int cant_carrito = 0;

    public Menú_inicio() {

        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        cant_carrito = cant_carrito + 1;
        Cerrar_Carrito.confirmarSalida(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carrito = new javax.swing.JButton();
        cuenta = new javax.swing.JButton();
        calzado = new javax.swing.JButton();
        prendassuperiores = new javax.swing.JButton();
        prendasinferiores = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/carro_compras.png"))); // NOI18N
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });
        getContentPane().add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 40, 80, 59));

        cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/cuenta_usuario.png"))); // NOI18N
        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });
        getContentPane().add(cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(858, 40, 80, 59));

        calzado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/zapatos_200.png"))); // NOI18N
        calzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calzadoActionPerformed(evt);
            }
        });
        getContentPane().add(calzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, 180));

        prendassuperiores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/prendas_superiores_200.png"))); // NOI18N
        prendassuperiores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prendassuperioresActionPerformed(evt);
            }
        });
        getContentPane().add(prendassuperiores, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, 180));

        prendasinferiores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/prenda_inferior_200.png"))); // NOI18N
        prendasinferiores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prendasinferioresActionPerformed(evt);
            }
        });
        getContentPane().add(prendasinferiores, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, 180));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("PamCa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Bienvenido al catalogo de ropa a la moda PamCa. A continuación seleccione el tipo de prenda que esta buscando.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/fondoInicio2.jpg"))); // NOI18N
        jPanel1.add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-586, 35, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoActionPerformed
        Carrito car = new Carrito();
        car.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_carritoActionPerformed

    private void cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaActionPerformed
        CrearIngresar ci = new CrearIngresar();
        ci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cuentaActionPerformed

    private void prendassuperioresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prendassuperioresActionPerformed
        PrendasSuperiores ps = new PrendasSuperiores();
        ps.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_prendassuperioresActionPerformed

    private void prendasinferioresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prendasinferioresActionPerformed
        PrendasInferiores pi = new PrendasInferiores();
        pi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_prendasinferioresActionPerformed

    private void calzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calzadoActionPerformed
        Calzado ca = new Calzado();
        ca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_calzadoActionPerformed

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
            java.util.logging.Logger.getLogger(Menú_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calzado;
    private javax.swing.JButton carrito;
    private javax.swing.JButton cuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton prendasinferiores;
    private javax.swing.JButton prendassuperiores;
    // End of variables declaration//GEN-END:variables
}
