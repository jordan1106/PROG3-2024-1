package principales;
import matematicas.Operacion;
//Cuando ya trabajamos con paquetes funcionan los modificadores de acceso
//de las clases. Si no colocamos nada es el modificador por default
//esto no es publico ni privado, es default, y su alcance es el paquete.

//No basta con que la clase sea publica, el que sea publica me permite acceder a ella,
//para poder utilizarla debo importarla
public class Principal{
	public static void main(String[] args){
		Operacion op = new Operacion();
		System.out.println(op.sumar(10,20));
		System.out.println(op.restar(10,20));
		op.imprimir("Bienvenidos a Prog3");
	}
}
//Compilar siempre desde el directorio raiz