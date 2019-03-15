#Author: rubyprofesional@gmail.com
## (Comments)
#Sample Feature Definition Template
@buscarSucursal
Feature: Requiero buscar la sucursal de banco más cercana a mi ubicación

  @Buscar
  Scenario Outline: Realizar busqueda de sucursal más cercana ingresando mi dirección
    Given Ingresar a la pagina de consulta de oficinas cercanas
    When Ingresar la dirección del cliente |<Direccion>|
    Then Buscar la oficina mas cercana

    Examples: 
      | Direccion                        |
      | Centro empresarial olaya herrera |
      | Itagui                           |
