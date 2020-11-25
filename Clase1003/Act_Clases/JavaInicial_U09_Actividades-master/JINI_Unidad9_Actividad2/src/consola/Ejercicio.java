/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.util.Scanner;

/**
 *
 * @author fnang
 */
public class Ejercicio {

    public void actividadDos() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar la coordenada en x: ");
        int x = teclado.nextInt();

        System.out.println("Ingresar la coordenada en y: ");
        int y = teclado.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("El punto esta en el primer cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto esta en el segundo cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto esta en el tercer cuadrante");
        } else {
            System.out.println("El punto esta en el cuarto cuadrante");
        }

    }//Fin de la actividadDos()

}//Fin de la clase
