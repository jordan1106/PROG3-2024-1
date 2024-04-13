abstract class MiembroPUCP extends Miembro implements Consultable{
	private String codigoPUCP;

	public MiembroPUCP(String codigoPUCP, String nombre, String apellidoPaterno){
		super(nombre,apellidoPaterno);
		this.codigoPUCP = codigoPUCP;
	}
	//Metodo abstracto
	public abstract String consultarDatos();
	//Los metodos abstractos van en clases que sean abstractas
	//Las clases abstractas se definen cuando nosotros en la logica definen
	//negocio no necesitamos que se haga un new de estas clases
	
	public String getCodigoPUCP(){
		return codigoPUCP;
	}
}