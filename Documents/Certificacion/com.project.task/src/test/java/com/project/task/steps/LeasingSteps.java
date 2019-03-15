package com.project.task.steps;

import java.util.List;

import com.project.task.pageObjects.LeasingPageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LeasingSteps {

	LeasingPageObject leasingPageObject;
	@Step
	public void ingreso_Banco(){
		
		leasingPageObject.open();
		leasingPageObject.ProductosYServicios();
		leasingPageObject.Leasing();
		leasingPageObject.LeasingHabitacional();
		leasingPageObject.SimularCanonconstante();
	}
	
	
	@Step
	public void diligenciar_datos_tabla(List<List<String>> data, int i) {

		leasingPageObject.valorActivo(data.get(i).get(0).trim());
		leasingPageObject.plazo(data.get(i).get(1).trim());
		leasingPageObject.opcionCompra(data.get(i).get(2).trim());
		leasingPageObject.comboTipoTasa(data.get(i).get(3).trim());
		leasingPageObject.validarBtn();
		
	} 
}


