package web04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExercicioPraticoActions2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		Actions actions = new Actions(driver);
		
		WebElement draggableDiv = driver.findElement(By.id("draggable"));
		WebElement droppableDiv = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(draggableDiv, droppableDiv).perform();
		
		actions.doubleClick(driver.findElement(By.id("double-click"))).perform();
		
		WebElement hoverSecondButton =driver.findElement(By.xpath("//button[text()='Hover Over Me Second!']")); 
		actions.moveToElement(hoverSecondButton).perform();
		actions.click(driver.findElement(By.linkText("Link 1"))).perform();
		driver.switchTo().alert().accept();
		
		actions.clickAndHold(driver.findElement(By.id("click-box"))).perform();
		actions.release().perform();
	}

}
