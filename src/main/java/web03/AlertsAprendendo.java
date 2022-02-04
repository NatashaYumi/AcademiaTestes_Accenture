package web03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAprendendo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		WebElement alertConfirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		WebElement alertPromptButton = driver.findElement(By.xpath("//button[text=()='Click for JS Prompt']"));
		
		alertButton.click();
		Alert alert01 = driver.switchTo().alert();
		System.out.println(alert01.getText());
		alert01.accept();
		
		alertConfirmButton.click();
		driver.switchTo().alert().dismiss();
		
		alertPromptButton.click();
		Alert alert03 = driver.switchTo().alert();
		System.out.println(alert03.getText());
		alert03.sendKeys("Ola alerta");
		alert03.accept();
		
	}

}
