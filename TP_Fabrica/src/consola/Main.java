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
        Scanner teclado = new Scanner(System.in);
        
        
        Gerente ger = new Gerente("Ingeniero", 111, "Esteban", "Quito", 34);
        int[] p1 = {10, 2, 3, 4, 1};
        Empleado emp1 = new Empleado(p1, 222, "Juan", "Perez", 30);
        int[] p2 = {3, 5, 8, 4, 0};
        Empleado emp2 = new Empleado(p2, 333, "Maria", "Teresa", 67);
        int[] p3 = {1, 20, 13, 2, 1};
        Empleado emp3 = new Empleado(p3, 444, "Diego", "Armando", 60);
        
        
        GestionPersonal gp = new GestionPersonal();
        
        // Punto1
        
        gp.altaPersona(ger, 0);
        gp.altaPersona(emp1, 1);
        gp.altaPersona(emp2, 2);
        gp.altaPersona(emp3, 3);
        
        System.out.println("Empleados:");
        System.out.println(gp.toString());
        
        // Punto 2
        
        System.out.println("Modificar");
        System.out.print("Ingrese DNI a buscar: ");
        int dni = teclado.nextInt();
        System.out.print("Ingrese nuevo nombre: ");
        String nvoNombre = teclado.next();
        gp.modificacion(dni, nvoNombre);
                
        System.out.println(gp.toString());

        // Punto 3
        
        System.out.println("Eliminar");
        System.out.print("Nombre: ");
        String nombre = teclado.next();
        System.out.print("Apellido: ");
        String apellido = teclado.next();
        gp.bajaPersona(nombre, apellido);
        
        System.out.println(gp.toString());
        
        // Punto 5
        
        System.out.println("Empleado MAS");
        Empleado mayor = gp.mayorPiezas();
        System.out.println(mayor);
        
    }
    
}
