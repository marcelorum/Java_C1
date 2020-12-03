package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Estudiante extends Persona {
    private int legajo;
    private int[] notas;
    private boolean cursoPagado;

    public Estudiante() {
    }

    public Estudiante(int legajo, int[] notas, boolean cursoPagado) {
        this.legajo = legajo;
        this.notas = notas;
        this.cursoPagado = cursoPagado;
    }

    public Estudiante(int legajo, int[] notas, boolean cursoPagado, String nombre, String apellido, int diaN, int mesN, int anoN) {
        super(nombre, apellido, diaN, mesN, anoN);
        this.legajo = legajo;
        this.notas = notas;
        this.cursoPagado = cursoPagado;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public boolean isCursoPagado() {
        return cursoPagado;
    }

    public void setCursoPagado(boolean cursoPagado) {
        this.cursoPagado = cursoPagado;
    }
    
    public float getPromedio(){
        int acum = 0;
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
            acum++;
        } 
        float prom = suma / acum;
        return prom;
    }
    
    public String verNotas(){
        String info = "[";
        for (int nota : notas) {
            info += nota + ", ";
        }
        info += "]";
        return info;
    }
    
    public void cambiarNota(int ind, int nota){
        notas[ind] = nota;        
    }

    @Override
    public String toString() {
        return super.toString() + ", Legajo: " + legajo + ", Notas: " + verNotas() + ", Curso Pagado: " + cursoPagado;
    }
    
    
    
}
