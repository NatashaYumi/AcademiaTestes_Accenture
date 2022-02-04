package web01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class HelloDriver {

	public static void main(String[] args) {
		
		// Instanciando objeto do tipo WebDriver
		WebDriver driver = new ChromeDriver();
		
		/* 
		 * Para usar EDGE, caso não esteja com as configurações de variáveis do sistema
		 * System.setProperty("webdriver.edge.driver","c:/drivers/msedgedriver.exe");
		 * WebDriver driver02 = new EdgeDriver();
		 * */
		
		// Utiliza o método "GET" do objeto instanciado para abrir uma url 
		driver.get("http://automationpractice.com/index.php");
		
		String text = driver.getTitle(); // Declarando variável text e atribuindo a ela o <title> da página chamada em l20
		System.out.println(text); // Exibindo o valor da variável text
		System.out.println(driver.getCurrentUrl()); // Exibe a url da página aberta
		
		// MÉTODOS DA CLASSE WEBDRIVER
		
		// MANAGE
		driver.manage().window().maximize(); // maximiza a janela do navegador 
		driver.manage().deleteAllCookies(); // limpa todos os cookies do navegador
		
		// NAVIGATE, métodos para navegação
		// validar histórico, avançar, atualizar, etc
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php"); // igual ao driver.get()
		driver.navigate().back();
		driver.navigate().refresh(); // atualiza a página (F5)
		driver.navigate().forward();
		
		driver.close(); //fecha a aba atual 
		driver.quit(); // fecha a janela do navegador
		
		/*Código do exercício
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.quit();*/
		
	}

}
