package pages;

import static org.junit.Assert.assertEquals;


public class AmazonSearchHats extends BasePage {

    public static String searchTab = "//input[@id='twotabsearchtextbox']";
    public static String searchButton = "//input[@id='nav-search-submit-button']";
    public static String imageHat = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]";
    public static String clickDropdown = "(//span[@class='a-button-text a-declarative'])[1]";
    public static String example = "//span[contains(text(),"+"'hat for men'"+")]";
    public static String addTwoItems = "//ul[@role='listbox']/li[2]";
    public static String addToCart= "//input[@id='add-to-cart-button']";
    public static String firstPrice = "//span[@class='a-size-base a-color-price a-text-bold']";
    public static String firstQuantity = "//span[@class='a-color-base ewc-quantity-text']";
    public static String goToCart = "//a[@class='a-button-text']";
    public static String lastDropdown = "//span[@class='a-dropdown-label']";
    public static String secondPrice = "(//span[text()='$8.99'])[1]";
    public static String secondQuantity ="//span[@id='sc-subtotal-label-activecart']";  
    public static String addOneItem = "//a[@id='quantity_1']";

    public void navigateToAmazonHats() {
        navigateTo("https://www.amazon.com/");
    }
    public void searchHats(String value) {
        click(searchTab);
        fill(searchTab, "Hats for men");
        click(searchButton);
        click(imageHat);
        
    }

    public void selectFirstHats () {
        
        click(clickDropdown);
        click(addTwoItems);
        click(addToCart);
    }

    public void firstQuantityAndPrice() {
        System.out.println("First Price");
        System.out.println(getInnerText(firstPrice));
        System.out.println("First Quantity");
        System.out.println(getInnerText(firstQuantity));
    }

    public void secondQuantityAndPrice () throws InterruptedException  {
        click(goToCart);
        click(lastDropdown);
        click(addOneItem);
        Thread.sleep(3000);
    }


    public void finalQuantityAndPrice () throws InterruptedException {

        double finalValue = (17.98/2.0);
        


        System.out.println("Second Price");
        Thread.sleep(5000);
        System.out.println(getInnerText(secondPrice));
        System.out.println("Second Quantity");
        System.out.println(getInnerText(secondQuantity));
        assertEquals("$"+finalValue, getInnerText(secondPrice));
    }
    
    
}