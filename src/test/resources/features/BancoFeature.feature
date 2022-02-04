# language: pt
# encoding: utf-8

@bancoXYZ
Funcionalidade: Teste das funcionalidades da aplicacao do banco XYZ

	@realizarDeposito
	Cenario: Realizar deposito em uma conta valida
		Dado que acesse o site do banco XYZ
		E que o usuario esteja logado como <cliente>
		E que esteja na conta <numero_conta>
		Quando o cliente depositar <valor> em sua conta
		Entao a quantia deve ser depositada na conta fornecida
		
		Exemplos: 
    | cliente              |  numero_conta     | valor    |
    | "Neville Longbottom" | "1015"            | 500      |
    
    @novoCliente
		Cenario: Criacao de um cliente
		Dado que acesse o site do banco XYZ
		E que o gerente esteja logado
		E esteja no formulario de adicionar cliente
		Quando o gerente preencher com dados validos as informacoes do cliente <nome>, <sobrenome>, <codigoPostal> 
		E clicar em adicionar cliente
		Entao uma novo cliente deve ser criado com sucesso
		
		Exemplos: 
    | nome   |  sobrenome            | codigoPostal        |
    | "Hugo" | "Silveira"            | "3438-2"            |    
    
    @novaConta
		Cenario: Criacao de uma conta
		Dado que acesse o site do banco XYZ
		E que o gerente esteja logado
		E esteja no formulario de abrir conta
		Quando o gerente preencher com dados validos as informacoes <cliente> e <moeda>
		E clicar em criar conta
		Entao uma nova conta para o cliente deve ser criada com sucesso
		
		Exemplos: 
    | cliente              |  moeda        |
    | "Neville Longbottom" | "Rupee"       |
    