package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoPesquisaBlogPage extends BlogPage {

	public ResultadoPesquisaBlogPage(WebDriver navegador) {
		super(navegador);
	}

	public ResultadoPesquisaBlogPage confirmarResultadoPesquisa(String pesquisa) {
		String txt = navegador.findElement(By.xpath("/html/body/div[2]/div/section[1]/div/div/div/div/div/section/div/div/div/div/div/div[2]/div/h2")).getText();
		System.out.println(txt);
		Assert.assertEquals("Search Results for: " + pesquisa, txt);

		return new ResultadoPesquisaBlogPage(navegador);
	}

}
