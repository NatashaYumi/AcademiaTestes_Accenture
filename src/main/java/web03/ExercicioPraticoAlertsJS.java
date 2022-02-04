package web03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercicioPraticoAlertsJS {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		//WebElement showConfirmButton = driver.findElement(By.id("confirmexample"));
		//showConfirmButton.click();
		// as duas linhas anteriores podem ser substituidas por 
		driver.findElement(By.id("confirmexample")).click();
		Alert alertShowConfirm = driver.switchTo().alert();
		System.out.println(alertShowConfirm.getText());
		alertShowConfirm.dismiss();
		
		//WebElement showPromptButton = driver.findElement(By.id("promptexample"));
		//showPromptButton.click();
		driver.findElement(By.id("promptexample")).click();
		Alert alertPromptBox = driver.switchTo().alert();
		alertPromptBox.sendKeys("Preenchendo o prompt");
		alertPromptBox.accept();
		
	}

}
