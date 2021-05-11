package herencia;

public class App {

	public static void main(String[] args) {
		
		Producto arroz = new Producto(1, 69.5);
		Producto yerba = new Producto(2, 45.99);
		Producto aceite = new Producto(3, 88.0);
		Producto leche = new Producto(4, 30.77);
		Producto pollo = new Producto(5, 225.10);
		Producto papa = new Producto(5, 60.5);
		
		Pedido P1 = new PedidoBasico(false);
		Pedido P2 = new PedidoPremium();
		Pedido P3 = new PedidoBasico(true);
		
		Cadete C1 = new Cadete("Matias", 15);
		
		P3.agregarProducto(papa);
		P3.agregarProducto(leche);
		P3.agregarProducto(arroz);
		
		P2.agregarProducto(yerba);
		P2.agregarProducto(aceite);
		P2.agregarProducto(arroz);
		P2.agregarProducto(papa);
		P2.agregarProducto(papa);
		P2.agregarProducto(pollo);
		
		P1.agregarProducto(arroz);
		P1.agregarProducto(leche);
		P1.agregarProducto(aceite);
		P1.agregarProducto(yerba);
		
		
		C1.agregarPedido(P3);
		C1.agregarPedido(P2);
		C1.agregarPedido(P1);
		
		P1.finalizado();
		P2.finalizado();
		P3.finalizado();
		
		System.out.println("El precio total del pedido 1 no express es: $" + P1.precio());
		System.out.println("La comision del cadete por llevar el pedido es:  $" + P1.comision());
		
		System.out.println("El precio total del pedido 2 premium es: $" + P2.precio());
		System.out.println("La comision del cadete por llevar el pedido es:  $" + P2.comision());

		System.out.println("El precio total del pedido 3 express es: $" + P3.precio());
		System.out.println("La comision del cadete por llevar el pedido es:  $" + P3.comision());
		
		System.out.println("La comision obtenida por el cadete " + C1.getNombre() + " en el dia de hoy es de $" + C1.comisiones());





		
	
	}

}
