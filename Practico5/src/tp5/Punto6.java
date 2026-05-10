package tp5;

import java.util.ArrayList;

public class Punto6 {

	
	private ArrayList<ArrayList<Casillero>> solucion;
	
	public Punto6() {
		this.solucion = new ArrayList<ArrayList<Casillero>>();
	}
	
	
	public ArrayList<ArrayList<Casillero>> buscarCaminos(Casillero c,Integer cant_pisadas){
		
		ArrayList<Casillero> camino = new ArrayList<Casillero>();
		
		buscarCaminos(c,0,camino,cant_pisadas);
		
		
		return solucion;
	}
	
	
	private void buscarCaminos(Casillero actual,Integer cant_pisadas,ArrayList<Casillero> camino,Integer pisadas_posibles) {
		
		if(cant_pisadas == pisadas_posibles) {
			
			this.solucion.add(new ArrayList<>(camino));
			
		}else {
			ArrayList<Casillero> adyacentes = actual.getAyacentes();
			for(Casillero adyacente : adyacentes) {
				if(!adyacente.getColor().equals("Verde") && !adyacente.getColor().equals("Rojo")) {
					camino.add(adyacente);
					adyacente.marcarVisitado();
					buscarCaminos(adyacente,cant_pisadas+1,camino,pisadas_posibles);
					adyacente.desmarcarVisitado();
					camino.remove(camino.size() - 1);
				}
			}
		}
	}
}
