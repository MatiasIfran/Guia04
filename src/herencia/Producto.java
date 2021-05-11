package herencia;

public class Producto {

	private int id_producto;
	private double Precio_producto;
	
	public Producto(int id_producto, double Precio_producto) {
		this.id_producto = id_producto;
		this.Precio_producto = Precio_producto;
	}
	
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public double getPrecio_producto() {
		return Precio_producto;
	}
	public void setPrecio_producto(double precio_producto) {
		Precio_producto = precio_producto;
	}
	
	
	
}
