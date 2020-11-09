package clase1107;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Estudiante extends Persona{
    
    // CAMPOS HEREDADOS
    //nroLegajo, apellido, nombre y dni
    
    // CAMPO PROPIO
    private int[] notas;

    public Estudiante() {
    }

    public Estudiante(int[] notas, int nroLegajo, String apellido, String nombre, int dni) {
        super(nroLegajo, apellido, nombre, dni);
        this.notas = notas;
    }
    
    // METODOS
    
    @Override
    public void setNroLegajo(int nroLegajo){
        if (nroLegajo > 5000){
            super.setNroLegajo(nroLegajo);
        }
        
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        //return "Estudiante{" + "notas=" + notas + '}';
        // Para hacerlo desde la SUPER CLASE
        return super.toString() + "Estudiante{" + "notas=" + notas + '}';
    }
    
    @Override
    public void metodoAbstracto(){
        System.out.println("Met abstracto Est");
        
    }
    
    
}
