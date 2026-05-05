package tp5;

import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class GrafoDirigido<T> implements Grafo<T> {

    private HashMap<Integer, HashMap<Integer, Arco<T>>> grafo;
    private int cantidadArcos;

    public GrafoDirigido() {
        this.grafo = new HashMap<>();
        this.cantidadArcos = 0;
    }

    @Override
    public void agregarVertice(int verticeId) {
        grafo.putIfAbsent(verticeId, new HashMap<>());
    }

    @Override
    public void borrarVertice(int verticeId) {
        if (!grafo.containsKey(verticeId)) return;

        // eliminar arcos que apuntan a este vértice
        for (Integer v : grafo.keySet()) {
            if (grafo.get(v).remove(verticeId) != null) {
                cantidadArcos--;
            }
        }

        // eliminar sus arcos salientes
        cantidadArcos -= grafo.get(verticeId).size();

        grafo.remove(verticeId);
    }

    @Override
    public void agregarArco(int v1, int v2, T etiqueta) {
        if (!grafo.containsKey(v1) || !grafo.containsKey(v2)) return;

        HashMap<Integer, Arco<T>> ady = grafo.get(v1);

        if (!ady.containsKey(v2)) {
            cantidadArcos++;
        }

        ady.put(v2, new Arco<>(v1, v2, etiqueta));
    }

    @Override
    public void borrarArco(int v1, int v2) {
        if (grafo.containsKey(v1) && grafo.get(v1).remove(v2) != null) {
            cantidadArcos--;
        }
    }

    @Override
    public boolean contieneVertice(int verticeId) {
        return grafo.containsKey(verticeId);
    }

    @Override
    public boolean existeArco(int v1, int v2) {
        return grafo.containsKey(v1) && grafo.get(v1).containsKey(v2);
    }

    @Override
    public Arco<T> obtenerArco(int v1, int v2) {
        if (!existeArco(v1, v2)) return null;
        return grafo.get(v1).get(v2);
    }

    @Override
    public int cantidadVertices() {
        return grafo.size();
    }

    @Override
    public int cantidadArcos() {
        return cantidadArcos;
    }

    @Override
    public Iterator<Integer> obtenerVertices() {
        return grafo.keySet().iterator();
    }

    @Override
    public Iterator<Integer> obtenerAdyacentes(int v) {
        if (!grafo.containsKey(v)) return Collections.emptyIterator();
        return grafo.get(v).keySet().iterator();
    }

    @Override
    public Iterator<Arco<T>> obtenerArcos() {
        ArrayList<Arco<T>> lista = new ArrayList<>();

        for (HashMap<Integer, Arco<T>> ady : grafo.values()) {
            lista.addAll(ady.values());
        }

        return lista.iterator();
    }

    @Override
    public Iterator<Arco<T>> obtenerArcos(int v) {
        if (!grafo.containsKey(v)) return Collections.emptyIterator();
        return grafo.get(v).values().iterator();
    }
}