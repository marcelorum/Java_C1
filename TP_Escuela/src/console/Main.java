package console;

import java.util.Scanner;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Docente doc = new Docente("Lengua", "Pablo", "Caseres", 34, 1);
        float[] prom1 = {1,2,3,4,5,6,7,8};
        Estudiante es1 = new Estudiante(prom1, "Juan", "Dolce", 14, 2);
        float[] prom2 = {8,7,6,5,4,3,2,1};
        Estudiante es2 = new Estudiante(prom2, "Josefa", "Eusovia", 16, 0);
        float[] prom3 = {9,8,9,8,9,8,9,7};
        Estudiante es3 = new Estudiante(prom3, "Victoria", "Perez", 15, 2);
        
        GestionAcademica ga = new GestionAcademica();
        
        // ABMC
        
        // ALTA
        ga.alta(doc, 0);
        ga.alta(es1, 1);
        ga.alta(es2, 2);
        ga.alta(es3, 3);
        
        System.out.println("Colegio");
        System.out.println(ga.toString());
        
        // BUSCAR
        
        System.out.print("Ingrese el apellido a buscar: ");
        String apellido = teclado.next();
        String search = ga.buscar(apellido);
        System.out.println(search);
        
        // MEJOR PROMEDIO
        
        System.out.println("Mejor promedio");
        System.out.println(ga.mejorPromedio().toString());
        
        // CANTIDAD X GENERO
        
        System.out.println("Cantidad x Género");
        System.out.print("Ingresar 0, 1, 2: ");
        int gen = teclado.nextInt();
        System.out.println("La cantidad es " + ga.cantidad(gen));
        
    }
}
