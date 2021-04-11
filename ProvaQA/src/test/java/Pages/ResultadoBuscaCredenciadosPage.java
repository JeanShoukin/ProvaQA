package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaCredenciadosPage extends InicioPage{

	public ResultadoBuscaCredenciadosPage(WebDriver navegador) {
		super(navegador);
	}
	
	public ResultadoBuscaCredenciadosPage ConfirmarPerfilEmpresa() {
		String txt =	navegador.findElement(By.xpath("//*[@id=\"div-header-perfil\"]/div/div[3]/div[1]/span")).getText();
		System.out.println(txt);
		Assert.assertEquals("INSTITUTO DE ANÁLISES CLINICAS DE SANTOS", txt);
		
		return new ResultadoBuscaCredenciadosPage(navegador);

	}
}
	
