package negocio;
public class Main {
    public static void main(String[] args) {
        Sensor s1 = new Sensor("S01", "Temperatura", 24.5, true);
        Sensor s2 = new Sensor("S02", "Presion", 1.8, true);
        Sensor s3 = new Sensor("S03", "Humedad", 65.0, false);
        Sensor s4 = new Sensor("S04", "Temperatura", 28.5, true);
        SistemaControl sistema = new SistemaControl();
        System.out.println("SISTEMA VACIO");
        System.out.println(sistema.mostrarSensores());
        sistema.agregarSensor(s1);
        sistema.agregarSensor(s2);
        sistema.agregarSensor(s3);
        sistema.agregarSensor(s4);
        System.out.println("\nSENSORES REGISTRADOS");
        System.out.println(sistema.mostrarSensores());
        System.out.println("\nBUSCAR SENSOR S02");
        Sensor encontrado = sistema.buscarSensor("S02");
        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Sensor no encontrado");
        }
        System.out.println("\nBUSCAR SENSOR S10");
        Sensor noEncontrado = sistema.buscarSensor("S10");
        if (noEncontrado != null) {
            System.out.println(noEncontrado.mostrarInformacion());
        } else {
            System.out.println("Sensor no encontrado");
        }
        System.out.println("\nPROMEDIO DE LECTURAS: " + sistema.calcularPromedioLecturas());
        System.out.println("SENSORES ACTIVOS: " + sistema.contarSensoresActivos());
        System.out.println("\nELIMINAR SENSOR S03");
        boolean eliminado = sistema.eliminarSensor("S03");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("\nELIMINAR SENSOR S10");
        boolean eliminado2 = sistema.eliminarSensor("S10");
        System.out.println("Eliminado: " + eliminado2);
        System.out.println("\nSISTEMA ACTUALIZADO");
        System.out.println(sistema.mostrarSensores());
    }
}