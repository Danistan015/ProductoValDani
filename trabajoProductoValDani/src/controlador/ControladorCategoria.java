/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DaoCategorias;
import java.sql.SQLException;
import modelo.Categoria;

/**
 *
 * @author val
 */
public class ControladorCategoria {
    DaoCategorias dao;

    public ControladorCategoria() {
        dao = new DaoCategorias();
    }
    
    public void agregarCategoria(Categoria categoria) throws SQLException{
        dao.agregarCategoria(categoria);
    }
    
    public Categoria buscarCategoria(int id) throws SQLException{
        return dao.buscarCategoria(id);
    }
    
    public Categoria editarCategoria(int id, String nombre) throws SQLException{
        return dao.editarCategoria(id, nombre);
    }
    
    public void eliminarCategoria(int id) throws SQLException{
        dao.eliminarCategoria(id);
    }
}
