/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Conexion.DatabaseSingleton;
import Modelo.Despacho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sotog
 */
public class DaoDespacho {

    private Connection con;

    public DaoDespacho() {
        this.con = DatabaseSingleton.getInstance().getConnection();

    }

    public void agregarDespacho(Despacho despacho) throws SQLException {
        try {
            PreparedStatement ps = null;

            String sql = "INSERT INTO despacho (edificio) VALUES (?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, despacho.getNombre());
            ps.execute();

        } catch (SQLException ex) {
            throw new SQLException();
        }
    }

    public Despacho buscarDespachoId(int id) throws SQLException {
        Despacho despachoEncontrado = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String where = " WHERE id = '" + id + "'";
        String sql = "SELECT * FROM despacho" + where;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("edificio");
                despachoEncontrado = new Despacho(nombre);
            }
        } catch (SQLException ex) {
            throw new SQLException();
        }

        return despachoEncontrado;
    }

    public int buscarIDCategoria(String nombre) throws SQLException {
        int id = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String where = " WHERE edificio = '" + nombre + "'";
        String sql = "SELECT * FROM despacho" + where;

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            throw new SQLException();
        }
        return id;
    }

    public void editarDespacho(int id, String nombre) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE despacho SET edificio=? WHERE id=?");
            ps.setString(1, nombre);
            ps.setInt(2, id);
            ps.execute();

        } catch (SQLException ex) {
            throw new SQLException();
        }
    }

    public void eliminarDespacho(int id) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("DELETE FROM despacho WHERE id= '" + id + "'");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            throw new SQLException();
        }
    }

    public ArrayList<Despacho> getAllEdificios() {
        ArrayList<Despacho> despacho = new ArrayList<>();

        try {
            PreparedStatement ps;
            ResultSet rs;

            String query = "SELECT * FROM despacho";

            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                String categoryName = rs.getString("edificio");
                Despacho category = new Despacho(categoryName);
                despacho.add(category);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return despacho;
    }

}
