import java.util.ArrayList;
class Principal{
	public static void main(String[] args){
		//Creamos el objeto EQuipu
		EQuipu objEQuipu = new EQuipu();
		
		//Creamos los equipos
		Equipo eq1 = new Equipo("Equipo 1","Interes 1");
		Equipo eq2 = new Equipo("Equipo 2","Interes 2");
		Equipo eq3 = new Equipo("Equipo 3","Interes 3");
		Equipo eq4 = new Equipo("Equipo 4","Interes 4");
		
		//Agregamos los equipos al EQuipu
		objEQuipu.setEquipos(new ArrayList<>());
		
		objEQuipu.getEquipos().add(eq1);
		objEQuipu.getEquipos().add(eq2);
		objEQuipu.getEquipos().add(eq3);
		objEQuipu.getEquipos().add(eq4);
		
		//Miembros del equipo 1
		Alumno alumno1 = new Alumno("Juan","Perez","20196508","68.3");
		Profesor profesor1 = new Profesor("Maria","Sanchez","20210578",TipoDedicacion.TC);
		Alumno alumno2 = new Alumno("Jordan","Martel","20195876","50");
		
		//Agregamos los miembros al equipo 1
		eq1.setMiembros(new ArrayList<>());
		
		eq1.getMiembros().add(alumno1);
		eq1.getMiembros().add(profesor1);
		eq1.getMiembros().add(alumno2);
		
		String reporte = objEQuipu.consultarMiembrosDeEquipo(0);
		
		System.out.println(reporte);
	}
}