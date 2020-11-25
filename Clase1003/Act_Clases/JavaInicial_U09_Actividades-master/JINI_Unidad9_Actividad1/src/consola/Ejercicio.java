package consola;

import java.util.Scanner;

/**
 *
 * @author fnang
 */
public class Ejercicio {

    public void actividadUno() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = teclado.nextInt();

        System.out.println("Ingrese otro numero: ");
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            int suma = num1 + num2;
            int resta = num1 - num2;
            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
        } else {
            int producto = num1 * num2;
            double division = (double) num1 / num2;
            System.out.println("El producto es: " + producto);
            System.out.println("La division es: " + division);
        }

    } //Fin del metodo actividadUno()        

} //Fin de la clase
