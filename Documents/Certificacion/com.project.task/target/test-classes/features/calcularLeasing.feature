#Author: rubyprofesional@gmail.com
#Sample Feature Definition Template
@IngresoBanco
Feature: Verificar el funcionamiento de la pantalla de simulación de Canon Financiero expuesta
  		 por el grupo Bancolombia - Leasing, en cuanto a la presentación de los valores calculados

  @CasoExitosoB
  Scenario: Diligencia el simulador de canon financiero
    Given Ingreso Banco, productos y servicios, leasing, leasing habitacional, simular canon constante
    When Diligencio formulario Tabla banco$
      | valorActivo | plazo | opcionCompra | comboTipoTasa |
      |   200000000 |    12 |            5 | DTF           |
    Then Verifico ingreso exitoso$

  @CasoAlternoB
  Scenario Outline: Title of your scenario outline
    Given Ingreso Banco
    And Ingreso Productos y Servicios
    And Ingreso a Leasing
    And Ingreso a Leasing Habitacional
    And Ingreso Simular Canon Constante
    When Diligencio formulario Tabla banco$
      | valorActivo | plazo | opcionCompra | comboTipoTasa |
      |   200000000 |    12 |            5 | DTF           |
    Then Verifico meses menor
