import java.util.ArrayList;

class InstitucionEducativa{
	private int idInstitucionEducativa;
	private String RUC;
	private String nombre;
	ArrayList<Sede> sedes;
	
	public InstitucionEducativa(int idInstitucionEducativa, String RUC, String nombre){
		this.idInstitucionEducativa = idInstitucionEducativa;
		this.RUC = RUC;
		this.nombre = nombre;
	}
	
	public String consultarProgramasDeSede(int indiceSede){
		String cadena = "Programas disponibles para "+sedes.get(indiceSede).getNombre() + "\n";
		cadena = cadena + sedes.get(indiceSede).consultarProgramas();
		return cadena;
	}
	
	public ArrayList<Sede> getSedes(){
		return sedes;
	}
	
	public void setSedes(ArrayList<Sede>sedes){
		this.sedes = sedes;
	}
}