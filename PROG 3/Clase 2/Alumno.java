class Alumno extends MiembroPUCP{
	private double CRAEST;
	
	public Alumno(String codigoPUCP, String nombre, String apellidoPaterno, double CRAEST){
		super(codigoPUCP,nombre,apellidoPaterno);
		this.CRAEST = CRAEST;
	}
	
	public String consultarDatos(){
		return "Alumno: " + getCodigoPUCP() + " " + getNombre() + " " + 
		getApellidoPaterno() + " " + CRAEST + "\n";
	}
}