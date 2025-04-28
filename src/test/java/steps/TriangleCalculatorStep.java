package steps;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.TriangleCalculatorPage;

public class TriangleCalculatorStep {

    TriangleCalculatorPage triangleCalculatorPage =  new TriangleCalculatorPage();

    @Given("Ingreso a la web Triangle Calculator")
        public void navigateToTriangleCalculator(){
            triangleCalculatorPage.navigateToTriangleCalculator();
        }
    
    
    @Given("Ingreso {string} en el lado {string}")
        public void ingresoValorLado(String valor, String lado){
            triangleCalculatorPage.ingresoLadoTriangulo(lado, valor);
        }
    
    @Given("Ingreso {string} en el campo nombre")
        public void ingresoName(String name){
            triangleCalculatorPage.ingresoNombre(name);
        }
        
    @When("Presiono el boton Check")
        public void clickBtnCheck(){
            triangleCalculatorPage.clickCheck();
        }
        
    @Then("Visualizo la {string} del programa")
        public void viewGrafico(String respuestaEsperada){
            Assert.assertTrue(triangleCalculatorPage.viewCanvas());
            System.out.println("Respuesta esperada: " + respuestaEsperada);
        }

    @Then("Visualizo la alerta de falta de datos")
        public void viewAlert(){
            String mensajeAlerta = triangleCalculatorPage.capturarTexAlerta();
            Assert.assertEquals(mensajeAlerta, "The name field is blank. Please enter your name in the field at the top of the instructions.");
            triangleCalculatorPage.aceptAlerta();
        }
}
