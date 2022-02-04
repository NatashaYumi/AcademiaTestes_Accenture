package web04;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcoesTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/sortable");
		
		Actions actions = new Actions(driver);
		
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		WebElement elementFive = driver.findElement(By.xpath("//div[@id='demo-tabpane-list']//div[text()='Five']"));
		WebElement elementOne = driver.findElement(By.xpath("//div[@id='demo-tabpane-list']//div[text()='One']"));
		
		
		actions.dragAndDrop(elementFive, elementOne).perform();
		
		driver.quit();
	}
	
	public static void teste01() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		
		// Utilizando a classe ACTIONS
		Actions actions = new Actions(driver);
		WebElement element01 = driver.findElement(By.id("cylindercapacity"));
		actions.sendKeys(element01, "100").perform(); // action precisa chamar perform
		actions.contextClick().perform();
		
		WebElement element02 = driver.findElement(By.id("engineperformance"));
		actions.keyDown(element02, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		

		driver.quit();
	}
	
	public static void teste02() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/index.html");
		
		Actions actions = new Actions(driver);
		List<WebElement> listProdutos = driver.findElements(By.className("hrefch"));
		for (int i = 0; i < listProdutos.size(); i++) {
			actions.moveToElement(listProdutos.get(i)).perform();
		}
		
		WebElement teste = driver.findElement(By.xpath("//p[text()='Copyright © Product Store 2017']"));
		actions.moveToElement(teste).perform();
		
		driver.quit();
	}
	
	public static void teste03() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		
		Actions actions = new Actions(driver);
		WebElement element01 = driver.findElement(By.id("cylindercapacity"));
		actions.sendKeys(element01, "100").perform();
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
		
		driver.quit();
		
	}
	
	public static void teste04() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		
		Actions actions = new Actions(driver);
		WebElement element01 = driver.findElement(By.id("cylindercapacity"));
		actions.sendKeys(element01, "100").perform();
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		WebElement element02 = driver.findElement(By.id("engineperformance"));
		actions.contextClick().perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		driver.quit();
	}

}


