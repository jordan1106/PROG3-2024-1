class Operador extends Empresa{
	private boolean soporteLogistico;
	private boolean asistenciaNavegacion;
	
	public Operador(String nombre, boolean soporteLogistico,boolean asistenciaNavegacion){
		super(nombre);
		this.soporteLogistico = soporteLogistico;
		this.asistenciaNavegacion = asistenciaNavegacion;
	}
	
	public String consultarDatos(){
		return "Operador: "+getNombreEmpresa()+" - Soporte Logistico: "+ soporteLogistico
		+" Asistencia Navegacion: " + asistenciaNavegacion + "\n";
	}
	
}