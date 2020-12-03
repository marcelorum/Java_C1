package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public abstract class Persona {
    private int legajo;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(int legajo, String nombre, String apellido, int edad) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad;
    }
    
}