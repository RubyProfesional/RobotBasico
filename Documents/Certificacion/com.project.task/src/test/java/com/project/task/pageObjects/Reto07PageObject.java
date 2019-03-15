package com.project.task.pageObjects;

import org.openqa.selenium.Alert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://the-internet.herokuapp.com/")
public class Reto07PageObject extends PageObject {

	// Mapeo y métodos de clic
	@FindBy(css = "a[href='/javascript_alerts']")
	public WebElementFacade linkJavaScripAlerts;

	@FindBy(xpath = "//*[@id=\'content\']/div/ul/li[1]/button")
	public WebElementFacade btnJsAlert;

	@FindBy(xpath = "//*[@id=\'content\']/div/ul/li[2]/button")
	public WebElementFacade btnJsConfirm;

	@FindBy(xpath = "//*[@id=\'content\']/div/ul/li[3]/button")
	public WebElementFacade btnJsPrompt;
	


	public void ingreso_JavaScriptsAlerts() {

		linkJavaScripAlerts.click();

	}

	public void botonJsAlert() throws InterruptedException {
		btnJsAlert.click();

	}

	public void aceptarJsAlert() throws InterruptedException {

		esperar(5);
		Alert aceptar = (Alert) getDriver().switchTo().alert();
		aceptar.accept();
	}

	public void ingresarJsConfirm() {
		btnJsConfirm.click();

	}

	public void cancelarJsConfirm() throws InterruptedException {

		esperar(5);
		Alert cancelar = getDriver().switchTo().alert();
		cancelar.dismiss();
	}

	public void ingresarJsPrompt() {
		btnJsPrompt.click();

	}

	public void ingresarTexto(String dato) throws InterruptedException {

		
		Alert texto = getDriver().switchTo().alert();
		texto.sendKeys(dato);
		esperar(2);
		texto.accept();
		

	}

	public void esperar(int intSegundos) throws InterruptedException {
		Thread.sleep(intSegundos * 1000);
	}

}
