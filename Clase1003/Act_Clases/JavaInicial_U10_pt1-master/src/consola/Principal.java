package consola;

import java.util.Scanner;

/**
 * Clase Unidad 10 parte 1. Trabajar con métodos y sobrecarga de métodos.
 *
 * @author Angonoa, Franco Nestor
 * @since Mayo 2020
 * @version 1.0 Inicial - 1.1 Cambios de valores
 */
public class Principal {

    /**
     * Método main.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Matematica mat = new Matematica();

        System.out.println("===TABLA DE MULTIPLICAR===");
        mat.tablaMultiplicar(5); //Como es void, simplemente llamo al metodo.

        System.out.println("\n===SUMA DE NUMEROS===");
        int resultado = mat.sumaDeNumeros(5, 10); //Como retorna un int, lo debo guardar en una variable.
        System.out.println("El resultado es: " + resultado);

        System.out.println("\n===OBJETOS COMO ARGUMENTO Y PARÁMETROS===");
        Persona per = new Persona(); //Creamos un objeto que instancie a la clase Persona.
        per.nombreApellido = "Juan Perez"; //Cargamos sus atributos.
        per.edad = 20;

        System.out.println("==ANTES DE MODIFICAR==");
        per.mostrarInformacion();

        MinisterioNombres mn = new MinisterioNombres(); //Creamos un objeto del ministerio, para poder utilizar sus metodos.
        mn.cambiarNombre(per);

        System.out.println("==DESPUÉS DE MODIFICAR==");
        per.mostrarInformacion();

        /*
            ACTIVIDADES EN CLASE
         */
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\n===ACTIVIDADES===");
        Unidad10ACT u10 = new Unidad10ACT(); //Primero se crea el objeto para poder utilizar los métodos.
        System.out.println("\t===ACTIVIDAD 1===");

        System.out.println("Ingresa un numero: ");
        int numeroUno = teclado.nextInt();

        System.out.println("Ingresa un numero: ");
        int numeroDos = teclado.nextInt();
        
        int mayor = u10.esMayor(numeroUno, numeroDos);
        System.out.println("\tEl mayor es: " + mayor);

        System.out.println("\n\t===ACTIVIDAD 2===");

        System.out.println("Ingresa un numero: ");
        int numeroIntervalo = teclado.nextInt();
        
        boolean inter = u10.entreIntervalos(numeroIntervalo);
        System.out.println("El numero esta entre los intervalos definidos?: " + inter);

        System.out.println("\n\t===ACTIVIDAD 3===");
        String nombres = u10.vectorNombres();
        System.out.println("Los nombres son: " + nombres);

        System.out.println("\n\t===ACTIVIDAD 4===");
        //Primero se crean las dos personas y cargamos sus atributos.
        Persona per1 = new Persona();
        per1.nombreApellido = "Jorge Luis Borges";
        per1.edad = 87;

        Persona per2 = new Persona();
        per2.nombreApellido = "Julio Cortazar";
        per2.edad = 70;

        //Metodo con retorno lo tiene que guardar en un objeto del mismo tipo.
        Persona perMayor = u10.quienEsMayor(per1, per2);
        System.out.println("Información acerca de la persona mayor: ");
        perMayor.mostrarInformacion();

    } //Fin del metodo main()       

} //Fin de la clase
