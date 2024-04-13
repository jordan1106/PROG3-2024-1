class Avion extends Vehiculo{
	private int capMaxPasajeros;
	
	public Avion(Aerolinea aerolinea,String modelo, double velocidadMax,
	int capMaxPasajeros){
		super(aerolinea,modelo,velocidadMax);
		this.capMaxPasajeros = capMaxPasajeros;
	}
	
	public String consultarDatos(){
		String cadena;
		cadena = "Avion: " + getModelo()+" - Cap. Max. Pasajeros: "+capMaxPasajeros+"\n";
		cadena = cadena + "Aerolinea: "+getNombre()+" - "+getCallsing()+" - Programa Fidelidad: "+getFidelidad()+"\n";
		return cadena;
	}
	
}