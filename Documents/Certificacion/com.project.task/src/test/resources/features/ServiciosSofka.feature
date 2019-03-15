#Author: rubyprofesional@gmail.com
#Keywords Summary :
## (Comments)
#Sample Feature Definition Template
@ServiciosSofka
Feature: Abrir en una ventana diferente cada uno de sus servicios ofrecidos por sofka

  @NavegacionBasica
  Scenario: Ingresar al sitio web Sofka y abrir una ventana por cada uno de sus servicios
    Given Quiero ingresar al sitio web de Sofka
    And Ingresar a la opcion Servicios
    When Abrir en una ventana diferente cada uno de los servicios
    Then tomar una captura de pantalla del resultado final

   