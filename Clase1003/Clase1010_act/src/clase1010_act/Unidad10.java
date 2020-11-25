package clase1010_act;

/**
 *
 * @author marce
 */
public class Unidad10 {
    // Act1
    public int esMayor(int num1, int num2){
        int mayor;
        if (num1 > num2){
            mayor = num1;
        }else{
            mayor = num2;
        }
        return mayor;
    }
    // Act2
    public boolean entreIntervalos(int num){
        if (num >= 0 && num <= 10){
            return true;
        }else if (num >= 60 && num <= 70){
            return true;
        }else{
            return false;
        }    
    }
    // Act3
    public String vectorNombres(){
        String[] nombres = {"abc", "qwe", "asd", "zxc", "wee"};
        String todos = "Nombres: [";
        for (int i=0;i < nombres.length;i++){
            todos += nombres[i] + " ";
        }
        todos += "]";
        return todos;
    }
    
    // Act4
    public Persona quienEsMayor(Persona per1, Persona per2){
        
        if (per1.edad > per2.edad){
            //System.out.println("El mayor es " + per1.nombreApellido);
            return per1;
        }else{
            //System.out.println("El mayor es " + per2.nombreApellido);
            return per2;
        }

    }
    
}
