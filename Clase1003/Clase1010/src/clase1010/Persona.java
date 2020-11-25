/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1010;

/**
 *
 * @author marce
 */
public class Persona {
    //CAMPOS
    public String nombreApellido;
    public int edad;
    
    public void mostrarInformacion(){
        System.out.println("\nNombre y apellido: " + nombreApellido);
        System.out.println("Edad: " + edad);
    }
    
}
