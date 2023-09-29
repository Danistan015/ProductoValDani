/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectpruebapunt;

/**
 *
 * @author sotog
 */
public class ProyectPruebApunt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    /**crear tabla normal:  CREATE TABLE empleado (ID INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    id_edificio INT)
     * 
     * para crear tabla con foranea: CREATE TABLE empleado (ID INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    id_edificio INT,
    FOREIGN KEY (id_edificio) REFERENCES despacho(id)
    * 
    * 
);
* 
* para reducir nombres: SELECT e.nombre, d.edificio FROM empleado as e 
* JOIN despacho as d On e.id_edificio= d.id;
* 
* para ver la foranea: SELECT empleado.nombre, 
* despacho.edificio FROM empleado JOIN despacho On empleado.id_edificio= despacho.id;
* 
* 
* 
* borrar columna: DELETE FROM nombre_de_la_tabla
WHERE columna = valor;
* DELETE FROM usuario WHERE nombre = 'Andres Galvis'
* 
* 
* añadir atributos: ALTER TABLE usuario 
ADD (edad int,
telefono VARCHAR(50)
* 
* 
* insertar datos: INSERT INTO nombreTabla (atributos,atributos)
* VALUES(valor en orden, siguiente valor)
* 
* 
* editar datos: UPDATE nombreTabla SET nombre='valor' WHERE id=id del valor
* commit deja plasmado y rollback temporiza
* 
* START TRANSACTION; 
UPDATE usuario SET nombre='Andres Galvis' WHERE id=7261;
UPDATE cliente SET nombre='Andres Galvis' WHERE id=7261;

SELECT * FROM usuario;
SELECT * FROM cliente;

ROLLBACK; or COMMIT;

**/
    
    
    
}
