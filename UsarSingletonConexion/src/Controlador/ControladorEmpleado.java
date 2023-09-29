/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Dao.DaoEmpleado;
import Modelo.Empleado;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sotog
 */
public class ControladorEmpleado {
    
    private DaoEmpleado dao;

    public ControladorEmpleado() {
        this.dao = dao= new DaoEmpleado();
    }
    
    public Empleado buscarEmpleado(int id) throws SQLException{
        return dao.buscarEmpleado(id);
    }
    
    public void agregarEmpleado(Empleado empleado) throws SQLException{
        dao.agregarEmpleado(empleado);
    }
    
    public void editarEmpleado(int id, String nombre,String apellido) throws SQLException {
        dao.editarEmpleado(id, nombre, apellido);
    }
    
    public void eliminarEmpleado(int id) throws SQLException{
        dao.eliminariEmpleado(id);
    }
    
   
    
    public ArrayList<Empleado> listaLibros () throws SQLException {
        return dao.listaEmpleado();
    }
    
}
