package consola;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Gerente extends Persona{
    private String profesion;

    public Gerente() {
    }

    public Gerente(String profesion) {
        this.profesion = profesion;
    }

    public Gerente(String profesion, int documento, String nombre, String apellido, int edad) {
        super(documento, nombre, apellido, edad);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Profesión: " + profesion;
    }
    
    
    
}
