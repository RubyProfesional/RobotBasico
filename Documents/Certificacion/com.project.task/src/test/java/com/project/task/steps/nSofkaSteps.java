package com.project.task.steps;

import com.project.task.pageObjects.nSofkaPageObjec;

import net.thucydides.core.annotations.Step;

public class nSofkaSteps {

	nSofkaPageObjec nsofkaPageObjec;

	@Step
	public void ingresarSofka() {
		nsofkaPageObjec.open();

	}

	@Step
	public void ingresarSevicios() throws InterruptedException {
		nsofkaPageObjec.linkServicios();

	}

	public void ingresarTodosLosServicios() {
		nsofkaPageObjec.ingresarDesarrollo();
		nsofkaPageObjec.ingresarConsultoriaimplementaciones();
		nsofkaPageObjec.ingresarDesarrolloconsultoria();
		nsofkaPageObjec.ingresarFabricaTesting();
		
	}

}
