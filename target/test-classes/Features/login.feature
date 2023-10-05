Feature: Testando funcionalidade de login

  Scenario: Validando login com credenciais válidas
  
    Given que o usuario esta na pagina de login
    When o usuario inserir seu nome de user e password
    And clicar no botao de login
    Then o usuario é redirecionado para a pagina home


