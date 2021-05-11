package sobrecarga;

public class App {

	public static void main(String[] args) {
		Coordenadas C1 = new Coordenadas(38.63, -91.25); //coor de eeuu
		Coordenadas C2 = new Coordenadas(-22.81, 119.32); //coor de australia
		
		Camino cam1 = new Camino();
	//	cam1.agregar(C1);
	//	cam1.agregar(C2);
		
		cam1.agregar(-14.84, 48.90);
		cam1.agregar(-6.28, -35.02);
		cam1.agregar(41.36, -117.07);
		
		
		//cam1.agregar(52, 12); //le sumo los metros a la ultima latitud y longitud cargada 
		
		cam1.buscar(C1, C2);
		for(int i=0; i<cam1.getAux().size(); i++) {
			System.out.println(cam1.getAux().get(i).getLatitud());
			System.out.println(cam1.getAux().get(i).getLongitud());
		}
		
	}

}
