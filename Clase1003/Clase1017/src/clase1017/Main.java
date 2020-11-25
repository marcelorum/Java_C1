package clase1017;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CON CONSTRUCTOR
        Persona persona1 = new Persona("Juan","Perez",12345678,20);
        
//        SIN CONSRTUCTOR
//        Persona persona1 = new Persona();
//        persona1.setNombre("Juan");
//        persona1.setApellido("Perez");
//        persona1.setEdad(20);
//        persona1.setDocumento(12345678);
        
        System.out.println("\nNombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("Documento: " + persona1.getDocumento());
        System.out.println("Edad: " + persona1.getEdad());
        
//        SIN CONSRTUCTOR
        Persona persona2 = new Persona();
        
        persona2.setNombre("Maria");
        persona2.setApellido("Garcia");
        persona2.setEdad(30);
        persona2.setDocumento(23456789);
        
        System.out.println("\nNombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
        System.out.println("Documento: " + persona2.getDocumento());
        System.out.println("Edad: " + persona2.getEdad());
        
        // CONSTRUCTOR CON DOS CAMPOS
        Persona persona3 = new Persona("Marcelo",34);
        System.out.println("\nNombre: " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());
        
        //persona1.mostrarInformacion();
    }
    
}
