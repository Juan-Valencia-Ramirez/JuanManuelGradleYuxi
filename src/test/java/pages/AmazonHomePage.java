package pages;

import org.openqa.selenium.By;

public class AmazonHomePage extends BasePage {

    public static String categoryFreeShipping = "//h2[text()='Envío GRATIS a Colombia']";

    // constructor
    public AmazonHomePage() {
        super(driver);
    }

    public void navigateToAmazon() {
        navigateTo("https://www.amazon.com/");
    }

    public boolean checkIfCategoriesIsDisplayed() {
        return driver.findElement(By.xpath(categoryFreeShipping)).isDisplayed();
    }

}
