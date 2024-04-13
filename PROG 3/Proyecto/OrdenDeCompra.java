import java.util.Date;
import java.util.ArrayList;

public class OrdenDeCompra {

    private int idOrdenDeCompra;
    private String nombreCliente;
    private double precioTotal;
    private String estado;
    private Date fechaDePago;
    private String codigoCompra;
	private ArrayList<Pedido> pedidos;
	private ArrayList<BoletaDeVenta> lBoletaDeVenta;
	private Persona persona;

    public OrdenDeCompra(){
    }


    public void consultarDatos() {
    }

    public void cancelarOrden() {
    }

    public void pagarOrden() {

    }

    public void generarBoleta() {
    }

}