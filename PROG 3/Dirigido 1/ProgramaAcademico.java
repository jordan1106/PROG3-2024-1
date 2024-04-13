//se coloca abstract porque hablamos de una clase padre
//se coloca implements porque va a implementar una interface
abstract class ProgramaAcademico implements IConsultable{
	//Colocamos static porque queremos crear un indice correlativo
	private static int indice = 1;	
	private int idProgramaAcademico;
	private String nombre;
	private String clave;
	private char modalidad;
	private double precio;
	
	public ProgramaAcademico(String nombre, String clave,
							char modalidad, double precio){
		this.idProgramaAcademico = indice;
		this.nombre = nombre;
		this.clave = clave;
		this.modalidad = modalidad;
		this.precio = precio;
		indice++;
	}
	
	public String getClave(){
		return clave;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public double getPrecio(){
		return precio;
	}
}