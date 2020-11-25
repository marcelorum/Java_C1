package console;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class Agenda_de_Contactos {
    private Contacto[] contactos;

    public Agenda_de_Contactos() {
        contactos = new Contacto[5];
    }
    
    public Agenda_de_Contactos(int tamano){
        contactos = new Contacto[tamano];
    }
    
    public void anadirContacto(Contacto c){
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null && contactos[i].getTelefono() == c.getTelefono()){
                if(contactos[i].getNombre().equals(c.getNombre())){
                    System.out.println("NO SE PUEDE AGREGAR, YA EXISTE");
                    break;
                }
            }
            if(contactos[i] == null){
                contactos[i] = c;
                break;
            }
        }
    }
    
    public void modificarContacto(int telefono, String nuevoNombre){
        if(espacioLibre() != contactos.length){
            for (int i = 0; i < contactos.length; i++) {
                if(contactos[i].getTelefono() == telefono){
                    contactos[i].setNombre(nuevoNombre);
                    System.out.println("Contacto modificado");
                    break;
                }else{
                    System.out.println("Contacto no existe");
                }
            }
        }else{
            System.out.println("No hay ningún contacto");
        }
    }
    
    public Contacto darDeBajaContacto(int telefono){
        Contacto temp = null;
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null){
                if(contactos[i].getTelefono() == telefono){
                    temp = contactos[i]; 
                    contactos[i] = null;
                    return temp;
                }else{
                    System.out.println("Contacto no existe");
                }
            }else{
                System.out.println("No hay ningún contacto");
            }
        }
        return temp;
    }
    
    public int buscarPorNombre(String nombre){
        int num = 0;
        if(espacioLibre() == contactos.length){
            return num;
        }
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i].getNombre().equals(nombre)){
                num = contactos[i].getTelefono();
            } return num;
        }
        return num;
    }
    
    public String listarContactos(){
        String lista = "";
        if(espacioLibre() == contactos.length){
            lista = "No hay ningún contacto";
            return lista;
        }
        for (Contacto contacto : contactos) {
            if(contacto != null){
                lista += contacto.toString() + "\n";
            }
        }
        return lista;
    }
    
    public boolean agendaLlena(){
        int contador = 0;
        for (Contacto contacto : contactos) {
            if(contacto == null){
                contador++;
            }
        }
        if(contador == 0){
            return true;
        }else{
            return false;
        }
        
    }
    
    public int espacioLibre(){
        int contador = 0;
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] == null){
                contador++;
            }
        } return contador;
    }
    
    public static String codigoPais(int codigo){
        String ispa = "No se encuentra";
        String[][] codigos = {
            {"Alemania","49"},
            {"Argentina","54"},
            {"Bangladés","880"},
            {"Brasil","55"},
            {"Chile","56"},
            {"China","86"},
            {"Fiji","679"},
            {"Islas Marshall","692"}
        };
        String cod = Integer.toString(codigo);
        for (String[] codigo1 : codigos) {
            for (String string : codigo1) {
                if(string.equals(cod)){
                    ispa = codigo1[0];
                    return ispa;
                }
            }
        }return ispa;
//        for (int i = 0; i < codigos.length; i++) {
//            for (int j = 0; j < codigos[i].length; j++) {
//                System.out.println(codigos[i][j]);
//            }
//      }
    }
}
