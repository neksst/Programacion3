package tp5;

import java.util.ArrayList;

public class Punto4 {
	/*
	 * Partición de conjunto. Dado un conjunto de n enteros se desea encontrar, si
	 * existe, una partición en dos subconjuntos disjuntos, tal que la suma de sus
	 * elementos sea la misma.
	 */
	
	
	//La misma mierda  que el 3 pero dividiendo el total. Existen particiones si y solo si 
	
	private ArrayList<ArrayList<Integer>> soluciones;

	public Punto4() {
		this.soluciones = new ArrayList<ArrayList<Integer>>();
	}

	public ArrayList<ArrayList<Integer>> existeParticiones(ArrayList<Integer> conjunto) {
		int suma = 0;
		for (int i = 0; i < conjunto.size(); i++) {
			suma += conjunto.get(i);
		}

		if (suma % 2 != 0) 
			return new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> camino = new ArrayList<>();
		existeParticiones(conjunto, 0, 0, camino, suma / 2);

		return soluciones;
	}

	private void existeParticiones(ArrayList<Integer> conjunto, Integer indice, Integer suma, ArrayList<Integer> camino,Integer total) {

		if (suma == total) {
			soluciones.add(new ArrayList<>(camino));
		} else if (suma < total) {
			for (int i = indice; i < conjunto.size(); i++) {
				int num = conjunto.get(i);
					camino.add(num);
					existeParticiones(conjunto, i + 1, suma + num, camino, total);
					camino.remove(camino.size() - 1);
			}
		}
	}

}
