package clase1003;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarar e instanciar un vector - array
        // Tipo[] nombre = new Tipo[lenght];
        
        int[] vect1 = new int[5];
        
        vect1[0] = 1;
        vect1[1] = 6;
        vect1[2] = 5;
        vect1[3] = 35;
        vect1[4] = 8;
        
        /*
        System.out.println(vect1[0]);
        System.out.println(vect1[1]);
        System.out.println(vect1[3]);
        System.out.println(vect1.length);
        */
        
        for (int i = 0; i < vect1.length; i++){
            System.out.println((i+1) + "° elemento: " + vect1[i]);
        }
        
        for (int elemento : vect1){
            System.out.println("Elemento: " + elemento);
        }
        
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        
        for (char vocale : vocales) {
            System.out.println(vocale);    
        }
        
        
        Scanner teclado = new Scanner(System.in);
        
        String[] nombres = new String[3];
        for (int i =0;i < nombres.length;i++){
            System.out.println("Ingrese un nombre");
            nombres[i] = teclado.nextLine();
        }
        System.out.println("Lista:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
    }
    
}
