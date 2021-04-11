package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web {
	
	//Abrir Navegador
	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dark_\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver navegador = new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.manage().window().maximize();
		
		return navegador;
	}
	
		
}
