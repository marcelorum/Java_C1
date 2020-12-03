package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Empleado extends Persona{
    private boolean[] asistencias;

    public Empleado() {
    }

    public Empleado(boolean[] asistencias) {
        this.asistencias = asistencias;
    }

    public Empleado(boolean[] asistencias, int legajo, String nombre, String apellido, int edad) {
        super(legajo, nombre, apellido, edad);
        this.asistencias = asistencias;
    }

    public boolean[] getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(boolean[] asistencias) {
        this.asistencias = asistencias;
    }
    
    public String verAsistencias(){
        String info = "";
        for (boolean asistencia : asistencias) {
            info += asistencia + " ";
        }
        return info;
    }

    @Override
    public String toString() {
        return super.toString() + ", Asistencias: " + verAsistencias();
    }
    
}