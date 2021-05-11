package herencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class PedidoBasico extends Pedido {
	
	private boolean express;
	private LocalDate fechaInicio;

	public PedidoBasico(boolean Express) {
		pedido = new ArrayList<Producto>();
		this.express = Express;
	}
	
	public boolean isExpress() {
		return express;
	}
	public void setExpress(boolean express) {
		this.express = express;
	}
	
	public void agregarProducto(Producto p) {
		if(pedido.size()<5) {
			pedido.add(p);
		}
		else {
			System.out.println("No es posible agregar el producto");
		}
	}
	
	public double precio() {
		double precioTotal=0;
		
		for(int i=0; i<pedido.size(); i++) {
			precioTotal = precioTotal + pedido.get(i).getPrecio_producto()*1.05;
		}
		
		if(express==true) {
			precioTotal = precioTotal*1.20;
		}
		return precioTotal;
	}
	
	public double comision() {
		if(fechaInicio==null) {
			return 0.0;
		}
		else return precio()*0.10;
	}
	
	public boolean PedidoBasicoTrue() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean PedidoPremiumTrue() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean finalizado() {
		
		fechaInicio = LocalDate.now();
		
		return true;
	}

	@Override
	public boolean esTramite() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
