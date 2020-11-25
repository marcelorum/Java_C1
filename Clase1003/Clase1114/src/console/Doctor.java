package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Doctor extends Persona{
    private int matricula;
    private TipoEspecialidad especialidad;
    
    // CONSTRUCTORES

    public Doctor() {
    }

    public Doctor(int matricula, TipoEspecialidad especialidad, int documento, String nombreApellido, int edad) {
        super(documento, nombreApellido, edad);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public TipoEspecialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(TipoEspecialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        //return "Doctor{" + "matricula=" + matricula + ", especialidad=" + especialidad + '}';
        return super.toString() + "Doctor{" + "matricula=" + matricula + ", especialidad=" + especialidad + '}';
    }
    
    
    
}
