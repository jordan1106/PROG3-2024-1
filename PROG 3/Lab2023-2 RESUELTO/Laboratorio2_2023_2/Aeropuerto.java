class Aeropuerto implements Consultable{
    private String nombre;
    private String direccion;
    private TipoAeropuerto tipo;
    private Ciudad ciudad;
    private Operadora operadora;

    public Aeropuerto(String nombre,String direccion,
            TipoAeropuerto tipo, Ciudad ciudad, Operadora operadora) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        this.ciudad = ciudad;
        this.operadora = operadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public TipoAeropuerto getTipoAeropuerto() {
        return this.tipo;
    }

    public Ciudad getCiudad() {
        return this.ciudad;
    }

    public Operadora getOperadora() {
        return this.operadora;
    }

    public String consultarDatos() {
        String cadena = "";
        cadena += "Aeropuero: " + this.getNombre() + " - " + this.getCiudad() + " - "
                + this.getTipoAeropuerto()+"\n";
        cadena += this.operadora.consultarDatos();
        return cadena;
    }
}
