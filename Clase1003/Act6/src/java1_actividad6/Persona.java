/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1_actividad6;

public class Persona {
    private String nombreApellido;
    private int edad;
    private boolean carnet;
    
    // CONSTRUCTORES

    public Persona() {
    }

    public Persona(String nombreApellido, int edad, boolean carnet) {
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.carnet = carnet;
    }
    
    // METODOS

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCarnet() {
        return carnet;
    }

    public void setCarnet(boolean carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreApellido=" + nombreApellido + ", edad=" + edad + ", carnet=" + carnet + '}';
    }
    
    
    
}
