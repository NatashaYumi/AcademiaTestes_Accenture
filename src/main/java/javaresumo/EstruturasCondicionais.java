package javaresumo;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		// IF
		int numero =10;
		if(numero==10) {
			System.out.println("Número igual a 10");
		}
		System.out.println();
		
		// IF + IF
		String palavra="CAVALO";
		if(palavra.startsWith("C")) {
			System.out.println("A palavra começa com C");
		}
		if(palavra.endsWith("O")) {
			System.out.println("A palavra começa com O");
		}
		System.out.println();
		
		// IF + ELSE
		if("cachorro".equals("gato")) {
			System.out.println("As palavras são iguais");
		}
		else {
			System.out.println("As palavras são diferentes");
		}
		System.out.println();
		
		//IF + ELSE IF + ELSE
		int horario = 16;
		if (horario<12) {
			System.out.println("Bom dia");
		} else if (horario >=12 && horario < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		System.out.println();
		
		// SWITCH
		int numero3 = 50;
		String operacao = "multiplicacao";
		switch(operacao) {
		case "divisao":
			numero3 = numero3 / 2;
			break;
		case "multiplicacao":
			numero3 = numero3 * 2;
			break;
		case "soma":
			numero3 = numero3 + 2;
			break;
		default:
			System.out.println("Operação não encontrada");
		}
		System.out.println("Valor numero3: " + numero3);
		System.out.println();
		
		//
		String diaSemanaString = "Sexta";
		String tipoDia = null;
		switch(diaSemanaString) {
		case "Segunda":
			System.out.println("Início da semana de trabalho");
			break;
		case "Terca":
		case "Quarta":
		case "Quinta":
			break;
		case "Sexta":
			break;
		default:
			System.out.println();
		}
	}

}
