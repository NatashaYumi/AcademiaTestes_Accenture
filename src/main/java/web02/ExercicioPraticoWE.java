package web02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioPraticoWE {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
		
		/*// EXEMPLO 1
		WebElement searchInput = driver.findElement(By.id("search_query_top"));
		searchInput.sendKeys("dress"); // preenche o campo de busca com o texto dress
		System.out.println(searchInput.getAttribute("placeholder")); // retorna o valor do atributo "placeholder"
		
		
		WebElement text = driver.findElement(By.id("editorial_image_legend"));
		System.out.println(text.getText());
	
		*/
		
		//EXEMPLO 2 
		//quando nao for usar o retorno, pode chamar direto
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click(); //dessa forma tem que achar o elemento
		
		// EXEMPLO 3
		WebElement element = driver.findElement(By.id("search_query_top"));
		element.clear();
		element.sendKeys("faded");
		element.sendKeys(Keys.ENTER);
				
		
		/*CORREÇÃO LAURA
		 * */
		
		driver.quit();
	}

}
