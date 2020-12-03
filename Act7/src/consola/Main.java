package consola;

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
        
        Docente doc0 = new Docente("Matematica", "Juan Perez", 12345678, 0, 30);
        Docente doc1 = new Docente("Lengua", "Jose Perez", 12345678, 0, 33);
        Docente doc2 = new Docente("Naturales", "Juana Perez", 12345678, 1, 36);
        Docente doc3 = new Docente("Sociales", "Josefina Perez", 12345678, 1, 50);
        Estudiante est0 = new Estudiante(2, "Jose Canoero", 23232323, 3, 14);
        Estudiante est1 = new Estudiante(3, "Laura Canoero", 23232323, 1, 14);
        Estudiante est2 = new Estudiante(6, "Milagros Canoero", 23232323, 2, 14);
        Estudiante est3 = new Estudiante(1, "Sofía Canoero", 23232323, 2, 14);
        
        GestionAcademica ga = new GestionAcademica();
        
        // EJERCICIO 1
        ga.agregarPersona(doc0, 0);
        ga.agregarPersona(est0, 1);
        ga.agregarPersona(doc1, 2);
        ga.agregarPersona(doc2, 3);
        ga.agregarPersona(doc3, 4);
        ga.agregarPersona(est1, 5);
        ga.agregarPersona(est2, 6);
        ga.agregarPersona(est3, 7);
        
        System.out.println("Personas dentro del colegio: ");
        System.out.println(ga.toString());
        
        //EJERCICIO 2
        String ejer2 = ga.segundoObjeto();
        System.out.println("\nEL segundo objeto " + ejer2);
        
        //EJERCICIO 3
        System.out.println("\nCambiar nombre");
        ga.cambiarNombre();
        System.out.println("\n"+ ga.toString());
        
        //EJERCICIO 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar edad: ");
        int edad = scanner.nextInt();
        String ejer4 = ga.personasSegunEdad(edad);
        System.out.println(ejer4);
        
        //EJERCICIO 5
        String ejer5 = ga.soloGeneroFemenino();
        System.out.println(ejer5);
        
        
        
    }
    
}
