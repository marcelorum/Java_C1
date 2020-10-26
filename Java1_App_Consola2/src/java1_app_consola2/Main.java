/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1_app_consola2;

import java.util.Random;
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
        Scanner teclado = new Scanner(System.in);
        Random rnum = new Random();
        int min = 1;
        int max = 6;
        
        System.out.println("\nIngrese el nombre del jugador 1:");
        String nom1 = teclado.nextLine();
        int dados1 = 0;
        for (int i = 1 ; i <= 3 ; i++){
            int dado = min + rnum.nextInt(max);
            System.out.println("El valor del dado en el lanzamiento " + i + " de " + nom1 + " es: " + dado);
            dados1 += dado;
        }
        System.out.println(nom1+" suma "+dados1+" puntos!");
        
        System.out.println("\nIngrese el nombre del jugador 2:");
        String nom2 = teclado.nextLine();
        int dados2 = 0;
        for (int i = 1 ; i <= 3 ; i++){
            int dado = min + rnum.nextInt(max);
            System.out.println("El valor del dado en el lanzamiento " + i + " de " + nom2 + " es: " + dado);
            dados2 += dado;
        }
        System.out.println(nom2+" suma "+dados2+" puntos!");
       
        while (dados1 == dados2) {
            System.out.println("\n ES UN EMPATE!! \nNuevo lanzamiento!");
            for (int i = 1 ; i <= 3 ; i++){
                int dado = min + rnum.nextInt(max);
                System.out.println("El valor del dado en el lanzamiento " + i + " de " + nom1 + " es: " + dado);
                dados1 += dado;
            } 
            System.out.println(nom1+" suma "+dados1+" puntos!");
            for (int i = 1 ; i <= 3 ; i++){
                int dado = min + rnum.nextInt(max);
                System.out.println("El valor del dado en el lanzamiento " + i + " de " + nom2 + " es: " + dado);
                dados2 += dado;
            } 
            System.out.println(nom2+" suma "+dados2+" puntos!");
        }
        
        if (dados1 > dados2){
            System.out.println("\nEl ganador es "+ nom1);
        }else {
            System.out.println("\nEl ganador es "+ nom2);
        }

    }
    
}
