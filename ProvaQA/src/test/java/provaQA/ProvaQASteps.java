package provaQA;

import org.openqa.selenium.WebDriver;

import Pages.BlogPage;
import Pages.BuscaCredenciadosPage;
import Pages.InicioPage;
import Pages.ResultadoBuscaCredenciadosPage;
import Pages.ResultadoPesquisaBlogPage;
import Pages.SocnetPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.After;
import suporte.Screenshot;
import suporte.Web;

public class ProvaQASteps {
		
	private WebDriver navegador;
		
	@Dado("que abro o navegador")
	public void queAbroONavegador() {
	navegador = Web.createChrome();
	}
	
	@Dado("acesso o pagina do blog{string}")
	public void acessoOPaginaDoBlog(String site) {
		new BlogPage(navegador)
			.acessarSite(site);
	}
	
	@Quando("informo o que busco {string}")
	public void informoOQueBusco(String pesquisa) {
		new BlogPage(navegador)
			.preencherCampoBusca(pesquisa);
	}

	@Quando("seleciono o botão da lupa")
	public void selecionoOBotãoDaLupa() {
		new BlogPage(navegador)
			.clicarBotaoLupa();
	}

	@Então("mostrar Search Results for: {string} na pagina")
	public void mostrarSearchResultsForNaPagina(String pesquisa) {
		new ResultadoPesquisaBlogPage(navegador)
			.confirmarResultadoPesquisa(pesquisa);
	}

	
	
	@Quando("acesso a pagina inicial {string}")
	public void acessoAPaginaInicial(String site) {
		new InicioPage(navegador)
		.acessarSite(site);
	}
	
	@Quando("seleciono Soluções")
	public void selecionoSoluções() {
	    new InicioPage(navegador)
	    	.clicarSolucoes();
	}

	@Quando("seleciono SOCNET")
	public void selecionoSOCNET() {
	    new InicioPage(navegador)
	    	.clicarSocnet();
	}

	@Quando("seleciono Buscar credenciados")
	public void selecionoBuscarCredenciados() {
		new SocnetPage(navegador)
			.clicarBuscaCredenciados();
	}

	@Quando("Preencho os filtros de busca")
	public void preenchoOsFiltrosDeBusca() {
		new BuscaCredenciadosPage(navegador)
			.clicarWifi()
			.clicarPagamentoCartao()
			.clicarAcessoriaConsultoria()
			.clicarLaudosPericiais()
			.preencerCEP();
	}

	@Quando("seleciono o icone de lupa")
	public void selecionoOIconeDeLupa() {
		new BuscaCredenciadosPage(navegador)
			.clicarIconeBusca();
	}

	@Quando("seleciono a empresa")
	public void selecionoAEmpresa() {
		new BuscaCredenciadosPage(navegador)
			.selecionarAEmpresa();
	}

	@Então("mostrar o perfil da empresa selecionada")
	public void mostrarOPerfilDaEmpresaSelecionada() {
		new ResultadoBuscaCredenciadosPage(navegador)
			.ConfirmarPerfilEmpresa();
	}

	@After
	public void screenshotFinalizarTeste () {
		new Screenshot(navegador)
		.screenshotFinalizarTeste();
	}
}
