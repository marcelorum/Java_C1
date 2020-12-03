package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Docente extends Persona{
    private String profesion;

    public Docente() {
    }

    public Docente(String profesion) {
        this.profesion = profesion;
    }

    public Docente(String profesion, String nombre, String apellido, int edad, int genero) {
        super(nombre, apellido, edad, genero);
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
        return super.toString() + ", Profesion: " + profesion;
    }
    
    
    
}
