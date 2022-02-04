package javaresumo;

public class TratEx {
	
	public static void main(String[] args) {
		try {
			int [] numeros = {1,3,5};
			System.out.println(numeros[3]);
		} catch (Exception e) {
			System.out.println("Foi encontrado um erro na execução: " + e);
		}
	}

}
