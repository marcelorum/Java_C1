/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1024;

/**
 *
 * @author marce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declarar e instanciar matriz
        // tipo [][] nombreMatriz = new tipo [nro. vectores][ñenght vectores]
        
        // tipo int
        int[][] notas = new int[3][4]; // Son 3 alumnos con 4 notas cada uno
        
        //Alumno 1
        notas[0][0] = 9;
        notas[0][1] = 10;
        notas[0][2] = 9;
        notas[0][3] = 10;
        
        //ALumno2
        notas[1][0] = 5;
        notas[1][1] = 7;
        notas[1][2] = 6;
        notas[1][3] = 8;
        
        //Alumno3
        notas[2][0] = 2;
        notas[2][1] = 1;
        notas[2][2] = 3;
        //notas[2][3] = 2;
        
        System.out.println("\n Ejemplos de salida");
        System.out.println("Cantidad de alumnos: " + notas.length);
        System.out.println("Cantidad de notas alumno 0: " + notas[0].length);
        System.out.println("Cantidad de notas alumno 1: " + notas[1].length);
        System.out.println("Cantidad de notas alumno 2: " + notas[2].length);
        System.out.println("Segunda nota del alumno 1: " + notas[2][1]);
        
        // Recorrido de Matrices
        System.out.println("\nRecorrido de Matrices");
        for (int i = 0; i < notas.length; i++){
            System.out.print("Alumno " + i + ": ");
            for (int j = 0; j < notas[i].length; j++){
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println("");
        }
        
        // Recorrido con FOR mejorado
        System.out.println("\n Otro recorrido");
        for (int[] vectorFila : notas){
            for (int i = 0; i< vectorFila.length;i++){
                System.out.print(vectorFila[i] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("\n Otro ejemplo");
        String[][] nombres = {
            {"Marcelo", "Gerardo"},
            {"Gonzalo", "Celeste", "Ana"},
            {"Alejandro"},
        };
        System.out.println("Cantidad de filas: " + nombres.length);              
        System.out.println("Cantidad de nombres en la fila 0:");
        
        // Recorrer
        
        System.out.println("\nRecorrer");
        for (String[] vectorNombre : nombres) {
            for (String elemento : vectorNombre) {
                System.out.print(elemento + "\t");
            }
            System.out.println("");
        }
           
                
    }
    
}
