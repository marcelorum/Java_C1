package consola;

/**
 * Clase que representa un Ministerio de Nombres autorizados para cambiar el
 * nombre de una persona. Es utilizada para el ejemplo de la clase Unidad 10.
 *
 * @author Angonoa, Franco
 * @since Mayo 2020
 * @version 1.0
 */
public class MinisterioNombres {

    /**
     * Método que permite cambiar el nombre de una persona que recibe como
     * parámetro.
     *
     * @param unaPer objeto que instancia la clase Persona y que se le modifica
     * sus atributos.
     */
    public void cambiarNombre(Persona unaPer) {
        //unaPer = new Persona(); //Referencia nueva - Recuerde que esto hace que no cambie la información del objeto que se pasa como parámetro ya que estaría creando una nueva referencia.
        unaPer.nombreApellido = "Bad Bunny";
        unaPer.edad = 26;
    }

}//Fin de la clase
