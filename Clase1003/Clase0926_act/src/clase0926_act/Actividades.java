package clase0926_act;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Actividades {
    Scanner teclado = new Scanner(System.in);
    
    public void actUno(){
        //Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar 1er num: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingresar 2do num: ");
        int num2 = teclado.nextInt();
        
        if (num1 > num2){
            int suma = num1 + num2;
            int resta = num1 - num2;
            System.out.println("La suma es " + suma);
            System.out.println("La resta es " + resta);
        } else {
            int prod = num1 * num2;
            double div = (double) num1 / num2;
            System.out.println("El producto es " + prod);
            System.out.println("La división es " + div);
        }
        
    }
    
    public void actDos(){
        //Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese variable x: ");
        int numx = teclado.nextInt();
        System.out.println("Ingrese variable y:");
        int numy = teclado.nextInt();
        
        if (numx > 0){
            if (numy > 0){
                System.out.println("Primer cuadrante");
            }else{
                System.out.println("Cuarto cuadrante");
            }
        }else if (numy > 0){
            System.out.println("Segundo cuadreante");
        }else{
            System.out.println("Tercer cuadrante");
        }
    }
    
    public void actTres(){
        int cant = 10;
        int conta = 0;
        int mayor = 0;
        int menor = 0;
        while (conta < cant){
            conta++;
            System.out.println("Ingrese la nota: ");
            int nota = teclado.nextInt();
            if (nota >= 7){
                mayor++;
            }else{
                menor++;
            }
        }
        System.out.println("Las notas mayores son " + mayor);
        System.out.println("Las notas menores son "+ menor);
    }
    
    public void actCuatro(){
        int num = -1;
        int div3 = 0;
        int div5 = 0;
        
        while (num != 0){
            System.out.println("Ingresar un num, 0 para salir: ");
            num = teclado.nextInt();
            if ((num%3) == 0 ){
                div3++;
                if ((num%5)==0){
                    div5++;
                }
            }else if ((num%5)==0){
                div5++;
            }
        }
        System.out.println("Multiplos de 3: " + div3);
        System.out.println("Multiplos de 5: " + div5);
        
    }
    
}
