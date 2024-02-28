package metodos;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By local, String texto) {
		try {
			driver.findElement(local).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO *******" + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO ****" + e.getMessage());
		}
	}

	public void clicar(By local) {
		try {
			driver.findElement(local).click();
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO *******" + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO ****" + e.getMessage());
		}
	}

	public void subimit(By local) {
		try {
			driver.findElement(local).submit();
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO *******" + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO ****" + e.getMessage());
		}
	}

	public void validarTexto(By local, String textoEsperado) {
		try {
			String textoCapturado = driver.findElement(local).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO *******" + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO ****" + e.getMessage());
		}
	}

	public void mudarAba() {
		try {
			String janelaPrincipal = driver.getWindowHandle();
			Set<String> todasJanelas = driver.getWindowHandles();
			for (String janela : todasJanelas) {
				if (!janela.equals(janelaPrincipal)) {
					driver.switchTo().window(janela);
				}
			}
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO *******" + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO ****" + e.getMessage());
		}
	}

}
