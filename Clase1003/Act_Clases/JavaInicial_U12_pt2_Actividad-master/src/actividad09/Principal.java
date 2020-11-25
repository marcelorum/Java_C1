package actividad09;

/**
 * Clase Principal. Representa la clase en donde se visualizará el menú para
 * llamar a las funciones que ingrese el usuario
 *
 * @author Angonoa, Franco
 * @since Julio 2019
 * @version 3.0
 */
public class Principal {

    public static void main(String[] args) {

        //RESPETAR EL ORDEN DEL CONSTRUCTOR DOCENTE -> (String nombre, long documento, int genero, int edad, String especialidad)
        Docente docente1 = new Docente("Ada Lovelace", 16553129, 0, 32, "Matemática");
        Docente docente2 = new Docente("John von Neumann", 15453109, 1, 35, "Lengua");
        Docente docente3 = new Docente("James Gosling", 15463781, 1, 56, "Ciencias Sociales");
        Docente docente4 = new Docente("Alan Turing", 23454164, 2, 25, "Ciencias Naturales");

        //RESPETAR EL ORDEN DEL CONSTRUCTOR ESTUDIANTE -> (String nombre, long documento, int genero, int edad, int añosDeEstudio)
        Estudiante estudiante1 = new Estudiante("Richard Stallman", 38769900, 1, 10, 5);
        Estudiante estudiante2 = new Estudiante("Joan Clarke", 400912385, 0, 9, 4);
        Estudiante estudiante3 = new Estudiante("Grace Hopper", 39876345, 0, 11, 5);
        Estudiante estudiante4 = new Estudiante("Linus Torvalds", 41498542, 2, 12, 6);

        //Crear un objeto que represente a la clase GestionAcademica
        GestionAcademica ga = new GestionAcademica(8);

        //Ejercicio 1.
        System.out.println("=====EJERCICIO 1: CARGAR Y MOSTRAR EL ARREGLO=====");
        ga.agregarPersona(docente1, 0);
        ga.agregarPersona(docente2, 1);
        ga.agregarPersona(docente3, 2);
        ga.agregarPersona(docente4, 3);
        ga.agregarPersona(estudiante1, 4);
        ga.agregarPersona(estudiante2, 5);
        ga.agregarPersona(estudiante3, 6);
        ga.agregarPersona(estudiante4, 7);
        //Mostrar el arreglo:
        System.out.println("El arreglo es: " + ga.toString());

        //Ejercicio 2.
        System.out.println("\n=====EJERCICIO 2: DATOS DEL SEGUNDO OBJETO=====");
        String ej2 = ga.segundoObjeto();
        System.out.println(ej2);

        //Ejercicio 3.
        System.out.println("\n=====EJERCICIO 3: CAMBIAR NOMBRE=====");
        ga.ultimoObjeto();
        System.out.println("¡Cambio de nombre!");
        System.out.println(ga);

        //Ejercicio 4.
        System.out.println("\n=====EJERCICIO 4: ARREGLO SEGUNEDAD=====");
        System.out.println("Ingrese una edad: ");
        int edad = Consola.readInt();
        String ejercicio4 = ga.personasSegunEdad(edad);
        System.out.println("Los que son menores a " + edad + " anios son:\n" + ejercicio4);

        //Ejercicio 5.
        System.out.println("\n=====EJERCICIO 5: SOLO GENERO FEMENINO=====");
        String ejercicio5 = ga.soloGeneroFemenino();
        System.out.println(ejercicio5);

    } //Fin del método main

} //Fin de la clase
