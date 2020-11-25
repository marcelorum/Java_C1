package clase1107;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public abstract class Persona {
    private int nroLegajo;
    private String apellido;
    private String nombre;
    private int dni;

    public Persona() {
    }

    public Persona(int nroLegajo, String apellido, String nombre, int dni) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public abstract void metodoAbstracto();

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Persona{" + "nroLegajo=" + nroLegajo + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
}
