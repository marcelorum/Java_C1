package console;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int tel;
        int op = 0;
        int num;
        Contacto con;
        // OBJETO DE TIPO AGENDA DE CLASES
        Agenda_de_Contactos ag = new Agenda_de_Contactos();
        // MENU DE OPCIONES
        while (op != 9) {
            System.out.println("\n**** MENU AGENDA ****");
            System.out.println("1 - Añadir Contacto");
            System.out.println("2 - Modificar Contacto");
            System.out.println("3 - Dar de baja Contacto");
            System.out.println("4 - Buscar un Contacto por nombre");
            System.out.println("5 - Listar todos los Contactos");
            System.out.println("6 - La Agenda está llena?");
            System.out.println("7 - Espacio libre en Agenda");
            System.out.println("8 - Ver código de un país");
            System.out.println("9 - Salir");
            try {
                System.out.print("  Escribe una opción: ");
                op = teclado.nextInt();
                switch(op){
                    case 1:
                        System.out.println("\nAñadir Contacto Nuevo");
                        if(!ag.agendaLlena()){
                            System.out.print("Ingrese el nombre: ");
                            teclado.nextLine();
                            nombre = teclado.nextLine();
                            System.out.print("Ingrese número: ");
                            tel = teclado.nextInt();
                            con = new Contacto(nombre, tel);
                            ag.anadirContacto(con);
                        }else{
                            System.out.println("No se puede, agenda llena!");
                        }
                        break;
                    case 2:
                        System.out.println("\nModificar Contacto por Número");
                        System.out.print("Ingrese el Número: ");
                        tel = teclado.nextInt();
                        System.out.print("Ingrese el nuevo Nombre: ");
                        teclado.nextLine();
                        nombre = teclado.nextLine();
                        ag.modificarContacto(tel, nombre);
                        break;
                    case 3:
                        System.out.println("\nEliminar Contacto");
                        System.out.print("Ingresar Número a eliminar: ");
                        tel = teclado.nextInt();
                        con = ag.darDeBajaContacto(tel);
                        System.out.println("Contacto eliminado:\n" + con);
                        break;
                    case 4:
                        System.out.println("\nBuscar en Agenda");
                        System.out.print("Nombre a buscar: ");
                        nombre = teclado.next();
                        tel = ag.buscarPorNombre(nombre);
                        if(tel != 0){
                            System.out.println("El número de " + nombre + " es " + tel);
                        }else{
                            System.out.println("El contacto " + nombre + " no existe");
                        }
                        break;
                    case 5:
                        System.out.println("\nLista de Contactos");
                        System.out.println(ag.listarContactos());
                        break;
                    case 6:
                        System.out.print("\nLa Agenda está llena?: ");
                        if(ag.agendaLlena()){
                            System.out.println("SI");
                        }else{
                            System.out.println("NO");
                        }
                        break;
                    case 7:
                        System.out.println("\nQuedan " + ag.espacioLibre() + " espacios libres");
                        break;
                    case 8:
                        System.out.println("\nVer País según Código");
                        System.out.print("Ingresar código a buscar: ");
                        num = teclado.nextInt();
                        System.out.println("El código " + num + " pertenece a " + Agenda_de_Contactos.codigoPais(num));
                        break;
                    case 9:
                        System.out.println("\nCHAU!!!\nMuchas Gracias!");
                        break;
                    default:
                        System.out.println("Opciones entre 1 y 9");
                    }
                } catch (InputMismatchException e){
                    System.out.println("ERROR: Ingresar solo números entre 1 y 9");
                    teclado.next();
                }
        }
    }
}
