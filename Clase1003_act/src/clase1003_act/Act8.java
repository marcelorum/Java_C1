/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1003_act;

/**
 *
 * @author marce
 */
public class Act8 {
    // Parte 1
    public int[] vector1;
    public int[] vector2;
    // Parte 2
    public void cargarVectores(){
        // Parte 3
        vector1 = new int[5];
        vector2 = new int[5];
        
        vector1[0] = 5;
        vector1[1] = 10;
        vector1[2] = 80;
        vector1[3] = 1;
        vector1[4] = 60;
        
        vector2[0] = 97;
        vector2[1] = 15;
        vector2[2] = 3;
        vector2[3] = 21;
        vector2[4] = 30;
    }
    // Parte 4
    public void recorrerVectore(){
        int total1 = 0, total2 = 0;
        
        for (int i = 0 ; i < vector1.length; i++){
            total1 += vector1[i];
            System.out.println("Vector 1 Pos " + (i+1) + " es " + vector1[i]);
        }
        for (int i=0;i<vector2.length;i++){
            total2 += vector2[i];
            System.out.println("Vector 2 Pos " + (i+1) + " es " + vector2[i]);
        }
        int prom1 = total1 / vector1.length;
        int prom2 = total2 / vector2.length;
        
        System.out.println("El prom del Vector 1 es " + prom1 + " y del 2 es " + prom2);
        
        if (prom1 > prom2){
            System.out.println("El mejor promedio es del Vector 1");
        }else{
            System.out.println("El mejor promedio es del Vector 2");
        }
        
    }
    
}
