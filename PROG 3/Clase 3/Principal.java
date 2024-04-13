import java.util.ArrayList;
class Operacion{
	public static int numero = 10;
	//el static me permite utilizarlo sin necesidad de inicializarlo
	//o sea no el =10 sino el crear en el main Operation op = new Operation()

	//Lo mismo sucede para los metodos
	public static void metodoEstatico(){
		System.out.println("Impresion de metodo estatico");
	}
	
	public int codigo;
}
interface IConsultable{
	void metodoImpresion(String cadena);
	int comportamientoComun();
}
//Si una clase implemente una interface se ve obligada a implementar todos
//los metodos de esa interface

//Una clase puede heradar de una sola clase padre, mientras que, puede 
//implementar multiples interfaces

//Si una clase hereda y utiliza una interface:
//primero va el extends y luego el implements


class Persona implements IConsultable{
	public void metodoImpresion(String cadena){
		System.out.println(cadena);
	}
	public int comportamientoComun(){
		return 10;
	}
	public void caminar(){
		System.out.println("La persona esta caminando...");
	}
}

abstract class Figura{
	private int alto;
	private int largo;
	public Figura(){
		System.out.println("Mensaje Figura");
	}
	public Figura(int alto, int largo){
		this.alto = alto;
		this.largo = largo;
	}
	public void calcularArea(){
		System.out.println("Se esta calculando el area de la figura");
		
	}
	public int getAlto(){
		return alto;
	}
	public void setAlto(int alto){
		this.alto = alto;
	}
	public int getLargo(){
		return largo;
	}

}

class Cuadrado extends Figura{
	public Cuadrado(int alto, int largo){
		super(alto,largo);
		System.out.println("Mensaje Cuadrado");
	}
	
	@Override
	public void calcularArea(){
		System.out.println("Se esta calculando el area del Cuadrado");
		System.out.println(getAlto()*getLargo());
	}	
}

class Triangulo extends Figura{
	public Triangulo(int alto, int largo){
		super(alto,largo);
	}
	@Override
	public void calcularArea(){
		System.out.println("Se esta calculando el area del Triangulo");
		System.out.println(getAlto()*getLargo()/2);
	}	
}

class Principal{
	public static void main(String[] args){
		
		//Cuadrado cuadrado = new Cuadrado(10,30);
		//Triangulo triangulo = new Triangulo(20,40);	
		
		Figura figura1 = new Cuadrado(10,30);
		Figura figura2 = new Triangulo(20,40);
	
		ArrayList<Figura> figuras = new ArrayList<>();
			
		figuras.add(figura1);	
		figuras.add(figura2);
		
		for(int i=0;i<figuras.size();i++){
			figuras.get(i).calcularArea();
		}
		
		//La interfaz funciona como un tipo de herencia, no llega a ser herencia pero...
		IConsultable p1 = new Persona(); 
		//Casteo seguro
		if(p1 instanceof Persona){
			((Persona)p1).caminar();
		}
		
		//for(Figura f: figuras){
			
		//}
		
		//cuadrado.calcularArea();
		//triangulo.calcularArea();
		//System.out.println(cuadrado.getAlto());
		
		
		//Operacion op = new Operacion(); 
		System.out.println(Operacion.numero);
		Operacion.metodoEstatico();
		
		Operacion op1 = new Operacion();
		Operacion op2 = new Operacion();
		op1.numero = 20;
		op1.numero = 21;
		//basta que modifique el valor en un objeto, al ser un espacio
		//compartido se guarda el ultimo
		System.out.println(Operacion.numero);
	}
}

//Si declaramos una clase abstracta en una clase que va a ser padre
//se debe usar esta clase abstracta en las clases hijas