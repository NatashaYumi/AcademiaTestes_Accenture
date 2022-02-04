package web01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Localizadores {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		
		// MÉTODOS PARA MAPEAMENTO DE OBJETOS
		
		// BY ID
		WebElement requestButton = driver.findElement(By.id("downloadtrial"));
		
		WebElement autoMobileLink = driver.findElement(By.id("nav_automobile"));
		
		// BY NAME
		WebElement searchInput = driver.findElement(By.name("Search Support"));
		
		WebElement menuMotoLink = driver.findElement(By.name("Navigation Motorcycle"));
		
		// BY CLASS
		WebElement containerClass = driver.findElement(By.className("container"));
		
		List<WebElement> itensMenuList = driver.findElements(By.className("menu-item"));
		System.out.println(itensMenuList.size());
		
		// BY LINK
		WebElement linkMoto = driver.findElement(By.linkText("Motorcycle"));
		WebElement requestDemoLink = driver.findElement(By.partialLinkText("Request"));
		
		// BY TAG
		WebElement  tagsA= driver.findElement(By.tagName("a")); // Pega somente a primeira ocorrência da tag "a"
		List<WebElement> tagsList = driver.findElements(By.tagName("a")); // Pega todas as ocorrências da tag e coloca dentro do list
		
		// BY CSS SELECTOR
		WebElement botaoSearch = driver.findElement(By.cssSelector("#search_form")); // usar # para pegar o id
		
		//BY XPATH, pode ser utilizado mesmo não tendo os localizadores(id, name, etc)
		// quando for colocar o parâmetro, não utilizar xpath fornecido na pagina
		WebElement download = driver.findElement(By.xpath("//a[@title='Download Trial']"));
		
		
		driver.quit();

	}

}
