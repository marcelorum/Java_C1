package clase1017_act;

import java.util.Scanner;

/**
 *
 * @author Marce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CREAR OBJETOS
        Camisa cam1 = new Camisa(5, "Rojo", 450, 'M');
        Camisa cam2 = new Camisa(40, "Blanca", 678.9, 'L');
        Camisa cam3 = new Camisa(560, 1200.45);
        Camisa cam4 = new Camisa(3, "Multi", 999.99, 'L');
        Camisa cam5 = new Camisa(333, "Negro", 1299, 'S');
        
        // AGREGAR A ARREGLO
        Camisa[] camisas = {cam1, cam2, cam3, cam4, cam5};
        
        // RECORRER Y MOSTRAR
        for(Camisa elemento: camisas){
            System.out.println("Elemento: " + elemento);
        }
        
//        System.out.println("Camisa 1: " + cam1);
//        System.out.println("Camisa 2: " + cam2);
//        System.out.println("Camisa 3: " + cam3);
//        System.out.println("Camisa 4: " + cam4);
//        System.out.println("Camisa 5: " + cam5);

        // ACTIVIDAD 5
        System.out.println("\nActividad 5");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor de referencia: ");
        double valor = teclado.nextDouble();
        //int valor = 900;
        System.out.println("\nCon For Each");
        for (Camisa camisa: camisas){
            if(camisa.getPrecio() > valor){
                System.out.println("Camisa: " + camisa.toString());
            }
        }
        System.out.println("\nCon FOR");
        for (int i = 0; i < camisas.length; i++){
            if(camisas[i].getPrecio() > valor){
                System.out.println("-Camisa: " + camisas[i].toString());
            }
        }
        
        
    }
    
}
