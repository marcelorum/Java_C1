/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

/**
 *
 * Enunciado. Escribir un programa orientado a objetos que pida ingresar la
 * coordenada de un punto en el plano, es decir dos valores enteros x e y
 * (distintos a cero). Posteriormente imprimir en pantalla en que cuadrante se
 * ubica dicho punto, teniendo en cuenta: _____1º Cuadrante : si x > 0 e y > 0
 * 2º Cuadrante: si x < 0 e y > 0
 * 3º Cuadrante: si x < 0 e y < 0
 * 4º Cuadrante: si x > 0 e y < 0
 *
 * @author Angonoa Franco
 * @since Septiembre 2020
 * @version 1.0
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ejercicio ej = new Ejercicio();

        ej.actividadDos();

    }//Fin del metodo main()

}//Fin de la clase
