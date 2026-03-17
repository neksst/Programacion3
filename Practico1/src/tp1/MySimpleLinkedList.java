package tp1;

import java.util.Iterator;

public class MySimpleLinkedList<T> implements Iterable<T>{
	
	private Node<T> first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size  = 0;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
	}
	
	public T extractFront() {		
		if (this.first == null) return null;
		T info = this.first.getInfo();
		this.first = this.first.getNext();
		this.size--;
		return info;
	}

	public boolean isEmpty() {
		return this.first == null;
	}
	
	public T get(int index) {
		if(index < 0 || index > this.size) return null;
		Node<T> node = this.first;
		int idx = 0;
		while(idx < index) {
			node = node.getNext();
			idx++;
		}
		return node.getInfo();
		
	}
	
	public int indexOf(T data) {
		Node<T> nodo = this.first;
		int idx = 0;
		while(nodo != null) {
			if(nodo.getInfo().equals(data)) return idx;
			idx++;
			nodo = nodo.getNext();
		}
		return -1;
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
	    String s = "[";
	    Node<T> node = this.first;

	    while (node != null) {
	        s += node.getInfo();
	        node = node.getNext();
	        if (node != null) s += ", ";
	    }

	    s += "]";
	    return s;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator<>(this.first);
	}
	
}
