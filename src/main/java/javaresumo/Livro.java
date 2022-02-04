package javaresumo;

public class Livro {
	private String titulo;
	private String Autor;
	
	
	public Livro() {
	}
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		Autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	
	public void printInfo() {
		System.out.println("O livro com título: " + getTitulo() + " foi escrito por: " + getAutor());
	}
	
	
}
