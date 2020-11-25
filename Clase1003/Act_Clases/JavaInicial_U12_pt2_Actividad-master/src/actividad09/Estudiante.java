package actividad09;

/**
 * Clase Estudiante. Representa a los estudiantes que forman parte de la institución.
 * Su único atributo es el año de estudio en que se encuentra: 1, 2, 3.
 * @author fnang
 */

public class Estudiante extends Persona{
    //CAMPOS
    private int aniosDeEstudio;

    //CONSTRUCTORES
    public Estudiante(){
        
    }
    
    public Estudiante(int anios){
        aniosDeEstudio = anios;
    }
    
    public Estudiante (String nombre, long documento, int genero, int edad, int añosDeEstudio){   
        super(nombre, documento, genero, edad);
        this.aniosDeEstudio = añosDeEstudio;
        
    }

    //METODOS
    public int getAniosDeEstudio() {
        return aniosDeEstudio;
    }

    public void setAniosDeEstudio(int aniosDeEstudio) {
        this.aniosDeEstudio = aniosDeEstudio;
    }

    @Override
    public String toString() {
        return super.toString() + ", es un estudiante del grado: " + aniosDeEstudio;
    }   
    
}//Fin de la clase
