package actividad09;

/**
 * Clase Docente. Representa a los doncetes que forman parte de la institución.
 * Su único atributo es la especialidad. Ejemplo: Ciencias sociales, Matemática,
 * Lengua, etc.
 *
 * @author Angonoa, Franco
 * @since Julio 2019
 * @version 3.0
 */
public class Docente extends Persona {

    //CAMPOS
    private String especialidad;

    //CONSTRUCTORES
    public Docente(){
        
    }
    
    public Docente(String esp){
        especialidad = esp;
    }
    
    public Docente(String nombre, long documento, int genero, int edad, String especialidad) {
        super(nombre, documento, genero, edad);
        this.especialidad = especialidad;
    }

    //METODOS
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", es un docente con especialidad: " + especialidad;
    }

} //Fin de la clase
