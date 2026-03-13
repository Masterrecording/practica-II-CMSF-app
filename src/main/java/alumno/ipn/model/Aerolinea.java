package alumno.ipn.model;

public class Aerolinea {

    private String nombre;
    private String pais;
    private String fundacion;

    public Aerolinea(String nombre, String pais, String fundacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.fundacion = fundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getFundacion() {
        return fundacion;
    }
}