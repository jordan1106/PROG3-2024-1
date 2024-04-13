import java.util.Date;
import java.time.LocalTime;
class Vuelo {
    private static int identificador = 1;
    private int identificadorVuelo;
    private String codigoVuelo;
    private Date fecha;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private Avion avion;
    private Remolque remolque;
    private Aeropuerto aeropuertoSalida;
    private Aeropuerto aeropuertoLlegada;
    public Vuelo(String codigoVuelo,Date fecha,LocalTime horaSalida,
            LocalTime horaLlegada) {
        this.identificadorVuelo = identificador;
        this.codigoVuelo = codigoVuelo;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        identificador++;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }
    public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }

    public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
        this.aeropuertoLlegada = aeropuertoLlegada;
    }

    public String devolverInformacion() {
        String cadena = "";
        cadena = "Datos del vuelod " + this.codigoVuelo + " con ID:" + identificadorVuelo + "\n";
        for (int i = 0; i < 50; i++)
            cadena+="-";
        cadena+="\n";
        cadena+="Fecha:"+this.fecha+" - Hora Salida:"+this.horaSalida+" - Hora Llegada:"+
                this.horaLlegada + "\n";
        cadena += this.avion.consultarDatos();
        cadena += this.remolque.consultarDatos();
        for (int i = 0; i < 50; i++)
            cadena += "-";
        cadena += "\n";
        cadena += "DESDE:" + "\n";
        cadena += this.aeropuertoSalida.consultarDatos();
        for (int i = 0; i < 50; i++)
            cadena += "-";
        cadena += "\n";
        cadena += "HACIA:" + "\n";
        cadena += this.aeropuertoLlegada.consultarDatos();
        return cadena;
    }
}
