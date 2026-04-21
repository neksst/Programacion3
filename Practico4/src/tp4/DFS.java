package tp4;

import java.util.ArrayList;
import java.util.Iterator;

public class DFS {

	
	public void dfs(Grafo<?> grafo, int inicio) {
		//Lista de vertices no visitados
		ArrayList<Integer> visitados = new ArrayList<Integer>();
		
		Iterator<Integer> vertices = grafo.obtenerVertices();
		
		while(vertices.hasNext()) {
			Integer vertice = vertices.next();
			if(!visitados.contains(vertice))
				this.dfs(grafo,vertice,visitados);
		}
		
	}
	
	
	/* TODO:
	 * cambiar el actual por el primero del grafo evitando asi que no tenga que señalizar por donde arranca
	 * No tengo ni las mas perra idea de como sacar el primer elem de un hashmap
	 */
	
	private void dfs(Grafo<?> grafo, int actual, ArrayList<Integer> visitados) {
		visitados.add(actual);
		
		//debug
		System.out.println(actual);
		
		Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
		while(adyacentes.hasNext()) {
			int adyacente = adyacentes.next(); // rip dislexia
			if(!visitados.contains(adyacente))
				dfs(grafo,adyacente,visitados);
				
					
		}
		
		
	}

}
