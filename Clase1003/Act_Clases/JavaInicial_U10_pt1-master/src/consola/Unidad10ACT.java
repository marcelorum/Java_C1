package consola;

/**
 * La siguiente clase representa las actividades realizadas en la unidad 10.
 *
 * @author Angonoa, Franco
 * @since Mayo 2020
 * @version 1.0 Inicial - 1.1 Cambios de valores
 */
public class Unidad10ACT {

    /**
     * Actividad 1. Crear una clase titulada Unidad 10 el cual contenga un
     * método llamado esMayor() que recibe como parámetros dos números y
     * devuelve un entero int. La tarea es devolver el mayor de los dos
     * parámetros
     *
     * @param num1 primer número que el usuario cargará
     * @param num2 segundo número que el usuario cargará
     * @return el mayor de los dos números.
     */
    public int esMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }

        return num2;
    } //Fin del método.

    /**
     * Actividad 2 El siguiente método de la clase es entreIntervalos() en donde
     * recibe un parámetro entero y devuelve un true si el número está entre el
     * 0 y 10 ó entre el 60 y 70
     *
     * @param numero representa el número que cargará el usuario.
     * @return true si el numero está entre 0 y 10 ó entre el 60 y 70.
     */
    public boolean entreIntervalos(int numero) {
        //Forma simplificada: las condiciones devuelven valores booleanos.
        return (numero > 0 && numero < 10) || (numero > 60 && numero < 70);
    } //Fin del método

    /**
     * Actividad 3. Otro método se llama vectorNombres() el cuál se debe crear
     * un vector con cinco nombres y a cada elemento se lo debe almacenar en un
     * String que tiene que ser devuelto.
     *
     * @return cadena de String con cinco nombres.
     */
    public String vectorNombres() {
        //Carga de vectores
        String[] nombres = {"San Martin", "Saavedra", "Castelli", "Rivadavia", "Brown"};

        //Inicio de la cadena, para darle un buen formato.
        String todxsNombres = "Nombres: [";

        for (int i = 0; i < nombres.length; i++) {
            todxsNombres += nombres[i] + " "; //A cada nombre, le concateno un espacio
        }

        todxsNombres += "]"; //Para que la cadena finalice con un corchete.
        return todxsNombres;
    } //Fin del metodo

    /**
     * Actividad 4. Por último, se debe utilizar la clase Persona de esta
     * filmina, instanciar dos objetos en el main y el método quienEsMayor()
     * devolverá el objeto persona que tenga la edad mayor
     *
     * @param per1 representa un objeto que instancia de la clase Persona.
     * @param per2 representa otro objeto que instancia de la clase Persona.
     * @return el objeto que tenga mayor edad.
     */
    public Persona quienEsMayor(Persona per1, Persona per2) {
        int edad1 = per1.edad;
        int edad2 = per2.edad;

        int mayor = esMayor(edad1, edad2);

        if (mayor == edad1) {
            return per1;
        }
        return per2;
    } //Fin del metodo

}
 //Fin de la clase
