package tp5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		Casillero c1 = new Casillero(1,"Amarillo");
		Casillero c2 = new Casillero(2,"Amarillo");
		Casillero c3 = new Casillero(3,"Amarillo");
		Casillero c4 = new Casillero(4,"Verde");
		Casillero c5 = new Casillero(5,"Amarillo");
		Casillero c6 = new Casillero(6,"Amarillo");
		Casillero c7 = new Casillero(7,"Amarillo");
		Casillero c8 = new Casillero(8,"Verde");
		Casillero c9 = new Casillero(9,"Verde");
		Casillero c10 = new Casillero(10,"Amarillo");
		Casillero c11 = new Casillero(11,"Amarillo");
		Casillero c12 = new Casillero(12,"Verde");
		Casillero c13 = new Casillero(13,"Verde");
		Casillero c14 = new Casillero(14,"Verde");
		Casillero c15 = new Casillero(15,"Verde");
		Casillero c16 = new Casillero(17,"Amarillo");
		
		c1.agregarAdyacente(c2);
		c1.agregarAdyacente(c5);
		
		c2.agregarAdyacente(c1);
		c2.agregarAdyacente(c3);
		c2.agregarAdyacente(c6);
		
		c3.agregarAdyacente(c2);
		c3.agregarAdyacente(c4);
		c3.agregarAdyacente(c7);
		
		c4.agregarAdyacente(c3);
		c4.agregarAdyacente(c8);
		
		c5.agregarAdyacente(c1);
		c5.agregarAdyacente(c6);
		c5.agregarAdyacente(c9);
		
		c6.agregarAdyacente(c2);
		c6.agregarAdyacente(c5);
		c6.agregarAdyacente(c7);
		c6.agregarAdyacente(c10);
		
		c7.agregarAdyacente(c3);
		c7.agregarAdyacente(c6);
		c7.agregarAdyacente(c8);
		c7.agregarAdyacente(c11);
		
		c8.agregarAdyacente(c4);
		c8.agregarAdyacente(c7);
		c8.agregarAdyacente(c12);
		
		c9.agregarAdyacente(c5);
		c9.agregarAdyacente(c10);
		c9.agregarAdyacente(c13);
		
		c10.agregarAdyacente(c6);
		c10.agregarAdyacente(c9);
		c10.agregarAdyacente(c14);
		c10.agregarAdyacente(c11);
		
		c11.agregarAdyacente(c7);
		c11.agregarAdyacente(c10);
		c11.agregarAdyacente(c15);
		c11.agregarAdyacente(c12);
		
		c12.agregarAdyacente(c8);
		c12.agregarAdyacente(c11);
		c12.agregarAdyacente(c16);
		
		c13.agregarAdyacente(c9);
		c13.agregarAdyacente(c14);
		
		c14.agregarAdyacente(c10);
		c14.agregarAdyacente(c13);
		c14.agregarAdyacente(c15);
		
		c15.agregarAdyacente(c11);
		c15.agregarAdyacente(c14);
		c15.agregarAdyacente(c16);
		
		c16.agregarAdyacente(c12);
		c16.agregarAdyacente(c15);
		
		
		Punto6 p = new Punto6();
		System.out.println(p.buscarCaminos(c9, 8));
	}

}
