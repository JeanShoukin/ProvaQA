#language: pt
Funcionalidade: Busca no site da empresa SOC
  Como um usuario
  Eu vou realizar uma busca 
  Para que eu possa obter os resultados
 
  Contexto:
  	Dado que abro o navegador
  
	@provaQA-A
  Cenário: Deve Realizar busca no blog
		E acesso o pagina do blog"https://ww2.soc.com.br/blog/"
		Quando informo o que busco "certificado"
    E seleciono o botão da lupa
    Então mostrar Search Results for: "certificado" na pagina
  
    
    
	@provaQA-B
  Cenário: Deve Realizar busca de empresas credenciadas
    Quando acesso a pagina inicial "https://www.soc.com.br/"
    E seleciono Soluções 
    E seleciono SOCNET
    E seleciono Buscar credenciados
    E Preencho os filtros de busca
    E seleciono o icone de lupa
    E seleciono a empresa
    Então mostrar o perfil da empresa selecionada
