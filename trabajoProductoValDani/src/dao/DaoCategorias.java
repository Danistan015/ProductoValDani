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
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;

/**
 *
 * @author val
 */
public class DaoCategorias {

    public void agregarCategoria(Categoria categoria) throws SQLException {
        try {
            PreparedStatement ps = null;
            Conexion_db conn = new Conexion_db();
            Connection con = conn.getConexion();

            String sql = "INSERT INTO categorias (ID, Nombre) VALUES (?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, categoria.getId());
            ps.setString(2, categoria.getNombre());
            ps.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }

    public Categoria buscarCategoria(int id) throws SQLException {
        Categoria categoriaEncontrada = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion_db conn = new Conexion_db();
        Connection con = conn.getConexion();

        String where = " WHERE id = '" + id + "'";
        String sql = "SELECT * FROM categorias" + where;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                categoriaEncontrada = new Categoria(id, nombre);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }

        return categoriaEncontrada;
    }

    public Categoria editarCategoria(int id) throws SQLException {
        Categoria categoriaEncontrada = buscarCategoria(id);
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion_db obConexion_db = new Conexion_db();
        Connection conn = obConexion_db.getConexion();
        try {
            ps = conn.prepareStatement("UPDATE  categorias SET nombre=? WHERE id= '" + id + "'");
            String nombre = rs.getString("nombre");
            categoriaEncontrada.setNombre(nombre);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
        return categoriaEncontrada;
    }

    public void eliminarCategoria(int id) throws SQLException {
        PreparedStatement ps = null;

        try {

            Conexion_db objCon = new Conexion_db();
            Connection conn = objCon.getConexion();
            ps = conn.prepareStatement("DELETE FROM categorias WHERE id= '" + id + "'");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }
}
