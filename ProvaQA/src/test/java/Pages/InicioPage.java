package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicioPage {
	
	protected WebDriver navegador;
	
	public InicioPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public InicioPage acessarSite(String site) {
		navegador.navigate().to(site);

		return new InicioPage(navegador);
	}
	
	public InicioPage clicarSolucoes() {
		navegador.findElement(By.linkText("Soluções")).click();
		
		return new InicioPage(navegador);
	}
	
	public SocnetPage clicarSocnet() {
		navegador.findElement(By.linkText("SOCNET")).click();
		
		return new SocnetPage(navegador);
	}
	
	
	
}
