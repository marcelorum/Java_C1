package consola;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Docente extends Persona {
    private String especialidad;

    public Docente() {
    }

    public Docente(String especialidad) {
        this.especialidad = especialidad;
    }

    public Docente(String especialidad, String nombre, long documento, int genero, int edad) {
        super(nombre, documento, genero, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Docente{" + "especialidad=" + especialidad + '}';
    }
    
    
    
}
