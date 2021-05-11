package herencia;

import java.util.ArrayList;

public class Cadete {
	
	private String Nombre;
	private int id_cadete;
	
	private ArrayList<Comisionable> pedidoTomado;
	
	public Cadete(String nombre, int id_cadete) {
		pedidoTomado = new ArrayList<Comisionable>();
		this.Nombre = nombre;
		this.id_cadete = id_cadete;
	}
	
	public void agregarPedido(Pedido p) {
		pedidoTomado.add(p);
	}
	
	
	public double comisiones(){
		
		double comisionTotal=0;
		
		for(int i=0; i<pedidoTomado.size(); i++) {
			if(pedidoTomado.get(i).PedidoBasicoTrue()) { //creo que si no pongo ==true entra igual
				comisionTotal += pedidoTomado.get(i).comision();
			} 
			if(pedidoTomado.get(i).PedidoPremiumTrue()) {
				comisionTotal += pedidoTomado.get(i).comision();
			}
			if(pedidoTomado.get(i).esTramite()) {
				comisionTotal += 20;
			}
		}
		return comisionTotal;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getId_cadete() {
		return id_cadete;
	}

	public void setId_cadete(int id_cadete) {
		this.id_cadete = id_cadete;
	}

	public ArrayList<Comisionable> getPedidoTomado() {
		return pedidoTomado;
	}

	public void setPedidoTomado(ArrayList<Comisionable> pedidoTomado) {
		this.pedidoTomado = pedidoTomado;
	}
	
	
}
