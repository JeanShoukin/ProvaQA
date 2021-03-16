#language: pt


Funcionalidade: Enviar um email pelo outlook
  Como um usuario
  Eu quero fazer login 
  Para que eu possa enviar um email

  Cenário: Deve enviar um email
    Dado que estou acessando a aplicação
    Quando informo o usuário "Dark_kohaku@hotmail.com"
    E seleciono proximo
		E a senha "Denzel@@1835"
		E seleciono permanecer conectado
		E seleciono entrar
		Então seleciono nova mensagem 
		E informo para "Dark_kohaku@hotmail.com"
		E informo o assunto "Teste operacional"
		E informo a mensagem "Teste automatizado feito com selenium e Cucumber"
		E seleciono enviar
		Então checar caixa de itens enviados