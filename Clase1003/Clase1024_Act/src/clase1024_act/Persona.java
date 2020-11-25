/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1024_act;

/**
 *
 * @author marce
 */
public class Persona {
    private int legajo;
    private String nombreApellido;
    private Documento documento;
    private int pais;
    private int ciudad;
    
    public Persona(){}

    public Persona(int legajo, String nombreApellido, Documento documento, int pais, int ciudad) {
        this.legajo = legajo;
        this.nombreApellido = nombreApellido;
        this.documento = documento;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public Documento getDocumento() {
        return documento;
    }

    public int getPais() {
        return pais;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "legajo=" + legajo + ", nombreApellido=" + nombreApellido + ", documento=" + documento + ", pais=" + pais + ", ciudad=" + ciudad + '}';
    }
    
    


    
    
    
    
    
    
}
