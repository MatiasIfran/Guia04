package herencia;

import java.util.ArrayList;

public abstract class Pedido implements Comisionable {

	protected ArrayList<Producto> pedido;
	
	public abstract double precio();
	public abstract double comision();
	public abstract void agregarProducto(Producto p);
	public abstract boolean finalizado();

	public ArrayList<Producto> getPedido() {
		return pedido;
	}
	public void setPedido(ArrayList<Producto> pedido) {
		this.pedido = pedido;
	}
	
}
