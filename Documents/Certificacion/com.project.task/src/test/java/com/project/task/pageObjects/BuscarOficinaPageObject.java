package com.project.task.pageObjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")
public class BuscarOficinaPageObject extends PageObject {

	// Seleccionar icono de Visitanos

	@FindBy(xpath = "//*[@id=\"ayuda\"]/div/div[1]/div/div[1]/div/div[4]/div/a/img")
	public WebElementFacade IconoVisitanos;

	// Label ingresar dirección manual
	@FindBy(id = "srch-term")
	public WebElementFacade txtUbicacion;

	// Copiar dirección que aparece de primera
	@FindBy(xpath = "//*[@id=\'tab1\']/div[1]/div[6]/div[1]/div/div[2]/p")
	public WebElementFacade txtDireccion;

	// Icono de laprimer ubicación que aparece

	@FindBy(xpath = "//*[@id=\'tab1\']/div[1]/div[6]/div[1]/div/div[1]/button")
	public WebElementFacade txtSeleccionarDireccion;

	// Mapeo lupa
	@FindBy(xpath = "//*[@id=\'tab1\']/div[1]/div[1]/div/button/input")
	public WebElementFacade btnBuscar;

	// Ingresar dirección forma manual
	public void ingresarDireccion(String datoprueba) throws InterruptedException {
		getDriver().switchTo().frame(getDriver().findElement(By.tagName("iframe")));
		txtUbicacion.click();
		txtUbicacion.clear();
		txtUbicacion.sendKeys(datoprueba);
	}

	public void IngresoVisitanos() {
		IconoVisitanos.click();
	}

	public void Seleccionardireccion() throws InterruptedException {
		visualizar(9);
		txtSeleccionarDireccion.click();

	}

	public void visualizar(int intSegundos) throws InterruptedException {
		Thread.sleep(intSegundos * 1000);
	}

	public void buscarDireccion() {
		btnBuscar.click();
	}

}
