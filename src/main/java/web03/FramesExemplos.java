package web03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExemplos {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/iframes-test.html");

		System.out.println(driver.findElement(By.className("explanation")).getText());
		
		// Troco para o frame
		driver.switchTo().frame(0);
		WebElement elementInFrame = driver.findElement(By.id("iframe1"));
		System.out.println(elementInFrame.getText());
		
		// Volta para o conteudo principal
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.className("explanation")).getText());

		driver.switchTo().frame("theheaderhtml");
		System.out.println(driver.findElement(By.className("explanation")).getText());
		driver.switchTo().defaultContent();
		
		WebElement frameExemplo = driver.findElement(By.id("thedynamichtml"));
		driver.switchTo().frame(frameExemplo);
		System.out.println(driver.findElement(By.id("iframe3")).getText());
	}
}