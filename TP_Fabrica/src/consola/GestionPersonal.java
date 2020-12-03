package consola;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class GestionPersonal {
    
    private Persona[] empleadosFabrica;
    
    public GestionPersonal(){
        empleadosFabrica = new Persona[4];
    }
    
    public GestionPersonal(int tamanio){
        empleadosFabrica = new Persona[tamanio];
    }
    
    public void altaPersona(Persona per, int pos){
        empleadosFabrica[pos] = per;
    }
    
    public void modificacion(int dni, String nombre){
        for (int i = 0; i < empleadosFabrica.length; i++) {
            if(empleadosFabrica[i].getDocumento() == dni){
                empleadosFabrica[i].setNombre(nombre);
                System.out.println("Nombre modificado");
                break;
            }
        }
    }
    
    public void bajaPersona(String nombre, String apellido){
        for (int i = 0; i < empleadosFabrica.length; i++) {
            if(empleadosFabrica[i].getNombre().equals(nombre) && empleadosFabrica[i].getApellido().equals(apellido)){
                empleadosFabrica[i] = null;
                System.out.println("Empleado dado da baja");
                break;
            }else{
                System.out.println("Error en el DNI");
            }
        }
    }
    
    public Empleado mayorPiezas(){
        Empleado empleadoMayorPiezas = null;
        int cantidadMayorPiezas = 0;
        
        for (Persona persona : empleadosFabrica) {
            if(persona instanceof Empleado){
                Empleado aux = (Empleado) persona;
                int[] arregloPiezas = aux.getPiezasPorMeses();
                int acumulador = 0;
                for (int piezas : arregloPiezas) {
                    acumulador += piezas;
                }
                
                if(acumulador > cantidadMayorPiezas){
                    cantidadMayorPiezas = acumulador;
                    empleadoMayorPiezas = aux;
                }
            }
            
        }return empleadoMayorPiezas;
    }

    @Override
    public String toString() {
        String lista = "";
        for (Persona persona : empleadosFabrica) {
            if(persona != null){
                lista += persona.toString() + "\n";
            }
        }
        return lista;        
    }
    
    
    
    
}
