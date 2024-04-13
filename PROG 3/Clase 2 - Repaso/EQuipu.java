import java.util.ArrayList;
class EQuipu{
	private ArrayList<Equipo> equipos;
	private ArrayList<Miembro> miembros;
	
	public ArrayList<Equipo> getEquipos(){
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo>equipos){
		this.equipos = equipos;
	}
	
	public String consultarMiembrosDeEquipo(int numero){
		String reporte = " ";
		for(Miembro m: this.equipos.get(numero).getMiembros()){
			if(m instanceof MiembroPUCP){
				reporte = reporte + ((MiembroPUCP)m).consultarDatos();
			}
		}
		return reporte;
	}
}