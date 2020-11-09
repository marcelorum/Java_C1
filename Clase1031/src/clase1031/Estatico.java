/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1031;

/**
 *
 * @author marce
 */
public class Estatico {
    
    private int nroEstatico;
    private static int contadorEst;   
    public static int variableEst;
    
    public Estatico(){
        this. nroEstatico = ++contadorEst;
    }

    public int getNroEstatico() {
        return nroEstatico;
    }

    public void setNroEstatico(int nroEstatico) {
        this.nroEstatico = nroEstatico;
    }
    
    

    public static int getVariableEst() {
        return variableEst;
    }

    public static void setVariableEst(int variableEst) {
        Estatico.variableEst = variableEst;
    }
    
    
    
    public static char convertirTalle(int numero){
        
        if (numero < 10){
            return 'S';
        }else if (numero < 14){
            return 'M';
        }else if (numero < 18){
            return 'L';
        }else {
            return 'X';
        }
        
    }
    
}
