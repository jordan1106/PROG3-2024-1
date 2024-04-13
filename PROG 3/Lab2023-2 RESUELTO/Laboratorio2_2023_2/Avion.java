class Avion extends Vehiculo{
    private int capacidadMaxima;

    public Avion(Aerolinea aerolinea,String modelo,double velocidadMaxima,
            int capacidadMaxima) {
        super(aerolinea, modelo, velocidadMaxima);
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }
    @Override
    public String consultarDatos() {
        String cadena = "";
        cadena+="Avion: "+this.getModelo()+" - "+"Capacidad Max. Pasajeros: "+
                this.capacidadMaxima + "\n";
        cadena += "Aerolinea: " + this.getAerolinea().getNombre() + " - " +
                this.getAerolinea().getCallsign() + " - " +
                "Programa Fidelidad:"+this.getAerolinea().getFidelidad()+"\n";
        return cadena;
    }
}
