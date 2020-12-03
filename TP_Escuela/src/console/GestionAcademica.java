package console;


/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class GestionAcademica {
    private Persona[] colegio;

    public GestionAcademica() {
        colegio = new Persona[4];
    }

    public GestionAcademica(int tamanio) {
        colegio = new Persona[tamanio];
    }
    
    // ALTA
    public void alta(Persona per, int pos){
        colegio[pos] = per;
    }
    
    // BUSCAR
    
    public String buscar(String apellido){
        for (Persona persona : colegio) {
            if (persona.getApellido().equals(apellido)){
                if (persona instanceof Docente){
                    String info = persona.getNombre() + persona.getEdad() + ((Docente) persona).getProfesion();
                    return info;
                }else if(persona instanceof Estudiante){
                    String info = persona.getNombre() + persona.getEdad() ;
                    float[] aux = ((Estudiante) persona).getPromedios();
                    float mate = aux[2];
                    info += mate;
                    return info;
                }
            }
        }
        return "No se encuentra la persona";
    }
    
    // MEJOR PROMEDIO
    
    public Persona mejorPromedio(){
        Estudiante mejor = null;
        float mayor = 0;
        
        for (Persona persona : colegio) {
            if(persona instanceof Estudiante){
                Estudiante aux = (Estudiante) persona;
                float[] proms = aux.getPromedios();
                float suma = 0;
                for (float prom : proms) {
                    suma += prom;
                }
                if (suma > mayor){
                    mayor = suma;
                    mejor = aux;
                }
            }
            
        }return mejor;
    }
    
    // CANTIDAD X GENERO
    
    public int cantidad(int gen){
        int total = 0;
        for (Persona persona : colegio) {
            if (persona.getGenero() == gen){
                total++;
            }
        }
        return total;
    }
    
    // SALIDA

    @Override
    public String toString() {
        String info = "";
        for (Persona persona : colegio) {
            if(persona != null){
                info += persona.toString() + "\n";
            }
        }
        return info;
    }
    
}
