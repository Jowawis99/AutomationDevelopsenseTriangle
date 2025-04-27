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
        
    @Then("Visualizo la respuesta del programa")
        public void viewGrafico(){
            Assert.assertTrue(triangleCalculatorPage.viewCanvas());
        }

}
