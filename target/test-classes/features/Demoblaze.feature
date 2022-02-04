# language: pt
# encoding: utf-8

@demoblaze
Funcionalidade: Teste de funcionalidades da aplicação Demoblaze

	@realizarContato
	Cenario: Realizar contato pelo formulario de envio de mensagem
		Dado que acesse o site da loja demoblaze
		E esteja no formulario de contato
		Quando preencher os campos <email>, <name> e <message> com dados validos
		E clicar em send message
		Entao a mensagem deve ser enviada com sucesso

		Exemplos:
		| email												| name						| message																	|
		| "yumi-nakayama@hotmail.com" | "Natasha Yumi"	| "Testando envio de mensagem de contato"	|
		| "teste" 										| "Nome teste" 		| "Testando envio de mensagem de contato" |
		
	@removerProduto
	Cenario: Remover um produto do carrinho de compras
		Dado que acesse o site da loja demoblaze
		E acesse a pagina do <produto>
		E clique em add to cart
		E acesse a pagina cart
		Quando clicar na opcao delete do <produto>
		Entao o <produto> deve ser excluido do carrinho
	
		Exemplos:
		| produto				|
		|"Iphone 6 32gb"|
		|"Nexus 6"			|

	
	@realizarPedido
	Cenario: Realizar pedido de compra
		Dado que acesse o site da loja demoblaze
		E acesse a pagina do <produto>
		E clique em add to cart
		E acesse a pagina cart
		Quando clicar em place order
		E preencher com dados validos as informacoes da compra <name>, <country>, <city>, <credit_card>, <month> e <year> 
		Entao o pedido deve ser realizado
	
	Exemplos:
	| produto				| name						| country					| city						| credit_card			| month						| year					|
	|"Iphone 6 32gb"| "Natasha"				| "Brasil"				| "Praia Grande"	| "100000 0"			| "07"						| "26"					|
	|"Nexus 6"			| "Yumi"					| "Brasil"				| "São Paulo"			| "25848545"			| "12"						| "28"					|
	