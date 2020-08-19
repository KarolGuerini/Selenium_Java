package framework.selenium.comandos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteComandosNavegacao {
	
	static WebDriver driver;

	public static void main(String[] args) {
		navegacao();

	}
	
	public static void navegacao() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Testing Company/Downloads/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//indo até a pagina 
		driver.get("http://www.facebook.com");
		
		//navegando para outrsa páginas
		driver.navigate().to("https://www.google.com.br");
		driver.findElement(By.name("q")).sendKeys("celular lg");
		Actions act = new Actions(driver); 
		act.sendKeys(Keys.ENTER).build().perform();//serve para simular o ENTER  do teclado
		driver.findElement(By.linkText("Shopping")).click();
		
		//voltando uma página
		driver.navigate().back();
		
		//dando um refresh na página
		driver.navigate().refresh();
		
		//avançando uma página
		driver.navigate().forward();
		
	
		//fechando a janela
		driver.close();
		
		
		
		
		
		
	}
	

}
