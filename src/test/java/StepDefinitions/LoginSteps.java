package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("que o usuario esta na pagina de login")
	public void que_o_usuario_esta_na_pagina_de_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step Dado");
	}

	@When("o usuario inserir seu nome de user e password")
	public void o_usuario_inserir_seu_nome_de_user_e_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step Quando");
	}

	@And("clicar no botao de login")
	public void clicar_no_botao_de_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step E");
	}

	@Then("o usuario é redirecionado para a pagina home")
	public void o_usuario_é_redirecionado_para_a_pagina_home() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step Entao");
	}

}
