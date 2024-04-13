abstract class Vehiculo implements Consultable {
    private Aerolinea aerolinea;
    private String modelo;
    private double velocidadMaxima;

    public Vehiculo(Aerolinea aerolinea, String modelo, double velocidadMaxima) {
        this.aerolinea = aerolinea;
        this.modelo = modelo;
    }

    public Aerolinea getAerolinea() {
        return this.aerolinea;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
}
