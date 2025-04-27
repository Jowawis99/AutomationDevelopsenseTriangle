package pages;

public class TestValidarPage extends BasePage{

    public TestValidarPage(){
        super(driver);
    }

    public void navigatePage(){
        navigateTo("https://www.developsense.com/triangle/triangle.html");
    }

}
