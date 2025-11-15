package Parqueadero.domain;

public class Vehiculo {
    private String placa;
    private String tipo;
    private String propietario;

    public Vehiculo(String placa, String tipo, String propietario) {
        this.placa = placa;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Tipo: " + tipo + ", Propietario: " + propietario;
    }
}