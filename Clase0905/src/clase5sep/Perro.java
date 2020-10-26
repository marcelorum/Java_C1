/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5sep;

/**
 *
 * @author marce
 */
public class Perro {
    //CAMPOS - [modificador] tipo nombreCampo
    //+ -> public
    //- -> private
    public String raza;
    public String color;
    public double peso;
    public int edad;
    
    //METODOS
    //[modificadores] tipo nombreMetodo () {}
    
    public void ladrar(){
        System.out.println("Estoy ladrando... (GUAU)");
    } // Fin metodo ladrar
    
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    public void mostrarInformacion(){
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso + "Kg");
        System.out.println("Edad: " + edad + " años");
    }
} // Fin de la clase
