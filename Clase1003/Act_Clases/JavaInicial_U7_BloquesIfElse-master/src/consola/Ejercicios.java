package consola;

import java.util.Scanner;

/**
 *
 * @author Franco Angonoa
 * @since 12 Septiembre 2020
 */
public class Ejercicios {
    //CAMPOS

    //METODOS
    /**
     * Ejemplo resuelto en clase. Enunciado: Ingresar el sueldo de una persona,
     * si supera los 3000 pesos mostrar un mensaje en pantalla indicando que
     * debe abonar impuestos.
     */
    public void abonarImpuesto() {
        System.out.println("Ingrese un sueldo: ");
        double sueldo = Consola.readDouble();

        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos");
        }
    } //Fin del metodo abonarImpuesto()

    /**
     * Ejemplo resuelto en clase. Enunciado: Crear un programa que muestre por
     * pantalla si un número es par o impar.
     */
    public void parOImpar() {
        System.out.println("Ingrese un numero: ");
        int numero = Consola.readInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    } //Fin del metodo parOImpar()

    /**
     * Ejemplo resuelto en clase. Enunciado Dada la calificación de un
     * estudiante, decir que nota le corresponde, sabiendo que: Nota A si la
     * calificación es mayor a 90, Nota B si la calificación es mayor a 80, Nota
     * C si la calificación es mayor a 70, Nota D si la calificación es mayor a
     * 60, Nota F si la calificación es menor e igual a 60.
     */
    public void nota() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la calificacion del estudiante: ");
        int calificacion = teclado.nextInt();

        char nota;

        if (calificacion > 90) {
            //Si mi condicion es true
            nota = 'A';
        } else if (calificacion > 80) {
            //Si mi elseif es true
            nota = 'B';
        } else if (calificacion > 70) {
            nota = 'C';
        } else if (calificacion > 60) {
            nota = 'D';
        } else {
            //Si todo lo demas es falso
            nota = 'F';
        }

        System.out.println("La nota es: " + nota);
    } //Fin del metodo nota()

    /**
     * Ejemplo resuelto en clase. Enunciado: Ingresar un mes e informar la
     * cantidad de días que posee.
     */
    public void cantidadDias() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes: ");
        int mes = teclado.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("Hay 31 dias en este mes.");
        } else if (mes == 2) {
            System.out.println("Hay 28 o 29 dias en este mes.");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("Hay 30 dias en este mes.");
        } else {
            System.out.println("Mes invalido.");
        }
    }//Fin del metodo cantidadDias()

} //Fin de la clase
