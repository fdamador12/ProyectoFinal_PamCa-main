/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Buscador_Ropa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Juan Pardo
 */
public class agregar_ropa extends javax.swing.JFrame {

    public agregar_ropa() {
        initComponents();
        this.setLocationRelativeTo(null);
        Cerrar_Carrito.confirmarSalida(this);
        
    }

    int idropa = 0;
    int cantidad = 0;
    float precio = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        precios = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        cantidades = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imagen = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        tipo = new javax.swing.JComboBox<>();
        talla = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel1.setText("PamCa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 6, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 83, 156, -1));

        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 86, -1, -1));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 120, -1, -1));

        jLabel4.setText("Tipo de prenda:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 160, -1, -1));

        jLabel5.setText("Talla:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 197, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 117, 156, -1));
        getContentPane().add(precios, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 237, 156, -1));

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/agregar_prenda.png"))); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 451, -1, -1));

        jLabel7.setText("Precio:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 240, -1, -1));

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/lupa_negra.png"))); // NOI18N
        buscar.setText("Buscar foto");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 357, -1, -1));
        getContentPane().add(cantidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 277, 156, -1));

        jLabel8.setText("Cantidad:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 280, -1, -1));

        jLabel9.setText("Imagen:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        imagen.setEditable(false);
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 317, 156, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_regresar.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 466, -1, -1));

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/escoba_negra.png"))); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 401, 119, -1));

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "prenda superior", "prenda inferior", "calzado" }));
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 157, 156, -1));
        getContentPane().add(talla, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 197, 156, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/fondoIngreso.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        try {

            // Validación para que se ingrese un valor en todos los campos y no queden vacios
            if (id.getText().isEmpty() | nombre.getText().isEmpty() | talla.getText().isEmpty() | precios.getText().isEmpty() | cantidades.getText().isEmpty() | imagen.getText().isEmpty()) {
                if (id.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un ID, por favor.");
                } else if (nombre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese el nombre de la prenda, por favor.");
                } else if (talla.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese la talla de la prenda, por favor.");
                } else if (precios.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese el precio de la prenda, por favor.");
                } else if (cantidades.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese la cantidad de unidades que hay de la prenda, por favor.");
                } else if (imagen.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese una imagen para la prenda, por favor.");
                }
            } else {
                
                // Validación para que sean los tipos de valores que se necesitan
                int idropa = Integer.parseInt(id.getText());
                float precio = Float.parseFloat(precios.getText());
                int cantidad = Integer.parseInt(cantidades.getText());

                try {

                    // Obtener la conexión a la base de datos
                    Connection conexion = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/bd_codigo", "frank", "1234");

                    // Consultar si ya existe un registro con el mismo id
                    String comprobacionSQL = "SELECT id FROM ropa WHERE id = ?";
                    PreparedStatement consulta = conexion.prepareStatement(comprobacionSQL);
                    consulta.setInt(1, idropa);

                    ResultSet resultado = consulta.executeQuery();

                    // Si la consulta devuelve algún resultado, significa que ya existe un registro con ese id
                    if (resultado.next()) {
                        JOptionPane.showMessageDialog(null, "El id " + idropa + " ya está en uso. Intente con otro valor.");
                    } else {

                        // Crear la consulta SQL para agregar un nuevo registro
                        String insertarSQL = "INSERT INTO ropa (id, nombre, tipo, talla, precio, cantidad, imagen) VALUES (?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement insertar = conexion.prepareStatement(insertarSQL);
                        insertar.setInt(1, idropa);
                        insertar.setString(2, nombre.getText());
                        insertar.setString(3, tipo.getSelectedItem().toString());
                        insertar.setString(4, talla.getText());
                        insertar.setFloat(5, precio);
                        insertar.setInt(6, cantidad);
                        insertar.setBinaryStream(7, new FileInputStream(imagen.getText()));
                        insertar.executeUpdate();
                        conexion.close();

                        JOptionPane.showMessageDialog(null, "El producto se ha agregado correctamente.");

                    }
                } catch (SQLException | FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "No sirvió " + ex);
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No se ingresó un valor valido, revise que cada campo tenga el valor que corresponde.");
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // Es el que se encarga de abrir el buscador de archivos en busca de la imagen

        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if (s == JFileChooser.APPROVE_OPTION) {
            String ruta = j.getSelectedFile().getAbsolutePath();
            imagen.setText(ruta);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Menú_Admin ma = new Menú_Admin();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        id.setText("");
        nombre.setText("");
        talla.setText("");
        cantidades.setText("");
        precios.setText("");
        imagen.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(agregar_ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar_ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar_ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_ropa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cantidades;
    private javax.swing.JTextField id;
    private javax.swing.JTextField imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precios;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField talla;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
