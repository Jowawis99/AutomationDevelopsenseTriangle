Feature: Validar la respuesta del programa al ingresar las longitudes de los lados

    Background:
        Given Ingreso a la web Triangle Calculator

    @ValidateTriangle
    Scenario Outline: Verificar respuesta al ingresar longitudes válidas
        And Ingreso "<ladoA>" en el lado "A"
        And Ingreso "<ladoB>" en el lado "B"
        And Ingreso "<ladoC>" en el lado "C"
        And Ingreso "JohaoVal" en el campo nombre
        When Presiono el boton Check
        Then Visualizo la "<respuesta>" del programa

    Examples:
        | ladoA | ladoB | ladoC | respuesta            |        
        | 5     | 5     | 5     | Triangulo equilatero |
        | 5     | 5     | 2     | Triangulo isosceles  |   
        | 3     | 4     | 5     | Triangulo escaleno   |
        | 1     | 2     | 10    | No es triangulo      |
        | -1    | 5     | 5     | No es triangulo      |


    @ValidateAlert
    Scenario: Validar alerta al no ingresar ciertos datos
        And Ingreso "5" en el lado "B"
        When Presiono el boton Check
        Then Visualizo la alerta de falta de datos
