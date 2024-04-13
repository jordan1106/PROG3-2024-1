import java.util.Date;
abstract class Miembro{
	private static int correlativo = 0;
	private int idMiembro;
	private String nombre;
	private String apellidoPaterno;
	private Date fechaNacimiento;
	private String direccion;
	private String email;
	private char sexo;
	
	public Miembro(String nombre, String apellidoPaterno){
		correlativo++;
		this.idMiembro = correlativo;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellidoPaterno(){
		return apellidoPaterno;
	}
	
}