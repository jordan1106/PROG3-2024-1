abstract class Vehiculo implements Consultable{
	private Aerolinea aerolinea;
	private double velocidadMax;
	private String modelo;
	
	public Vehiculo(Aerolinea aerolinea, String modelo, double velocidadMax){
		this.aerolinea = aerolinea;
		this.velocidadMax = velocidadMax;
		this.modelo = modelo;
	}
	
	abstract public String consultarDatos();
	
	public String getModelo(){
		return modelo;
	}
	public String getNombre(){
		return aerolinea.getNombre();
	}
	public String getCallsing(){
		return aerolinea.getCallsing();
	}
	public boolean getFidelidad(){
		return aerolinea.getFidelidad();
	}
}