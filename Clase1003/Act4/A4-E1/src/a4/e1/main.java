package a4.e1;

/**
 *
 * @author Marce marcelorum@gmail.com
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double venta;
        double comision;
        
        venta = 20001;
        comision = 0;
        
        if (venta > 20000){
            comision = 0.10;
        }else if (venta > 10000){
            comision = 0.5;
        }
        
        System.out.println("La comisión es: " + comision);
    }
    
}
