package com.project.task.steps;

import java.util.List;
import com.project.task.pageObjects.BuscarOficinaPageObject;
import net.thucydides.core.annotations.Step;

public class BuscarOficinaSteps {

	BuscarOficinaPageObject buscarOficinaPageObject;

	@Step
	public void ingresarConsultarOficinas() {
		buscarOficinaPageObject.open();
		buscarOficinaPageObject.IngresoVisitanos();

	}

	@Step
	public void ingresarDirección(List<List<String>> data, int id) throws InterruptedException {
		buscarOficinaPageObject.ingresarDireccion(data.get(id).get(0).trim());
		buscarOficinaPageObject.buscarDireccion();
		buscarOficinaPageObject.Seleccionardireccion();

	}

	@Step
	public void VerOficina() throws InterruptedException {
		// retoUbicacionFormsPage.MostrarMapa();
		System.out.println("Esta es la oficina más cercana");
	}

}
