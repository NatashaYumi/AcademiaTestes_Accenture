package web05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExemplos {

	/*
	 * A Espera Implícita direciona o Selenium WebDriver para aguardar uma determinada medida 
	 * de tempo antes de lançar uma exceção. Uma vez definido esse tempo, o WebDriver aguardará 
	 * o elemento antes que a exceção ocorra.
	 * Depois que o comando estiver em vigor, a Espera Implícita permanece em vigor durante todo 
	 * o período em que o navegador estiver aberto. Sua configuração padrão é 0 e o tempo de 
	 * espera específico precisa ser definido pelo protocolo a seguir.
	 *
	 */
	
	/*
	 * Ao usar o comando Explicit Wait, o WebDriver é direcionado a aguardar até que uma 
	 * determinada condição ocorra antes de prosseguir com a execução do código.
	 * Definir Espera Explícita é importante nos casos em que há certos elementos que 
	 * naturalmente levam mais tempo para carregar. Se alguém definir um comando de espera 
	 * implícito, o navegador aguardará o mesmo período de tempo antes de carregar cada 
	 * elemento da web. Isso causa um atraso desnecessário na execução do script de teste.
	 * A espera explícita é mais inteligente, mas só pode ser aplicada a elementos especificados. 
	 * No entanto, é uma melhoria na espera implícita, pois permite que o programa faça uma 
	 * pausa para elementos Ajax carregados dinamicamente.
	 */
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultvb.aspx");

		WebDriverWait wait = new WebDriverWait(driver,40);
		driver.findElement(By.xpath("//div[@class='calendarContainer']//a[text()='11']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("ctl00_ContentPlaceholder1_Label1"), "No Selected Dates to display."));
		
		driver.quit();
		
	}
	
	public static void visible() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		By byPesquisa = By.name("q");
		//By byPesquisaXpath = By.xpath("//a");
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.presenceOfElementLocated(byPesquisa));
		
		WebElement element = driver.findElement(byPesquisa);
		element.sendKeys("Java");
		element.sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Java | Oracle']")));
		driver.findElement(By.xpath("//h3[text()='Java | Oracle']")).click();
		
		driver.quit();
	}
	
	public static void alertaExemplo() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 12);
		Alert alert  = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		// equivalente a 
		///driver.switchTo().alert().accept();
		
		driver.quit();
	}
	
	public static void atributo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/exercise_5_2.html");
		driver.findElement(By.id("runTestButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 12);
		wait.until(ExpectedConditions.attributeContains(By.id("runTestButton"),"disable", "true"));
		System.out.println(driver.findElement(By.id("runTestButton")).getAttribute("disabled"));
		driver.quit();
	}
	
	public static void tituloDaPagina() {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/activity_5_B-1.html");
		
		driver.findElement(By.id("runTestButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.titleIs("Explicit wait teste has been run"));
		// busca por titulo contém
		//wait.until(ExpectedConditions.titleContains("Explicit wait"));
		System.out.println(driver.getTitle());		
		driver.quit();
	}
	
	public static void WaitImplicito() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // global, toda vez que chamar o objeto vai esperar 20 segundos
		driver.get(null);
		driver.findElement(null);
		driver.quit();
		
	}

	public static void WaitExplicito() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='CLICK ME!']")));
		driver.findElement(By.xpath("//p[text()='CLICK ME!']")).click();
		//ou
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='CLICK ME!']")));
		element.click();
		
	}
}
