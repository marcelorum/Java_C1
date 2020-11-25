package u9_actividad3;

/**
 *
 * @author fnang
 */
public class Actividad3 {
    
    public void contarNotas(){
        
        int mayorASiete = 0;
        int menorASiete = 0;
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Ingresa la nota " + i + " de 10: ");
            int nota = Consola.readInt();
            
            if(nota >= 7){
                mayorASiete++;
            }
            else{
                menorASiete++;
            }
        }
        
        System.out.println("Los mayores a siete son: " + mayorASiete);
        System.out.println("Los menores a siete son: " + menorASiete);
        
    } //Fin del metodo
    
} //Fin de la clase
