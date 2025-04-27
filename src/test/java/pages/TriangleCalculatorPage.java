package pages;

public class TriangleCalculatorPage extends BasePage{

    private String inputName = "//input[@id='username']";
    private String btnCheck = "//button[text()='Check']";
    private String graphCanvas = "//canvas[@id='triangleBox']";      


    public TriangleCalculatorPage(){
        super(driver);
    }

    public void navigateToTriangleCalculator(){
        navigateTo("https://www.developsense.com/triangle/triangle.html");
    }

    public void ingresoLadoTriangulo(String lado, String valor){
        String xpathLado = String.format("//input[@id='Side%s']", lado);
        write(xpathLado, valor);
    }
    
    public void ingresoNombre(String nombre){
        write(inputName, nombre);
    }

    public void clickCheck(){
        clickElement(btnCheck);    
    }

    public boolean viewCanvas(){
        return isDisplayed(graphCanvas);
    } 

}
