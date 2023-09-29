/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Conexion.DatabaseSingleton;
import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sotog
 */
public class DaoEmpleado {

    private Connection con;

    public DaoEmpleado() {
        this.con = DatabaseSingleton.getInstance().getConnection();

    }

    public void agregarEmpleado(Empleado empleado) throws SQLException {
        try {
            PreparedStatement ps = null;

            String sql = "INSERT INTO empleado (Nombre) VALUES (?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, empleado.getNombre());
            ps.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }

   

       public Empleado buscarEmpleado(int ID) throws SQLException {
        Empleado empleadoEncontrado = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

      

        String where = " WHERE ID = '" + ID + "'";
        String sql = "SELECT * FROM empleado" + where;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                empleadoEncontrado = new Empleado(ID, nombre, apellido);
            }

        } catch (SQLException ex) {
            throw new SQLException();
        }
        return empleadoEncontrado;

    }

    public void editarEmpleado(int id, String nombre, String apellido) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("UPDATE categorias SET nombre=?, apellido=? WHERE ID=?");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, id);
            ps.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }

    public void eliminariEmpleado(int id) throws SQLException {
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("DELETE FROM empleado WHERE ID= '" + id + "'");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new SQLException();
        }
    }

    public ArrayList<Empleado> listaEmpleado() throws SQLException {

        ArrayList<Empleado> empleados = new ArrayList<>();

        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT e.ID, e.nombre, e.apellido g.nombre "
                    + "FROM empleado as e "
                    + "INNER JOIN despacho as d ON e.id_edificio = d.id";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ID");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");

                Empleado empleado = new Empleado(id, nombre, apellido);
                empleados.add(empleado);
            }

        } catch (SQLException ex) {
            throw new SQLException();
        }
        
        System.out.println(empleados);
        return empleados;
    }
}