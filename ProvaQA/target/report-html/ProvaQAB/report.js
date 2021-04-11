$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ProvaQA.feature");
formatter.feature({
  "name": "Busca no site da empresa SOC",
  "description": "  Como um usuario\n  Eu vou realizar uma busca \n  Para que eu possa obter os resultados",
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
  "name": "Deve Realizar busca de empresas credenciadas",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@provaQA-B"
    }
  ]
});
formatter.step({
  "name": "acesso a pagina inicial \"https://www.soc.com.br/\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "ProvaQASteps.acessoAPaginaInicial(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Soluções",
  "keyword": "E "
});
formatter.match({
  "location": "ProvaQASteps.selecionoSoluções()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono SOCNET",
  "keyword": "E "
});
formatter.match({
  "location": "ProvaQASteps.selecionoSOCNET()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Buscar credenciados",
  "keyword": "E "
});
formatter.match({
  "location": "ProvaQASteps.selecionoBuscarCredenciados()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencho os filtros de busca",
  "keyword": "E "
});
formatter.match({
  "location": "ProvaQASteps.preenchoOsFiltrosDeBusca()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o icone de lupa",
  "keyword": "E "
});
formatter.match({
  "location": "ProvaQASteps.selecionoOIconeDeLupa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a empresa",
  "keyword": "E "
});
formatter.match({
  "location": "ProvaQASteps.selecionoAEmpresa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mostrar o perfil da empresa selecionada",
  "keyword": "Então "
});
formatter.match({
  "location": "ProvaQASteps.mostrarOPerfilDaEmpresaSelecionada()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});