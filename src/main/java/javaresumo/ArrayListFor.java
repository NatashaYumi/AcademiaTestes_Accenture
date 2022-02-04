package javaresumo;

import java.util.ArrayList;

public class ArrayListFor {

	public static void main(String[] args) {
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("Elemento01");
		elementos.add("Elmento02");
		elementos.add("Elemento03");
		elementos.add("Elemento04");
		for (int i=0; i < elementos.size(); i++) {
			System.out.println(elementos.get(i));
			System.out.println(elementos.get(i).length());
		}
		System.out.println();
		
		String produto = "Plano TV 4k Combo";
		if(produto.contains("TV") && produto.contains("Combo")) {
            System.out.println("Contém TV e Combo");
        }
	}

}
