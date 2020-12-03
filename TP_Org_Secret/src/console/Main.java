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
        
        GestionSecreta gs = new GestionSecreta();
        
        // CREAR OBJETOS
        
        // EJE 3.1, 3.2, 4.1 y 4.2
        Docente doc = new Docente("Matemáticas", 1234, "Harry", "Potter", 10, 5, 1980);
        
        int[] not1 = {1, 2, 3, 4, 5, 6};
        Estudiante es1 = new Estudiante(123, not1, true, "Nikola", "Tesla", 10, 10, 1900);
        int[] not2 = {1, 2, 3, 4, 5, 6};
        Estudiante es2 = new Estudiante(122, not2, false, "Ada", "Lovelace", 12, 12, 1912);
        int[] not3 = {1, 2, 3, 4, 5, 6};
        Estudiante es3 = new Estudiante(111, not3, true, "Paulo", "Dybala", 23, 1, 2000);
        int[] not4 = {1, 2, 3, 4, 5, 6};
        Estudiante es4 = new Estudiante(100, not4, true, "Estefania", "Banini", 20, 10, 1980);
        int[] not5 = {1, 2, 3, 4, 5, 6};
        Estudiante es5 = new Estudiante(233, not5, false, "René", "Favaloro", 23, 5, 1965);
        int[] not6 = {1, 2, 3, 4, 5, 6};
        Estudiante es6 = new Estudiante(344, not6, false, "Alfonsina", "Storni", 8, 8, 1970);
        
        // AGREGAR OBJETOS 
        
        gs.alta(doc, 0);
        gs.alta(es1, 1);
        gs.alta(es2, 2);
        gs.alta(es3, 3);
        gs.alta(es4, 4);
        gs.alta(es5, 5);
        gs.alta(es6, 6);
        
        // MOSTRAR
        System.out.println(gs.toString());
        
        // EJE 1.1
        System.out.println("\nCambiar legajo de Paulo a 63389");
        System.out.println(gs.cambioLeg(3, 63389));
        
        // EJE 1.2
        System.out.println("\nMostrar edad de Ada Lovelace");
        System.out.println("Edad: " + gs.getEdad(2));
        
        // EJE 1.3
        System.out.println("\nPagar cuota de Alfonsina");
        System.out.println(gs.pagarCuota(6));
        
        // EJE 2.1
        System.out.print("\nPromedio de Alfonsina: ");
        System.out.println(gs.getProm(6));
        
        // EJE 2.2
        System.out.println("\nCambiar nota Favaloro (2 x 9)");
        System.out.println(gs.cambiarNotas(5, 2, 9));
        
        // EJE 2.3
        System.out.println("\nVer si aprobaron");
        System.out.println("Tesla: " + gs.verAprobado(1));
        System.out.println("Banini: " + gs.verAprobado(4));
        
        // EJE 3.3
        System.out.println("\nVer deudores");
        System.out.println(gs.soloDeudas());
        
    }
    
}