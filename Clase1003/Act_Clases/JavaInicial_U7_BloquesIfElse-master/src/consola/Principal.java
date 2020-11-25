package consola;

/**
 *
 * @author Franco Angonoa
 * @since 12 Septiembre 2020
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Creamos un objeto que instancia
            la clase Ejercicios para poder 
            utilizar sus metodos
        */  
        Ejercicios ejercicios = new Ejercicios();
        
        //Ejemplo 1
        ejercicios.abonarImpuesto();
        
        //Ejemplo 2
        ejercicios.parOImpar();
        
        //Ejemplo 3
        ejercicios.nota();
    
        //Ejemplo 4
        ejercicios.cantidadDias();
        
    } //Fin del main
    
} //Fin de clase
