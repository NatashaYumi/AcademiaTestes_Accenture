package web02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioPraticoRadioCheck {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		
		WebElement emailCreateInput = driver.findElement(By.id("email_create"));
		emailCreateInput.sendKeys("teste555555555501@gmail.com");
		emailCreateInput.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='Adrina';", driver.findElement(By.id("customer_firstname")));
		js.executeScript("arguments[0].click();", driver.findElement(By.id("id_gender2")));
		js.executeScript("arguments[0].checked=true;", driver.findElement(By.id("uniform-newsletter")));
		
	
		driver.quit();
	}

}
