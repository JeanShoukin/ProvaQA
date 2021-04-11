package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaCredenciadosPage extends InicioPage{

	public BuscaCredenciadosPage(WebDriver navegador) {
		super(navegador);
	}

	public BuscaCredenciadosPage clicarWifi() {
		navegador.findElement(By.xpath("//*[@id=\"div-filtro-conveniencias\"]/section/div[1]/label/span[1]")).click();
		
		return new BuscaCredenciadosPage(navegador);
	}
	
	public BuscaCredenciadosPage clicarPagamentoCartao() {
		navegador.findElement(By.xpath("//*[@id=\"div-filtro-conveniencias\"]/section/div[2]/label/span[1]")).click();
		
		return new BuscaCredenciadosPage(navegador);
	}
	
	public BuscaCredenciadosPage clicarAcessoriaConsultoria() {
		navegador.findElement(By.xpath("//*[@id=\"div-filtro-servicos\"]/section/div[3]/label/span[1]")).click();
		
		return new BuscaCredenciadosPage(navegador);
	}
	
	public BuscaCredenciadosPage clicarLaudosPericiais() {
		navegador.findElement(By.xpath("//*[@id=\"div-filtro-servicos\"]/section/div[4]/label/span[1]")).click();
		
		return new BuscaCredenciadosPage(navegador);
	}
	
	public BuscaCredenciadosPage preencerCEP() {
		navegador.findElement(By.id("ipt-busca-credenciado-2")).sendKeys("11460-500");
		
		return new BuscaCredenciadosPage(navegador);
	}
	
	public BuscaCredenciadosPage clicarIconeBusca() {
	    navegador.findElement(By.id("botao-buscar")).click();
		
		return new BuscaCredenciadosPage(navegador);
	}
	
	public ResultadoBuscaCredenciadosPage selecionarAEmpresa() {
		navegador.findElement(By.xpath("//*[@id=\"conteudo-resultados\"]/div[1]/div/div[2]/div/section/div[2]/p/span[1]")).click();
		navegador.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div[1]/div/div[2]/div/section/div[2]/a/button")).click();
		
		return new ResultadoBuscaCredenciadosPage(navegador);
	}
	
}
