import java.util.Date;
import java.time.LocalTime;
class Taller extends ProgramaAcademico{
	private Date fechaRealizacion;
	private LocalTime horaInicioTaller;
	private LocalTime horaFinTaller;
	
	public Taller(String nombre, String clave, char modalidad, double precio,
				Date fechaRealizacion, LocalTime horaInicioTaller, LocalTime horaFinTaller){
		super(nombre,clave,modalidad,precio);
		this.fechaRealizacion = fechaRealizacion;
		this.horaInicioTaller = horaInicioTaller;
		this.horaFinTaller = horaFinTaller;
	}
	
	public String consultarDatos(){
		return "CURSO: "+ getClave() + " - "+getNombre()+"- S/. "+ getPrecio()+" - FECHA: "
			+ fechaRealizacion;
	}
}