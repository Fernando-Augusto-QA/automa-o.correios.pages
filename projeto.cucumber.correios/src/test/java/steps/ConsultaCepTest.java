package steps;

import org.junit.Before;

import config.InicializarTeste;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsultaCepTest {
	
	@Before
	public void iniciarTeste() {
		InicializarTeste.configurarAmbiente();
	}
	
	@After
	public void fecharTeste() {
		InicializarTeste.encerrerTeste();
	}
	
	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
	   
	}
	
	@Then("validar os dados retornados")
	public void validarOsDadosRetornados() {
	  
	}




}
