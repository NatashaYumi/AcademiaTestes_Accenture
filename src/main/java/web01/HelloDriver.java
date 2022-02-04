package web01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class HelloDriver {

	public static void main(String[] args) {
		
		// Instanciando objeto do tipo WebDriver
		WebDriver driver = new ChromeDriver();
		
		/* 
		 * Para usar EDGE, caso n�o esteja com as configura��es de vari�veis do sistema
		 * System.setProperty("webdriver.edge.driver","c:/drivers/msedgedriver.exe");
		 * WebDriver driver02 = new EdgeDriver();
		 * */
		
		// Utiliza o m�todo "GET" do objeto instanciado para abrir uma url 
		driver.get("http://automationpractice.com/index.php");
		
		String text = driver.getTitle(); // Declarando vari�vel text e atribuindo a ela o <title> da p�gina chamada em l20
		System.out.println(text); // Exibindo o valor da vari�vel text
		System.out.println(driver.getCurrentUrl()); // Exibe a url da p�gina aberta
		
		// M�TODOS DA CLASSE WEBDRIVER
		
		// MANAGE
		driver.manage().window().maximize(); // maximiza a janela do navegador 
		driver.manage().deleteAllCookies(); // limpa todos os cookies do navegador
		
		// NAVIGATE, m�todos para navega��o
		// validar hist�rico, avan�ar, atualizar, etc
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php"); // igual ao driver.get()
		driver.navigate().back();
		driver.navigate().refresh(); // atualiza a p�gina (F5)
		driver.navigate().forward();
		
		driver.close(); //fecha a aba atual 
		driver.quit(); // fecha a janela do navegador
		
		/*C�digo do exerc�cio
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.quit();*/
		
	}

}
