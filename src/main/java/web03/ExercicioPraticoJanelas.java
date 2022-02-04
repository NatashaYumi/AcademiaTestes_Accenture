package web03;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioPraticoJanelas {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("http://automationpractice.com/index.php");
		
		String getHandle = driver.getWindowHandle();
		System.out.println(getHandle);
		driver.findElement(By.xpath("")).click();

		//Obetem todos os identificadores de janelas abertas, neste caso só terão duas
		ArrayList<String> handlesList = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(handlesList.get(0));
		System.out.println(driver.getTitle());
		

	}

}
