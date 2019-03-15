package com.project.task.definition;

import java.util.List;

import com.project.task.steps.Reto07Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Reto07Definition {

	@Steps
	Reto07Steps reto07Steps;

	@Step
	@Given("^Navegacion sitio web$")
	public void navegacion_sitio_web() throws InterruptedException {
		reto07Steps.ingresar_JavaScriptAlerts();

	}

	@Step
	@When("^validaciones alerta tipo JavaScript$")
	public void validaciones_alerta_tipo_JavaScript(DataTable datos) throws Throwable {

		List<List<String>> data = datos.raw();

		for (int i = 1; i < data.size(); i++) {
			reto07Steps.getionarVentanasEmergentes(data, i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
		}

	}

	@Step
	@Then("^resultado de la validacion$")
	public void resultado_de_la_validacion() throws Throwable {

	}
}
