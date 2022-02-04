package bancopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustumerLoginPage {
	private WebDriver driver;
	
	@FindBy(id = "userSelect")
	private WebElement userCustumerSelect;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement userLoginButton;
	
	@FindBy(xpath="//form[@ng-submit='showAccount()']")
	private WebElement showAccountForm;
		
	public CustumerLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean getCustumerLoginPage() {
		boolean isCustumerLoginPage = false;
		if (showAccountForm.isDisplayed()) {
			isCustumerLoginPage = true;
		}
		return isCustumerLoginPage;
	}
	
	public void fillCustumerLoginData(String cliente) {
		Select userSelect = new Select(userCustumerSelect);
		userSelect.selectByVisibleText(cliente);
	}
	
	public void doCustumerLogin() {
		userLoginButton.click();
	} 
	

	
}
