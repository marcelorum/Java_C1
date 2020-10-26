/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1_actividad2;

/**
 *
 * @author marce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Java Inicial - Actividad 2");
                
        Actividad long1 = new Actividad();
        System.out.println("Métodos de String:");
        System.out.println("Cadena 1 es: " + long1.cadena1);
        System.out.println("Cadena 2 es: " + long1.cadena2);
        
        System.out.println("\n- Lenght:");
        long1.longitud();
        System.out.println("\n- IsEmpty:");
        long1.esVacio();
        System.out.println("\n- Equals");
        long1.igual();
        System.out.println("\n- Concat");
        long1.concatenar();
        System.out.println("\n- ToLowerCase");
        long1.minuscula();
        
        Actividad objetoString = new Actividad();
        System.out.println("\n\nMétodos de StringBuilder:");
        objetoString.objetoBuilder();        
    }
    
}
