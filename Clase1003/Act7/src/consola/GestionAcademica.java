package consola;

import java.util.Scanner;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class GestionAcademica {
    private Persona[] institucion;

    public GestionAcademica() {
        institucion = new Persona[8];
    }
    
    public GestionAcademica(int tamanio){
        institucion = new Persona[tamanio];
    }
    
    public void agregarPersona(Persona per, int pos){
        institucion[pos] = per;
    }
    
    public String segundoObjeto(){
        String informacion = "";
        Persona segundaPersona = institucion[1];
        if (segundaPersona instanceof Docente){
            informacion += "es un Docente, ";
        }else{
            informacion += "es un Estudiante, ";
        }
        
        informacion += "nombre: " + segundaPersona.getNombre();
        informacion += ", DNI: " + segundaPersona.getDocumento();
        
        return informacion;
    }
    
    public void cambiarNombre(){
        int ultimo = institucion.length -1;
        Persona pertemp = institucion[ultimo];
        pertemp.setNombre("Estanislao");
        
    }
    
    public String personasSegunEdad (int edad){
        String segunEdad = "";
        for (Persona persona : institucion) {
            if (persona.getEdad() < edad){
                segunEdad += persona.toString() + "\n";
            }
        }
        return segunEdad;
    }
    
    public String soloGeneroFemenino(){
        String fems = "";
        int contador = 0;
        
        for (Persona persona : institucion) {
            if(persona.getGenero() == 0){
                fems += persona.toString() + "\n";
                contador++;
            }
        }
        return fems;
    }

    @Override
    public String toString() {
        String listaPersonas = "[";
        for (Persona persona : institucion) {
            listaPersonas += persona.toString() + "\n";
            
        }
        listaPersonas += "]";
        return listaPersonas;
    }
    
    
    
    
    Scanner teclado = new Scanner(System.in);
    //blabla = teclado.nextLine();

}
