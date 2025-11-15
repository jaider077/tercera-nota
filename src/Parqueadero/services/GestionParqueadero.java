package Parqueadero.services;

import Parqueadero.domain.Vehiculo;
import Parqueadero.domain.EspacioParqueadero;
import java.util.List;
import java.util.ArrayList;

public class GestionParqueadero {
    private List<Vehiculo> vehiculos;
    private List<EspacioParqueadero> espacios;

    public GestionParqueadero() {
        this.vehiculos = new ArrayList<>();
        this.espacios = new ArrayList<>();
    }

    public void registrarVehiculo(String placa, String tipo, String propietario) {
        Vehiculo vehiculo = new Vehiculo(placa, tipo, propietario);
        vehiculos.add(vehiculo);
        System.out.println("Vehiculo registrado: " + vehiculo);
    }

    public void agregarEspacio(int numeroEspacio, String tipoPermitido) {
        EspacioParqueadero espacio = new EspacioParqueadero(numeroEspacio, tipoPermitido);
        espacios.add(espacio);
    }

    public void mostrarEspaciosDisponibles() {
        System.out.println("\n=== Espacios Disponibles ===");
        boolean hayDisponibles = false;
        for (EspacioParqueadero espacio : espacios) {
            if (espacio.isDisponible()) {
                System.out.println(espacio);
                hayDisponibles = true;
            }
        }
        if (!hayDisponibles) {
            System.out.println("No hay espacios disponibles");
        }
    }

    public void mostrarTodosLosEspacios() {
        System.out.println("\n=== Todos los Espacios ===");
        for (EspacioParqueadero espacio : espacios) {
            System.out.println(espacio);
        }
    }

    public void asignarEspacio(String placa, int numeroEspacio) {
        Vehiculo vehiculo = buscarVehiculo(placa);
        if (vehiculo == null) {
            System.out.println("Vehiculo con placa " + placa + " no encontrado");
            return;
        }

        EspacioParqueadero espacio = buscarEspacio(numeroEspacio);
        if (espacio == null) {
            System.out.println("Espacio " + numeroEspacio + " no encontrado");
            return;
        }

        if (!espacio.isDisponible()) {
            System.out.println("El espacio " + numeroEspacio + " ya esta ocupado");
            return;
        }

        if (!espacio.getTipoPermitido().equalsIgnoreCase(vehiculo.getTipo())) {
            System.out.println("Error: El vehiculo tipo " + vehiculo.getTipo() +
                    " no puede ocupar un espacio para " + espacio.getTipoPermitido());
            return;
        }

        espacio.asignarVehiculo(vehiculo);
        System.out.println("Espacio asignado exitosamente");
        System.out.println(espacio);
    }

    public void liberarEspacio(int numeroEspacio) {
        EspacioParqueadero espacio = buscarEspacio(numeroEspacio);
        if (espacio == null) {
            System.out.println("Espacio " + numeroEspacio + " no encontrado");
            return;
        }

        if (espacio.isDisponible()) {
            System.out.println("El espacio " + numeroEspacio + " ya esta disponible");
            return;
        }

        espacio.liberarEspacio();
        System.out.println("Espacio " + numeroEspacio + " liberado exitosamente");
    }

    private Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                return vehiculo;
            }
        }
        return null;
    }

    private EspacioParqueadero buscarEspacio(int numeroEspacio) {
        for (EspacioParqueadero espacio : espacios) {
            if (espacio.getNumeroEspacio() == numeroEspacio) {
                return espacio;
            }
        }
        return null;
    }
}