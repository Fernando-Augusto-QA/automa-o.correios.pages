package steps;

import org.junit.Before;

import config.InicializarTeste;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePages;

public class ConsultaCepTest {
	
	HomePages home = new HomePages();

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
		home.buscarCepEndereco("07094-190");
	}

	@Then("validar os dados retornados")
	public void validarOsDadosRetornados() {
		home.validarDadosRetornados("Rua Cidade Lion", "Jardim Anny", "Guarulhos/SP", "07094-190");
	}

}
