package framework.selenium.comandos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosBrowser {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		comandosBrowser();

	}
	
	public static void comandosBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Testing Company/Downloads/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //abre a tela maximizada 
		
		
		//abrindo uma url
		driver.get("http://www.facebook.com");
		
		//pegando o título da página 
		String titulo = driver.getTitle();
		System.out.println(titulo);
		
		//pegando a url corrente
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//pegando o código fonte da página
		String codigoFonte = driver.getPageSource();
		System.out.println(codigoFonte);
		
		//fechar a janela aberta 
		driver.close();
		
		//Fecha a sessão do webdriver
		driver.quit();
	}
	

}
