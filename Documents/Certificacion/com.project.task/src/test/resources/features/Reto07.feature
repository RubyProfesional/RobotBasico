#Author: rubyprofesional@gmail.com
#Sample Feature Definition Template
@Regresion
Feature: Manejo de alertas tipo JavaScript. Automatización web

  @Reto07
  Scenario Outline: Manejo de alertas tipo JavaScrpt
    Given Navegacion sitio web
    When validaciones alerta tipo JavaScript
      | <inputMensaje> |
    Then resultado de la validacion

    Examples: 
      | inputMensaje                                            |
      | Hola esta es la captura de la segunda ventana emergente |
     # | Esta es la captura de la tercer ventana emergente       |
