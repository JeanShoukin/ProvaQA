package testeEnvioDeEmailOutlook;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeDeEnvioSteps {

	private WebDriver navegador;
	private String campoPara = "//*[@id='ReadingPaneContainerId']/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/input";
	private String campoMensagem = "//*[@id=\"ReadingPaneContainerId\"]/div/div/div/div[1]/div[2]/div[1]/div";
	private String campoAssunto = "/html/body/div[2]/div/div[2]/div[1]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div/input";
	private String botaoEnviar = "/html/body/div[2]/div/div[2]/div[1]/div[1]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[3]/div[2]/div[1]/div/span/button[1]/span";
	private String emailsEnviados = "/html/body/div[2]/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div/span[1]";		
	
	@Dado("que estou acessando a aplicação")
	public void que_estou_acessando_a_aplicação() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dark_\\Drivers\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		navegador.manage().window().maximize();
		navegador.navigate().to("https://outlook.live.com/owa/");
		navegador.findElement(By.linkText("Entrar")).click();

	}

	@Quando("informo o usuário {string}")
	public void informo_o_usuário(String email) {
		navegador.findElement(By.id("i0116")).sendKeys(email);
	}
	
	@Quando("seleciono proximo")
	public void seleciono_proximo() {
		navegador.findElement(By.id("idSIButton9")).click();
	}

	@Quando("a senha {string}")
	public void a_senha(String senha) {
		navegador.findElement(By.id("i0118")).sendKeys(senha);
	}

	@Quando("seleciono permanecer conectado")
	public void seleciono_permanecer_conectado() {
		navegador.findElement(By.id("idChkBx_PWD_KMSI0Pwd")).click();
		
	}

	@Quando("seleciono entrar")
	public void seleciono_entrar() {
		navegador.findElement(By.id("idSIButton9")).click();
		
	}

	@Então("seleciono nova mensagem")
	public void seleciono_nova_mensagem() {
		navegador.findElement(By.id("id__6")).click();
	}

	@Quando("informo para {string}")
	public void informo_para(String email) {
		navegador.findElement(By.xpath(campoPara)).sendKeys(email);
	}

	@Quando("informo o assunto {string}")
	public void informo_o_assunto(String assunto) {
		navegador.findElement(By.xpath(campoAssunto)).sendKeys(assunto);
	}

	@Quando("informo a mensagem {string}")
	public void informo_a_mensagem(String mensagem) {
		navegador.findElement(By.xpath(campoMensagem)).sendKeys(mensagem);
	}

	@Quando("seleciono enviar")
	public void seleciono_enviar() {
		navegador.findElement(By.xpath(botaoEnviar)).click();
	}

	@Então("checar caixa de itens enviados")
	public void checar_caixa_de_itens_enviados() {
		navegador.findElement(By.xpath(emailsEnviados)).click();

	}
}
