/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1010_act;

/**
 *
 * @author marce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Unidad10 act = new Unidad10();
        int mayor = act.esMayor(2, 3);
        System.out.println(mayor);
        
        boolean entre = act.entreIntervalos(60);
        System.out.println(entre);
        
        String nombres = act.vectorNombres();
        System.out.println(nombres);
        
        Persona per1 = new Persona();
        per1.nombreApellido = "Juan";
        per1.edad = 34;
        
        Persona per2 = new Persona();
        per2.nombreApellido = "Pepe";
        per2.edad = 35;
        
        Persona perMayor = act.quienEsMayor(per1, per2);
        System.out.println("El mayor es: ");
        System.out.println(perMayor.nombreApellido);
             
        
        
    }
    
}
