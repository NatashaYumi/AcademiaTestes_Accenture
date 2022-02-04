package web04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExercicioPraticoActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		Actions actions = new Actions(driver);
		
		WebElement searchInput = driver.findElement(By.id("search_query_top"));
		actions.sendKeys(searchInput, "dress").perform();
		actions.sendKeys(Keys.ENTER).perform();
		
		WebElement linkFooter = driver.findElement(By.linkText("Ecommerce software by PrestaShop™"));
		actions.moveToElement(linkFooter).perform();
		
		driver.quit();

	}

}
