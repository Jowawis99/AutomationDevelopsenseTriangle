package steps;

import io.cucumber.java.en.*;
import pages.TestValidarPage;

public class TestStep {

    TestValidarPage validateTest =  new TestValidarPage();

    @Given("I navigate to pag")
        public void navigatePagTest(){
            validateTest.navigatePage();
        }
    
}
