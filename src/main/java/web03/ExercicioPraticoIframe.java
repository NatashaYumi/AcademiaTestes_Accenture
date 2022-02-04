package web03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioPraticoIframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		//acessa o frame 
		driver.switchTo().frame(0);
		
		// acessa atributo de um objeto que está dentro do frame
		System.out.println(driver.findElement(By.id("meta_referrer")).getAttribute("name"));
		System.out.println(driver.findElement(By.id("facebook")).getAttribute("class"));
		
		driver.switchTo().defaultContent();
		driver.findElement(By.className("login")).click();
		
	}

}
