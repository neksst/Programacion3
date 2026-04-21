package tp4;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

	
		Grafo<Integer> g = new GrafoDirigido<>();
		for (int i = 1; i <= 8; i++) {
		    g.agregarVertice(i);
		}

		g.agregarArco(1, 2, null);
		g.agregarArco(1, 4, null);

		g.agregarArco(2, 5, null);
		g.agregarArco(2, 7, null);

		g.agregarArco(3, 2, null);
		g.agregarArco(3, 5, null);
		g.agregarArco(3, 8, null);

		g.agregarArco(4, 6, null);
		g.agregarArco(4, 7, null);

		g.agregarArco(5, 7, null);
		
		
		g.agregarArco(6, 1, null);

		g.agregarArco(7, 6, null);

		g.agregarArco(8, 7, null);
		
		//check_grafo(g);
		
		DFS dfs = new DFS();
		dfs.dfs(g, 4);
		
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
