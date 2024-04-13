import java.util.ArrayList;
class Principal{
	public static void main(String[] args){
		//Creamos el objeto EQuipu
		EQuipu objEquipu = new EQuipu();
		
		//Creamos los equipos
		Equipo eq1 = new Equipo("HCI-DUXAIT","Interes en temas de Interaccion Humano Computador");
		Equipo eq2 = new Equipo("Equipo 2","Interes 2");
		Equipo eq3 = new Equipo("Equipo 3","Interes 3");
		Equipo eq4 = new Equipo("Equipo 4","Interes 4");
		
		//Agregamos los equipos al EQuipu
		objEquipu.setEquipos(new ArrayList<>());
		
		objEquipu.getEquipos().add(eq1);
		objEquipu.getEquipos().add(eq2);
		objEquipu.getEquipos().add(eq3);
		objEquipu.getEquipos().add(eq4);
		
		//Miembros del Equipo 1
		Alumno alumno1 = new Alumno("20090606","Juan","Perez",68.3);
		Profesor profesor1 = new Profesor("46891","Andrea","Montenegro",TipoDedicacion.TC);
		Alumno alumno2 = new Alumno("20096969","Viviana","Rivasplata",64.5);
		
		//Asignamos los miembros al equipo 1
		eq1.setMiembros(new ArrayList<>());
		
		eq1.getMiembros().add(alumno1);
		eq1.getMiembros().add(profesor1);
		eq1.getMiembros().add(alumno2);
		
		String reporte = objEquipu.consultarMiembrosDeEquipo(0);
		
		System.out.println(reporte);
	}
}