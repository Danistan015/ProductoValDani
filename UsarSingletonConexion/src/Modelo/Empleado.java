/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author sotog
 */
public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int id_despacho;

    public Empleado(int id, String nombre, String apellido, int id_despacho) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_despacho = id_despacho;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Empleado(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_despacho() {
        return id_despacho;
    }

    public void setId_despacho(int id_despacho) {
        this.id_despacho = id_despacho;
    }
    
    
    
}
