package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public abstract class Persona {
    private int documento;
    private String nombreApellido;
    private int edad;
    
    // contructores

    public Persona() {
    }

    public Persona(int documento, String nombreApellido, int edad) {
        this.documento = documento;
        this.nombreApellido = nombreApellido;
        this.edad = edad;
    }
    
    // Metodos

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "documento=" + documento + ", nombreApellido=" + nombreApellido + ", edad=" + edad + '}';
    }
    
    
    
}
