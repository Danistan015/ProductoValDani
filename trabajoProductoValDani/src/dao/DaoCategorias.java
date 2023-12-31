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
import java.util.ArrayList;

import modelo.Categoria;

/**
 *
 * @author val
 */
public class DaoCategorias {

    private Connection con;
    
    public DaoCategorias() {
        con = DatabaseSingleton.getInstance().getConnection();
    }

    
    public void agregarCategoria(Categoria categoria) throws SQLException {
        try {
            PreparedStatement ps = null;

            String sql = "INSERT INTO categorias (Nombre) VALUES (?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria.getNombre());
            ps.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }

    public Categoria buscarCategoriaId(int id) throws SQLException {
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
                categoriaEncontrada = new Categoria(nombre);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }

        return categoriaEncontrada;
    }

    public int buscarIDCategoria(String nombre) throws SQLException {
        int id = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String where = " WHERE Nombre = '" + nombre + "'";
        String sql = "SELECT * FROM categorias" + where;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("ID");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
        return id;
    }

    public void editarCategoria(int id, String nombre) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE categorias SET Nombre=? WHERE ID=?");
            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }

    public void eliminarCategoria(int id) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("DELETE FROM categorias WHERE id= '" + id + "'");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }

    public ArrayList<Categoria> getAllCategories() {
        ArrayList<Categoria> categorias = new ArrayList<>();

        try {
            PreparedStatement ps;
            ResultSet rs;

            String query = "SELECT * FROM categorias";

            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                String categoryName = rs.getString("Nombre");
                Categoria category = new Categoria(categoryName);
                categorias.add(category);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        
        return categorias;
    }

    
        
}
