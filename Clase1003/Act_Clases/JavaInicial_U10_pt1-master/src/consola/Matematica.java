package consola;

/**
 * Clase que representa algunas operaciones matemáticas. Utilizada para dar
 * ejemplos de la Unidad 10, donde se ve métodos con parámetros y métodos con
 * retornos. Por último, se explica la sobrecarga de métodos.
 *
 * @author Angonoa, Franco
 * @since Mayo 2020
 * @version 1.0
 */
public class Matematica {

    /**
     * Introducción al método con parámetro pero sin retorno.
     *
     * @param numero parámetro que representa el número de la tabla que se
     * quiere resolver.
     */
    public void tablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            //int multiplicar = numero*i; //Puede crear una variable o hacer los calculos en el System.out.print.
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }

    }//Fin del metodo

    /**
     * Introducción a los métodos con retornos. En este caso, el método retorna
     * un número entero (int).
     *
     * @param num1 representa el primer termino a sumar.
     * @param num2 representa el segundo termino a sumar.
     * @return la suma de los dos parámetros.
     */
    public int sumaDeNumeros(int num1, int num2) {
        int suma = num1 + num2;

        return suma;
    } //Fin del metodo

    /**
     * Introducción al método de la misma clase. Dentro del if() se utiliza un
     * método de esta clase que devuelve un booleano.
     *
     * @param num1 numerador de la división.
     * @param num2 denominador de la división.
     * @return el cociente de la división.
     */
    public double div(int num1, int num2) {
        if (esDistintoCero(num2)) {
            return (num1 / num2);
        }

        return 0; //Si no entra al if, retorna 0.
    } //Fin del metodo

    /**
     * Introducción al método de la misma clase. Dentro del if() se utiliza un
     * método de esta clase que devuelve un booleano.
     *
     * @param arg argumento del algoritmo.
     * @return el logaritmo de un argumento en base 10.
     */
    public double logBas10(double arg) {
        if (esDistintoCero(arg)) {
            return Math.log10(arg);
        }

        return 0;
    } //Fin del metodo

    /**
     * Método con retorno que informa si el número es distinto a cero.
     *
     * @param numero cargado por el usuario para validar.
     * @return true si es disntinto a cero o false en caso contrario.
     */
    public boolean esDistintoCero(double numero) {
        boolean esDistinto = (numero != 0);
        return esDistinto;
    }

    /**
     * SOBRECARGA del método div. Con dos parámetros de tipos diferentes.
     *
     * @param num1 numerador de la división.
     * @param num2 denominador de la división.
     * @return el cociente de la división.
     */
    public double div(double num1, double num2) {
        if (esDistintoCero(num2)) {
            return (num1 / num2);
        }

        return 0;
    }

    /**
     * SOBRECARGA del método div. Con dos parámetros de tipos diferentes.
     *
     * @param num1 numerador de la división.
     * @param num2 denominador de la división.
     * @return el cociente de la división.
     */
    public double div(long num1, float num2) {
        if (esDistintoCero(num2)) {
            return (num1 / num2);
        }

        return 0;
    }

    /**
     * SOBRECARGA del método div. Con dos parámetros de tipos diferentes.
     *
     * @param cadena ejemplo de que pueden ser cualquier tipo.
     * @param num ejemplo de que pueden ser cualquier tipo.
     * @return tamaño de la palabra.
     */
    public float div(String cadena, float num) {
        num = cadena.length();

        return num;
    }

} //Fin de la clase.
