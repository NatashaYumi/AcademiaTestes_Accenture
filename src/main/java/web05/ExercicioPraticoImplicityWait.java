package web05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioPraticoImplicityWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("http://automationpractice.com/index.php");
		
		System.out.println(driver.findElement(By.id("editorial_image_legend")).getText());
		
		driver.quit();
		
	}

}
