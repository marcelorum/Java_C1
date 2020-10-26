/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1010;

/**
 *
 * @author marce
 */
public class Matematica {
    
    public void tablaMultiplicar(int numero, int limite){
        
        for (int i = 1 ; i <= limite ; i++){
            int multiplicar = numero * i;
            System.out.println(numero + " * " + i + " = " + multiplicar);
        }
    } // Fin metodo
    
    public int sumaDeNumeros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
    
    public String concatenarNombres(String nom1, String nom2){
        String nombre = nom1 + ", " + nom2;
        return nombre;
    } // Fin metodo
    
    private int devolverResto(int dividendo){
        int resto = dividendo%2;
        return resto;
    }
    
    public boolean esPar (int numero){
        int resto = devolverResto(numero);
        if (resto == 0){
            //Es par
            return true;
        }else{
            //Es impar
            return false;
        }
    }
    
    public void modificar(Persona pers){
        pers.nombreApellido = "Max Power";
        pers.edad = 90;        
    }
    
} // Fin clase
