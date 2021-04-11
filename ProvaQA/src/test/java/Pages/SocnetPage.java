package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocnetPage extends InicioPage{

	public SocnetPage(WebDriver navegador) {
		super(navegador);
	}

	public BuscaCredenciadosPage clicarBuscaCredenciados () {
	    navegador.findElement(By.linkText("Buscar credenciados")).click();

	    return new BuscaCredenciadosPage(navegador);
	}
	
	
}
