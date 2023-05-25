package Buscador_Ropa;

import static Buscador_Ropa.Carrito.Fecha;
import static Buscador_Ropa.Carrito.cantidad;
import static Buscador_Ropa.Carrito.name;
import static Buscador_Ropa.Carrito.price;

/**
 * @author Juan Pardo
 */
public class FacturaCompra extends javax.swing.JFrame {

    public FacturaCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
        Cerrar_Carrito.confirmarSalida(this);
        date.setText(Fecha);
        nombre.setText(name);
        amount.setText(String.valueOf(cantidad));
        pricee.setText(String.valueOf(price));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        pricee = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/cuenta_usuario_25.png"))); // NOI18N
        jLabel2.setText("Compra hecha por:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 238, -1, -1));

        jLabel3.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel3.setText("PamCa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 39, -1, -1));

        jLabel4.setFont(new java.awt.Font("Vladimir Script", 1, 32)); // NOI18N
        jLabel4.setText("¡Gracias por su compra!");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 126, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/fecha.png"))); // NOI18N
        jLabel5.setText("Fecha de la compra:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 182, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/nuevo_producto.png"))); // NOI18N
        jLabel6.setText("Cantidad de articulos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 295, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/precio.png"))); // NOI18N
        jLabel7.setText("Precio total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 347, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_regresar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 423, -1, -1));

        nombre.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 238, 174, 23));

        date.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 182, 225, 23));

        amount.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 297, 174, 23));

        pricee.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        getContentPane().add(pricee, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 349, 174, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/fondoIngreso.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Menú_inicio me = new Menú_inicio();
       me.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FacturaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pricee;
    // End of variables declaration//GEN-END:variables
}
