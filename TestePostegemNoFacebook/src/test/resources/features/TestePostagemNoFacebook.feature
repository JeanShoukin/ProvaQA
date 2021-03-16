#language: pt
Funcionalidade: Fazer uma publicação no Facebook
  Como um usuario
  Eu quero fazer login 
  Para que eu possa fazer uma publicação

Cenário: Deve fazer publicação
  Dado que estou acessando a aplicação
  Quando informo o usuário "Dark_kohaku@hotmail.com"
  E a senha "Denzel@@1835"
  E seleciono entrar
  Então seleciono no que estou pensando
  Quando seleciono publico
  E seleciono somente eu
  E seleciono marcar amigos
  E informo o amigo "ARIANA REIS SANTOS"
  E seleciono o amigo informado
  E seleciono concluir
  E informo mensagem "Postagem feita com selenium e cucumber realizada com sucesso"
  E seleciono sentimento/atividade
  E seleciono feliz
  E seleciono Aa
  E seleciono Um dos modelos
  Então selecionar publicar
