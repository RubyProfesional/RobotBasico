package com.project.task.pageObjects;

import org.openqa.selenium.Alert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("http://www.sofka.com.co/es/")
public class nSofkaPageObjec extends PageObject {

	@FindBy(css = "a[href='/es/#services']")
	public WebElementFacade linkJServicios;
	
	@FindBy(className="a_padding-bottom-30")	
	public WebElementFacade linkDesarrollo;
	
	@FindBy(css = "a[href='/es/#services']")
	public WebElementFacade linkConsultoriaimplementaciones;
	
	@FindBy(css = "a[href='/es/#services']")
	public WebElementFacade linkDesarrolloconsultoria;
	
	@FindBy(css = "a[href='/es/#services']")
	public WebElementFacade linkFabricaTesting;
	
	

	

	public void linkServicios() throws InterruptedException {
		linkJServicios.click();
		esperar(4);

	}
	
	public void esperar(int intSegundos) throws InterruptedException {
		Thread.sleep(intSegundos * 1000);
	}

	public void ingresarDesarrollo() {
		linkDesarrollo.click();
		
	}

	public void ingresarConsultoriaimplementaciones() {
		
		
	}

	public void ingresarDesarrolloconsultoria() {
	
		
	}

	public void ingresarFabricaTesting() {
		
		
	}

}
