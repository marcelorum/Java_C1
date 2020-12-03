package consola;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Estudiante extends Persona {
    private int aniosDeEstudio;

    public Estudiante() {
    }

    public Estudiante(int aniosDeEstudio) {
        this.aniosDeEstudio = aniosDeEstudio;
    }

    public Estudiante(int aniosDeEstudio, String nombre, long documento, int genero, int edad) {
        super(nombre, documento, genero, edad);
        this.aniosDeEstudio = aniosDeEstudio;
    }

    public int getAniosDeEstudio() {
        return aniosDeEstudio;
    }

    public void setAniosDeEstudio(int aniosDeEstudio) {
        this.aniosDeEstudio = aniosDeEstudio;
    }

    @Override
    public String toString() {
        return super.toString() + " es estudiante del año : " + aniosDeEstudio;
    }
    
    
    
    
}
