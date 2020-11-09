package java1_actividad6;

public class Estacionamiento {
    
    // CAMPOS
    private Vehiculo[] vehiculos;
    
    // VER ESTE CONSTRUCTOR
    public Estacionamiento() {
        vehiculos = new Vehiculo[5];
    }

    public Estacionamiento(int tamanio) {
        vehiculos = new Vehiculo[tamanio];
    }
    
    // METODOS
    
    public void agregarVehiculo(Vehiculo v){
        //Agrega un objeto de tipo vehículo al arreglo
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] == null){
                vehiculos[i] = v;
                break;
            }
        }
    }
    
    public void eliminarVehiculo(String patente){
        //Se debe buscar el objeto por su patente, si lo encuentra se
        //debe eliminar, si no se encuentra debe informarse la situación.
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null){
                Vehiculo aux = vehiculos[i];
                if(aux.getPatente().equals(patente)){
                    vehiculos[i] = null;
                    break;
                }
            }
        }
    }
    
    public int cantidadDeVehiculos(){
        //Devuelve un entero indicando la cantidad de vehículos que hay en el
        //estacionamiento.
        int cant = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo != null){
                cant += 1;
            } 
        }
        return cant;
    }
    
    public int espacioLibre(){
        //Devuelve un entero indicando la cantidad de espacio disponible en el
        //estacionamiento.
        int cant = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo == null){
                cant += 1;
            }
        }
        return cant;
    }
    
    public String listadoDeVehiculos(){
        //Devuelve un String con toda la información de los vehículos que se
        //encuentran en el estacionamiento.
        String vehiculosGuardados = "";
        
        /*
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null){
                Vehiculo aux = vehiculos[i];
                vehiculosGuardados += aux.toString()+ "\n";
            }
        }*/
        
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo != null){
                vehiculosGuardados += vehiculo.toString() + "\n";
            }else{
                vehiculosGuardados += "- Vacío\n";
            }
        }
        return vehiculosGuardados;
    }

}
