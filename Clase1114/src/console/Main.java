package console;


// TEMAS
// POLIMORFISMO
// CONVERSION
// INSTANCEOF

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creo un objeto de cada uno
        
        //Admin admin1 = new Admin(10, 1234, 12345678, "Juan Perez", 30);
        //Doctor doc1 = new Doctor(2323, new TipoEspecialidad("Pediatra"), 12345678, "Juan Perez Hijo", 35);
        
        // Creo los mismo objetos pero con Polimorfismo
        
        Persona adm = new Admin(10, 1234, 12345678, "Juan Perez", 30);
        Persona doc = new Doctor(2323, new TipoEspecialidad("Pediatra"), 12345678, "Juan Perez Hijo", 35);
        
        Persona[] hospital = {doc, adm}; // Polimorfmismo. Si se puede hacer porque ambos 
        //Doctor[] doctores = {doc, adm}; // ESTO NO se puede porque adm no es un doctor
        
        for (Persona elemento : hospital) {
            int honorario = calcularHonorario(elemento);
            System.out.println("El honorario de: " + elemento.getNombreApellido() + " es " + honorario);
        }
                
    }
    
    public static int calcularHonorario(Persona per){
        System.out.println("Documento: " + per.getDocumento());
        
        
        if (per instanceof Doctor){
            // CONVERTIR, ver PER como un DOCTOR
            int matricula = ((Doctor)per).getMatricula();
            System.out.println("Dr. matricula: " + matricula);
            return 500;
        }else if (per instanceof Admin){
            // OTRA FORMA DE CONVERSION
            Admin admAux = (Admin) per;
            int legajo = admAux.getLegajo();
            System.out.println("Adm. Legajo: " + legajo);
            return 200;
        }
        
        return 0;
    }
    
}
