package consola;

import java.util.Scanner;

/**
 *
 * @author fnang
 */
public class EjemplosArreglos {

    public void arreglosDePrimitivos() {
        System.out.println("==ARREGLO 1==");
        //Declarar e instaciar un vector - arreglo - array        
        //Tipo[] nombre = new Tipo[length];

        int[] vect1 = new int[5];
        //Primer indice: 0
        //Ultimo indice: vector.length - 1: 5 - 1 = 4.

        //Inicializamos con valores
        vect1[0] = 1;
        vect1[1] = 6;
        vect1[2] = 7;
        vect1[3] = 50;
        vect1[4] = 8;
        //vect1[5] = 10; //Error en tiempo de EJECUCION

        //Recorrer un arreglo - for comun
        for (int i = 0; i < vect1.length; i++) {
            System.out.println((i + 1) + "° elemento: " + vect1[i]);
        }

        //Recorrer un arreglo - for (each) mejorado
        for (int elemento : vect1) {
            System.out.println("Elemento: " + elemento);
        }

        System.out.println("\n\tLa cantidad de elementos son: " + vect1.length);

        System.out.println("\n===ARREGLO 2===");
        //Otra forma de crear arreglos.
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        for (char elemento : vocales) {
            System.out.println("Elemento: " + elemento);
        }

    }//Fin metodo arreglosDePrimitivos()

    public void arreglosDeObjetos1() {
        System.out.println("\n===ARREGLO 3===");

        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[3];
        //Inicialmente todos valores son null porque es un arreglo de Objetos.

        //Cargando valores...
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese un nombre: ");
            nombres[i] = teclado.nextLine();
        }

        //Recorriendo y mostrando
        System.out.println("Los nombres ingresados: ");
        for (String elemento : nombres) {
            System.out.println("Nombre: " + elemento);
        }

    } //Fin del metodo arreglosDeObjetos1()

    public void arreglosDeObjetos2() {

        //Declarar e instanciar un arreglo
        //Tipo[] nomVector = new Tipo[length];
        Persona[] personas1 = new Persona[5];

        Persona per1 = new Persona();
        Persona per2 = new Persona();

        personas1[0] = per1;
        personas1[1] = per2;
        personas1[2] = new Persona();

        //Cargamos valores a los objetos
        per1.nombre = "Juan";
        per1.apellido = "Pablex";
        per1.documento = 23456123;

        personas1[2].nombre = "Ana";
        personas1[2].apellido = "Mariax";
        personas1[2].documento = 34584212;

        System.out.println("\n==ARREGLO 4==");
        //Recorremos para mostrar el arreglo
        for (int i = 0; i < personas1.length; i++) {
            Persona aux = personas1[i];
            if (aux != null) {
                aux.mostrarInformacion();
            }
            //Otra forma:
            //if(personas1[i] != null) personas1[i].mostrarInformacion();
        }

        System.out.println("\nCON FOR MEJORADO");
        for (Persona elemento : personas1) {
            if (elemento != null) {
                elemento.mostrarInformacion();
            }
        }

        System.out.println("\n==ARREGLO 5==");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar el nro de Personas: ");
        int cantPersonas = teclado.nextInt();
        teclado.nextLine();
        Persona[] personas2 = new Persona[cantPersonas];

        //Cargar valores del objeto
        for (int i = 0; i < personas2.length; i++) {

            //Cargo los valores
            System.out.println("\nIngresar nombre: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingresar apellido: ");
            String apellido = teclado.nextLine();

            System.out.println("Ingresar documento: ");
            int documento = teclado.nextInt();
            teclado.nextLine();

            Persona personaPorTeclado = new Persona(); //Creo el objeto
            personaPorTeclado.nombre = nombre; //Asigno los valores
            personaPorTeclado.apellido = apellido;
            personaPorTeclado.documento = documento;

            personas2[i] = personaPorTeclado; //Guardo mi objeto en el arreglo
        }

        System.out.println("\nMostramos los resultados:");
        //Mostramos resultado
        for (Persona elementos : personas2) {
            elementos.mostrarInformacion();
        }

    } //Fin del metodo arreglosDeObjetos2()

} //Fin de la clase