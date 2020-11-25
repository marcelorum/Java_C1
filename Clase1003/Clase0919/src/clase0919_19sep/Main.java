/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase0919_19sep;

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
//        int valor = 0;
//        switch(valor){
//            case 1: System.out.println("El valor es 1");
//            break;
//            case 2: System.out.println("2");
//            break;
//            case 3: System.out.println("3");
//            break;
//            case 4: System.out.println("4");
//            break;
//            default: System.out.println("Nada");
//            break;                
//        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        
        System.out.println("1- Suma de dos nums: ");
        System.out.println("2- Resta de dos nums");
        System.out.println("3- Dicvision de dos nums");
        System.out.println("4- Multiplicacion de dos nums");
        System.out.println("Ingrese la opcion: ");
        int opcion = teclado.nextInt();
        
        switch(opcion){
            case 1: System.out.println("La suma es " + (num1 + num2));
            break;
            case 2: System.out.println("La resta es " + (num1 - num2));
            break;
            case 3: System.out.println("La mult es " + (num1 * num2));
            break;
            case 4: System.out.println("La div es " + (num1 / num2));
            break;
            default: System.out.println("Opción incorrecta");
        }
    }    
}
