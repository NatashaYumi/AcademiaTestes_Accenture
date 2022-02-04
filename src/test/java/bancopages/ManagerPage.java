package bancopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerPage {
	private WebDriver driver;
	
	@FindBy(xpath = "//button[@ng-click='addCust()']")	
	private WebElement addCustumerButton;
	
	@FindBy(xpath = "//button[@ng-click='openAccount()']")
	private WebElement openAccountButton;
	
	public ManagerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean getManagerPage() {
		boolean isManagerPage = false;
		if(addCustumerButton.isDisplayed()) {
			isManagerPage = true;
		}
		return isManagerPage;
	}
	
	public void accessAddCustumerPage() {
		addCustumerButton.click();
	}
	
	public void accessOpenAccountPage() {
		openAccountButton.click();
	}
}
