package sobrecarga;

public class Coordenadas {

	private Double latitud;
	private Double longitud;
	
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	public Coordenadas(){
		this.setLatitud(0.0);
		this.setLongitud(0.0);
	}
	
	public Coordenadas(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public boolean iguales(Coordenadas C2) {
		if(this.latitud.equals(C2.latitud)) {
			if(this.longitud.equals(C2.longitud)) {
				return true;
			}
		}
		return false;
	}
	
	public void ConvertirString() {
		this.latitud.toString();
		this.longitud.toString();
	}
	
}
