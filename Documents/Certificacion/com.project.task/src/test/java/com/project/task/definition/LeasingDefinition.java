package com.project.task.definition;
import java.util.List;

import com.project.task.steps.LeasingSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps; 

public class LeasingDefinition {
	
	@Steps
	LeasingSteps leasingSteps;
	
    @Step
	@Given("^Ingreso Banco$")
	public void ingreso_Banco() throws Throwable {
	leasingSteps.ingreso_Banco();
	}

    
    @Step
	@When("^Diligencio formulario Tabla banco\\$$")
	public void diligencio_formulario_Tabla_banco(DataTable dtDatosForm) throws InterruptedException {

		
			  List<List<String>> data = dtDatosForm.raw();
				for(int i=1; i<data.size(); i++) {
					leasingSteps.diligenciar_datos_tabla(data, i);
				try {
					Thread.sleep(5000);
				}
				catch(InterruptedException e) {}
			}
		   
		}
	    

	@Then("^Verifico ingreso exitoso\\$$")
	public void verifico_ingreso_exitoso$() throws Throwable {


	}
	}




