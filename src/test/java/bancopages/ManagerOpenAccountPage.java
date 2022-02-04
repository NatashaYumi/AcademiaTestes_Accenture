package bancopages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManagerOpenAccountPage {
	
	private WebDriver driver;
	
	@FindBy(id = "userSelect")
	private WebElement userAccountSelect;
	
	@FindBy(id = "currency")
	private WebElement currencyAccountSelect;
	
	@FindBy(xpath = "//button[text()='Process']")
	private WebElement processButton;
	
	public ManagerOpenAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean getManagerOpenAccountPage() {
		boolean isManagerOpenAccountPage = false;
		if(userAccountSelect.isDisplayed()) {
			isManagerOpenAccountPage = true;
		}
		return isManagerOpenAccountPage;
	}
	
	public void fillOpenAccountData(String cliente, String moeda) {
		Select userSelect = new Select(userAccountSelect);
		userSelect.selectByVisibleText(cliente);
		Select currencySelect = new Select(currencyAccountSelect);
		currencySelect.selectByVisibleText(moeda);
	}
	
	public void createAccount() {
		processButton.click();
	}
	
	public boolean getMessageAlertConfirmation() {
		boolean isOpennedSuccessfully = false;
		Alert accountConfirmationAlert = driver.switchTo().alert();
		if (accountConfirmationAlert.getText().contains("Account created successfully with account Number")) {
			isOpennedSuccessfully = true;
		}
		accountConfirmationAlert.accept();
		return isOpennedSuccessfully;
	}
	
}
