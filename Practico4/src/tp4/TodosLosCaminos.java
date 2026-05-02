package tp4;

import java.util.ArrayList;
import java.util.Iterator;

public class TodosLosCaminos {
	

	public ArrayList<ArrayList<Integer>> dfs(Grafo<?> grafo,int objetivo) {
		//Lista de vertices no visitados
		ArrayList<Integer> visitados = new ArrayList<>();
		
		ArrayList<Integer> caminoActual = new ArrayList<>();
		ArrayList<ArrayList<Integer>> caminos = new ArrayList<>();
		
		Iterator<Integer> vertices = grafo.obtenerVertices();
		
		while(vertices.hasNext()) {
			Integer vertice = vertices.next();
			if(!visitados.contains(vertice))
				this.dfs_visit(grafo,vertice,visitados,objetivo,caminoActual,caminos);
		}
		return caminos;
	}
	
	

	
	private void dfs_visit(Grafo<?> grafo, int actual, ArrayList<Integer> visitados,int objetivo,ArrayList<Integer> caminoActual, ArrayList<ArrayList<Integer>> caminos ) {
		visitados.add(actual);
		caminoActual.add(actual);
		//debug
		System.out.println(actual);

		
		if(actual == objetivo) {
			caminos.add(new ArrayList<Integer>(caminoActual));
			
			//Debug
			System.out.println(caminoActual);
			
		}else {
			Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
			while(adyacentes.hasNext()) {
				int adyacente = adyacentes.next(); 
				if(!visitados.contains(adyacente))
					dfs_visit(grafo,adyacente,visitados,objetivo,caminoActual,caminos);
					
						
			}
		}
		
		caminoActual.remove(caminoActual.size() -1); //borrar el ultimo insertado
		visitados.remove((Integer) actual);

	}
	
}

	
