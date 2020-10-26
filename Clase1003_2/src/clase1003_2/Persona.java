/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1003_2;

/**
 *
 * @author marce
 */
public class Persona {
    //Campos
    public String nombre;
    public String apellido;
    public int documento;
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("DNI: " + documento);
    }
    
}
