package clase1024_act;

public class Documento {
    
    // Campos private
    private long num;
    private String tipoDoc;
    
    // Constructor
    // Default
    public Documento(){}
    
    // Cpn todos los campos
    public Documento(long num, String tipoDoc) {
        this.num = num;
        this.tipoDoc = tipoDoc;
    }
    
    // METODOS

    public long getNum() {
        return num;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    @Override
    public String toString() {
        return "Documento{" + "num=" + num + ", tipoDoc=" + tipoDoc + '}';
    }    
}