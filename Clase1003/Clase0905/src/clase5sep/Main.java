/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5sep;

/**
 *
 * @author marce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración e instanciacion del objeto        
        // Clase nombreObketo = new Clase ();
        
        /*Perro perroUno;
        perroUno = new Perro();*/
        
        Perro perroUno = new Perro();
        System.out.println("Valores por defecto:");
        System.out.println("Raza de perro uno: " + perroUno.raza);
        System.out.println("Edad de perro uno: " + perroUno.edad);
        
        
        perroUno.raza = "Labrador";
        perroUno.edad = 10;
        
        System.out.println("\nSalida luego de asignacion de variable");
        System.out.println("Raza de perro uno: " + perroUno.raza);
        System.out.println("Edad de perro uno: " + perroUno.edad);
        
        perroUno.ladrar();
        
        Perro perroDos = new Perro();
        perroDos.raza = "Bulldog";
        perroDos.peso = 20.9;
        
        System.out.println("\nInfo del perro Dos");
        System.out.println("Raza de perro dos: " + perroDos.raza);
        System.out.println("Peso de perro dos: " + perroDos.peso);
        
        perroDos.dormir();
        
        Perro perro6 = perroDos;
        
        if (perro6 == perroDos){
            System.out.println("Iguales");            
        } else {
            System.out.println("Distintas");
        }
               
        Perro perroTres = new Perro();
        
        perroTres = perroDos;
        System.out.println("Raza de perro tres: " + perroTres.raza);
        
        perroDos.raza = "Doberman";
        
        System.out.println("Raza perro dos: " + perroDos.raza);
        System.out.println("Raza pero tres: " + perroTres.raza);
        
        System.out.println("\nInfo de perro uno: ");
        perroUno.mostrarInformacion();
        
        System.out.println("\nInfo de perro dos: ");
        perroDos.mostrarInformacion();
        
        System.out.println("\nInfo de perro tres: ");
        perroTres.mostrarInformacion();
        
        Perro perroCuatro = new Perro();
        Perro perroCinco = new Perro();
        
        perroCuatro.raza = "Labrador";
        perroCinco.raza = "Labrador";
        
        perroCuatro.mostrarInformacion();
        
        
        
    } // Fin del main
    
} // Fin de la claseh
