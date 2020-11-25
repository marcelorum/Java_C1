/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

/**
 *
 * @author marce
 */
public class Ejercicios {
    
    public void abonarImpuesto(){
        double sueldo = 2000.23;
        
        if (sueldo > 3000){
            System.out.println("Debe abonar impuestos");
        }
    }
    
    public void parOImpar(){
        int num = 6;
        
        if (num % 2 == 0){
            System.out.println("Es par");
        } else{
            System.out.println("Es impar");
        }
    }
    
    public void nota(){
        int cal = 71;
        char nota = ' ';
        
        if (cal > 90){
            nota = 'A';
        }else if (cal > 80){
            nota = 'B';
        }else if (cal > 70){
            nota = 'C';
        }else if (cal > 60){
            nota = 'D';
        }else{
            nota = 'F';
        }
        System.out.println("La nota es: " + nota);
        
    }
    
}
