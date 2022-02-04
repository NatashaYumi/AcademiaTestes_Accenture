package javaresumo;

public class Animal {

	private double peso;
	private String habitat;
	
	public Animal() {

	}
	
	public Animal(double peso, String habitat) {
		this.peso = peso;
		this.habitat = habitat;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void printInfo() {
		System.out.println("Animal tem peso: " + getPeso() + " e seu habitat �: " + getHabitat());
	}
	
	public void comunicar() {
		System.out.println("Animal est� se comunicando");
	}
	
	public void comer() {
		System.out.println("Animal est� comendo");
	}
	
	// static n�o precisa do objeto pra ser chamado
	public static void descricao() {
		System.out.println("Reino biol�gico composto por seres vivos... com capacidade de responder ao");
	}
}
