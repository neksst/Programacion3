package tp4;

import java.util.ArrayList;
import java.util.Iterator;

public class Punto5 {

	public ArrayList<Integer> dfs(Grafo<?> grafo, int objetivo) {
	    Iterator<Integer> vertices = grafo.obtenerVertices();

	    while (vertices.hasNext()) {
	        int origen = vertices.next();

	        ArrayList<Integer> visitados = new ArrayList<>();
	        ArrayList<Integer> camino = new ArrayList<>();
	        if (dfs_visit(grafo, origen, objetivo, visitados, camino)) {
	            return camino;
	        }
	    }

	    return new ArrayList<>();
	}
	
	

	
	private boolean dfs_visit(Grafo<?> grafo, int actual, int objetivo, ArrayList<Integer> visitados,ArrayList<Integer> camino) {
		visitados.add(actual);
		camino.add(actual);
		if (actual == objetivo) return true;

	    
	    
	    Iterator<Integer> ady = grafo.obtenerAdyacentes(actual);
	    while (ady.hasNext()) {
	        int vecino = ady.next();
	        if (!visitados.contains(vecino)) {
	            if (dfs_visit(grafo, vecino, objetivo, visitados,camino)) {
	                return true; 
	            }
	        }
	    }

	    camino.remove(camino.size() - 1);
	    visitados.remove((Integer) actual);

	    return false;
	   
	}
	
}
