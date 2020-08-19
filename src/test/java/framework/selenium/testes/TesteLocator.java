package framework.selenium.testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteLocator {

	static WebDriver driver;

	public static void main(String[] args) {
		// TesteLogin();
		TesteCadastro();

	}

	public static void TesteLogin() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Testing Company/Downloads/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("karol@email.com");

		driver.findElement(By.id("pass")).sendKeys("123456");

		driver.findElement(By.name("login")).click();

	}

	public static void TesteCadastro() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Testing Company/Downloads/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");

		driver.findElement(By.linkText("Criar nova conta")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("custom_gender_container")));

		driver.findElement(By.name("firstname")).sendKeys("Maria");

		driver.findElement(By.name("lastname")).sendKeys("do Bairro");

		driver.findElement(By.name("reg_email__")).sendKeys("maria@email.com");

		driver.findElement(By.id("password_step_input")).sendKeys("123456");

		Select data = new Select(driver.findElement(By.id("day")));
		data.selectByValue("10");

		Select mes = new Select(driver.findElement(By.id("month")));
		mes.selectByValue("5");

		Select ano = new Select(driver.findElement(By.id("year")));
		ano.selectByValue("2002");

		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();

		driver.findElement(By.name("websubmit")).click();
	}

}

// PARA FIREFOX ==> System.setProperty("webdriver.gecko.driver","C:/Users/Testing Company/Downloads/geckodriver.exe");
