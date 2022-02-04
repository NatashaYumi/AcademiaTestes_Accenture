package web03;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JanelasExemplo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		
		//Obtem o identficador da aba e imprime, aqui guardar na variável pois vamos voltar para
		// esta será a primeira aba que foi aberta no site http://sampleapp.tricentis.com/101/index.php
		String getHandle = driver.getWindowHandle();
		System.out.println(getHandle);
		driver.findElement(By.id("downloadtrial")).click();

		//Obetem todos os identificadores de janelas abertas, neste caso só terão duas
		ArrayList<String> handlesList = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(handlesList.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("Email")).sendKeys("teste@teste.com");
		
		//driver.switchTo().window(getHandle);
		driver.switchTo().window(handlesList.get(0));
		System.out.println(driver.getTitle());
		
		
	}

}
