package clase1017_act;

/**
 *
 * @author Marce
 */
public class Camisa {
    // CAMPOS
    private int identificador;
    private String color;
    private double precio;
    private char talle;
    
    // CONSTRUCTOR
    public Camisa(){}

    public Camisa(int identificador, double precio) {
        this.identificador = identificador;
        this.precio = precio;
    }

    public Camisa(int identificador, String color, double precio, char talle) {
        this.identificador = identificador;
        this.color = color;
        this.precio = precio;
        this.talle = talle;
    }
    
    // METODOS

    public int getIdentificador() {
        return identificador;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public char getTalle() {
        return talle;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }

    @Override
    public String toString() {
        return "Camisa{" + "identificador=" + identificador + ", color=" + color + ", precio=" + precio + ", talle=" + talle + '}';
    }
    
    
}
