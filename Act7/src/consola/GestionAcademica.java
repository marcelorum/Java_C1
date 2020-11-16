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
        
        return null;
    }
    
    public void cambiarNombre(){
        
    }
    
    public String personasSegunEdad (int edad){
        return null;
    }
    
    public String soloGeneroFemenino(){
        return null;
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
