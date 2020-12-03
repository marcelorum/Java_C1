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
        
        // OBJETOS
        Gerente ger = new Gerente("Ingeniero", 1234, "Juan", "Perez", 40);
        boolean[] asis1 = {true, true, true, false, false};
        Empleado em1 = new Empleado(asis1, 123, "Maria", "Teresa", 34);
        boolean[] asis2 = {true, true, true, true, true};
        Empleado em2 = new Empleado(asis2, 122, "Esteban", "Quito", 33);
        boolean[] asis3 = {true, false, false, false, false};
        Empleado em3 = new Empleado(asis3, 121, "Mara", "Dona", 60);
        
        // GESTION
        
        GestionPersonal gp = new GestionPersonal();
        
        // ALTA
        
        gp.alta(ger, 0);
        gp.alta(em1, 1);
        gp.alta(em2, 2);
        gp.alta(em3, 3);
        
        // MOSTRAR
        
        System.out.println("\nInformación");
        System.out.println(gp.toString());
            
        // BUSCAR Y CAMBIAR
        System.out.println("\nBuscar y cambiar");
        System.out.print("Ingresar Apellido a buscar: ");
        String ape = teclado.next();
        System.out.print("Ingreasar legajo nuevo: ");
        int newleg = teclado.nextInt();
        System.out.println(gp.buscar(ape, newleg));
        
        // ASISTENCIA
        
        System.out.println("\nAsistencia");
        System.out.println(gp.mejorAsistencia());
        
        // POR LEGAJO
        
        System.out.println("\nBuscar por legajo");
        System.out.print("Ingresar legajo: ");
        int lega = teclado.nextInt();
        System.out.println(gp.buscarPorLegajo(lega));
        
    }
    
}
