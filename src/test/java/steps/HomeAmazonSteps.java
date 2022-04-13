package steps;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AmazonHomePage;
import pages.BasePage;

public class HomeAmazonSteps {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    String category;

    @Given("I am in the Amazon home page")
    public void i_am_in_the_Amazon_home_page() {
        amazonHomePage.navigateToAmazon();
    }

    @When("the page loads")
    public void the_page_loads() {
        Assert.assertEquals("Validate the home page loads properly", BasePage.getUrl(), "https://www.amazon.com/");
    }

    @Then("the following highlight categories should be displayed:")
    public void the_following_highlight_categories_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> columns : rows) {
            String value = columns.get(0);
            Assert.assertTrue(amazonHomePage.checkIfCategoryIsDisplayed(value));
        }
    }

    @When("I search for the category {string} in the dropdown of the search field")
    public void i_search_for_the_category_in_the_dropdown_of_the_search_field(String value) {
        category = value;
        amazonHomePage.searchCategory(value);
    }

    @Then("I should be redirected to the result page of the category {string}")
    public void i_should_be_redirected_to_the_result_page_of_the_category(String value) {
        // Assert.assertTrue(BasePage.toBeVisible("//b[text()='" + value + "']"));
        Assert.assertTrue(BasePage.toBeVisible("//b[text()='Hola']"));
    }

}
