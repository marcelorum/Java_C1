package clase1107;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos objetos
        
        int[] notas = {10, 9, 10, 8};
        Estudiante est = new Estudiante(notas, 545454, "Perez", "Juan", 23232323 );
        
        Docente doc = new Docente(10, "Ingeniero", 3434, "Garcia", "Maria", 23432434);
        
        Persona per ;
                
        System.out.println("Legajo Estudiante: " + est.getNroLegajo());
        System.out.println("Legajo Docente: " + doc.getNroLegajo());
        
        System.out.println(est.toString());
        System.out.println(doc.toString());
        //System.out.println(per.toString());

    }
    
}
