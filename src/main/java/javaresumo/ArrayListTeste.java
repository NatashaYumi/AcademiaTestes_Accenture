package javaresumo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTeste {

	public static void main(String[] args) {
		// ArrayList - ADD
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Rodrigo");
		nomes.add("Paulo");
		nomes.add("Marcos");
		nomes.add("Alexandre");
		System.out.println(nomes.get(3));
		System.out.println(nomes.size());
		
		// ArrayList - REMOVE
		nomes.remove(0);
		nomes.remove("Marcos"); // sobrecarga
		System.out.println(nomes);
		System.out.println();
		
		// ArrayList - CONTAINS
		
		// Retornar de forma ordenada seu arraylist - SORT
		ArrayList<Integer> numerosinteiros = new ArrayList<Integer>();
		numerosinteiros.add(3);
		numerosinteiros.add(78);
		numerosinteiros.add(0);
		numerosinteiros.add(-1);
		Collections.sort(numerosinteiros);
		System.out.println(numerosinteiros);
		System.out.println();
		
		// Index Of
		ArrayList<Character> charArrayList = new ArrayList<Character>();
		charArrayList.add('a');
		charArrayList.add('b');
		charArrayList.add('c');
		int index = charArrayList.indexOf('c');
		System.out.println(index);
		System.out.println();
		
		// ArrayList vazio
		List<String> cursos = new ArrayList<String>();
	    System.out.println(cursos.isEmpty());
		
		
	}

}
