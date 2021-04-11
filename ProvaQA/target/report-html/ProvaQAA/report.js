$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ProvaQA.feature");
formatter.feature({
  "name": "Fazer uma busca no",
  "description": "  Como um usuario\n  Eu realizar uma busca \n  Para que eu possa obter os resultados",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que abro o navegador",
  "keyword": "Dado "
});
formatter.match({
  "location": "ProvaQASteps.queAbroONavegador()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve Realizar busca no blog",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@provaQA-A"
    }
  ]
});
formatter.step({
  "name": "acesso o pagina do blog\"https://ww2.soc.com.br/blog/\"",
  "keyword": "E "
});
formatter.match({
  "location": "ProvaQASteps.acessoOPaginaDoBlog(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o que busco \"certificado\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "ProvaQASteps.informoOQueBusco(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o botão da lupa",
  "keyword": "E "
});
formatter.match({
  "location": "ProvaQASteps.selecionoOBotãoDaLupa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mostrar Search Results for: \"certificado\" na pagina",
  "keyword": "Então "
});
formatter.match({
  "location": "ProvaQASteps.mostrarSearchResultsForNaPagina(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});