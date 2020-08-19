package framework.selenium.comandos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestsComandosWebElements {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebElement();
		
	}
	
	public static void WebElement() {
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/Testing Company/Downloads/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //abre a tela maximizada 
		
		
		//abrindo uma url
		driver.get("http://www.facebook.com");
		
		//digitando no campo 
		driver.findElement(By.id("email")).sendKeys("karol@gmail.com");
		
		//apagando do campo
		driver.findElement(By.id("email")).clear();
		
		//verificar se o elemento está visível
		boolean apareceu = driver.findElement(By.id("email")).isDisplayed();
		
		System.out.println(apareceu);
		
		//verificar se o elemento está habilitado
		boolean habilitado=driver.findElement(By.id("email")).isEnabled();
		System.out.println(habilitado);
		
		//verificar se o elemento está selecionado ou não
		driver.findElement(By.linkText("Criar nova conta")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("custom_gender_container")));
		driver.findElement(By.id("custom_gender_container"));
		
		boolean selecionado = driver.findElement(By.xpath("(//input[@name='sex'])[1]")).isSelected();
		System.out.println(selecionado);
		
		//submetendo  o elemento (quase o mesmo que o click, porém menos eficiente)
		driver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).submit();
		System.out.println("submeteu aqui");
		
		//pegando o texto 
		String texto = driver.findElement(By.linkText("Termos")).getText();
		System.out.println(texto);
		
	}
	
}
