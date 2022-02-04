package web02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropsWeb {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
		
		
		// Seleciona a opção a partir do index
		WebElement element = driver.findElement(By.id("make"));
		Select seletorMake = new Select(element);
		seletorMake.selectByIndex(1); // seleciona a primeira opção com value "Audi"
		
		// Seleciona a opção a partir do value
		Select seletorModelo = new Select(driver.findElement(By.id("model"))); 
		seletorModelo.selectByValue("Moped");
		
		//Seleciona a opção a partir do texto
		Select seletorA = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
		seletorA.selectByVisibleText("3");
		
		// Retorna o elemento primeiro selecionado
		WebElement elementoOption = seletorMake.getFirstSelectedOption();
		System.out.println(elementoOption.getText());
		
		// Retorna todas as opções do seletor
		List<WebElement> elementosMakeList = seletorMake.getOptions();
		System.out.println(elementosMakeList.size());
		
		for(int i=0; i<elementosMakeList.size(); i++) {
			System.out.println(elementosMakeList.get(i).getText());
		}
		
		// Retorna a opção selecionada
		
		driver.quit();
		

	}

}
