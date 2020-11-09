package java1_actividad6;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estacionamiento estNvaCba = new Estacionamiento();
        
        // FORMA 1
        Persona per1 = new Persona("Juan Carlos", 20, true);
        Vehiculo veh1 = new Vehiculo("ABC123", per1, "Rojo", true);
        estNvaCba.agregarVehiculo(veh1);
        
        // FORMA 2
        
        estNvaCba.agregarVehiculo(new Vehiculo("ZXC123", new Persona("Juan Perez", 30, true), "Verde", false));
        
        String listado = estNvaCba.listadoDeVehiculos(); // con retorno string
        System.out.println("Listado de veículos\n" + listado);
        
        int autos = estNvaCba.cantidadDeVehiculos();
        System.out.println("Cantidad de Autos: " + autos);
        
        int vacio = estNvaCba.espacioLibre();
        System.out.println("Espacios vacíos: " + vacio);
        
        // ELIMINAR y LISTAR
        estNvaCba.eliminarVehiculo("ZXC123");
        
        String listadoa = estNvaCba.listadoDeVehiculos(); // con retorno string
        System.out.println("Listado de veículos\n" + listadoa);
    }
        
}
