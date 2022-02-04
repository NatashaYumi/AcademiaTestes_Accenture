package stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import bancopages.AccountCustumerPage;
import bancopages.CustumerLoginPage;
import bancopages.LoginPageBank;
import bancopages.ManagerAddCustumerPage;
import bancopages.ManagerOpenAccountPage;
import bancopages.ManagerPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepsDefinitionBanco {

	WebDriver driver = Hooks.driver;
	
	@Dado("que acesse o site do banco XYZ")
	public void que_acesse_o_site_do_banco_xyz() {
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		LoginPageBank loginPage = new LoginPageBank(driver);
		assertEquals("XYZ Bank", loginPage.getLoginPageTitle());
	}

	@Dado("que o usuario esteja logado como {string}")
	public void que_o_usuario_esteja_logado_como(String cliente) {
		
		LoginPageBank loginPage = new LoginPageBank(driver);
		loginPage.customerLogin();
	
		CustumerLoginPage custumerLogin = new CustumerLoginPage(driver);
		// nao precisa validar
		//assertTrue(custumerLogin.getCustumerLoginPage());

		custumerLogin.fillCustumerLoginData(cliente);
		//pode fazer dentro do método fillCustumerLoginData
		custumerLogin.doCustumerLogin();
		
		AccountCustumerPage accountCustumer = new AccountCustumerPage(driver);
		// pode usar assertequals e só comparar com o retorno do objeto.getText
		assertTrue(accountCustumer.getCustumerNameLoggedIn(cliente));	    
	}

	@Dado("que esteja na conta {string}")
	public void que_esteja_na_conta(String numero_conta) {
		AccountCustumerPage accountCustumer = new AccountCustumerPage(driver);
		accountCustumer.fillCustumerAccount(numero_conta);
		// pode usar asserttrue + método retornando string + contains dentro
		assertTrue(accountCustumer.getCustumerAccountSelected(numero_conta));
	}

	@Quando("o cliente depositar {int} em sua conta")
	public void o_cliente_depositar_em_sua_conta(Integer valor) {
		AccountCustumerPage accountCustumer = new AccountCustumerPage(driver);
		accountCustumer.accessDepositForm();
		accountCustumer.fillDepositData(valor);
		accountCustumer.doDeposit();
	}

	@Entao("a quantia deve ser depositada na conta fornecida")
	
	public void a_quantia_deve_ser_depositada_na_conta_fornecida() {
		AccountCustumerPage accountCustumer = new AccountCustumerPage(driver);
		assertTrue(accountCustumer.getMessageDeposit());
	}

	@Dado("que o gerente esteja logado")
	public void que_o_gerente_esteja_logado() {
		LoginPageBank loginPage = new LoginPageBank(driver);
		loginPage.managerLogin();
		ManagerPage managerPage = new ManagerPage(driver);
		assertTrue(managerPage.getManagerPage());
	}

	@Dado("esteja no formulario de adicionar cliente")
	public void esteja_no_formulario_de_adicionar_cliente() {
		
		ManagerPage managerPage = new ManagerPage(driver);
		managerPage.accessAddCustumerPage();
		
		ManagerAddCustumerPage addCustumerPage = new ManagerAddCustumerPage(driver);
		assertTrue(addCustumerPage.getManagerAddCustumerPage());
	}

	@Quando("o gerente preencher com dados validos as informacoes do cliente {string}, {string}, {string}")
	public void o_gerente_preencher_com_dados_validos_as_informacoes_do_cliente(String nome, String sobrenome, String codigoPostal) {
		ManagerAddCustumerPage addCustumerPage = new ManagerAddCustumerPage(driver);
		addCustumerPage.fillCustumerData(nome, sobrenome, codigoPostal);
	}

	@Quando("clicar em adicionar cliente")
	public void clicar_em_adicionar_cliente() {
		ManagerAddCustumerPage addCustumerPage = new ManagerAddCustumerPage(driver);
		addCustumerPage.addCustumer();
		
	}

	@Entao("uma novo cliente deve ser criado com sucesso")
	public void uma_novo_cliente_deve_ser_criado_com_sucesso() {
		ManagerAddCustumerPage addCustumerPage = new ManagerAddCustumerPage(driver);
		assertTrue(addCustumerPage.getMessageAlertConfirmation());
	}

	@Dado("esteja no formulario de abrir conta")
	public void esteja_no_formulario_de_abrir_conta() {
		ManagerPage managerPage = new ManagerPage(driver);
		managerPage.accessOpenAccountPage();
		
		ManagerOpenAccountPage openAccountPage = new ManagerOpenAccountPage(driver);
		assertTrue(openAccountPage.getManagerOpenAccountPage());
	}

	@Quando("o gerente preencher com dados validos as informacoes {string} e {string}")
	public void o_gerente_preencher_com_dados_validos_as_informacoes_e(String cliente, String moeda) {
		ManagerOpenAccountPage openAccountPage = new ManagerOpenAccountPage(driver);
		openAccountPage.fillOpenAccountData(cliente, moeda);
	}

	@Quando("clicar em criar conta")
	public void clicar_em_criar_conta() {
		ManagerOpenAccountPage openAccountPage = new ManagerOpenAccountPage(driver);
		openAccountPage.createAccount();    
	}

	@Entao("uma nova conta para o cliente deve ser criada com sucesso")
	public void uma_nova_conta_para_o_cliente_deve_ser_criada_com_sucesso() {
		ManagerOpenAccountPage openAccountPage = new ManagerOpenAccountPage(driver);
		assertTrue(openAccountPage.getMessageAlertConfirmation());
	}
}
