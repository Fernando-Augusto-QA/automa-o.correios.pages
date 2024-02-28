package pages;

import elementos.Elementos;
import metodos.Metodos;

public class HomePages {
	
	Metodos metodo = new Metodos();
	
	public void buscarCepEndereco(String dado) {
		metodo.escrever(Elementos.buscarCepEndereco, dado);
	}
	
	public void validarDadosRetornados(String logradouro, String bairro, String localidade, String cep) {
		metodo.mudarAba();
		metodo.validarTexto(Elementos.logradouro_Nome, logradouro);
		metodo.validarTexto(Elementos.bairro_Distrito, bairro);
		metodo.validarTexto(Elementos.localidade_Uf, localidade);
		metodo.validarTexto(Elementos.cep, cep);
	}

}
