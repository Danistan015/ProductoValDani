/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DaoProductos;
import java.sql.SQLException;
import modelo.Producto;

/**
 *
 * @author sotog
 */
public class ControladorProductos {
     DaoProductos dao;

    public ControladorProductos( DaoProductos dao) {
        this.dao = dao;
    }

  
    public void agregarProducto(Producto productos) throws SQLException{
        dao.agregarProducto(productos);
    }
    
    public Producto buscarProducto(int id) throws SQLException{
        return dao.buscarProducto(id);
    }
    
    public void editarProducto(int id,String nombre, double precio, String distribuidor, int id_categoria) throws SQLException{
        dao.editarProductos(id,nombre, precio, distribuidor, id_categoria);
    }
    
    public void eliminarProducto(int id) throws SQLException{
        dao.eliminarProductos(id);
    }
    
}
