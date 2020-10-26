/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase0926_26sep;

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
        Scanner teclado = new Scanner(System.in);
        /*
        //WHILE
        System.out.println("Ingrese la cantidad de números: ");
        int cantNum = teclado.nextInt();
        int contador = 0;
        double total = 0;
        while (contador < cantNum) {
            System.out.println("Ingrese un num: ");
            double num = teclado.nextInt();
            total += num;
            contador++;
        }
        double prom = total / cantNum;
        System.out.println("El promedio es: " + prom);
        */
        // FOR
        /*
        System.out.println("Ingresar un num:");
        int num = teclado.nextInt();
        for (int i = 1 ; i <= 12 ; i++){
            int prod = num * i;
            System.out.println(num + " por " + i + " es: " + prod);
        */
        System.out.println("Ingrese un num: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese otro:");
        int num2 = teclado.nextInt();
        int opc;
        do {
            
            System.out.println("\n1 - Sumar nums");
            System.out.println("2 - Restar nums");
            System.out.println("3 - salir");
            System.out.println("Ingrese una opción");
            opc = teclado.nextInt();
            
            switch(opc){
                case 1:
                    int suma = num1 + num2;
                    System.out.println("Suma: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("Resta: " + resta);
                    break;
                default:
                    if(opc != 3) System.out.println("No valido");

            }
        } while(opc != 3);
        
    }
    
}
