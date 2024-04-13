class Alumno extends MiembroPUCP{
	private String CRAEST;
	
	public Alumno(String nombre, String apellidoPaterno, String codigoPUCP, String CRAEST){
		super(nombre,apellidoPaterno,codigoPUCP);
		this.CRAEST = CRAEST;
	}
	
	public String consultarDatos(){
		return "Alumno: " + getCodigoPUCP() + " - " + getNombre() + " " + 
		getApellidoPaterno() + " " + CRAEST + "\n";
	}
}