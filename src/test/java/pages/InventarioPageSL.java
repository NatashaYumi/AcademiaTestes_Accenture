package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventarioPageSL {

	private WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Products']")
    private WebElement produtosLabel;
	
	@FindBy(className = "inventory_item_name")
    private List<WebElement> produtos;
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement adicionarAoCarrinhoButton;
	
	@FindBy(className = "shopping_cart_link")
    private WebElement carrinhoLink;
	
	public InventarioPageSL(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getUrlInventario() {
		return driver.getCurrentUrl();
	}
	
	public boolean acessarProduto(String produto) {
		boolean isEncontrouProduto = false;
		
		for (int i = 0; i < produtos.size(); i++) {
			System.out.println(produtos.get(i).getText());
			if (produtos.get(i).getText().equals(produto)) {
				produtos.get(i).click();
				isEncontrouProduto = true;
				break;
			}
		}
		return isEncontrouProduto;
	}
	
	public void adicionarProdutoAposAcesso() {
		adicionarAoCarrinhoButton.click();
	}
	
	public void acessarCarrinho() {
		carrinhoLink.click();
	}
}
