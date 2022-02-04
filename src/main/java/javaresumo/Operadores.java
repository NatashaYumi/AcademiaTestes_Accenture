package javaresumo;

public class Operadores {

	public static void main(String[] args) {
		/*
		// variáveis de tipo primitivo
		// tipo, nome da variavel, atribuição e valor
		byte b = 23; // até 127 funciona
		char c = 'F'; //'aspas simples para um caractere'
		short s = 65;
		// mais utilizadas em testes
		int i = 56;
		double d = 65.55;
		boolean isTrue = true;
		
		int numero01 = 5;
		int numero02 = 10;
		
		int numero03 = numero01 + numero02;
		System.out.println(numero03);
		
		int numero04 = numero01 - numero02;
		System.out.println(numero04);	
		
		System.out.println(3*2);
		System.out.println(4/2);
		System.out.println(4%2);
		
		int numero = 10;
		System.out.println(numero==10);
		System.out.println(numero!=10);
		System.out.println(numero> 20);
		System.out.println(numero>=20);
		System.out.println(numero<20);
		System.out.println(numero<=20);
		*/
		int x = 5;
		int y = 6;
		int z = 8;
		
		boolean exp01 = ((x<y) || (z>y));
		System.out.println(exp01);
		
		boolean exp02 = ((x<y) || (z<y));
		System.out.println(exp02);
	}

}
