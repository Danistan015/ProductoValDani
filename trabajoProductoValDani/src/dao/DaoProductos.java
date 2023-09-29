/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Singleton.DatabaseSingleton;
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

    private Connection con;
    
    public DaoProductos() {
        con = DatabaseSingleton.getInstance().getConnection();
    }

    
    public void agregarProducto(Producto producto) throws SQLException {
        try {
            PreparedStatement ps = null;

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

     public void editarProductos(int id, String nombre, double precio, String distribuidor, int id_categoria) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE productos SET nombre=?,precio=?,distribuidor=?, id_categoria=? WHERE id=?");
            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.setString(3,distribuidor);
            ps.setInt(4,id_categoria);
            ps.setInt(5,id);
            ps.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }


    public void eliminarProductos(int id) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("DELETE FROM productos WHERE id= '" + id + "'");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }
}
