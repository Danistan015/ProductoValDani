/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.Conexion_db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Producto;

/**
 *
 * @author sotog
 */
public class DaoProductos {

    public void agregarProducto(Producto producto) throws SQLException {
        try {
            PreparedStatement ps = null;
            Conexion_db conn = new Conexion_db();
            Connection con = conn.getConexion();

            String sql = "INSERT INTO productos (id, nombre, id_categoria, distribuidor, precio) VALUES (?, ?, ?, ?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setInt(3, producto.getIdCategoria());
            ps.setString(4, producto.getDistribuidor());
            ps.setDouble(5, producto.getPrecio());
            ps.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }

    public Producto buscarProducto(int id) throws SQLException {
        Producto productoEncontrado = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion_db conn = new Conexion_db();
        Connection con = conn.getConexion();

        String where = " WHERE id = '" + id + "'";
        String sql = "SELECT * FROM productos" + where;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                String distribuidor = rs.getString("distribuidor");
                int idCategoria = rs.getInt("id_Categoria");
                productoEncontrado = new Producto(id, nombre, precio, distribuidor, idCategoria);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }

        return productoEncontrado;
    }

    public Producto editarProductos(int id) throws SQLException {
        Producto productosEncontrado = buscarProducto(id);
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion_db obConexion_db = new Conexion_db();
        Connection conn = obConexion_db.getConexion();
        try {
            ps = conn.prepareStatement("UPDATE  categoria SET nombre=?, precio=?,distribuidor=?  WHERE id= '" + id + "'");
            String nombre = rs.getString("nombre");
            double precio = rs.getDouble("precio");
            String distribuidor = rs.getString("distribuidor");

            productosEncontrado.setNombre(nombre);
            productosEncontrado.setDistribuidor(distribuidor);
            productosEncontrado.setPrecio(precio);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
        return productosEncontrado;
    }

    public void eliminarProductos(int id) throws SQLException {
        PreparedStatement ps = null;

        try {

            Conexion_db objCon = new Conexion_db();
            Connection conn = objCon.getConexion();
            ps = conn.prepareStatement("DELETE FROM productos WHERE id= '" + id + "'");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }
}
