package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class GestionPersonal {
    private Persona[] organizacion;
    
    public GestionPersonal(){
        organizacion = new Persona[4];
    }
    
    public GestionPersonal(int tamanio){
        organizacion = new Persona[tamanio];
    }
    
    //ABM
    
    //ALTA
      
    public void alta(Persona per, int pos){
        organizacion[pos] = per;
    }
    
    // SALIDA DE INFO

    @Override
    public String toString() {
        String info = "";
        for (Persona persona : organizacion) {
            info += persona.toString() + "\n";
            
        }
        return info;
    }
    
    // BUSCAR
    
    public String buscar(String ape, int leg){
        String info = "No se encuentra";
        for (Persona persona : organizacion) {
            if(persona.getApellido().equals(ape)){
                persona.setLegajo(leg);
                info = persona.toString();
                return info;
            }
        }
        return info;
    }
    
    // ASISTENCIA
    
    public String mejorAsistencia(){
        int mayor = 0;
        Empleado mejor = null;
        for (Persona persona : organizacion) {
            if(persona instanceof Empleado){
                Empleado aux = (Empleado) persona;
                boolean[] asis = aux.getAsistencias();
                int suma = 0;
                for (boolean asi : asis) {
                    if(asi){
                        suma++;
                    }
                }
                if(suma > mayor){
                    mayor = suma;
                    mejor = aux;                   
                }
            }
        }
        String info = "Mejor asistente\n";
        info += "Leg: " + mejor.getLegajo() + ", Apellido: " + mejor.getApellido();
        return info;
    }
    
    // BUSCAR POR LEGAJO
    
    public String buscarPorLegajo(int lega){
        String info = "No se encuentra";
        for (Persona persona : organizacion) {
            if(persona.getLegajo() == lega){
                info = persona.toString();
            }
        }return info;
    }
}