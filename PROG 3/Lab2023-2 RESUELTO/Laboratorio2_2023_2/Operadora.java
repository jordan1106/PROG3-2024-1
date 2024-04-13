class Operadora extends Empresa{
    private boolean soporteLogistico;
    private boolean asistenciaNavegacion;

    public Operadora(String nombre,boolean soporteLogistico,
            boolean asistenciaNavegacion) {
        super(nombre);
        this.soporteLogistico = soporteLogistico;
        this.asistenciaNavegacion = asistenciaNavegacion;
    }
    @Override
    public String consultarDatos() {
        String cadena = "";
        cadena+="Operadora: "+this.getNombre()+" - "+
            "Soporte Logistico: "+this.soporteLogistico+" - "+
                "Asistencia Navegacion:" + this.asistenciaNavegacion + "\n";
        return cadena;
    }
    
}
