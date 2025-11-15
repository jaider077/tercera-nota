package Parqueadero.app;

import Parqueadero.services.GestionParqueadero;

public class App {
    public static void main(String[] args) {
        GestionParqueadero gestion = new GestionParqueadero();

        gestion.agregarEspacio(1, "carro");
        gestion.agregarEspacio(2, "carro");
        gestion.agregarEspacio(3, "moto");
        gestion.agregarEspacio(4, "moto");
        gestion.agregarEspacio(5, "carro");

        gestion.registrarVehiculo("ABC123", "carro", "Juan Perez");
        gestion.registrarVehiculo("XYZ789", "moto", "Maria Garcia");
        gestion.registrarVehiculo("DEF456", "carro", "Pedro Lopez");
        gestion.registrarVehiculo("GHI789", "moto", "Ana Martinez");

        gestion.mostrarEspaciosDisponibles();

        System.out.println("\n=== Asignando Espacios ===");
        gestion.asignarEspacio("ABC123", 1);
        gestion.asignarEspacio("XYZ789", 3);

        System.out.println("\n=== Intentando asignar moto en espacio de carro ===");
        gestion.asignarEspacio("GHI789", 2);

        System.out.println("\n=== Intentando asignar carro en espacio de moto ===");
        gestion.asignarEspacio("DEF456", 4);

        gestion.mostrarTodosLosEspacios();

        System.out.println("\n=== Liberando Espacio 1 ===");
        gestion.liberarEspacio(1);

        gestion.mostrarEspaciosDisponibles();

        System.out.println("\n=== Asignando vehiculo al espacio liberado ===");
        gestion.asignarEspacio("DEF456", 1);

        gestion.mostrarTodosLosEspacios();
    }
}