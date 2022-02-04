package web01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementoByTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		/*WebElement inputSearch = driver.findElement(By.id("search_query_top"));
		WebElement buttonSearch = driver.findElement(By.name("submit_search"));
		WebElement shopPhoneClass = driver.findElement(By.className("shop-phone"));
		WebElement listTag= driver.findElement(By.tagName("ul"));*/
		
		
		WebElement text = driver.findElement(By.xpath("//div//span[contains(text(),'Free')]"));
		WebElement spanTag = driver.findElement(By.xpath("//span[*]"));
		WebElement listBestsellers = driver.findElement(By.xpath("//ul[@id='blockbestsellers']"));
		
		driver.quit();

	}

}
