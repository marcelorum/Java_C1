package u9_actividad4;

/**
 *
 * @author fnang
 */
public class Actividad4 {
    
    public void esMultiplo(){
        //Inicio los contadores para cada caso del enunciado.
        int multiploDe3 = 0;
        int multiploDe5 = 0;
        int multiploDe3y5 = 0;
        
        //Solicito el primer numero. Si ingreso 0 no relaiza la actividad
        System.out.println("Ingresar un numero (Ingresar 0 cero para finalizar): ");
        int numero = Consola.readInt();
        
        while(numero != 0){
            if((numero%3 == 0) && (numero%5 == 0)){
                multiploDe3y5++; //Si es de 3 y 5 a la vez
            } else if(numero%3 == 0){
                multiploDe3++; //Si es solo de 3
            } else if(numero%5 == 0){
                multiploDe5++; //Si es solo de 5
            }
            
            //Solicitamos otro numero
            System.out.println("Ingresar otro numero (0 cero para finalizar): ");
            numero = Consola.readInt();
        }
        
        System.out.println("Cantidad de multiplos de 3 y 5 a la vez: " + multiploDe3y5);
        System.out.println("Cantidad de multiplos solo de 3: " + multiploDe3);
        System.out.println("Cantidad de multiplos solo de 5: " + multiploDe5);
        
    } //Fin del metodo
    
} //Fin de la clase
