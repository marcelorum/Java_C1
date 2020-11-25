package consola;

/**
 *
 * @author Angonoa Franco
 * @since Abril 2020
 * @version 1.0 Version inicial. 1.1 Se agrega comentarios y se quitan las
 * tildes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabraOculta = "Franco";
        String palabraAleatoria = "";
        int numeroIntentos = 0;

        //Mientras la palabra aleatoria sea distinta a la palabra oculta
        while (!palabraAleatoria.equals(palabraOculta.toLowerCase())) {
            palabraAleatoria = ""; //Vaciamos para formar una nueva palabra

            //Pequeña ayuda: Saber el tamaño de la palabra que quiero adivinar
            while (palabraAleatoria.length() < palabraOculta.length()) {
                char asciiChar = (char) (Math.random() * 26 + 97); //Genera una letra aleatoria segun el ASCII
                palabraAleatoria += asciiChar;
                //System.out.println("Armado de palabra: " + palabraAleatoria);
            }
            numeroIntentos++; //Incremento el numero de intentos
            //System.out.println("La palabra aleatoria armada: " + palabraAleatoria);
        }
        System.out.println(palabraOculta + " se encontro despues de "
                + numeroIntentos + " intentos!");

    } //Fin del metodo main()

}//Fin de la clase
