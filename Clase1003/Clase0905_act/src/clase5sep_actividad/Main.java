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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circun circ1 = new Circun();
        Circun circ2 = new Circun();
        Circun circ3 = new Circun();
        
        circ1.radio = 8;
        circ2.radio = 10;
        circ3.radio = 13;
        
        circ1.calcularArea();
        circ1.calcularDiametro();
        circ1.calcularLongitud();
        
        circ2.calcularArea();
        circ2.calcularDiametro();
        circ2.calcularLongitud();
        
        circ3.calcularArea();
        circ3.calcularDiametro();
        circ3.calcularLongitud();
        
        System.out.println("\nCirc 1");
        circ1.mostraInfo();
        System.out.println("\nCirc 2");
        circ2.mostraInfo();
        System.out.println("\nCirc 3");
        circ3.mostraInfo();
        
    }
    
}
