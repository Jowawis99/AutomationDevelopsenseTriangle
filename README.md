# Automation Developsense Triangle
# 🌐 Página objetivo
Este proyecto automatiza pruebas sobre la página:  
[Triangle Calculator](https://www.developsense.com/triangle/triangle.html)

## 📋 Criterios del reto

Este proyecto fue desarrollado como parte de un reto técnico. A continuación, se detallan los criterios aplicados:

### 1. Determinación de pruebas
Se exploró el programa Triangle Calculator, considerando posibles escenarios exitosos y de error.

### 2. Casos de prueba diseñados
- Validar el tipo de respuesta generada según los lados ingresados (dibujo de triángulo o no triángulo)
- Validar la alerta generada cuando no se completan todos los campos requeridos.

### 3. Clasificación de casos
- **Automatizables**: Validaciones del tipo de respuesta generada (dibujo de triángulo o no triángulo) y verificación de alertas.
- **No automatizable**: Validación exacta de la respuesta del contenido dibujado en el gráfico del elemento canvas.

### 4. Precondiciones
- Acceso a la página Triangle Calculator.
- Ingreso correcto de datos en los campos del sistema.

### 5. Indicaciones de ejecución
- Ejecución local mediante el comando `gradlew clean test`.  
  Para ejecutar filtrando por tags específicos, se debe usar: `gradle test -Dcucumber.filter.tags="@TAG"`.

- Ejecución en Jenkins utilizando la selección de `tags` a través del parámetro `TAG_RUN`.
### 6. Sugerencias de mejora
- Incorporar elementos HTML identificables en la respuesta del triángulo.
- Mejorar el control de errores obligatorios en la interfaz de usuario.

---

# 📄 Descripción del Proyecto

Este proyecto contiene una automatización de pruebas basada en la página **Triangle Calculator**.  
Se validan diferentes tipos de triángulos según las longitudes ingresadas, así como la generación de alertas al no completar datos requeridos.

## 🛠 Tecnologías utilizadas
- Java 21
- Gradle
- Selenium WebDriver
- Cucumber (BDD)
- JUnit 5
- Jenkins

## 🏗 Estructura del proyecto
- `pages/`: Clases de Page Object Model (POM).
- `steps/`: Definición de pasos en Cucumber.
- `features/`: Escenarios escritos en lenguaje Gherkin.
- `JenkinsFile`: Pipeline de Jenkins para automatización continua.

## ⚙ Ejecución local
 Para ejecutar de manera local se puede usar cualquiera de los tres tags disponibles:
```bash
gradle test -Dcucumber.filter.tags="@TriangleAutomation"
```
```bash
gradle test -Dcucumber.filter.tags="@ValidateTriangle"
```
```bash
gradle test -Dcucumber.filter.tags="@ValidateAlert"
```
Se genera automáticamente un reporte HTML en:
`build/reports/tests/test`

## ⚙ Ejecución en Jenkins
- Proyecto configurado con credenciales de **Cucumber Reports**.
- Ejecución mediante parámetro `TAG_RUN`, seleccionando entre:

    - `@TriangleAutomation`
    - `@ValidateTriangle`
    - `@ValidateAlert`

- Publicación automática de resultados en **Cucumber Reports**.

## 📊 Reportes generados
- Reporte HTML disponible en:
  
  ```bash
  build/reports/tests/test
