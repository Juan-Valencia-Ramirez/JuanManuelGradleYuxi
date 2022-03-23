package steps;

import cucumber.api.java.en.*;
import pages.GooglePage;


public class GoogleSteps {
    
    GooglePage googlePage= new GooglePage();

    @Given("^I am on the Google search page$")
    public void navigateToGoogle(){
        googlePage.navigateToGoogle();
    }

    @When("^I search for a criteria$")
    public void searchCriteria(){
        
    }

    @And("^I click on the search button$")
    public void clickOnSearchButton(){
        
    }

    @Then("^the result is displayed on screen$")
    public void validateResutls(){
        
    }

}
