package web02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExercicioPraticoSeletor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		
		WebElement emailCreateInput = driver.findElement(By.id("email_create"));
		emailCreateInput.sendKeys("teste555555555501@gmail.com");
		emailCreateInput.sendKeys(Keys.ENTER);

		WebElement element = driver.findElement(By.id("days"));
		Select seletorDays = new Select(element);
		seletorDays.selectByIndex(13);
		
		List<WebElement> elementosDaysList = seletorDays.getOptions();
		for(int i=0; i<elementosDaysList.size(); i++) {
			System.out.println(elementosDaysList.get(i).getText());
		}
		
		WebElement elementoOption = seletorDays.getFirstSelectedOption();
		System.out.println("Valor do seletor preenchido: "+ elementoOption.getText());
		
		driver.quit();

	}

}
