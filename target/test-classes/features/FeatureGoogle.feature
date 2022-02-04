# language: pt
# encoding: utf-8

@pesquisaGoogleFunc
Funcionalidade: Pesquisa google

  @pesquisaGeral
  Cenario: Pesquisar item no google
    Dado que estou na tela de pesquisa do google
    Quando digito <termo> na pesquisa e realizo a pesquisa 
    Entao deve exibir resultados
    
    Exemplos: 
      | termo 						 		|
      | "ibama"   						|
    #  | "governo pernambuco"  |

  @pesquisaResultado
  Cenario: Validar retorno pesquisa google
    Dado que estou na tela de pesquisa do google
    Quando digito <termo> na pesquisa e realizo a pesquisa
    Entao deve exibir o <resultado> na primeira pagina

    Exemplos: 
      | termo 						 		| resultado									|
      | "ibama"   						| "Ibama - Governo Federal"	|
     # | "selenium"  | "Selenium IDE"						|
