package herencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class PedidoPremium extends Pedido {
	
	private LocalDate fechaInicio;

	public boolean isPremium() {
		return true;
	}
	
	public PedidoPremium() {
		pedido = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto p) {
		if(pedido.size()<20) {
			pedido.add(p);
		}
		else {
			System.out.println("No es posible agregar el producto");
		}
	}

	
	public double precio() {
		double precioTotal=0;
		
		for(int i=0; i<pedido.size(); i++) {
			if(pedido.size()<5) {
				precioTotal = precioTotal + pedido.get(i).getPrecio_producto()*1.20;
			}
			else if(pedido.size()<20) {
				precioTotal = precioTotal + pedido.get(i).getPrecio_producto()*1.30;
			}
			
		}
		return precioTotal;
	}

	public double comision() {
		if(fechaInicio==null) {
			return 0.0;
		}
		else {
			if(pedido.size()>=10) {
			return precio()*0.15+50;
			}
			return precio()*0.15;
		}
		
	}

	@Override
	public boolean PedidoBasicoTrue() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean PedidoPremiumTrue() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean finalizado() {
		fechaInicio = LocalDate.now();
		return false;
	}

	@Override
	public boolean esTramite() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
