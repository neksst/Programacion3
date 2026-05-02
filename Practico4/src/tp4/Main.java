package tp4;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

	
		Grafo<Integer> g = new GrafoDirigido<>();
		for (int i = 1; i <= 20; i++) {
		    g.agregarVertice(i);
		}

		g.agregarArco(1, 3, null);
		g.agregarArco(1, 4, null);

		g.agregarArco(2, 18, null);
		g.agregarArco(2, 19, null);
		g.agregarArco(2, 12, null);

		g.agregarArco(3, 1, null);
		g.agregarArco(3, 8, null);
		g.agregarArco(3, 5, null);

		g.agregarArco(4, 1, null);
		g.agregarArco(4, 5, null);
		g.agregarArco(4, 13, null);

		g.agregarArco(5, 4, null);
		g.agregarArco(5, 3, null);
		g.agregarArco(5, 7, null);
		g.agregarArco(5, 15, null);

		g.agregarArco(6, 14, null);
		g.agregarArco(6, 17, null);
		g.agregarArco(6, 16, null);

		g.agregarArco(7, 5, null);
		g.agregarArco(7, 10, null);
		g.agregarArco(7, 8, null);
		g.agregarArco(7, 17, null);

		g.agregarArco(8, 7, null);
		g.agregarArco(8, 3, null);
		g.agregarArco(8, 9, null);

		g.agregarArco(9, 8, null);
		g.agregarArco(9, 11, null);
		g.agregarArco(9, 10, null);

		g.agregarArco(10, 7, null);
		g.agregarArco(10, 9, null);
		g.agregarArco(10, 12, null);
		g.agregarArco(10, 19, null);

		g.agregarArco(11, 9, null);
		g.agregarArco(11, 12, null);

		g.agregarArco(12, 10, null);
		g.agregarArco(12, 2, null);
		g.agregarArco(12, 11, null);

		g.agregarArco(13, 4, null);
		g.agregarArco(13, 20, null);
		g.agregarArco(13, 15, null);

		g.agregarArco(14, 15, null);
		g.agregarArco(14, 6, null);
		g.agregarArco(14, 20, null);

		g.agregarArco(15, 5, null);
		g.agregarArco(15, 17, null);
		g.agregarArco(15, 13, null);
		g.agregarArco(15, 14, null);

		g.agregarArco(16, 19, null);
		g.agregarArco(16, 18, null);
		g.agregarArco(16, 6, null);

		g.agregarArco(17, 7, null);
		g.agregarArco(17, 15, null);
		g.agregarArco(17, 19, null);
		g.agregarArco(17, 6, null);

		g.agregarArco(18, 16, null);
		g.agregarArco(18, 2, null);

		g.agregarArco(19, 17, null);
		g.agregarArco(19, 10, null);
		g.agregarArco(19, 2, null);
		g.agregarArco(19, 16, null);

		g.agregarArco(20, 13, null);
		g.agregarArco(20, 14, null);


		
		//check_grafo(g);

		//DFS
		/*DFS dfs = new DFS();
		dfs.dfs(g, 4);*/
		
		
		//BFS
		/*BFS bfs = new BFS();
		bfs.bfs(g);
		*/
		/*Punto5 p = new Punto5();
		System.out.println(p.dfs(g, 2));*/
		
		Punto6 p = new Punto6();
		System.out.println(p.bfs(g, 15, 7));
		
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
