# language: pt
# encoding: utf-8

@swag
Funcionalidade: Swag Labs Demo Site

	@swag_login
  Cenario: Realizar login
  	Dado que estou na pagina de login do swag labs demo site
		Quando preencho os campos de login do swag labs <email> e <senha> com dados validos 
		E pressiono o botao de login do site swag labs
  	Entao deve exibir a pagina de inventario
  
  	Exemplos: 
      | email           |  senha           |
      | "standard_user" | "secret_sauce"   | 
        
  @swag_adicionarProduto
  Cenario: Adicionar produto ao carrinho
  	Dado que estou na pagina de login do swag labs demo site
		Quando preencho os campos de login do swag labs <email> e <senha> com dados validos
		E pressiono o botao de login do site swag labs
  	Entao deve exibir a pagina de inventario
  	Quando que acessar um produto <produto> presente no swag labs e adicionar ao meu carrinho
  	Entao o produto <produto> do inventario deve ser exibido no carrinho
  	
  	Exemplos: 
      | email           |  senha           | produto                       |
      | "standard_user" | "secret_sauce"   |   "Sauce Labs Backpack"       |
      | "standard_user" | "secret_sauce"   |   "Sauce Labs Bolt T-Shirt"   |