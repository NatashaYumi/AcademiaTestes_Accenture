package javaresumo;

public class ArraysExp {

	public static void main(String[] args) {
		
		char[]	arrayChar 		= {'a','b','c','d','e','f','g'};
		String 	arrayString[] 	= {"Ricardo","Roberto","Paula"};
		char[] 	arrayVar 		= new char[2];
		int[] 	numeros 		= {1,3,5,6,7};
		int 	n1[] 			= {5,6,7};
		
		arrayString[0] = "Hugo";
		System.out.println(arrayString[0]);
		
		// SPLIT
		String dados = "30MB;100MB;300MB";
		String[] arraySplit = dados.split(";");
		System.out.println(arraySplit.length);
		System.out.println(arraySplit[1]);
		
	}

}
