package com.project.task.definition;

import java.util.List;

import com.project.task.steps.BuscarOficinaSteps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class BuscarOficinaDefinition {

	@Steps
	BuscarOficinaSteps buscarOficinaSteps;

	@Step
	@Given("^Ingreso Banco, productos y servicios, leasing, leasing habitacional, simular canon constante$")
	public void ingresar_a_la_pagina_de_consulta_de_oficinas_cercanas() throws Throwable {
		buscarOficinaSteps.ingresarConsultarOficinas();
		throw new PendingException();

	}

	@Step
	@When("^Ingresar la dirección del cliente$")
	public void ingresar_la_dirección_del_cliente(DataTable dtDireccion) throws Throwable {

		List<List<String>> data = dtDireccion.raw();

		for (int i = 1; i < data.size(); i++) {
			buscarOficinaSteps.ingresarDirección(data, i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
		}

	}

	@Step
	@Then("^Buscar la oficina mas cercana$")
	public void buscar_la_oficina_mas_cercana() throws Throwable {
		buscarOficinaSteps.VerOficina();

	}
}
