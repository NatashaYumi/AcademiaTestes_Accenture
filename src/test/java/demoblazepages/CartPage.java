package demoblazepages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	private WebDriver driver;
	
	@FindBy(id = "cartur")
	private WebElement cartLink;
	
	@FindBy(xpath = "//tr[@class='success']/td[2]")
	private List<WebElement> productsCartList;
	
	@FindBy(xpath = "//tr[@class='success']/td[4]/a")
	private List<WebElement> deleteCartList;
	
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeOrderButton;
	
	@FindBy(id = "name")
	private WebElement nameInput;
	
	@FindBy(id = "country")
	private WebElement countryInput;
	
	@FindBy(id = "city")
	private WebElement cityInput;
	
	@FindBy(id = "card")
	private WebElement cardInput;
	
	@FindBy(id = "month")
	private WebElement monthInput;
	
	@FindBy(id = "year")
	private WebElement yearInput;
	
	@FindBy (xpath = "//button[@onclick='purchaseOrder()']")
	private WebElement purchaseButton;
	
	@FindBy(xpath= "//div[@data-has-confirm-button='true']/h2")
	private WebElement confirmationPurchaseMessage;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement confirmationPurchaseButton;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void accessCart() {
		cartLink.click();
	}
	
	public boolean findProductInCartList(String produto) {
		boolean isfoundProduct = false;
		if (!productsCartList.isEmpty()) {
			for (int i = 0; i < productsCartList.size(); i++) {
				if (productsCartList.get(i).getText().equals(produto)) {
					deleteProduct(i);
					isfoundProduct = true;
					break;
				} else {
					isfoundProduct = false;
				}
			}
		}
		else {
			isfoundProduct = false;
		}
		return isfoundProduct;
	}

	public void deleteProduct(int indice) {
		deleteCartList.get(indice).click();
	}
	
	public void createPlaceOrder() {
		placeOrderButton.click();
	}
	
	public void fillPlaceOrder(String name, String country, String city, String credit_card, String month, String year) {
		nameInput.sendKeys(name);
		countryInput.sendKeys(country);
		cityInput.sendKeys(city);
		cardInput.sendKeys(credit_card);
		monthInput.sendKeys(month);
		yearInput.sendKeys(year);
	}
	
	public void purchaseProduct() {
		purchaseButton.click();
	}
	
	public boolean validatePurchaseMessage() {
		boolean isPurchaseConfirmed = false;
		if (confirmationPurchaseMessage.getText().contains("Thank you for your purchase")) {
			isPurchaseConfirmed = true;
		}
		return isPurchaseConfirmed;
	}
}
