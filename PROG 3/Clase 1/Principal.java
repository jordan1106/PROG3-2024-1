import java.text.SimpleDateFormat;
class Principal{
	public static void main(String[] args) throws Exception{
		System.out.println("Hola mundo...");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");	//m minuscula esta destinada para los minutos
		Persona p1 = new Persona("Juan",sdf.parse("03-01-1994"));
		Persona p2 = new Persona();
		System.out.println(sdf.format(p1.getFechaDeNacimiento()));
	}
}