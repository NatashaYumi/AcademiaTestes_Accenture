package bancopages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerAddCustumerPage {

	private WebDriver driver;
	
	@FindBy(xpath="//input[@ng-model='fName']")
	private WebElement nameInput;
	
	@FindBy(xpath="//input[@ng-model='lName']")
	private WebElement lastNameInput;
	
	@FindBy(xpath="//input[@ng-model='postCd']")
	private WebElement postCodeInput;
	
	@FindBy(xpath="//button[text()='Add Customer']")
	private WebElement addCustumerButton;
	
	public ManagerAddCustumerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillCustumerData(String nome, String sobrenome, String codigoPostal) {
		nameInput.sendKeys(nome);
		lastNameInput.sendKeys(sobrenome);
		postCodeInput.sendKeys(codigoPostal);
	}
	
	public boolean getManagerAddCustumerPage() {
		boolean isManagerAddCustumerPage = false;
		if(addCustumerButton.isDisplayed()) {
			isManagerAddCustumerPage = true;
		}
		return isManagerAddCustumerPage;
	}
	
	public void addCustumer() {
		addCustumerButton.click();
	}
	
	public boolean getMessageAlertConfirmation() {
		boolean isAddedSuccessfully = false;
		Alert customerConfirmationAlert = driver.switchTo().alert();
		if (customerConfirmationAlert.getText().contains("Customer added successfully with")) {
			isAddedSuccessfully = true;
		}
		customerConfirmationAlert.accept();
		return isAddedSuccessfully;
	}
}
