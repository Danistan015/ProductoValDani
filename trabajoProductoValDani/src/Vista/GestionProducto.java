/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Vista.TextPromt.TextPrompt;
import conexion.Conexion_db;
import controlador.ControladorCategoria;
import controlador.ControladorProductos;
import dao.DaoProductos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author sotog
 */
public class GestionProducto extends javax.swing.JFrame {

    ControladorProductos controlador;
    ControladorCategoria controladorCategoria;
    DaoProductos dao;

    /**
     * Creates new form GestionProducto
     */
    public GestionProducto(DaoProductos dao) {
        initComponents();
        TextPrompt pHUsuario = new TextPrompt("Ingrese  el ID del producto: ", txtID);
        TextPrompt pHUsuarioss = new TextPrompt("Ingrese el nombre : ", txtNombre);
        TextPrompt pHUsuariosss = new TextPrompt("Ingrese  el distribuidor: ", txtDistribuidor);
        TextPrompt pHUsuariosssss = new TextPrompt("Ingrese  el precio: ", txtPrecio);
        setLocationRelativeTo(this);
        this.dao = dao;
        controlador = new ControladorProductos(dao);
        controladorCategoria = new ControladorCategoria();
        cargarTabla();
        cargarCombo();
        txtID.setVisible(true);
        lblId.setVisible(false);
        lbl.setVisible(false);
        lblCategoria.setVisible(false);
        lblDistribuidor.setVisible(false);
        lblNombre.setVisible(false);
        lblPrecio.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnadir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        txtDistribuidor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        comboCategoria = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDistribuidor = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 194, 209));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        btnAnadir.setBackground(new java.awt.Color(251, 111, 146));
        btnAnadir.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnAnadir.setForeground(new java.awt.Color(255, 229, 236));
        btnAnadir.setText("Añadir  producto");
        btnAnadir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAnadirMouseMoved(evt);
            }
        });
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(251, 111, 146));
        btnModificar.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 229, 236));
        btnModificar.setText("Modificar  producto");
        btnModificar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnModificarMouseMoved(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 111, 146));
        jLabel1.setText("Productos");

        txtID.setBackground(new java.awt.Color(255, 229, 236));
        txtID.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(255, 229, 236));
        txtNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        btnEliminar.setBackground(new java.awt.Color(251, 111, 146));
        btnEliminar.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 229, 236));
        btnEliminar.setText("Eliminar  producto");
        btnEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEliminarMouseMoved(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtDistribuidor.setBackground(new java.awt.Color(255, 229, 236));
        txtDistribuidor.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        txtDistribuidor.setForeground(new java.awt.Color(0, 0, 0));
        txtDistribuidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDistribuidorKeyTyped(evt);
            }
        });

        txtPrecio.setBackground(new java.awt.Color(255, 229, 236));
        txtPrecio.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        comboCategoria.setBackground(new java.awt.Color(255, 229, 236));
        comboCategoria.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        comboCategoria.setForeground(new java.awt.Color(0, 0, 0));
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la categoria", "carros", "Tegnologia", " " }));

        lblId.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(251, 111, 146));
        lblId.setText("Id:");

        lbl.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        lbl.setForeground(new java.awt.Color(251, 111, 146));
        lbl.setText("ID:");

        lblNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(251, 111, 146));
        lblNombre.setText("Nombre:");

        lblDistribuidor.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        lblDistribuidor.setForeground(new java.awt.Color(251, 111, 146));
        lblDistribuidor.setText("Distribuidor:");

        lblPrecio.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(251, 111, 146));
        lblPrecio.setText("Precio:");

        lblCategoria.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(251, 111, 146));
        lblCategoria.setText("Categoria:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnadir)
                        .addGap(82, 82, 82)
                        .addComponent(btnEliminar)
                        .addGap(70, 70, 70)
                        .addComponent(btnModificar)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDistribuidor)
                            .addComponent(lblCategoria))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)))
                                .addGap(76, 76, 76))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDistribuidor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrecio)
                                    .addComponent(lblNombre))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecio)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId)
                            .addComponent(lbl))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDistribuidor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnadir)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar))
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Mas");

        jMenuItem1.setText("Volver");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseMoved
        // TODO add your handling code here:
        btnAnadir.setForeground(java.awt.Color.MAGENTA);
    }//GEN-LAST:event_btnAnadirMouseMoved

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().isEmpty() || txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtDistribuidor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor llene todos los campos");
        } else {
            String nombre = txtNombre.getText();
            int id = Integer.parseInt(txtID.getText());
            String distribuidor = txtDistribuidor.getText();
            double precio = Double.parseDouble(txtPrecio.getText());

            String nombreCategoria = comboCategoria.getSelectedItem().toString();
            try {
                int categoria = controladorCategoria.buscarID(nombreCategoria);
                Producto producto = new Producto(id, nombre, precio, distribuidor, categoria);
                controlador.agregarProducto(producto);
                JOptionPane.showMessageDialog(null, "Producto añadido correctamente");
                cargarTabla();
                limpiarCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al añadir el producto");
            }
        }


    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnModificarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseMoved
        // TODO add your handling code here:
        btnModificar.setForeground(java.awt.Color.MAGENTA);
    }//GEN-LAST:event_btnModificarMouseMoved

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtDistribuidor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor llene todos los campos");
        } else {

            String nombre = txtNombre.getText();
            int id = Integer.parseInt(lblId.getText());
            String distribuidor = txtDistribuidor.getText();
            double precio = Double.parseDouble(txtPrecio.getText());

            String nombreCategoria = comboCategoria.getSelectedItem().toString();
            try {
                int categoria = controladorCategoria.buscarID(nombreCategoria);
                Producto producto = new Producto(id, nombre, precio, distribuidor, categoria);
                controlador.editarProducto(id, nombre, precio, distribuidor, categoria);
                JOptionPane.showMessageDialog(null, "Producto modificado correctamente");
                cargarTabla();
                limpiarCampos();
                txtID.setVisible(true);
                lbl.setVisible(false);
                lblId.setVisible(false);
                lblCategoria.setVisible(false);
                lblDistribuidor.setVisible(false);
                lblNombre.setVisible(false);
                lblPrecio.setVisible(false);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar el producto");
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseMoved
        // TODO add your handling code here:
        btnEliminar.setForeground(java.awt.Color.MAGENTA);
    }//GEN-LAST:event_btnEliminarMouseMoved

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
        btnAnadir.setForeground(java.awt.Color.WHITE);
        btnEliminar.setForeground(java.awt.Color.WHITE);
        btnModificar.setForeground(java.awt.Color.WHITE);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int seleccionado = tabla.getSelectedRow();
        lblId.setVisible(true);
        lbl.setText("ID:");
        lbl.setVisible(true);
        txtID.setVisible(false);
        lblCategoria.setVisible(true);
        lblDistribuidor.setVisible(true);
        lblNombre.setVisible(true);
        lblPrecio.setVisible(true);
        lblId.setText(tabla.getValueAt(seleccionado, 0).toString());
        txtNombre.setText(tabla.getValueAt(seleccionado, 1).toString());
        comboCategoria.setSelectedItem(tabla.getValueAt(seleccionado, 3).toString());
        txtDistribuidor.setText(tabla.getValueAt(seleccionado, 4).toString());
        txtPrecio.setText(tabla.getValueAt(seleccionado, 5).toString());

    }//GEN-LAST:event_tablaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        int id = Integer.parseInt(lblId.getText());
        try {
            controlador.eliminarProducto(id);
            JOptionPane.showMessageDialog(null, "producto eliminada correctamente");
            cargarTabla();
            limpiarCampos();
            txtID.setVisible(true);
            lbl.setVisible(false);
            lblId.setVisible(false);
            lblCategoria.setVisible(false);
            lblDistribuidor.setVisible(false);
            lblNombre.setVisible(false);
            lblPrecio.setVisible(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtDistribuidorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistribuidorKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txtDistribuidorKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void limpiarCampos() {
        txtID.setText("");
        txtNombre.setText("");
        txtDistribuidor.setText("");
        txtPrecio.setText("");
        comboCategoria.setSelectedIndex(0);

    }

    // Método para cargar la tabla de productos
    public void cargarTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion_db conn = new Conexion_db();
            Connection con = (Connection) conn.getConexion();

            // Consulta SQL que une la tabla de productos con la tabla de categorías
            String sql = "SELECT p.id, p.nombre, p.id_categoria, c.nombre AS nombre_categoria, p.distribuidor, p.precio FROM productos p "
                    + "INNER JOIN categorias c ON p.id_categoria = c.id";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("id");
            modelo.addColumn("nombre");
            modelo.addColumn("id categoria");
            modelo.addColumn("nombre categoria");
            modelo.addColumn("distribuidor");
            modelo.addColumn("precio");

            int[] anchos = {500, 500, 500, 500, 500, 500};
            for (int i = 0; i < tabla.getColumnCount(); i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.print(ex.toString());
        }
    }

    public void cargarCombo() {
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            comboCategoria.setModel(model);
            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion_db conn = new Conexion_db();
            Connection con = (Connection) conn.getConexion();

            String sql = "SELECT * FROM categorias";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            model.addElement("Seleccione una categoría"); // Agrega la opción predeterminada

            while (rs.next()) {
                String categoryName = rs.getString("Nombre");
                model.addElement(categoryName);
            }

        } catch (SQLException ex) {
            System.err.print(ex.toString());
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDistribuidor;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtDistribuidor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
