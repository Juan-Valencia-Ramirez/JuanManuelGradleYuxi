package steps;

import org.junit.Assert;
import org.junit.Assert.*;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AmazonHomePage;
import pages.BasePage;

public class HomeAmazonSteps {

    AmazonHomePage amazonHomePage = new AmazonHomePage();

    @After
    public void closeNavigation() {
        BasePage.closeBrower();
    }

    @Given("I am in the Amazon home page")
    public void i_am_in_the_Amazon_home_page() {
        amazonHomePage.navigateToAmazon();
    }

    @When("the page loads")
    public void the_page_loads() {
        Assert.assertEquals(BasePage.getUrl(), "https://www.amazon.com/");
    }

    @Then("the Higlight categories should be displayed")
    public void the_Higlight_categories_should_be_displayed() {
        Assert.assertEquals(amazonHomePage.checkIfCategoriesIsDisplayed(), true);
    }

}
