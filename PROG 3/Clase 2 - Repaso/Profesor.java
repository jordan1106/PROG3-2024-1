class Profesor extends MiembroPUCP{
	private TipoDedicacion estado;
	
	public Profesor(String nombre, String apellidoPaterno, 
		String codigoPUCP, TipoDedicacion estado){
		super(nombre,apellidoPaterno,codigoPUCP);
		this.estado = estado;
	}
	public String consultarDatos(){
		return "Profesor: " + getCodigoPUCP() + " - " + getNombre() + " " + 
		getApellidoPaterno() + " - " + estado + "\n";
	}
}