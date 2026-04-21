package tp4;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

	
		Grafo<Integer> g = new GrafoDirigido<>();
		for (int i = 1; i <= 7; i++) {
		    g.agregarVertice(i);
		}

		g.agregarArco(1, 5, null);
		g.agregarArco(1, 7, null);

	
		g.agregarArco(4, 6, null);


		g.agregarArco(5, 6, null);
		
		
		g.agregarArco(6, 1, null);

		g.agregarArco(7, 4, null);

		
		check_grafo(g);

		//DFS
		/*DFS dfs = new DFS();
		dfs.dfs(g, 4);*/
		
		
		//BFS
		BFS bfs = new BFS();
		bfs.bfs(g);
		
	}

	//tutto bene amici o vaffanculo
	public static void check_grafo(Grafo<?> g){
		for (Iterator<Integer> it = g.obtenerVertices(); it.hasNext();) {
		    int v = it.next();
		    System.out.print(v + " -> ");

		    Iterator<Integer> ady = g.obtenerAdyacentes(v);
		    while (ady.hasNext()) {
		        System.out.print(ady.next() + " ");
		    }
		    System.out.println();
		}
	}
}
