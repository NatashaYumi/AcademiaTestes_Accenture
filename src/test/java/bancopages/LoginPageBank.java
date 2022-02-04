package bancopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPageBank {
	private WebDriver driver;
	
	@FindBy(xpath = "//button[@ng-click='customer()']")
	private WebElement customerLoginButton;
	
	@FindBy(xpath = "//button[@ng-click='manager()']")
	private WebElement managerLoginButton;
	
	public LoginPageBank(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	} 
	
	public void customerLogin() {
		customerLoginButton.click();
	}
	
	public void managerLogin() {
		managerLoginButton.click();
	}
}
