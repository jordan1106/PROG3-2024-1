class MiembroExterno extends Miembro{
	private char dedicacion;
	
	public MiembroExterno(String nombre, String apellidoPaterno, char dedicacion){
		super(nombre,apellidoPaterno);
		this.dedicacion = dedicacion;
	}
	
}