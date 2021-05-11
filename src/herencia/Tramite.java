package herencia;

import java.time.LocalDate;

public class Tramite implements Comisionable {

	private String descripcion;
	private String domicilio;
	private double hora;
	private LocalDate dia;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
	@Override
	public double comision() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean PedidoBasicoTrue() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean PedidoPremiumTrue() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean esTramite() {
		// TODO Auto-generated method stub
		return true;
	}
	public void finalizado() {
		dia = LocalDate.now();
	}
	
}
