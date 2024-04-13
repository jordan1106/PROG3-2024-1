import java.util.Date;
class Persona{
	//Estado
	private String nombre;
	private Date fechaNacimiento;
	//Constructor
	public Persona(){};
	public Persona(String nombre, Date fechaNacimiento){
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	};
	//Getters y Setters
	public Date getFechaDeNacimiento(){
		return fechaNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaNacimiento){
		this.fechaNacimiento = fechaNacimiento;
	}
}