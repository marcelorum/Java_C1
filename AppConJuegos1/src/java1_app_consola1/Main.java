/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1_app_consola1;

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
        Random rnum = new Random();
        int min = 1;
        int max = 100;
        int mnum = min + rnum.nextInt(max);
        //System.out.println(mnum);
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println("\nIntento " + i + ": Cuál es el número mágico?: ");
            int num = teclado.nextInt();
            if (mnum > num){
                System.out.println("Cerca! El número mágico es MAYOR a "+ num + ", inténtalo de nuevo!");
            }else if (mnum < num){
                System.out.println("Cerca! El número mágico es MENOR a "+ num + ", inténtalo de nuevo");
            }else if (mnum == num){
                System.out.println("GANASTE!!! En el intento " + i);
                break;
            }
            if (i == 10){
            System.out.println("\nPERDISTE! Has superado los 10 intentos!");
            }
        }
    }
}
