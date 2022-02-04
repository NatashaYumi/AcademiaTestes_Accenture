package web02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElem01Teste {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
		
		WebElement elemento01 = driver.findElement(By.id("nav_camper"));
		String textRetorno = elemento01.getText();
		System.out.println(textRetorno);
		
		elemento01.click();
		
		WebElement element = driver.findElement(By.id("engineperformance"));
		element.sendKeys("9884"); // preenche com o valor 9884 dentro do input com id engineperformance
		element.clear(); // limpa o campo
		element.sendKeys("1122"); //preenche o campo com  o valor 1122 
		
		System.out.println(element.getAttribute("value")); // retorna 1122
		System.out.println(element.getAttribute("id")); // retorna engineperformance
		
		driver.quit();

	}

}
