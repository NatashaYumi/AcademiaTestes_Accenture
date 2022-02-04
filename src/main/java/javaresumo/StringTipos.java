package javaresumo;

public class StringTipos {

	public static void main(String[] args) {
		
		String s1 = "Hello Java";
		String s2 = "Java";
		String s3 = new String("Aqui string");
		
		System.out.println(s2.length());
		System.out.println(s2.charAt(0));
		System.out.println(s1.equals(s2));
		System.out.println(s1.contains(s2));
		
		// Validar se começa com H
		System.out.println(s1.startsWith("H"));
		
		// SUBSTRING
		System.out.println(s1.substring(0,5));
		
		System.out.println(s1.substring(s1.length()-1));
		
		// REPLACE
		String tel = "81-987518043";
		String telSomenteNumeros = tel.replace("-","");
		System.out.println(telSomenteNumeros);
		
		// TRIM, UPPERCASE, LOWCASE
		String campo = "    Teste    ";
		campo = campo.trim();
		System.out.println(campo);
		System.out.println(campo.toUpperCase());
		System.out.println(campo.toLowerCase());
	}

}
