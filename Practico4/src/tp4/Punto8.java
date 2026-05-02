package tp4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Punto8 {

	 private HashMap<Integer, String> colores;
	    private ArrayList<Integer> solucion;
	    private Integer mejor;

	    public Punto8() {
	        this.colores = new HashMap<>();
	        this.solucion = new ArrayList<>();
	        this.mejor = null;
	    }

	    public ArrayList<Integer> dfs(Grafo<Integer> grafo) {

	        Iterator<Integer> vertices = grafo.obtenerVertices();
	        while (vertices.hasNext()) {
	            colores.put(vertices.next(), "blanco");
	        }

	        vertices = grafo.obtenerVertices();
	        while (vertices.hasNext()) {
	            Integer vertice = vertices.next();

	            ArrayList<Integer> caminoActual = new ArrayList<>();
	            caminoActual.add(vertice);

	            colores.put(vertice, "amarillo");

	            dfs_visit(grafo, vertice, caminoActual, vertice);

	            colores.put(vertice, "blanco");
	        }

	        return solucion;
	    }

	    private void dfs_visit(Grafo<Integer> grafo, Integer actual,ArrayList<Integer> caminoActual,int pesoActual) {

	        Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
	        boolean continuar = false;
	        while (adyacentes.hasNext()) {
	            Integer adyacente = adyacentes.next();
	            Arco<Integer> arco = grafo.obtenerArco(actual, adyacente);
	            if (colores.get(adyacente).equals("blanco") && arco.getEtiqueta() <= adyacente) {
	                continuar = true;

	                colores.put(adyacente, "amarillo");
	                caminoActual.add(adyacente);

	                int nuevoPeso = pesoActual + arco.getEtiqueta() + adyacente;

	                dfs_visit(grafo, adyacente, caminoActual, nuevoPeso);

	                colores.put(adyacente, "blanco");
	                caminoActual.remove(caminoActual.size() - 1);
	            }
	        }


	        if (!continuar) {
	            if (esMejor(pesoActual, mejor)) {
	                solucion.clear();
	                solucion.addAll(caminoActual);
	                mejor = pesoActual;
	            }
	        }
	    }

	    private boolean esMejor(Integer actual, Integer mejor) {
	        return mejor == null || actual > mejor;
	    }
}
