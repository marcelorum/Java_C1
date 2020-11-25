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
public class Main {
    
    public static String nombreClase;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        nombreClase = "Principal";
        metodo();
        int variable = metodo2();
        ejemplo();        
        
    }
    
    public static void metodo(){
        
    }
    
    public static int metodo2(){
        return 0;
    }
    
    public static void ejemplo(){
        char talle = Estatico.convertirTalle(14);
        System.out.println("Talle: " + talle);
        
        Estatico.variableEst = 10;
        System.out.println("VariableEst: " + Estatico.variableEst);
        
        Estatico est1 = new Estatico();
        Estatico est2 = new Estatico();
        
        // NO recomendable
        System.out.println("Est1: "+ est1.variableEst);
        est2.variableEst = 20;
        System.out.println("Est1: "+ est1.variableEst);
        System.out.println("Est2: "+ est2.variableEst);
        
        System.out.println("nroEstatico1: "+ est1.getNroEstatico());
        System.out.println("nroEstatico2: "+ est2.getNroEstatico());
    }
    
}
