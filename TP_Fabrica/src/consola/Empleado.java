package consola;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Empleado extends Persona {
    private int[] piezasPorMeses;

    public Empleado() {
    }

    public Empleado(int[] piezasPorMeses) {
        this.piezasPorMeses = piezasPorMeses;
    }

    public Empleado(int[] piezasPorMeses, int documento, String nombre, String apellido, int edad) {
        super(documento, nombre, apellido, edad);
        this.piezasPorMeses = piezasPorMeses;
    }
    
    public String visualizarPiezasPorMeses(){
        String salida = "[";
        for (int elemento : piezasPorMeses) {
            salida += elemento + " ";
        }
        salida += "]";
        return salida;
    }

    public int[] getPiezasPorMeses() {
        return piezasPorMeses;
    }

    public void setPiezasPorMeses(int[] piezasPorMeses) {
        this.piezasPorMeses = piezasPorMeses;
    }

    @Override
    public String toString() {
        return super.toString() + ", PiezasPorMeses: " + visualizarPiezasPorMeses();
    }
    
    

    
}
