package tp5;

import java.util.ArrayList;

public class Casillero {

	private Integer pos;
	private String color;
	private ArrayList<Casillero> adyacentes;
	
	
	public Casillero(int pos,String color) {
		this.pos 		= pos;
		this.color 		= color;
		this.adyacentes = new ArrayList<Casillero>();
	}
	
	
	
	public void agregarAdyacente(Casillero c) {
		this.adyacentes.add(c);
	}
	
	public ArrayList<Casillero> getAyacentes(){
		return this.adyacentes;
	}
	
	
	public void marcarVisitado() {
		this.color = "Rojo";
	}
	
	public void desmarcarVisitado() {
		this.color = "Amarillo";
	}
	
	public String getColor() {
		return this.color;
	}
	
	@Override
	public String toString() {
		return ""+this.pos+"";
	}
	
}
