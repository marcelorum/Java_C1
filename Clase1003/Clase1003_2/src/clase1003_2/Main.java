/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1003_2;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona[] personas1 = new Persona[5];
        
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        //Persona per3 = new Persona();
        
        personas1[0] = per1;
        personas1[1] = per2;
        personas1[2] = new Persona();        
        
        personas1[2].nombre = "Ana";
        personas1[2].apellido = "Perez";
        personas1[2].documento = 12345678;
        
        per1.nombre = "Juan";
        per1.apellido = "Perez";
        per1.documento = 12345678;
        
        
        for (int i = 0; i < personas1.length; i++){
            //personas1[i].mostrarInformacion();
            Persona aux = personas1[i];
            if(aux != null) aux.mostrarInformacion();
        }
        
        System.out.println("\n FOR MEJORADO");
        for (Persona elemento : personas1) {
            if(elemento != null) elemento.mostrarInformacion();
        }
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Personas: ");
        int cantPersonas = teclado.nextInt();
        teclado.nextLine();
        
        Persona[] personas2 = new Persona[cantPersonas];
        //Casrgar valores del objeto
        for(int i = 0; i < personas2.length; i++){
            
            System.out.println("Ingresar nombre");
            String nombre = teclado.nextLine();
            System.out.println("Ingresar apellido");
            String apellido = teclado.nextLine();
            System.out.println("Ingresar Documento");
            int documento = teclado.nextInt();
            teclado.nextLine();
            
            Persona personaPorTeclado = new Persona();
            personaPorTeclado.nombre = nombre;
            personaPorTeclado.apellido = apellido;
            personaPorTeclado.documento = documento;
            
            personas2[i] = personaPorTeclado;
        }
        
        for (Persona elementos : personas2) {
            elementos.mostrarInformacion();
        }
        
        
        
    }
    
}
