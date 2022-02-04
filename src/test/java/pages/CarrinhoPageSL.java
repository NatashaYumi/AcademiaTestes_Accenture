package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarrinhoPageSL {
	private WebDriver driver;

	@FindBy(xpath = "//div[@class='cart_item']//div[@class='inventory_item_name']")
	private List<WebElement> itensCarrinho;
	
	@FindBy(id = "checkout")
	private WebElement checkOutButton;
	

	public CarrinhoPageSL(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getUrlCarrinho() {
		return driver.getCurrentUrl();
	}

	public boolean isAchouProdutoCarrinho(String produto) {
		boolean isEncontrouItemCarrinho = false;
		for (int i = 0; i < itensCarrinho.size(); i++) {
			System.out.println(itensCarrinho.get(i).getText());
			System.out.println("");
			if (itensCarrinho.get(i).getText().equals(produto)) {
				itensCarrinho.get(i).click();
				isEncontrouItemCarrinho = true;
				break;
			}
		}
		return isEncontrouItemCarrinho;
	}
	
	public void irParaCheckOut() {
		checkOutButton.click();
	}
	
}
