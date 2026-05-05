package tp4;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

	
		Grafo<Integer> g = new GrafoDirigido<>();
		
		g.agregarVertice(0);


		
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
		/*
		Punto6 p = new Punto6();
		System.out.println(p.bfs(g, 15, 7));
		*/
		
		Punto8  p= new Punto8(); 
		
		
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
