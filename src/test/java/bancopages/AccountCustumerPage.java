package bancopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCustumerPage {
	private WebDriver driver;
	
	@FindBy(xpath = "//SPAN[@class='fontBig ng-binding']")
	private WebElement userNameSpan;
	
	@FindBy(id = "accountSelect")
	private WebElement numberAccountCustumerSelect;
	
	@FindBy(xpath = "//button[@ng-click='deposit()']")
	private WebElement depositOptionButton;
	
	@FindBy(xpath = "//input[@ng-model='amount']")
	private WebElement amountInput;
	
	@FindBy(xpath = "//button[text()='Deposit']")
	private WebElement doDepositButton;
	
	@FindBy(xpath = "//span[@ng-show='message']")
	private WebElement messageDepositSpan;
	
	public AccountCustumerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean getCustumerNameLoggedIn(String cliente) {
		boolean isLoginSucceed= false;
		if (userNameSpan.getText().equals(cliente)) {
			isLoginSucceed = true;
		}
		return isLoginSucceed;
	}
	
	public void fillCustumerAccount(String numero_conta) {
		Select numberAccountSelect = new Select(numberAccountCustumerSelect);
		numberAccountSelect.selectByVisibleText(numero_conta);
	}
	
	public boolean getCustumerAccountSelected(String numero_conta) {
		Select numberAccountSelect = new Select(numberAccountCustumerSelect);
		boolean isSelectedCustumerAccount = false;
		if (numberAccountSelect.getFirstSelectedOption().getText().equals(numero_conta)){
			isSelectedCustumerAccount = true;
		}
		return isSelectedCustumerAccount;
	}
	
	public void accessDepositForm() {
		depositOptionButton.click();
	}
	
	public void fillDepositData(Integer valor) {
		amountInput.sendKeys(Integer.toString(valor));
	}
	
	public void doDeposit() {
		doDepositButton.click();
	}
	
	public boolean getMessageDeposit() {
		boolean isDepositSucceed = false;
		if (messageDepositSpan.getText().equals("Deposit Successful")) {
			isDepositSucceed = true;
		}
		return isDepositSucceed;
	}
}
