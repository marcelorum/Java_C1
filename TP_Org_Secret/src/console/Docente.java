package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Docente extends Persona{
    private String profesion;
    private int matricula;

    public Docente() {
    }

    public Docente(String profesion, int matricula) {
        this.profesion = profesion;
        this.matricula = matricula;
    }

    public Docente(String profesion, int matricula, String nombre, String apellido, int diaN, int mesN, int anoN) {
        super(nombre, apellido, diaN, mesN, anoN);
        this.profesion = profesion;
        this.matricula = matricula;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Profesión: " + profesion + ", Matrícula: " + matricula;
    }
    
    
    
}
