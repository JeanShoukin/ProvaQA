package suporte;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {
	private WebDriver navegador;

	public Screenshot(WebDriver navegador) {
		this.navegador = navegador;
	}

	public static void tirar(WebDriver navegador, String arquivo) {
		File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(arquivo));
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o aquivo para a pasta" + e.getMessage());
		}

	}

	public void screenshotFinalizarTeste() {

		String screenshotArquivo = "C:\\Users\\Public\\Pictures\\ " + "ProvaQA " + Gerador.dataHoraParaArquivo()
				+ ".png";
		Screenshot.tirar(navegador, screenshotArquivo);
		navegador.quit();
	}
}