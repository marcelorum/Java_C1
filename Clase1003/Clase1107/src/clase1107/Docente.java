package clase1107;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Docente extends Persona{
    
    private int antiguedad;
    private String profesion;

    public Docente() {
    }

    public Docente(int antiguedad, String profesion, int nroLegajo, String apellido, String nombre, int dni) {
        super(nroLegajo, apellido, nombre, dni);
        this.antiguedad = antiguedad;
        this.profesion = profesion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        //return "Docente{" + "antiguedad=" + antiguedad + ", profesion=" + profesion + '}';
        // Para hacerlo desde la SUPER CLASE
        return super.toString() + " es un Docente{" + "antiguedad=" + antiguedad + ", profesion=" + profesion + '}';
    }
    
    
    @Override
    public void metodoAbstracto(){
        System.out.println("Abstracto de Docente");
        
    }
    
    
    
}
