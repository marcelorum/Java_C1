/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1024_act;

/**
 *
 * @author marce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear un objeto para usarlo para crear otro objeto
        Documento doc1 = new Documento(23123123, "DNI");
        Persona per1 = new Persona(222, "Jose Perales", doc1, 0, 0);
        // Crea el objeto creando el otro objeto en la misma línea
        Persona per2 = new Persona(333, "Pedro Canoero", new Documento(12234234, "DNI"), 0, 2);
        Persona per3 = new Persona(444, "Juan Perex", new Documento(34231233, "DNI"), 1, 3);
        Persona per4 = new Persona(555, "Juana Pereza", new Documento(12345678, "DU"), 1, 3);
        Persona per5 = new Persona(66, "Esteban Quito", new Documento(11111111, "DU"), 2, 1);
        Persona per6 = new Persona(99, "Dolores Java", new Documento(12222222, "DU"), 0, 0);
        
        Persona[] personas = {per1, per2, per3, per4, per5, per6};
        
//        for (Persona persona : personas) {
//            System.out.println("Personas: " + persona);
//        }
        
        // Actividad 4
        int[][] contador = new int[4][3];
        
        for (Persona per : personas){
            int pais = per.getPais();
            int ciudad = per.getCiudad();
            
            contador[ciudad][pais] = contador[ciudad][pais] + 1;
            // o
            // contador[ciudad][pais]++
        }
        
        // Recorrer
        for (int [] vectorCiudad : contador){
            for (int cuenta : vectorCiudad){
                System.out.print(cuenta + "\t");
            }
            System.out.println("");
        
            
        }

        
    }
    
}
