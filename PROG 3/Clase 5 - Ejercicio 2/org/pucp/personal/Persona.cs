using org.pucp.interfaces;
//Una diferencia con java es que no se llega hasta el nombre de la Clase
namespace org{
	namespace pucp{
		namespace personal{
			//el equivalente de los imports en java son using
			public class Persona : IConsultable{
				private string nombre;
				public Persona(string nombre){
					this.nombre = nombre;
				}
				public string Nombre{
					get{
						return nombre;
					}
					set{
						this.nombre = value;
					}
				}
				
				
				//Colocamos virtual en clase base 
				public virtual void imprimirDatos(){
					System.Console.WriteLine("Soy una persona..." + nombre);
				}
			}
		}
	}
}
