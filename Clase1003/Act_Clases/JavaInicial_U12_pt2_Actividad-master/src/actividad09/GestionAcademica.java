package actividad09;

/**
 * Clase GestionAcademica. Representa la funcionalidades básicas con respecto al
 * arreglo que contiene a las personas que forman parte de la institucion.
 *
 * @author Angonoa, Franco
 * @since Julio 2019
 * @version 3.0
 */
public class GestionAcademica {

    //CAMPOS
    Persona[] institucion;

    //CONSTRUCTORES
    /**
     * No recibe ningun parámetro e instancia el arreglo con un tamaño de 8.
     */
    public GestionAcademica() {
        institucion = new Persona[8];
    }

    /**
     * Recime un parámetro que representa el tamaño para instanciar el arreglo.
     *
     * @param tamanio length del arreglo.
     */
    public GestionAcademica(int tamanio) {
        institucion = new Persona[tamanio];
    }

    //MÉTODOS QUE REPRESENTAN LOS EJERCICIOS.
    /**
     * Ejercicio 1. Guardar en el arreglo llamado institucion que corresponde a
     * la clase GestionAcademica a los docentes y estudiantes creados en la
     * simulación (Es decir, en el main() ). También se le debe pasar el número
     * de índice.
     *
     * @param per objeto Persona
     * @param pos posicion en el arreglo
     */
    public void agregarPersona(Persona per, int pos) {
        institucion[pos] = per;
    }

    /**
     * Ejercicio 2. Tomar el segundo objeto del arreglo institucion y mostrar si
     * es Estudiante o Docente, junto con su nombre y documento.
     *
     * @return
     */
    public String segundoObjeto() {
        String personaCadena = "";

        Persona perAux = institucion[1];

        personaCadena += "\nNombre: " + perAux.getNombre();
        personaCadena += "\nDocumento: " + perAux.getDocumento();

        if (perAux instanceof Estudiante) {
            personaCadena += "\nEs un estudiante";
        } else {
            personaCadena += "\nEs un docente";
        }

        /* OTRA FORMA DE RESOLVERLO
        personaCadena += "\nNombre: " + institucion[1].getNombre();
        personaCadena += "\nDocumento: " + institucion[1].getDocumento();
        
        if(institucion[1] instanceof Estudiante) segundoObjeto += "\nEs un estudiante";
        else segundoObjeto += "\nEs un docente";        
         */
        return personaCadena;
    }

    /**
     * Ejercicio 3. Tomar el último objeto del arreglo institucion y cambiar su
     * nombre a “Estanislao”. Mostrar nuevamente el arreglo institucion para
     * poder ver el cambio.
     */
    public void ultimoObjeto() {
        int ultimoIndice = institucion.length - 1;
        Persona per = institucion[ultimoIndice];

        per.setNombre("Estanislao");
    }

    /**
     * Ejrercicio 4. Almacenar en una variable de tipo String llamada segunEdad
     * aquellas personas que tengan como edad un número menor a X, siendo X un
     * valor ingresado por teclado (desde el main() ). Por último, mostrar por
     * pantalla el String que retorna el método.
     *
     * @param x edad ingresada por teclado.
     * @return personas menores a x.
     */
    public String personasSegunEdad(int x) {
        String segunEdad = "";
        for (Persona elemento : institucion) {
            if (elemento.getEdad() < x) {
                segunEdad += elemento.toString() + "\n";
            }
        }

        return segunEdad;
    }

    /**
     * Ejercicio 5. Mostrar la información de todas las personas de género
     * femenino (0) y además la cantidad de personas de dicho género.
     *
     * @return Personas con el genero femenino.
     */
    public String soloGeneroFemenino() {
        String soloFem = "";
        int contador = 0;

        for (Persona elemento : institucion) {
            if (elemento.getGenero() == 0) {
                soloFem += elemento.toString() + "\n";
                contador++;
            }
        }
        soloFem += "Cantidad de personas femeninas: " + contador;
        return soloFem;
    }

    /**
     * Método toString recorre el arreglo para poder visualizar los docentes y
     * estudiantes que forman parte de la institución
     *
     * @return toda la información de los objetos almacenados en el arreglo.
     */
    @Override
    public String toString() {
        String infoInstitucion = "\n[\n";

        for (Persona elemento : institucion) {
            infoInstitucion += elemento + " \n";
        }

        infoInstitucion += "]";

        return infoInstitucion;
    }
}
