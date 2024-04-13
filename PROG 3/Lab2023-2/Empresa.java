abstract class Empresa{
	private String nombreEmpresa;
	
	public Empresa(String nombreEmpresa){
		this.nombreEmpresa = nombreEmpresa;
	}
	
	abstract public String consultarDatos();
	
	public String getNombreEmpresa(){
		return nombreEmpresa;
	}
}