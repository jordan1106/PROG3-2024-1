class Remolque extends Vehiculo{
    private double capacidadCarga;

    public Remolque(Aerolinea aerolinea, String modelo, double velocidadMaxima
            , double capacidadCarga) {
        super(aerolinea, modelo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }
    @Override
    public String consultarDatos() {
        String cadena = "";
        cadena+="Remolque: "+this.getModelo()+" - "+"Capacidad de Carga:"+
                this.capacidadCarga+"\n";
        return cadena;
    }
}
