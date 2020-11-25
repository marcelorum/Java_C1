package consola;

/**
 * Clase que representa a una persona con nombre, apellido y edad. Esta clase es
 * utilizada tanto para el ejemplo de la clase como para las actividades.
 *
 * @author Angonoa Franco
 * @since Mayo 2020
 * @version 1.0
 */
public class Persona {

    //CAMPOS
    public String nombreApellido;
    public int edad;

    /**
     * Método sin retorno que realiza las salidas por pantallas mostrando la
     * información de los atributos.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre y Apellido: " + nombreApellido);
        System.out.println("Edad: " + edad);
    }

} //Fin de la clase
