package com.project.task.definition;

import com.project.task.steps.nSofkaSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


public class nSofkaDefinition {

	@Steps
	nSofkaSteps nsofkaSteps;

	@Step
	@Given("^Quiero ingresar al sitio web de Sofka$")
	public void quiero_ingresar_al_sitio_web_de_Sofka() {

		nsofkaSteps.ingresarSofka();

	}

	@Step
	@Given("^Ingresar a la opcion Servicios$")
	public void ingresar_a_la_opcion_Servicios() throws Throwable {

		nsofkaSteps.ingresarSevicios();

		throw new PendingException();
	}

	@Step
	@When("^Abrir en una ventana diferente cada uno de los servicios$")
	public void abrir_en_una_ventana_diferente_cada_uno_de_los_servicios() throws Throwable {
		nsofkaSteps.ingresarTodosLosServicios();

		throw new PendingException();
	}

	@Step
	@Then("^tomar una captura de pantalla del resultado final$")
	public void tomar_una_captura_de_pantalla_del_resultado_final() throws Throwable {

		throw new PendingException();
	}

}
