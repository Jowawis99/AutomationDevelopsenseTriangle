Feature: Validar la respuesta del programa al ingresar longitudes distintas

    Scenario: Verificar respuesta al ingresar longitudes válidas
        Given Ingreso a la web Triangle Calculator
        And Ingreso "5" en el lado "A"
        And Ingreso "5" en el lado "B"
        And Ingreso "5" en el lado "C"
        And Ingreso "JohaoVal" en el campo nombre
        When Presiono el boton Check
        Then Visualizo la respuesta del programa