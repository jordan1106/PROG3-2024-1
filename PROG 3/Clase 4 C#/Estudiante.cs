using System;
class Estudiante{
	private string nombre;
	private double CRAEST;
	private DateTime fechaNacimiento;
	
	public Estudiante(string nombre,double CRAEST){
		this.nombre = nombre;
		this.CRAEST = CRAEST;
		this.fechaNacimiento = new DateTime();
	}
	
	//para hacer un getter y setter se crea una propiedad 
	public string Nombre{
		//Primera letra del atributo en mayuscula
		get{
			return nombre;
		}
		set{
			this.nombre = value;
		}
	}
	
	 
}