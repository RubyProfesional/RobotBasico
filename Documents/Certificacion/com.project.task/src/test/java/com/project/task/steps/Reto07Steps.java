package com.project.task.steps;

import java.util.List;

import com.project.task.pageObjects.Reto07PageObject;

import net.thucydides.core.annotations.Step;

public class Reto07Steps {

	Reto07PageObject reto07PageObject;

	public void ingresar_JavaScriptAlerts() throws InterruptedException {

		reto07PageObject.open();
		reto07PageObject.ingreso_JavaScriptsAlerts();
		reto07PageObject.botonJsAlert();
		reto07PageObject.aceptarJsAlert();

		reto07PageObject.ingresarJsConfirm();
		reto07PageObject.cancelarJsConfirm();

	}

	@Step
	public void getionarVentanasEmergentes(List<List<String>> datos, int i) throws InterruptedException {

		reto07PageObject.ingresarJsPrompt();
		reto07PageObject.ingresarTexto(datos.get(i).get(0).trim());

	}

}
