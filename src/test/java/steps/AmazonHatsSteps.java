package steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AmazonSearchHats;


public class AmazonHatsSteps {

    AmazonSearchHats amazonSearchHats = new AmazonSearchHats();
    String category;

    

    @And("I search for {string} on the search bar")
    public void i_search_for_on_the_search_bar(String string) {
        category = string;
        amazonSearchHats.searchHats(category); 
    }
    
    
    @When("I select the first hats")
    public void i_select_the_first_hats() {
        amazonSearchHats.selectFirstHats();
    }


    @And("validate the following quantity and price is displayed")
    public void validate_the_following_quantity_and_price_is_displayed() {
        amazonSearchHats.firstQuantityAndPrice(); 
    }
    
    @And("I Reduce the quantity in Cart for the item selected")
    public void i_Reduce_the_quantity_in_Cart_for_the_item_selected() throws InterruptedException {
        amazonSearchHats.secondQuantityAndPrice();

    }

    @Then("finally validate quantity and price is displayed")
public void finally_validate_quantity_and_price_is_displayed() throws InterruptedException {
    amazonSearchHats.finalQuantityAndPrice();
}

}