package actividad09;

/**
 * Clase Persona. Representa a las personas con los atributos básicos que se
 * comparten. Es la superclase de la jerarquía.
 *
 * @author Angonoa, Franco Néstor
 * @since Julio 2019
 * @version 3.0
 */
public abstract class Persona {

    //CAMPOS
    private String nombre;
    private long documento;
    private int genero;
    private int edad;

    //CONSTRUCTORES
    public Persona(){
        
    }
    
    public Persona(String nombre, long documento, int genero, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.genero = genero;
        this.edad = edad;
    }

    //MÉTODOS
    public String getNombre() {
        return nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public int getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + documento + ", Género: " + genero + ", Edad: " + edad;
    }

} //Fin de la clase Persona
