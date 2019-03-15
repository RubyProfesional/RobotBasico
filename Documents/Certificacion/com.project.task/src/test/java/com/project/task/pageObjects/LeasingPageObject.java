package com.project.task.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas")
public class LeasingPageObject extends PageObject {

	// Campo Required
	@FindBy(xpath = "//*[@id=\"main-menu\"]/div[2]/ul[1]/li[3]/a")
	public WebElementFacade ProductosYServicios;

	@FindBy(xpath = "//*[@id=\"productosPersonas\"]/div/div[1]/div/div/div[2]/div/a")
	public WebElementFacade Leasing;

	@FindBy(xpath = "//*[@id=\"category-detail\"]/div/div/div[2]/div/div[2]/h2/a")
	public WebElementFacade LeasingHabitacional;

	@FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div/div/div/div/div[1]/div/div/div[1]/a")
	public WebElementFacade SimularCanonconstante;

	@FindBy(name = "valorActivo")
	public WebElementFacade txtvalorActivo;

	@FindBy(name = "plazo")
	public WebElementFacade txtplazo;

	@FindBy(name = "opcionCompra")
	public WebElementFacade txtopcionCompra;

	@FindBy(name = "comboTipoTasa")
	public WebElementFacade txtcomboTipoTasa;

	// Campo Modalidad ..Bloqueado
	@FindBy(name = "//*[@id=\"sim-detail\"]/form/div[5]/input")
	public WebElementFacade Modalidad;

	// Botón simular
	@FindBy(xpath = "//*[@id=\"sim-detail\"]/form/div[6]/button")
	public WebElementFacade btnSimular;

	// Campo1 Resultado
	@FindBy(xpath = "//*[@id=\"resultado\"]/div/table/tbody/tr[1]/td[2]")
	public WebElementFacade txtVlrCanon;

	//
	@FindBy(xpath = "//*[@id=\"resultado\"]/div/table/tbody/tr[4]/td[2]")
	public WebElementFacade txtVlrCompra;

	public void ProductosYServicios() {
		ProductosYServicios.click();
	}

	public void Leasing() {
		Leasing.click();
	}

	public void LeasingHabitacional() {
		LeasingHabitacional.click();
	}

	public void SimularCanonconstante() {
		SimularCanonconstante.click();
	}

	public void valorActivo(String datoPrueba) {
		txtvalorActivo.click();
		txtvalorActivo.clear();
		txtvalorActivo.sendKeys(datoPrueba);
	}

	public void plazo(String datoPrueba) {
		txtplazo.click();
		txtplazo.clear();
		txtplazo.sendKeys(datoPrueba);
	}

	public void opcionCompra(String datoPrueba) {
		txtopcionCompra.click();
		txtopcionCompra.clear();
		txtopcionCompra.sendKeys(datoPrueba);
	}

	public void comboTipoTasa(String datoPrueba) {
		txtcomboTipoTasa.selectByVisibleText(datoPrueba);
	}

	public void validarBtn() {

		btnSimular.click();

	}

}
