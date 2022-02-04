package web05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExercicioPraticoExplicityWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");

		
		driver.findElement(By.id("alert")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		Alert alert  = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		driver.findElement(By.id("populate-text")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("h2"),"Selenium Webdriver"));
		System.out.println(driver.findElement(By.id("h2")).getText());
	
		driver.findElement(By.id("display-other-button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
		System.out.println(driver.findElement(By.id("hidden")).isDisplayed());
		
		driver.quit();
	}

}
