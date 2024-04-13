import java.util.ArrayList;
class Equipo{
	private String nombre;
	private String interes;
	private ArrayList<Miembro> miembros;
	
	public Equipo(String nombre, String interes){
		this.nombre = nombre;
		this.interes = interes;
	}
	
	public ArrayList<Miembro> getMiembros(){
		return miembros;
	}
	public void setMiembros(ArrayList<Miembro>miembros){
		this.miembros = miembros;
	}
}