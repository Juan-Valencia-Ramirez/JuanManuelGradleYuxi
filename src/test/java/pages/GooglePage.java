package pages;

public class GooglePage extends BasePage {

    //constructor
    public GooglePage() {
        super(driver);
    }
    
    public void navigateToGoogle(){
        navigateTo("https://google.com");
    }

    
}
