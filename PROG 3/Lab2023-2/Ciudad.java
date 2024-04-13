import java.util.ArrayList;
class Ciudad{
	private String nombre;
	public ArrayList<Aeropuerto> aeropuertos;
	
	public Ciudad(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
}