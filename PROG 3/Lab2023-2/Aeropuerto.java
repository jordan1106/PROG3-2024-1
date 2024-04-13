class Aeropuerto implements Consultable{
	private String nombreAeropuerto;
	private String direccion;
	private TipoAeropuerto tipo;
	private Ciudad ciudad;
	private Operador operador;
	
	public Aeropuerto(String nombreAeropuerto, String direccion, TipoAeropuerto tipo,
		Ciudad ciudad, Operador operador){
		this.nombreAeropuerto = nombreAeropuerto;
		this.direccion = direccion;
		this.tipo = tipo;
		this.ciudad = ciudad;
		this.operador = operador;
	}
	
	public String consultarDatos(){
		String cadena;
		cadena = "Aeropuerto: " + nombreAeropuerto + " - " + ciudad.getNombre()+" - " + tipo+"\n";
		cadena = cadena + operador.consultarDatos();
		return cadena;
	}
	
}