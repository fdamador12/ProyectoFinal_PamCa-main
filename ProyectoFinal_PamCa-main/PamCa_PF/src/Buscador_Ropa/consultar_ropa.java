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
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 *
 * @author Juan Pardo
 */
public class consultar_ropa extends javax.swing.JFrame {

    /**
     * Creates new form consultar_ropa
     */
    public consultar_ropa() {
        initComponents();
        this.setLocationRelativeTo(null);
        Cerrar_Carrito.confirmarSalida(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventario = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel1.setText("PamCa");

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/flecha_regresar.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscador_Ropa/consultar_gris.png"))); // NOI18N
        ver.setText("Consultar");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(inventario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ver)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(455, 455, 455))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ver)
                    .addComponent(regresar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Menú_Admin ma = new Menú_Admin();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        try {
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bd_codigo", "frank", "1234");

            Statement consulta = conexion.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT id, nombre, tipo, talla, precio, cantidad, imagen FROM ropa");

            // Obtener los metadatos de la consulta
            int columnCount = resultado.getMetaData().getColumnCount();

            // Crear el modelo de tabla
            DefaultTableModel modelo = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            /*for (int column = 1; column <= columnCount; column++) {
                modelo.addColumn(resultado.getMetaData().getColumnLabel(column));
            }*/
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("Talla");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Imagen");

            // Agregar las filas al modelo de tabla
            while (resultado.next()) {
                Object[] row = new Object[columnCount];
                for (int column = 1; column <= columnCount; column++) {
                    row[column - 1] = resultado.getObject(column);
                }
                modelo.addRow(row);
            }

            // Establecer el modelo de tabla en el JTable
            inventario.setModel(modelo);

            // Obtener la columna de imagen por índice
            TableColumn imageColumn = inventario.getColumnModel().getColumn(6);

            // Crear el renderizador de celdas personalizado
            ImageRenderer imageRenderer = new ImageRenderer();

            // Establecer el renderizador de celdas personalizado para la columna de imagen
            imageColumn.setCellRenderer(imageRenderer);

            // Ajustar el alto de las celdas
            int alturaCelda = 150; // Tamaño en píxeles
            inventario.setRowHeight(alturaCelda);

            // Ajustar el ancho de las columnas
            int anchoimagen = 350; // Tamaño en píxeles
            int anchoidtallapreciocant = 60; // Tamaño en píxeles
            
            inventario.getColumnModel().getColumn(0).setPreferredWidth(anchoidtallapreciocant);
            inventario.getColumnModel().getColumn(3).setPreferredWidth(anchoidtallapreciocant);
            inventario.getColumnModel().getColumn(4).setPreferredWidth(anchoidtallapreciocant);
            inventario.getColumnModel().getColumn(5).setPreferredWidth(anchoidtallapreciocant);
            inventario.getColumnModel().getColumn(6).setPreferredWidth(anchoimagen);
            
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos de la tabla: " + ex.getMessage());
        }
    }//GEN-LAST:event_verActionPerformed

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
            java.util.logging.Logger.getLogger(consultar_ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultar_ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultar_ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultar_ropa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultar_ropa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable inventario;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton regresar;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
