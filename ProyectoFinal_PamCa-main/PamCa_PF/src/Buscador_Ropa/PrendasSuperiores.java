package Buscador_Ropa;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pardo
 */
public class PrendasSuperiores extends javax.swing.JFrame {

    public // Crear una lista para almacenar los objetos Ropa
            List<prenda> listaprendas = new ArrayList<prenda>();
    public static CarritoClass CarritoC = new CarritoClass();
    public static List<prenda> listaPrenda = CarritoC.getListaPrenda();

    public List<prenda> Enviar() {
        return listaPrenda;
    }
    public static int c = 0;
    public static int cant = 0;

    public PrendasSuperiores() {

        initComponents();
        this.setLocationRelativeTo(null);
        Cerrar_Carrito.confirmarSalida(this);
        cant = 0;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_codigo?allowPublicKeyRetrieval=true", "frank", "1234");

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM ropa WHERE tipo = 'prenda superior'";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String tipo = resultSet.getString("tipo");
                String talla = resultSet.getString("talla");
                float precio = resultSet.getFloat("precio");
                int cantidad = resultSet.getInt("cantidad");
                int cantidadcarrito = resultSet.getInt("cantidad_carrito");
                byte[] imagen = resultSet.getBytes("imagen");

                prenda ropa = new prenda(id, nombre, tipo, talla, precio, cantidad, cantidadcarrito, imagen);
                listaprendas.add(ropa);
            }

            prenda prenda1 = listaprendas.get(c);
            ImageIcon imageIcon = new ImageIcon(prenda1.getImagen());

            imagenlugar.setIcon(imageIcon);
            nombre.setText(prenda1.getNombre());
            talla.setText(prenda1.getTalla());
            precio.setText(String.valueOf(prenda1.getPrecio()));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen." + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagenlugar = new javax.swing.JLabel();
        talla = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        carrito = new javax.swing.JButton();
        cuenta = new javax.swing.JButton();
        ccom = new javax.swing.JTextField();
        mas = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenlugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(imagenlugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 119, 351, 304));

        talla.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        talla.setForeground(new java.awt.Color(242, 242, 242));
        talla.setText("###");
        getContentPane().add(talla, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 471, 212, 24));

        nombre.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(242, 242, 242));
        nombre.setText("nombre prenda");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 304, 24));

        precio.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setText("$$$");
        precio.setToolTipText("");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 501, 109, 24));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 501, 91, 24));

        jLabel2.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("PamCa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 28, -1, -1));

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_izquierda.png"))); // NOI18N
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        getContentPane().add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 284, 116, 113));

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_derecha.png"))); // NOI18N
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 282, 116, 113));

        carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/carro_compras.png"))); // NOI18N
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });
        getContentPane().add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 27, 80, 59));

        cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/cuenta_usuario.png"))); // NOI18N
        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });
        getContentPane().add(cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 27, 80, 59));

        ccom.setEditable(false);
        ccom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ccom.setText("0");
        getContentPane().add(ccom, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 442, 27, -1));

        mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_arriba_25.png"))); // NOI18N
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });
        getContentPane().add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 425, 60, -1));

        menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_abajo_25.png"))); // NOI18N
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });
        getContentPane().add(menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 463, 60, -1));

        añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/agregar_carro.png"))); // NOI18N
        añadir.setText("Añadir al carrito");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        getContentPane().add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 531, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_regresar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 531, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Talla:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 471, 80, 24));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 501, 80, 24));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/fondoPrendas.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        if (c < (listaprendas.size() - 1)) {

            c = c + 1;
            prenda prenda1 = listaprendas.get(c);
            ImageIcon imageIcon = new ImageIcon(prenda1.getImagen());

            imagenlugar.setIcon(imageIcon);
            nombre.setText(prenda1.getNombre());
            talla.setText(prenda1.getTalla());
            precio.setText(String.valueOf(prenda1.getPrecio()));

        }
        cant = 0;
        ccom.setText(String.valueOf(cant));

    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        if (c > 0) {

            c = c - 1;

            prenda prenda1 = listaprendas.get(c);
            ImageIcon imageIcon = new ImageIcon(prenda1.getImagen());

            imagenlugar.setIcon(imageIcon);
            nombre.setText(prenda1.getNombre());
            talla.setText(prenda1.getTalla());
            precio.setText(String.valueOf(prenda1.getPrecio()));

        }
        cant = 0;
        ccom.setText(String.valueOf(cant));
    }//GEN-LAST:event_anteriorActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed

        prenda prenda1 = listaprendas.get(c);
        int cantidadcomprar = Integer.parseInt(ccom.getText());
        if (cantidadcomprar < prenda1.getCantidad()) {
            cant = cant + 1;
            ccom.setText(String.valueOf(cant));
        }
    }//GEN-LAST:event_masActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed

        int cantidadcomprar = Integer.parseInt(ccom.getText());
        if (cantidadcomprar > 0) {
            cant = cant - 1;
            ccom.setText(String.valueOf(cant));
        }
    }//GEN-LAST:event_menosActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        int ca = Integer.parseInt(ccom.getText());
        if (ca != 0) {
            prenda prenda1 = listaprendas.get(c);

            // Define la consulta SQL para actualizar la celda
            String actualizar = "UPDATE ropa SET cantidad_carrito = ? WHERE id = ?";

            if (prenda1.getCantidadCarrito() != 0) {
                JOptionPane.showMessageDialog(null, "Ya se añadió la prenda al carrito, si desea añadir más cantidad puede hacerlo desde el carrito.");

            } else {
                // Especifica los nuevos valores y el ID de la fila que quieres actualizar
                int nuevoValor = cant;
                int id = prenda1.getId();

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_codigo?useSSL=false", "frank", "1234");

                    // Prepara la consulta SQL con los parámetros necesarios
                    PreparedStatement statement = connection.prepareStatement(actualizar);
                    statement.setInt(1, nuevoValor);
                    statement.setInt(2, id);

                    // Ejecuta la consulta SQL
                    statement.executeUpdate();

                    // Actualiza la información de cuanta cantidad de la prenda hay en el carrito
                    prenda1.setCantidadCarrito(nuevoValor);

                    // Añade la prenda al carrito
                    CarritoC.agregarPrenda(prenda1);

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar la cantcarrito y añadir al carrito." + e);
                }
            }
        }
    }//GEN-LAST:event_añadirActionPerformed

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
            java.util.logging.Logger.getLogger(PrendasSuperiores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrendasSuperiores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrendasSuperiores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrendasSuperiores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrendasSuperiores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton añadir;
    private javax.swing.JButton carrito;
    private javax.swing.JTextField ccom;
    private javax.swing.JButton cuenta;
    private javax.swing.JLabel imagenlugar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel talla;
    // End of variables declaration//GEN-END:variables
}
