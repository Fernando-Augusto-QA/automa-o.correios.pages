package config;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InicializarTeste extends DriversFactory {

	static String ambiente = "https://www.correios.com.br";
	
	public static void configurarAmbiente() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();

	}

	public static void encerrerTeste() {

	}

}
