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

        jLabel1 = new javax.swing.JLabel();
        carrito = new javax.swing.JButton();
        cuenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        calzado = new javax.swing.JButton();
        prendassuperiores = new javax.swing.JButton();
        prendasinferiores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel1.setText("PamCa");

        carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/carro_compras.png"))); // NOI18N
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });

        cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/cuenta_usuario.png"))); // NOI18N
        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });

        jLabel2.setText("Bienvenido al catalogo de ropa a la moda PamCa. A continuación seleccione el tipo de prenda que esta buscando.");

        calzado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/zapatos_200.png"))); // NOI18N
        calzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calzadoActionPerformed(evt);
            }
        });

        prendassuperiores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/prendas_superiores_200.png"))); // NOI18N
        prendassuperiores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prendassuperioresActionPerformed(evt);
            }
        });

        prendasinferiores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/prenda_inferior_200.png"))); // NOI18N
        prendasinferiores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prendasinferioresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(jLabel1)
                        .addGap(172, 172, 172)
                        .addComponent(carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(prendassuperiores)
                .addGap(63, 63, 63)
                .addComponent(prendasinferiores)
                .addGap(73, 73, 73)
                .addComponent(calzado)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prendassuperiores, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prendasinferiores, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calzado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

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
    private javax.swing.JButton prendasinferiores;
    private javax.swing.JButton prendassuperiores;
    // End of variables declaration//GEN-END:variables
}
