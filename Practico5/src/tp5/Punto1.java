package tp5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Se tiene un conjunto de salas comunicadas entre sí a través de puertas que se abren solamente en
 * un sentido. Una de las salas se denomina entrada y la otra salida. Construir un algoritmo que
 * permita ir desde la entrada a la salida atravesando la máxima cantidad de salas. Idea: podría
 * representar el problema mediante un grafo dirigido, donde cada nodo es una habitación, y cada
 * puerta es un arco dirigido hacia otra habitación.
 */


public class Punto1 {

	private ArrayList<Integer> solucion;
	private HashMap<Integer,String> colores;
	
	public Punto1() {
		this.solucion = new ArrayList<Integer>();
		this.colores  = new HashMap<Integer,String>();
	}
	
	
	
	public ArrayList<Integer> buscarSalida(Grafo<Integer> grafo,Integer inicio,Integer fin){
		Iterator<Integer> vertices = grafo.obtenerVertices();
		while(vertices.hasNext()) {
			Integer vertice = vertices.next();
			colores.put(vertice, "Blanco");
		}
		ArrayList<Integer> salas = new ArrayList<>();
		salas.add(inicio);
		colores.put(inicio, "Amarillo");
		
		buscarSalida(grafo,inicio,fin,salas);
		
		return solucion;
	}
	
	
	private void buscarSalida(Grafo<Integer> grafo,Integer actual,Integer fin,ArrayList<Integer> salas){
		
		if(actual == fin) {
			if(esMejor(salas,this.solucion)) {
				this.solucion.clear();
				this.solucion.addAll(salas);
			}
		} else {
			Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
			while(adyacentes.hasNext()) {
				Integer adyacente = adyacentes.next();
				if(colores.get(adyacente).equals("Blanco")) {
					colores.put(adyacente, "Amarillo");
					salas.add(adyacente);
					buscarSalida(grafo,adyacente,fin,salas);
					colores.put(adyacente, "Blanco");
					salas.removeLast();
				}
			}
		}
	}
	
	
	private boolean esMejor(ArrayList<Integer> salas,ArrayList<Integer> mejor) {
		return this.solucion.isEmpty()|| salas.size() > mejor.size();
	}
	
}
