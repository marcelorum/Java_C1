package consola;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public abstract class Persona {
    private String nombre;
    private long documento;
    private int genero;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, long documento, int genero, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + documento + ", Género: " + genero + ", Edad: " + edad;
    }
    
    
    
}
