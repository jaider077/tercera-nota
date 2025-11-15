package Parqueadero.domain;

public class EspacioParqueadero {
    private int numeroEspacio;
    private String tipoPermitido;

    private boolean disponible;
    private Vehiculo vehiculo;

    public EspacioParqueadero(int numeroEspacio, String tipoPermitido) {
        this.numeroEspacio = numeroEspacio;
        this.tipoPermitido = tipoPermitido;
        this.disponible = true;
        this.vehiculo = null;
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.disponible = false;
    }

    public void liberarEspacio() {
        this.vehiculo = null;
        this.disponible = true;
    }

    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public void setNumeroEspacio(int numeroEspacio) {
        this.numeroEspacio = numeroEspacio;
    }

    public String getTipoPermitido() {
        return tipoPermitido;
    }

    public void setTipoPermitido(String tipoPermitido) {
        this.tipoPermitido = tipoPermitido;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        String estado = disponible ? "Disponible" : "Ocupado";
        String info = "Espacio " + numeroEspacio + " - Tipo: " + tipoPermitido + " - Estado: " + estado;
        if (!disponible && vehiculo != null) {
            info += " - " + vehiculo;
        }
        return info;
    }
}