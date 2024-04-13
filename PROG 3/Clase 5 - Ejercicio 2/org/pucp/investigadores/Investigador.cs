using org.pucp.personal;
using org.pucp.interfaces;
namespace org{
	namespace pucp{
		namespace investigadores{
			//Para declarar el uso de herencia o interface se usa :
			//Primero van las herencias y luego las interfaces
			public class Investigador : Persona, IConsultable {
				public string especialidad;
				//base reemplaza al super de java
				public Investigador(string nombre, string especialidad):base(nombre){
					this.especialidad = especialidad;
				}
				
				//Colocamos override en clase heredada
				public override void imprimirDatos(){
					System.Console.WriteLine("Soy una investigador..." + Nombre + 
					" - "+especialidad);
				}
			} 
		}
	}
}