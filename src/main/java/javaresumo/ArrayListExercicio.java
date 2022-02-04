package javaresumo;

import java.util.ArrayList;

public class ArrayListExercicio {

	public static void main(String[] args) {
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("Elemento1");
		elementos.add("Elemento2");
		elementos.add("Elemento3");
		elementos.add("Elemento4");
		
		elementos.remove(2);
		System.out.println(elementos.size());
		System.out.println(elementos.get(0));
		System.out.println(elementos.get(elementos.size()-1));
	}

}
