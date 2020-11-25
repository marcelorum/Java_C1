package consola;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SuperClase gest = new Gestor();
        
        InterfaceDatos gest2 = new Gestor();
        
        
        int[] arreglo = new int[5];
        
        try {
            
            arreglo[8] = 10;
            arreglo[1] = 10/0;
            
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Se produjo un error: "+ ex.getMessage());            
        } catch(ArithmeticException ae){
            System.out.println("Error aritmético: "+ ae.getMessage());
        }
        
        System.out.println("El programa sigue...");
        
        for (int i : arreglo) {
            System.out.println(i);
        }
        
    }
    
}