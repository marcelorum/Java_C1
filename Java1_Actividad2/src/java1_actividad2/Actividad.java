/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1_actividad2;

/**
 *
 * @author marce
 */
public class Actividad {
    String cadena1 = "El veloz murciélago hindú comía feliz CARDILLO y KIWI.";
    String cadena2 = "La cigüeña toca el SAXOFÓN detrás del PALENQUE de PAJA.";
    String cadena3;
    
    public void longitud(){
        System.out.print("Longitud de la Cadena 1: " );
        System.out.println(cadena1.length());        
    }
    
    public void esVacio(){
        System.out.println("La Cadena 1 está vacía?");
        System.out.println(cadena1.isEmpty());        
    }
    
    public void igual(){
        System.out.println("Las dos cadenas son iguales?");
        System.out.println(cadena1.equals(cadena2));        
    }
    
    public void concatenar(){
        cadena3 = cadena1.concat(cadena2);
        System.out.println("Concatenadas:");
        System.out.println(cadena3);
    }
    
    public void minuscula(){
        cadena3 = cadena1.toLowerCase();
        System.out.println(cadena3);
    }
    
    public void objetoBuilder(){
        System.out.println("Con la Cadena 1 y 2 creo el objeto StringBuilder con el método append:");
        StringBuilder cadenab = new StringBuilder();
        cadenab.append(cadena1);
        cadenab.append(" " + cadena2);
        System.out.println("\n- Objeto String Builder");
        System.out.println(cadenab);
        System.out.println("\n- Longitud");
        System.out.println(cadenab.length());
        System.out.println("\n- Reversa");
        System.out.println(cadenab.reverse());
        
    }
    
}
