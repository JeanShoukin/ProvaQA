package TestePostagemNoFacebookSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class TestePostagemNoFacebookSteps {
	
	private ChromeOptions options;
	private WebDriver navegador; 
	private String noQueEstouPensando = "/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span";
	private String publico = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div/span/div/div/div/span";
	private String somenteEu = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[5]/div/div/div[2]";
	private String marcarAmigos = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[3]/div[1]/div[2]/div/div[2]/span/div/div/div/div/div[1]/i";
	private String procurarAmigos = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[2]/div/div[2]/div/div[1]/div/div/label/input";
	private String amigo = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div/ul/div/div[2]/li/div/div[1]/div/div/div/div";
	private String concluir = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[2]/div/div[2]/div/div[1]/div/div/div/div/span/span";
	private String mensagem = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div/div/div/div";
	private String sentimentoAtividade = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[3]/div[1]/div[2]/div/div[3]/span/div/div/div/div/div[1]/i";
	private String feliz = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/ul/li[1]/div/div/div";
	private String modelos = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div/span/img";
	private String modeloEscolhido = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div[7]/div/div";
	private String publicar = "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[3]/div[2]/div/div[1]/div/span/span";

	
	
	@Dado("que estou acessando a aplicação")
	public void queEstouAcessandoAAplicação() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dark_\\Drivers\\chromedriver.exe");
		navegador = new ChromeDriver(options);
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navegador.manage().window().maximize();
		navegador.navigate().to("https://www.facebook.com/");
	}

	@Quando("informo o usuário {string}")
	public void informoOUsuário(String email) {
		navegador.findElement(By.id("email")).sendKeys(email);
	}

	@Quando("a senha {string}")
	public void aSenha(String senha) {
		navegador.findElement(By.id("pass")).sendKeys(senha);
	}

	@Quando("seleciono entrar")
	public void selecionoEntrar() {
		navegador.findElement(By.name("login")).click();
	}
	
	
	@Quando("seleciono no que estou pensando")
	public void selecionoNoQueEstouPensando() {
		navegador.findElement(By.xpath(noQueEstouPensando)).click();
	}

	@Quando("seleciono publico")
	public void selecionoPublico() {
		navegador.findElement(By.xpath(publico)).click();
	}

	@Quando("seleciono somente eu")
	public void selecionoSomenteEu() {
		navegador.findElement(By.xpath(somenteEu)).click();
	}

	@Quando("seleciono marcar amigos")
	public void selecionoMarcarAmigos() {
		navegador.findElement(By.xpath(marcarAmigos)).click();
	}

	@Quando("informo o amigo {string}")
	public void informoOAmigo(String amigo) {
		navegador.findElement(By.xpath(procurarAmigos)).sendKeys(amigo);
	}

	@Quando("seleciono o amigo informado")
	public void selecionoOAmigoInformado() {
		navegador.findElement(By.xpath(amigo)).click();

	}

	@Quando("seleciono concluir")
	public void selecionoConcluir() {
		navegador.findElement(By.xpath(concluir)).click();
	}

	@Quando("informo mensagem {string}")
	public void informoMensagem(String mensagemEscrita) {
		navegador.findElement(By.xpath(mensagem)).sendKeys(mensagemEscrita);;

	}

	@Quando("seleciono sentimento\\/atividade")
	public void selecionoSentimentoAtividade() {
		navegador.findElement(By.xpath(sentimentoAtividade)).click();
	}

	@Quando("seleciono feliz")
	public void selecionoFeliz() {
		navegador.findElement(By.xpath(feliz)).click();
	}

	@Quando("seleciono Aa")
	public void selecionoAa() {
		navegador.findElement(By.xpath(modelos)).click();

	}

	@Quando("seleciono Um dos modelos")
	public void selecionoUmDosModelos() {
		navegador.findElement(By.xpath(modeloEscolhido)).click();

	}

	@Então("selecionar publicar")
	public void selecionarPublicar() {
		navegador.findElement(By.xpath(publicar)).click();

	}

}
