package java1_actividad6;

public class Vehiculo {
    
    // CAMPOS
    private String patente;
    private Persona titular;
    private String color;
    private boolean itv;
    
    // CONSTRUCTORES

    public Vehiculo() {
    }

    public Vehiculo(String patente, Persona titular) {
        this.patente = patente;
        this.titular = titular;
    }

    public Vehiculo(String patente, Persona titular, String color, boolean itv) {
        this.patente = patente;
        this.titular = titular;
        this.color = color;
        this.itv = itv;
    }
    
    // METODOS

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isItv() {
        return itv;
    }

    public void setItv(boolean itv) {
        this.itv = itv;
    }
    
    // METODO PROPIO DE LA CLASE
    public static String enOtroIdioma(String idioma){
//        if(idioma == "ENG"){
//            return "Vehicle";
//        }else if(idioma == "DEU"){
//            return "Fahrzeug";
//        }else if (idioma == "FRA"){
//            return "Véhicule";
//        }else if (idioma == "ITA"){
//            return "Veicolo";
//        }else if (idioma == "POR"){
//            return "Veículo";
//        }
        switch(idioma){
            case "ENG": return "Vehicle";
            case "DEU": return "Fahrzeug";
            case "FRA": return "Véhicule";
            case "ITA": return "Veicolo";
            case "POR": return "Veículo";
            default: return "Sin Idioma";
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", titular=" + titular + ", color=" + color + ", itv=" + itv + '}';
    }
    
    
    
    
    
    
}
