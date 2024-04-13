import java.util.Date;
import java.time.LocalTime;
class Vuelo{
	static private int correlativo = 1;
	private int idVuelo;
	private String codigo;
	private Date fecha;
	private LocalTime horaSalida;
	private LocalTime horaLlegada;
	private Avion avion;
	private Remolque remolque;
	private Aeropuerto aeropuertoSalida;
	private Aeropuerto aeropuertoLlegada;
	
	public Vuelo(String codigo, Date fecha, LocalTime horaSalida,LocalTime horaLlegada){
		this.idVuelo = correlativo;
		this.codigo = codigo;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		correlativo++;
	}
	
	public void setAvion(Avion avion){
		this.avion = avion;
	}
	
	public void setRemolque(Remolque remolque){
		this.remolque = remolque;
	}
	
	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida){
		this.aeropuertoSalida = aeropuertoSalida;
	}
	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada){
		this.aeropuertoLlegada = aeropuertoLlegada;
	}
	
	public String devolverInformacion(){
		String cadena;
		cadena = "Datos del vuelo " + codigo + " con ID: "+idVuelo+"\n";
		cadena = cadena + "--------------------------------------------------"+"\n";
		cadena = cadena + fecha + "  -  Hora Salida: "+horaSalida+"  - Hora Llegada: "+horaLlegada+"\n";
		cadena = cadena + avion.consultarDatos();
		cadena = cadena + remolque.consultarDatos();
		cadena = cadena + "--------------------------------------------------"+"\n";
		cadena = cadena + "DESDE: "+"\n";
		cadena = cadena + aeropuertoSalida.consultarDatos();
		cadena = cadena + "--------------------------------------------------"+"\n";
		cadena = cadena + "HACIA: "+"\n";
		cadena = cadena + aeropuertoLlegada.consultarDatos();
		return cadena;
	}
}