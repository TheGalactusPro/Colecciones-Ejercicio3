package negocio;
import java.util.ArrayList;
public class SistemaControl {
    private ArrayList<Sensor> sensores;
    public SistemaControl() {
        sensores = new ArrayList<>();
    }
    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }
    public Sensor buscarSensor(String codigo) {
        for (Sensor s : sensores) {
            if (s.getCodigo().equals(codigo)) {
                return s;
            }
        }
        return null;
    }
    public boolean eliminarSensor(String codigo) {
        Sensor encontrado = buscarSensor(codigo);
        if (encontrado != null) {
            sensores.remove(encontrado);
            return true;
        }
        return false;
    }
    public double calcularPromedioLecturas() {
        if (sensores.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Sensor s : sensores) {
            suma += s.getLectura();
        }
        return suma / sensores.size();
    }
    public int contarSensoresActivos() {
        int contador = 0;
        for (Sensor s : sensores) {
            if (s.isActivo()) {
                contador++;
            }
        }
        return contador;
    }
    public String mostrarSensores() {
        String resultado = "SISTEMA DE CONTROL\n";
        for (Sensor s : sensores) {
            resultado += s.mostrarInformacion() + "\n";
            resultado += "--------------------------\n";
        }
        resultado += "Total de sensores: " + sensores.size();
        resultado += "\nSensores activos: " + contarSensoresActivos();
        resultado += "\nPromedio de lecturas: " + calcularPromedioLecturas();
        return resultado;
    }
}