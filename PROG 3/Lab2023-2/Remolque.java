class Remolque extends Vehiculo{
	private double capMaxCarga;
	
	public Remolque(Aerolinea aerolinea,String modelo,double velocidadMax,
	double capMaxCarga){
		super(aerolinea,modelo,velocidadMax);
		this.capMaxCarga = capMaxCarga;
	}
	
	public String consultarDatos(){
		return "Remolque: "+getModelo()+" - Capacidad de Carga: "+capMaxCarga+"\n"; 
	}
}