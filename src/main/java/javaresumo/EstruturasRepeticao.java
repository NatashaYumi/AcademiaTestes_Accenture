package javaresumo;

import java.util.ArrayList;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		
		// WHILE - imprimir de 0a 4
		int cont = 0;
		while(cont<5) {
			System.out.println("Valor de cont: " + cont);
			cont = cont +1;
		}
		System.out.println();

		// DO WHILE
		int cont2 = 4;
		do {
			System.out.println("Valor de cont2: "+ cont2);
			cont2 = cont2 +1;
		} while(cont2 <= 10);
		System.out.println();
		
		// FOR
		for (int i=0; i<7; i++) {
			System.out.println("Valor de i: " + i);
		}
		System.out.println();
		
		// FOR - imprimindo na vertical
		String hello = "Hello Java";
		for (int i = 0; i < hello.length(); i++) {
			System.out.println(hello.charAt(i));
		}
		System.out.println();
		
		// FOR - ARRAY
		int arr[] = {2,11,45,9};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		// FOR - ARRAYLIST
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Rodrigo");
		nomes.add("Paulo");
		nomes.add("Marcos");
		nomes.add("Alexandre");
		for (int i=0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println();
		
		// FOR BREAK
		
		int[] numeros2 = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		boolean achouNumero = false;
		for (int i=0; i < numeros2.length; i++) {
			if (numeros2[i] == 10) {
				System.out.println("Achou numero 10");
				achouNumero = true;
				break;
			}
		}
		
		// FOR CONTINUE
		String[] palavrasArray = {"","","","",""};
		for (int i=0; i< palavrasArray.length; i++) {
			if (palavrasArray[i].startsWith("B")) {
				
			}
		}
		
	}

}
