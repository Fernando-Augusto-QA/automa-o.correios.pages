
@regressivo
Feature: Buscar cep no correios
	Como usuario do correios
	Quero informar um cep na busca
	Para validar os dados de retorno
  
  
  Scenario: Realizar a busca do cep
    When enviar os dados para busca
    Then validar os dados retornados
   

 