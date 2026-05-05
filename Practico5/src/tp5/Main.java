package tp5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		/*
		Grafo<Integer> grafo = new GrafoDirigido<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			grafo.agregarVertice(i);
		}
		
		grafo.agregarArco(1, 2, null);
		grafo.agregarArco(1, 3, null);
		grafo.agregarArco(1, 10, null);
		
		grafo.agregarArco(2, 4, null);
		grafo.agregarArco(2, 5, null);
		
		grafo.agregarArco(4, 6, null);
		
		grafo.agregarArco(5, 8, null);
		
		grafo.agregarArco(7, 9, null);
		
		grafo.agregarArco(8, 7, null);
		grafo.agregarArco(8, 10, null);
		
		grafo.agregarArco(9, 10, null);
		*/

		/*
		Punto1 p = new Punto1();
		
		System.out.println(p.buscarSalida(grafo, 1, 10));
		*/
		
		/*
		ArrayList<Integer> numeros = new ArrayList<Integer>(List.of(1,2,3,4,5,6));
		Punto3 p = new Punto3();
		System.out.println(p.buscarSuma(numeros, 10));
		*/
		ArrayList<Integer> conjunto = new ArrayList<Integer>(List.of(1,5,11,5));
		Punto4 p = new Punto4();
		System.out.println(p.existeParticiones(conjunto));
	}

}
