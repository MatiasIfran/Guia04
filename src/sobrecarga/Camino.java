package sobrecarga;

import java.util.ArrayList;


public class Camino {

	double pi = Math.PI;
	
	private ArrayList<Coordenadas> recorrido;
	private ArrayList<Coordenadas> aux;
	
	public Camino() {
		recorrido = new ArrayList<Coordenadas>();
		aux = new ArrayList<Coordenadas>();
	}
	
	
	public void agregar(Coordenadas x) {
		recorrido.add(x);
	}
	
	public void agregar(double lat, double lng) {
		Coordenadas COR = new Coordenadas(lat, lng);
		recorrido.add(COR);
	}
	
	public void agregar(int mtslat, int mtslng) {
		double lat, lng;
		Coordenadas COR = this.recorrido.get(this.recorrido.size()-1);
		
		lat = COR.getLatitud()+(mtslat/6379000)*(180/pi);
		lng = COR.getLongitud()+(mtslng/6379000)*(180/pi)/Math.cos(COR.getLatitud()*pi/180);
		
		this.agregar(lat, lng);
	}

	public ArrayList<Coordenadas> getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(ArrayList<Coordenadas> recorrido) {
		this.recorrido = recorrido;
	}
	public ArrayList<Coordenadas> getAux() {
		return aux;
	}
	public void setAux(ArrayList<Coordenadas> aux) {
		this.aux = aux;
	}


	public ArrayList<Coordenadas> buscar(Coordenadas no, Coordenadas se){
		if(no.getLatitud()>0 && no.getLongitud()<0) {
			if(se.getLatitud()<0 && se.getLongitud()>0) {
				for(int i=0; i<recorrido.size(); i++) {
					if(recorrido.get(i).getLatitud()<no.getLatitud() && recorrido.get(i).getLatitud()>se.getLatitud()) {
						if(recorrido.get(i).getLongitud()>no.getLongitud() && recorrido.get(i).getLongitud()<se.getLongitud()) {
							aux.add(recorrido.get(i));
						}
					}
				}
			}
		}
		return null;
	}
	
	public ArrayList<Coordenadas> buscar (Coordenadas co, int metros){
		
		return null;
	}
	
	
}
