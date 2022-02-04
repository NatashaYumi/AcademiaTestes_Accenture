package web02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckTeste01 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
		
		
		driver.findElement(By.linkText("Camper")).click();
		driver.findElement(By.name("Enter Insurant Data")).click();
		
		WebElement elementRadio = driver.findElement(By.id("genderfemale"));
		boolean isSelected = elementRadio.isSelected();
		boolean isEnabled = elementRadio.isEnabled();
		boolean isDisplayed = elementRadio.isDisplayed();
		
		System.out.println(isSelected +" " + isEnabled + " " + isDisplayed);
		
		// neste caso usou o xpath pq o label nao tinha id
		// selecionando "female" no radio button
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		
		System.out.println(elementRadio.isSelected());
		
		// preenchendo o checkbox
		driver.findElement(By.xpath("//label[text()=' Bungee Jumping']")).click();
		driver.findElement(By.xpath("//label[text()=' Speeding']")).click();
		driver.findElement(By.xpath("//label[text()=' ']")).click();
		
		driver.quit();
		
		
	}

}
