package jini_act08;

/**
 *
 * @author fnang
 */
public class Actividad08 {
    public int[] vector1;
    public int[] vector2;
    
    public void cargarVetores(){
        //Instanciacion
        vector1 = new int[5];
        vector2 = new int[5];
        
        //Cargamos el vector1
        vector1[0] = 5;
        vector1[1] = 90;
        vector1[2] = 80;
        vector1[3] = 10;
        vector1[4] = 60;
        
        //Cargamos el vector2
        vector2[0] = 97;
        vector2[1] = 15;
        vector2[2] = 3;
        vector2[3] = 21;
        vector2[4] = 30;
    }
    
    public void recorrerVectores(){
        //Promedios = Sumatoria (Acumulador) / Cantidad (Length)
        
        int acumulador1 = 0, acumulador2 = 0;
        
        for(int i = 0; i < vector1.length; i++){
            acumulador1 += vector1[i]; //acumulador1 = acumularo2 + vector1[i];
            System.out.println("Vector 1 => Elemento: " + vector1[i]);
        }
        int contador1 = vector1.length;
        int promedio1 = acumulador1/contador1;
        System.out.println("\tEl promedio de valores de vector1 es: " + promedio1 + "\n");
        
        for(int indice = 0; indice < vector2.length; indice++){
            acumulador2 += vector2[indice];
            System.out.println("Vector 2 => Elemento: " + vector2[indice]);
//            System.out.println("Acumulador: " + acumulador2);
        }
        int promedio2 = acumulador2/vector2.length;
        System.out.println("\tEl promedio de valores de vector2 es: " + promedio2);
        
        if(promedio1 > promedio2){
            System.out.println("\nEl promedio de vector 1 es mayor, con un valor de " + promedio1 + " que supera al vector 2 con " + promedio2);
        }
        else{
            System.out.println("\nEl promedio de vector 2 es mayor, con un valor de " + promedio2 + " que supera al vector 1 con " + promedio1);
        }
    }
}
