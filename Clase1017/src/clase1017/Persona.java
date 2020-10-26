package clase1017;

/**
 *
 * @author Marce
 */
public class Persona {
    
    // Campos PRIVATE
    private String nombre;
    private String apellido;
    private int documento;
    private int edad;
    
    // CONSTRUCTOR
    // CONSTRUCTOR DEFAULT
    public Persona(){
        
    }
    // CONSTRUCTOR CON TODOS LOS CAMPOS
    public Persona(String nombre, String apellido, int documento, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
    }
    
    // CONSTRUCTOR CON SOLO DOS CAMPOS
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // METODOS GET/SET
    
    // GETS
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getDocumento(){
        return documento;
    }
    public int getEdad(){
        return edad;
    }
    
    // SETS
    
    public void setNombre(String newNombre){
        nombre = newNombre;
    }
    public void setApellido(String newApellido){
        apellido = newApellido;
    }
    public void setDocumento(int newDoc){
        documento = newDoc;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    public void mostrarInformacion(){
        System.out.println("\nNombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Edad: " + edad);
    }
    
    @Override
    public String toString(){
        String informacion = "[";
        informacion += "Nombre: " + nombre;
        informacion += ", Apellido: "+ apellido;
        informacion += ", Documento: "+ documento;
        informacion += ", Edad: "+ edad;
        informacion += "]";
        return informacion;
        // return "[Nombre: " + nombre + ", Apellido: " + apellidos....;
    }
    
} // Fin de clase
