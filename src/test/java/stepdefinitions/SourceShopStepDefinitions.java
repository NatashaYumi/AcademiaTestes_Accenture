package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CarrinhoPageSL;
import pages.InventarioPageSL;
import pages.LoginPageSL;

public class SourceShopStepDefinitions {

	WebDriver driver = Hooks.driver;
	
	@Dado("que estou na pagina de login do swag labs demo site")
	public void que_estou_na_pagina_de_login_do_swag_labs_demo_site() {
		driver.get("https://www.saucedemo.com/");
		LoginPageSL loginPage = new LoginPageSL(driver);
		assertEquals("Swag Labs", loginPage.getLoginPageTitle());
	}

	@Quando("preencho os campos de login do swag labs {string} e {string} com dados validos")
	public void preencho_os_campos_de_login_do_swag_labs_e_com_dados_validos(String user, String senha) {
		LoginPageSL loginPage = new LoginPageSL(driver);
		loginPage.preencherLogin(user, senha);
	}

	@Quando("pressiono o botao de login do site swag labs")
	public void pressiono_o_botao_de_login_do_site_swag_labs() {
		LoginPageSL loginPage = new LoginPageSL(driver);
		loginPage.realizarLogin();
	}

	@Entao("deve exibir a pagina de inventario")
	public void deve_exibir_a_pagina_de_inventario() {
		InventarioPageSL inventario = new InventarioPageSL(driver);
		assertEquals("https://www.saucedemo.com/inventory.html", inventario.getUrlInventario());

	}

	@Quando("que acessar um produto {string} presente no swag labs e adicionar ao meu carrinho")
	public void que_acessar_um_produto_presente_no_swag_labs_e_adicionar_ao_meu_carrinho(String produto) {
		InventarioPageSL inventario = new InventarioPageSL(driver);
		boolean isAchouProduto = inventario.acessarProduto(produto);
		assertTrue("Produto nao encontrado", isAchouProduto);
		inventario.adicionarProdutoAposAcesso(); 
	}

	@Entao("o produto {string} do inventario deve ser exibido no carrinho")
	public void o_produto_do_inventario_deve_ser_exibido_no_carrinho(String produto) {
		InventarioPageSL inventario = new InventarioPageSL(driver);
		inventario.acessarCarrinho();
		CarrinhoPageSL carrinhoPage = new CarrinhoPageSL(driver);
		assertEquals("https://www.saucedemo.com/cart.html", carrinhoPage.getUrlCarrinho());
		boolean isAchouProdutoCarrinho = carrinhoPage.isAchouProdutoCarrinho(produto);
		assertTrue("Produto nao encontrado no carrinho: " + produto, isAchouProdutoCarrinho);
		
	}
}
