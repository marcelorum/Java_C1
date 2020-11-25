package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Contacto {
    private String nombre;
    private int telefono;

    public Contacto() {
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
    }

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto: " + "Nombre: " + nombre + "\t\tTelefono: " + telefono;
    }
    
}
