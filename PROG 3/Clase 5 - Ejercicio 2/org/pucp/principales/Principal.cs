using org.pucp.personal;
using org.pucp.investigadores;
namespace org{
	namespace pucp{
		namespace principales{
			public class Principal{
				public static void Main(string[] args){
					Persona p = new Persona("Hugo");
					Investigador i = new Investigador("Carmen","Ing. Informatica");
					p.imprimirDatos();
					i.imprimirDatos();
				}
			}
		}
	}
}