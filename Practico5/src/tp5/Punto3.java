package tp5;

import java.util.ArrayList;

public class Punto3 {

	/*
	 * Suma de subconjuntos. Dados n números positivos distintos, se desea encontrar todas las
	 * combinaciones de esos números tal que la suma sea igual a M.
	 */
	private ArrayList<ArrayList<Integer>> solucion;

	public Punto3() {
		this.solucion = new ArrayList<>();
	}

	public ArrayList<ArrayList<Integer>> buscarSuma(ArrayList<Integer> numeros, Integer total) {
		ArrayList<Integer> camino = new ArrayList<>();
		buscarSuma(numeros, 0, 0, total, camino);
		return solucion;
	}

	private void buscarSuma(ArrayList<Integer> numeros, int indice, int suma, int total, ArrayList<Integer> camino) {

		if (suma == total) {
			solucion.add(new ArrayList<>(camino));
		} else if (suma < total) {
			for (int i = indice; i < numeros.size(); i++) {
				int num = numeros.get(i);

				camino.add(num);
				buscarSuma(numeros, i, suma + num, total, camino);
				camino.remove(camino.size() - 1);
			}
		}

	}
}
