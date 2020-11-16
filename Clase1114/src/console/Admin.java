package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Admin extends Persona {
    private int categoria;
    private int legajo;

    public Admin() {
    }

    public Admin(int categoria, int legajo, int documento, String nombreApellido, int edad) {
        super(documento, nombreApellido, edad);
        this.categoria = categoria;
        this.legajo = legajo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return super.toString() + "Admin{" + "categoria=" + categoria + ", legajo=" + legajo + '}';
    }
    
    
    
}
