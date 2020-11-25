/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1024_arraylist;

import java.util.ArrayList;

/**
 *
 * @author marce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList arreglo = new ArrayList();
        arreglo.add("Marcelo");
        arreglo.add("Gerardo");
        arreglo.add("Celeste");
        
        System.out.println(arreglo.toString());
        
        arreglo.remove("Gerardo");
        
        System.out.println(arreglo.toString());
        
    }
    
}
