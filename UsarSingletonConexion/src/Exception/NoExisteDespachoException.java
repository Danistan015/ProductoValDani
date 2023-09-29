/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

import javax.swing.JOptionPane;

/**
 *
 * @author sotog
 */
public class NoExisteDespachoException extends RuntimeException{

    public NoExisteDespachoException() {
                            JOptionPane.showMessageDialog(null, "El despacho no existe", "No se encuentra", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
