class Aerolinea extends Empresa {
    private String callsign;
    private boolean fidelidad;

    public Aerolinea(String nombre, String callsign, boolean fidelidad) {
        super(nombre);
        this.callsign = callsign;
        this.fidelidad = fidelidad;
    }

    public String getNombre() {
        return super.getNombre();
    }
    public String getCallsign() {
        return this.callsign;
    }

    public boolean getFidelidad() {
        return this.fidelidad;
    }
    @Override
    public String consultarDatos() {
        String cadena = "";
        cadena+="Aerolinea: "+this.getNombre()+" - "+this.callsign+
                " - Programa Fidelidad" + this.fidelidad;
        return cadena;
    }
}
