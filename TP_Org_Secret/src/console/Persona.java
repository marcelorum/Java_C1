package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int diaN;
    private int mesN;
    private int anoN;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int diaN, int mesN, int anoN) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaN = diaN;
        this.mesN = mesN;
        this.anoN = anoN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDiaN() {
        return diaN;
    }

    public void setDiaN(int diaN) {
        this.diaN = diaN;
    }

    public int getMesN() {
        return mesN;
    }

    public void setMesN(int mesN) {
        this.mesN = mesN;
    }

    public int getAnoN() {
        return anoN;
    }

    public void setAnoN(int anoN) {
        this.anoN = anoN;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha: " + diaN + "/" + mesN + "/" + anoN;
    }
}