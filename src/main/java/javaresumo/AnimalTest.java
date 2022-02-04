package javaresumo;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animalDesconhecido01 = new Animal(); // instancia a classe animal a partir de um construtor vazio
		//animal1.habitat = "cerrado"; // errado, encapsulamento
		Animal animalDesconhecido02 = new Animal(45, "cerrado");
		animalDesconhecido02.printInfo();
		
		animalDesconhecido02.comer();
		animalDesconhecido02.comunicar();
		
		Animal.descricao();
		
		Cachorro mel = new Cachorro();
		System.out.println();
		
		Cachorro tob = new Cachorro(12.4, "Fazenda", "Tob", "poodle");
		tob.comer();
		tob.comunicar();
		
		}

}
