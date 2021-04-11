package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPage {

	protected WebDriver navegador;

	public BlogPage(WebDriver navegador) {
		this.navegador = navegador;
	}

	public BlogPage acessarSite(String site) {
		navegador.navigate().to(site);

		return new BlogPage(navegador);
	}

	public BlogPage preencherCampoBusca(String pesquisa) {
		navegador.findElement(By.xpath("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/input")).sendKeys(pesquisa);

		return new BlogPage(navegador);
	}

	public ResultadoPesquisaBlogPage clicarBotaoLupa() {
		navegador.findElement(By.className("elementor-search-form__submit")).click();

		return new ResultadoPesquisaBlogPage(navegador);
	}

}
