Feature: Test Categories in the Home page

    @regression
    Scenario: All the Catagories are displayed on the Home page
        Given I am in the Amazon home page
        When the page loads
        Then the following highlight categories should be displayed:
            | Envío GRATIS a Colombia   |
            | Accesorios para juegos    |
            | Compras para Pascua       |
            | Computadoras y Accesorios |

    @regression
    Scenario: Search category
        Given I am in the Amazon home page
        When the page loads
        And I search for the category "Arte y artesanías" in the dropdown of the search field
        Then I should be redirected to the result page of the category "Artes y Manualidades"