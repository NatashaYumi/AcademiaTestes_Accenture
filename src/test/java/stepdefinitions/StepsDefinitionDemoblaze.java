package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demoblazepages.CartPage;
import demoblazepages.ProductPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepsDefinitionDemoblaze {

	WebDriver driver = Hooks.driver;
	
	@Dado("que acesse o site da loja demoblaze")
	public void que_acesse_o_site_da_loja_demoblaze() {
		driver.get("https://www.demoblaze.com/index.html");
		ProductPage productPage = new ProductPage(driver);
		assertEquals("STORE", productPage.getLoginPageTitle());
	}

	@Dado("esteja no formulario de contato")
	public void esteja_no_formulario_de_contato() {
	    ProductPage productPage = new ProductPage(driver);
	    productPage.accessContactForm();
	    assertTrue(productPage.ValidateContactForm());
	}

	@Quando("preencher os campos {string}, {string} e {string} com dados validos")
	public void preencher_os_campos_e_com_dados_validos(String email, String name, String message) {
		ProductPage productPage = new ProductPage(driver);
		productPage.fillContactForm(email, name, message);
	}

	@Quando("clicar em send message")
	public void clicar_em_send_message() {
		ProductPage productPage = new ProductPage(driver);
		productPage.sendMessage();
	}

	@Entao("a mensagem deve ser enviada com sucesso")
	public void a_mensagem_deve_ser_enviada_com_sucesso() {
		ProductPage productPage = new ProductPage(driver);
		assertTrue(productPage.validateMessageReturn("Thanks for the message"));
	    
	}

	@Dado("acesse a pagina do {string}")
	public void acesse_a_pagina_do(String produto) {
		ProductPage productPage = new ProductPage(driver);
		productPage.acessProduct(produto);
		assertTrue(productPage.getUrlPage().contains("https://www.demoblaze.com/prod"));
	}

	@Dado("clique em add to cart")
	public void clique_em_add_to_cart() {
		ProductPage productPage = new ProductPage(driver);
		productPage.addProductToCart();
		assertTrue(productPage.validateMessageReturn("Product added"));
	}

	@Dado("acesse a pagina cart")
	public void acesse_a_pagina_cart() {
	    CartPage cartPage = new CartPage(driver);
	    cartPage.accessCart();
	}

	@Quando("clicar na opcao delete do {string}")
	public void clicar_na_opcao_delete_do(String produto) {
		CartPage cartPage = new CartPage(driver);
		assertTrue(cartPage.findProductInCartList(produto));
	}

	@Entao("o {string} deve ser excluido do carrinho")
	public void o_deve_ser_excluido_do_carrinho(String produto) {
		CartPage cartPage = new CartPage(driver);
		assertFalse(cartPage.findProductInCartList(produto));
	}
		
	@Quando("clicar em place order")
	public void clicar_em_place_order() {
		CartPage cartPage = new CartPage(driver);
		cartPage.createPlaceOrder();
	}

	@Quando("preencher com dados validos as informacoes da compra {string}, {string}, {string}, {string}, {string} e {string}")
	public void preencher_com_dados_validos_as_informacoes_da_compra_e(String name, String country, String city, String credit_card, String month, String year) {
		CartPage cartPage = new CartPage(driver);
		cartPage.fillPlaceOrder(name, country, city, credit_card, month, year);
		cartPage.purchaseProduct();
	}

	@Entao("o pedido deve ser realizado")
	public void o_pedido_deve_ser_realizado() {
		CartPage cartPage = new CartPage(driver);
		assertTrue(cartPage.validatePurchaseMessage());
		
	}

}
