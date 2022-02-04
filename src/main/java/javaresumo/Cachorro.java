package javaresumo;

public class Cachorro extends Animal{

	private String nome;
	private String raca;
	
	public Cachorro() {

	}
		
	public Cachorro(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public Cachorro(double peso, String habitat, String nome, String raca) {
		super(peso, habitat);
		this.nome = nome;
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void comunicar() {
		System.out.println("Animal está se latindo");
	}
	
	@Override
	public void comer() {
		System.out.println("Animal está comendo racao");
	}
	
	public void brincar(Bola bola) {
		System.out.println("animal esta brincando com " + bola);
	}
	
	public void brincar(Osso osso) {
		System.out.println("animal esta brincando com " + osso);
	}
	
	
}
