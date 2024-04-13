abstract class MiembroPUCP extends Miembro implements Consultable{
	private String codigoPUCP;
	
	public MiembroPUCP(String nombre, String apellidoPaterno, String codigoPUCP){
		super(nombre,apellidoPaterno);
		this.codigoPUCP = codigoPUCP;
	}
	
	abstract public String consultarDatos();
	
	public String getCodigoPUCP(){
		return codigoPUCP;
	}
}