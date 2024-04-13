import java.time.LocalTime;
import java.util.Date;
//Colocamos extends porque es una clase hija de ProgramaAcademico
class Curso extends ProgramaAcademico{
	private int cantHorasClasePorSemana;
	private float cantCreditos;
	private Date fechaInicio;
	private Date fechaFin;
	private DiaSemana diaDictado;
	private LocalTime horaInicioClases;
	private LocalTime horaFinClases;
	
	//Para el constructor de la clase hija se deben agregar como parametros los atributos de la clase padre
	public Curso(String nombre, String clave, char modalidad, double precio,
				int cantHorasClasePorSemana, float cantCreditos, Date fechaInicio,
				Date fechaFin, DiaSemana diaDictado, LocalTime horaInicioClases, LocalTime horaFinClases){
		//el super realiza la construccion de los atributos de la clase padre
		super(nombre,clave,modalidad,precio);
		this.cantHorasClasePorSemana = cantHorasClasePorSemana;
		this.cantCreditos = cantCreditos;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.diaDictado = diaDictado;
		this.horaInicioClases = horaInicioClases;
		this.horaFinClases = horaFinClases;
	}
	
	public String consultarDatos(){
		return "CURSO: "+ getClave() + " - "+getNombre()+"- S/. "+ getPrecio()+" - CRED: "+ cantCreditos;
	}
}