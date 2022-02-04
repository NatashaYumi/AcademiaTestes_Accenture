package demoblazepages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	private WebDriver driver;
	
	@FindBy(linkText = "Contact")
    private WebElement contactLink;
	
	@FindBy(id = "recipient-email")
	private WebElement emailInput;
	
	@FindBy(id = "recipient-name")
	private WebElement nameInput;
	
	@FindBy(id = "message-text")
	private WebElement messageTextArea;
	
	@FindBy(xpath = "//button[@onclick='send()']")
	private WebElement sendButton;
	
	@FindBy(xpath = "//a[@class='hrefch']")
	private List<WebElement> productsList;
	
	@FindBy(linkText = "Add to cart")
	private WebElement addToCartButton;
	
	@FindBy(id = "exampleModalLabel")
	private WebElement modalLabel;
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	} 
	
	public String getUrlPage() {
		return driver.getCurrentUrl();
	}
	
	public void accessContactForm() {
		contactLink.click();
	}
	
	public boolean ValidateContactForm() {
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(modalLabel));
		boolean isModalVisible = false;
		if (sendButton.isDisplayed()) {
			isModalVisible = true;
		}
		return isModalVisible;
	}
	
	public void fillContactForm (String email, String name, String message) {
		emailInput.sendKeys(email);
		nameInput.sendKeys(name);
		messageTextArea.sendKeys(message);
	}
	
	public void sendMessage() {
		sendButton.click();
	}
	
	public boolean validateMessageReturn(String messageConfirmation)
	{
		boolean isSuccessfully = false;
		WebDriverWait wait = new WebDriverWait(driver, 12);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert confirmationAlert = driver.switchTo().alert();
		if (confirmationAlert.getText().contains(messageConfirmation)) {
			isSuccessfully = true;
		}
		confirmationAlert.accept();
		return isSuccessfully;
	}
	
	public boolean acessProduct(String produto) {
		boolean isFoundProduct = false;
		for (int i = 0; i < productsList.size(); i++) {
			if (productsList.get(i).getText().equals(produto)) {
				productsList.get(i).click();
				isFoundProduct = true;
				break;
			}
		}
		return isFoundProduct;
	}
	
	public void addProductToCart() {
		addToCartButton.click();
	}
	

}
