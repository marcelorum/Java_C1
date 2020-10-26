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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica mat = new Matematica();
        
        System.out.println("\nTabla Multiplicar");
        mat.tablaMultiplicar(7,5);
        
        System.out.println("\nSUMA");
        int resultado = mat.sumaDeNumeros(2, 3);
        System.out.println(resultado);
        
        System.out.println("\nConcatenar");
        String concatenar = mat.concatenarNombres("Apell", "Nomb");
        System.out.println(concatenar);
        
        System.out.println("\nBoolean");
        boolean espar = mat.esPar(5);
        System.out.println(espar);
        
        System.out.println("\nPersona");
        Persona per1 = new Persona();
        per1.nombreApellido = "Juan Perez";
        per1.edad = 109;
        per1.mostrarInformacion();
                
        mat.modificar(per1);
        per1.mostrarInformacion();
        
        
    }
        
}
