package Buscador_Ropa;

import static Buscador_Ropa.IngresarUsuario.usuname;
import static Buscador_Ropa.PrendasSuperiores.listaPrenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 * @author Juan Pardo
 */
public class Carrito extends javax.swing.JFrame {
    
    public static String Fecha;
    public static String name;
    public static int cantidad;
    public static float price;
    
    public Carrito() {
        initComponents();
        this.setLocationRelativeTo(null);
        Cerrar_Carrito.confirmarSalida(this);
        text1.setVisible(false);
        text2.setVisible(false);
        prendacambiar.setVisible(false);
        aceptar.setVisible(false);
        cantidadcambiar.setVisible(false);

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("Talla");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Imagen");

        // Agregar los registros a la tabla
        for (prenda ropa : listaPrenda) {

            modelo.addRow(new Object[]{ropa.getNombre(), ropa.getTalla(), ropa.getPrecio(), ropa.getCantidadCarrito(), ropa.getImagen()});

        }

        // Establecer el modelo de tabla en el JTable
        tablacarrito.setModel(modelo);

        // Obtener la columna de imagen por índice
        TableColumn imageColumn = tablacarrito.getColumnModel().getColumn(4);

        // Crear el renderizador de celdas personalizado
        ImageRenderer imageRenderer = new ImageRenderer();

        // Establecer el renderizador de celdas personalizado para la columna de imagen
        imageColumn.setCellRenderer(imageRenderer);

        int alturaCelda = 150; // Tamaño en píxeles
        tablacarrito.setRowHeight(alturaCelda);

        int anchoimagen = 250; // Tamaño en píxeles

        tablacarrito.getColumnModel().getColumn(4).setPreferredWidth(anchoimagen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacarrito = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        editarcarrito = new javax.swing.JButton();
        text1 = new javax.swing.JLabel();
        prendacambiar = new javax.swing.JTextField();
        text2 = new javax.swing.JLabel();
        cantidadcambiar = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel2.setText("PamCa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 26, -1, -1));

        tablacarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Talla", "Precio", "Cantidad", "Imagen"
            }
        ));
        jScrollPane1.setViewportView(tablacarrito);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 141, 737, 275));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/cuenta_usuario.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 26, 80, 59));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_regresar.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 467, -1, -1));

        comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/dedo_color.png"))); // NOI18N
        comprar.setText("Comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 467, -1, -1));

        editarcarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/modificar_carro_50.png"))); // NOI18N
        editarcarrito.setText("Editar Carrito");
        editarcarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarcarritoActionPerformed(evt);
            }
        });
        getContentPane().add(editarcarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 467, -1, -1));

        text1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/mas_menos_25.png"))); // NOI18N
        text1.setText("Cambiar cantidad de la prenda:");
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 141, -1, 29));
        getContentPane().add(prendacambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 182, 165, 34));

        text2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/nueva_cantidad_25.png"))); // NOI18N
        text2.setText("Nueva cantidad:");
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 255, -1, 29));
        getContentPane().add(cantidadcambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 296, 165, 34));

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 358, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/fondoCarrito.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CrearIngresar ci = new CrearIngresar();
        ci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Menú_inicio me = new Menú_inicio();
        me.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void editarcarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarcarritoActionPerformed
        text1.setVisible(true);
        text2.setVisible(true);
        prendacambiar.setVisible(true);
        aceptar.setVisible(true);
        cantidadcambiar.setVisible(true);
    }//GEN-LAST:event_editarcarritoActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        if (prendacambiar.getText().isEmpty() | cantidadcambiar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe indicar primero la prenda y la nueva cantidad que desea añadir a su carrito.");

        } else {
            String cantidad = cantidadcambiar.getText();
            if (!cantidad.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número para indicar la cantidada nueva del producto en el carrito.");
            } else {

                int id = 0;
                boolean comprobar = false;
                String Prenda = prendacambiar.getText();
                int NuevaCantidad = Integer.parseInt(cantidadcambiar.getText());
                for (prenda ropa : listaPrenda) {
                    if (ropa.getNombre().equalsIgnoreCase(Prenda)) {
                        if (NuevaCantidad <= ropa.getCantidad()) {
                            ropa.setCantidadCarrito(NuevaCantidad);
                            id = ropa.getId();
                            comprobar = true;
                        }
                    }
                }
                if (comprobar) {
                    String actualizar = "UPDATE ropa SET cantidad_carrito = ? WHERE id = ?";
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_codigo?useSSL=false", "frank", "1234");

                        // Prepara la consulta SQL con los parámetros necesarios
                        PreparedStatement statement = connection.prepareStatement(actualizar);
                        statement.setInt(1, NuevaCantidad);
                        statement.setInt(2, id);

                        // Ejecuta la consulta SQL
                        statement.executeUpdate();
                        DefaultTableModel modelo = new DefaultTableModel();

                        modelo.addColumn("Nombre");
                        modelo.addColumn("Talla");
                        modelo.addColumn("Precio");
                        modelo.addColumn("Cantidad");
                        modelo.addColumn("Imagen");

                        // Agregar los registros a la tabla
                        for (prenda ropa : listaPrenda) {

                            modelo.addRow(new Object[]{ropa.getNombre(), ropa.getTalla(), ropa.getPrecio(), ropa.getCantidadCarrito(), ropa.getImagen()});

                        }

                        // Establecer el modelo de tabla en el JTable
                        tablacarrito.setModel(modelo);

                        // Obtener la columna de imagen por índice
                        TableColumn imageColumn = tablacarrito.getColumnModel().getColumn(4);

                        // Crear el renderizador de celdas personalizado
                        ImageRenderer imageRenderer = new ImageRenderer();

                        // Establecer el renderizador de celdas personalizado para la columna de imagen
                        imageColumn.setCellRenderer(imageRenderer);

                        int alturaCelda = 150; // Tamaño en píxeles
                        tablacarrito.setRowHeight(alturaCelda);

                        int anchoimagen = 250; // Tamaño en píxeles

                        tablacarrito.getColumnModel().getColumn(4).setPreferredWidth(anchoimagen);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "No se pudo actualizar la cantidad nueva al carrito." + e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una prenda con el nombre ingresado o\n la cantidad nueva solicitada supera el stock del producto.");

                }
            }

        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        int sumacant = 0;
        float sumaprecio = 0;
        for (prenda ropa : listaPrenda) {
            sumacant = sumacant + ropa.getCantidadCarrito();
            sumaprecio = sumaprecio + (ropa.getPrecio() * ropa.getCantidadCarrito());
        }
        if (usuname.equals("NOHAY")) {
            JOptionPane.showMessageDialog(null, "Primero es necesario acceder con su cuenta de cliente para comprar");
        } else {
            LocalDateTime fechaHoraActual = LocalDateTime.now();

            // Formatear la fecha y hora según tu necesidad
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String fechaHora = fechaHoraActual.format(formato);
            FileManager.guardarInformacion(fechaHora, sumacant, usuname, sumaprecio, "Usuarios/FacturasVentas.txt");
            Fecha = fechaHora;
            cantidad = sumacant;
            name = usuname;
            price = sumaprecio;
            FacturaCompra fc = new FacturaCompra();
            fc.setVisible(true);
            this.setVisible(false); 
        }
    }//GEN-LAST:event_comprarActionPerformed

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
            java.util.logging.Logger.getLogger(Carrito.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton atras;
    private javax.swing.JTextField cantidadcambiar;
    private javax.swing.JButton comprar;
    private javax.swing.JButton editarcarrito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField prendacambiar;
    private javax.swing.JTable tablacarrito;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    // End of variables declaration//GEN-END:variables
}
