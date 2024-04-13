import java.text.SimpleDateFormat;
import java.time.LocalTime;
class Principal{
	// Jordan Martel Alcantara
	// 20195876
	
	public static void main(String[] args)throws Exception{
		//Se crea el objeto SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//Se crean ciudades
		Ciudad ciudad01 = new Ciudad("Lima");
		Ciudad ciudad02 = new Ciudad("Chiclayo");
		//Se crean operadoras
		Operador operador01 = new Operador("LIMA PARTNERS",true,true);
		Operador operador02 = new Operador("CORPAC",false,true);
		//Se crean los aeropuertos
		Aeropuerto aeropuerto01 = new Aeropuerto("Jorge Chavez","Av. Elmer Faucett S/N",
		TipoAeropuerto.INTERNACIONAL,ciudad01,operador01);
		Aeropuerto aeropuerto02 = new Aeropuerto("Jose Abelardo Quinones","Av. Bolognesi S/N",
		TipoAeropuerto.INTERNACIONAL,ciudad02,operador02);
		//Se crea la aerolinea
		Aerolinea aerolinea01 = new Aerolinea("Latam Airlines","LATAM",true);
		//Se crea el avion
		Avion avion01 = new Avion(aerolinea01,"AIRBUS A320",890.00,186);
		//Se crea el remolque
		Remolque remolque01 = new Remolque(aerolinea01,"HD-ATT60",158.00,4160.00);
		//Se crea el vuelo
		Vuelo vuelo01 = new Vuelo("LA2023",sdf.parse("25-08-2023"),LocalTime.of(13,00,00),LocalTime.of(14,30,00));
		//Establecemos el avion del vuelo
		vuelo01.setAvion(avion01);
		//Establecemos el remolque asignado al vuelo
		vuelo01.setRemolque(remolque01);
		//Establecemos el aeropuerto de salida del vuelo01
		vuelo01.setAeropuertoSalida(aeropuerto01);
		//Establecemos el aeropuerto de llegada del vuelo01
		vuelo01.setAeropuertoLlegada(aeropuerto02);
		//Se genera un reporte del vuelo
		String reporte = vuelo01.devolverInformacion();
		//Se imprime el reporte
		System.out.println(reporte);
	}
}