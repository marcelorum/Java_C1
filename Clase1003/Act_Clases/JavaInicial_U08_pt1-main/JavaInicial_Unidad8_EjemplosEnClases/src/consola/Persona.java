package consola;

/**
 *
 * @author fnang
 */
public class Persona {
    //CAMPOS
    public String nombre;
    public String apellido;
    public int documento;
    
    //METODOS
    public void mostrarInformacion(){
        System.out.println("\nNombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento: " + documento);
    }
    
} //Fin clase
