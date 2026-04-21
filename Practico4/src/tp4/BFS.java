package tp4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class BFS {

	public void bfs(Grafo<?> grafo) {
		ArrayList<Integer> visitados = new ArrayList<Integer>();
		
		
		Iterator<Integer> vertices = grafo.obtenerVertices();
		while(vertices.hasNext()) {
			Integer vertice = vertices.next();
			if(!visitados.contains(vertice))
				this.bfs(grafo, vertice, visitados);
		}
			
		System.out.println(visitados);
		
	}
	
	
	private void bfs(Grafo<?> grafo,Integer vertice, ArrayList<Integer> visitados){
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visitados.add(vertice);
		
		queue.add(vertice);
		
		while(!queue.isEmpty()) {
			int vertice_aux = queue.remove();
			Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(vertice_aux);
			while(adyacentes.hasNext()) {
				Integer adyacente = adyacentes.next();
				if(!visitados.contains(adyacente)) {
					visitados.add(adyacente);
					queue.add(adyacente);
				}
			}
		}
		
		
		
		
	}
	
	
	
}
