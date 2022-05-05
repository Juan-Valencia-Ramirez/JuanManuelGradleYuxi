Feature: Test Search Hats and add to the cart

    @TestHats
    Scenario: The user search for hats
        Given I am in the Amazon home page
        And  I search for "hats for men" on the search bar
        When I select the first hats 
        And validate the following quantity and price is displayed
        And I Reduce the quantity in Cart for the item selected
        Then  finally validate quantity and price is displayed