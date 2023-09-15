/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author val
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private String distribuidor;
    private int idCategoria;
    

    public Producto(int codigo, String nombre, double precio, String distribuidor,int idCategoria) {
        this.codigo = codigo;
        this.nombre = nombre;  
        this.precio = precio;
        this.distribuidor = distribuidor;
        this.idCategoria = idCategoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
    
    
}
