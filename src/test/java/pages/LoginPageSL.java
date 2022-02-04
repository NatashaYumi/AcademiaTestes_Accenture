package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSL {

	
	private WebDriver driver;
	
	@FindBy(id="user-name")
	private WebElement userInput;
	
	@FindBy(id = "password")
	private WebElement passInput;
	
	@FindBy (id = "login-button")
	private WebElement loginButton;
	
	public LoginPageSL(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	} 
	
	public void preencherLogin(String usuario, String pass) {
		userInput.sendKeys(usuario);
		passInput.sendKeys(pass);
	}
	
	public void realizarLogin() {
		loginButton.click();
	}
}
