/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.DaoDespacho;
import Modelo.Despacho;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sotog
 */
public class ControladorDespacho {
    private DaoDespacho dao;

    public ControladorDespacho() {
        this.dao = new DaoDespacho();
    }
    
    public void agregarDespacho(Despacho despacho) throws SQLException{
        dao.agregarDespacho(despacho);
    }
    
    public Despacho buscarDespacho(int id) throws SQLException{
        return dao.buscarDespachoId(id);
    }
    
    public int buscarIDDespachpNombre(String nombre) throws SQLException{
        return dao.buscarIDCategoria(nombre);
    }
    
    public void editarDespacho(int id, String nombre) throws SQLException{
        dao.editarDespacho(id, nombre);
    }
    
    public void eliminarDespacho(int id) throws SQLException{
        dao.eliminarDespacho(id);
    }
    
    public ArrayList<Despacho> listaDespacho() throws SQLException{
        return dao.getAllEdificios();
    }
}
