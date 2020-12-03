package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Estudiante extends Persona {
    private float[] promedios;

    public Estudiante() {
    }

    public Estudiante(float[] promedios) {
        this.promedios = promedios;
    }

    public Estudiante(float[] promedios, String nombre, String apellido, int edad, int genero) {
        super(nombre, apellido, edad, genero);
        this.promedios = promedios;
    }
    
    public String verPromedios(){
        String info = "[ ";
        for (float nota : promedios) {
            info += nota + " ";
        }
        info += " ]";
        return info;
    }

    public float[] getPromedios() {
        return promedios;
    }

    public void setPromedios(float[] promedios) {
        this.promedios = promedios;
    }

    @Override
    public String toString() {
        return super.toString() + ", Promedios: " + verPromedios();
    }
    
    

    
    
    
    
}
