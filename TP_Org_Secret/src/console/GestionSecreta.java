package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class GestionSecreta {
    private Persona[] consolata;
    
    public GestionSecreta(){
        consolata = new Persona[7];
    }
    
    public GestionSecreta(int tamanio){
        consolata = new Persona[tamanio];
    }
    
    // ALTA
    
    public void alta(Persona per, int pos){
        consolata[pos] = per;
    }
    
    // EJE 1.1
    public String cambioLeg(int pos, int leg){
        ((Estudiante) consolata[pos]).setLegajo(leg);
    return consolata[pos].toString();
    }
    
    // EJE 1.2
    public int getEdad(int pos){
        //int anoA = 2020;
        //int anoN = consolata[pos].getAnoN();
        //int edad = anoA - anoN;
        int edad = 2020 - consolata[pos].getAnoN();
        return edad;
    }
    
    // EJE 1.3
    public String pagarCuota(int pos){
        ((Estudiante) consolata[pos]).setCursoPagado(true);
        return consolata[pos].toString();
    }
    
    // EJE 2.1
    public float getProm(int pos){
        float prom = ((Estudiante) consolata[pos]).getPromedio();
        return prom;
    }
    
    // EJE 2.2
    public String cambiarNotas(int pos, int ind, int nota){
        ((Estudiante) consolata[pos]).cambiarNota(ind, nota);
        return consolata[pos].toString();
    }
    
    // EJE 2.3
    public boolean verAprobado(int pos){
        boolean estado = false;
        if (((Estudiante) consolata[pos]).getPromedio() > 7){
            if(((Estudiante) consolata[pos]).isCursoPagado()){
                estado = true;
            }
        }
        return estado;
    }
    
    // EJE 3.3
    public String soloDeudas(){
        String info = "";
        for (Persona persona : consolata) {
            if(persona instanceof Estudiante){
                if(!((Estudiante) persona).isCursoPagado()){
                    info += persona.getApellido() + "\n";
                }
            }
        }
        return info;
    }
    
    // MOSTRAR
    @Override
    public String toString() {
        String info = "Info Consolata\n";
        for (Persona persona : consolata) {
            info += persona + "\n";
        }
        return info;
    }

}