/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojoptionpane2;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class EjemploJOptionPane2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Ejemplo de Confirm Dialog
       
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere iniciar el proceso de lanzamiento de la sonda?", "Lanzamiento de satelite", JOptionPane.YES_NO_OPTION);

         JOptionPane.showMessageDialog(null, "Proceso inicializado");
        
    }
    
}
