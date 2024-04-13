class Aerolinea extends Empresa{
	private String callsing;
	private boolean fidelidad;
	
	public Aerolinea(String nombre, String callsing, boolean fidelidad){
		super(nombre);
		this.callsing = callsing;
		this.fidelidad = fidelidad;
	}
	
	public String consultarDatos(){
		return "Aerolinea: "+getNombreEmpresa()+" - "+callsing+" - Programa Fidelidad: "
		+fidelidad+"\n";
	}
	
	public String getCallsing(){
		return callsing;
	}
	public boolean getFidelidad(){
		return fidelidad;
	}
	public String getNombre(){
		return getNombreEmpresa();
	}
}