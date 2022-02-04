package javaresumo;

public class ExercicioPratico {

	public static void main(String[] args) {
		
		int num = 10;
		
		System.out.println("Sucessor:"+ (num+1));
		System.out.println("Antecessor:"+ (num-1));
		
		
		String nomes = "Adriano;Roberto;Paulo";
		String[] arraySplit = nomes.split(";");
		
		for (int i=0; i<arraySplit.length; i++) {
		System.out.println(arraySplit[i].replace((arraySplit[i].charAt(arraySplit[i].length()-1)),'a'));
		}

		// correção
		String nomes2 = "Adriano;Roberto;Paulo";
		String[] arraySplit2 = nomes2.split(";");
		
		System.out.println(arraySplit2[0].substring(0, arraySplit[0].length()-1)+"a");
	}

}
