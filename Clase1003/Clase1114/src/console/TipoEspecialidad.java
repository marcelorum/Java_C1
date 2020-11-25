package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class TipoEspecialidad {
    private String nombre;

    public TipoEspecialidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoEspecialidad{" + "nombre=" + nombre + '}';
    }
    
    
    
}
