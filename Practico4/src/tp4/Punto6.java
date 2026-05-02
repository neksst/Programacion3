package tp4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Punto6 {

	public ArrayList<Integer> bfs(Grafo<?> grafo,int inicio,int objetivo) {
		ArrayList<Integer> visitados = new ArrayList<Integer>();
		
		return this.bfs(grafo,inicio,visitados, objetivo);
	}
	
	
	private ArrayList<Integer> bfs(Grafo<?> grafo,Integer vertice, ArrayList<Integer> visitados,int objetivo){
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visitados.add(vertice);
		
		HashMap<Integer,Integer> predecesores = new HashMap<>();
		
		predecesores.put(vertice, null);
		
		queue.add(vertice);
		
		
		
		
		while(!queue.isEmpty()) {
			int vertice_aux = queue.remove();
			
			if(vertice_aux == objetivo) return RecorridoCamino(predecesores,objetivo);
			
			Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(vertice_aux);
			while(adyacentes.hasNext()) {
				Integer adyacente = adyacentes.next();
				if(!visitados.contains(adyacente)) {
					visitados.add(adyacente);
					queue.add(adyacente);
					predecesores.put(adyacente, vertice_aux);
				}
			}
		}	
		return null;
	}
	
	private ArrayList<Integer> RecorridoCamino(HashMap<Integer,Integer> predecesores, int fin){
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		Integer actual = fin;
		while(actual != null) {
			res.add(actual);
			actual = predecesores.get(actual);
		}
		
		Collections.reverse(res);
		return res;
		
	}
}
