/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5sep_actividad;

/**
 *
 * @author Marce
 */
public class Circun {
    public float radio;
    public float diametro;
    public double longitud;
    public double area;
    double pi = Math.PI;
    
    public void calcularDiametro(){
        diametro = 2 * radio;
        //System.out.println("El diámetro es: " + diametro);
    }
    
    public void calcularLongitud(){
        longitud = 2 * pi * radio;
        //System.out.println("La longitud es: " + longitud);
    }
    
    public void calcularArea(){
        area = pi * radio * radio;
        //System.out.println("El área es: " + area);
    }
    
    public void mostraInfo(){
        System.out.println("Radio: " + radio);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Longitud: " + longitud);
        System.out.println("Área: " + area);
    }
    
}
