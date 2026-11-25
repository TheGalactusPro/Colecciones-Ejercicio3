package negocio;
public class Sensor {
    private String codigo;
    private String tipo;
    private double lectura;
    private boolean activo;
    public Sensor(String codigo, String tipo, double lectura, boolean activo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.lectura = lectura;
        this.activo = activo;
    }
    public String getCodigo() {
        return codigo;
    }
    public double getLectura() {
        return lectura;
    }
    public boolean isActivo() {
        return activo;
    }
    public String mostrarInformacion() {
        return "Codigo: " + codigo + "\nTipo: " + tipo + "\nLectura: " + lectura + "\nActivo: " + activo;
    }
}