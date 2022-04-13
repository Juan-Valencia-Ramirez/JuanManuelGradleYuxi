package pages;
public class AmazonHomePage extends BasePage {

    public static String cards = "//div[@class='a-cardui-header']";
    public static String categoriesDropdown = "//div[@id='nav-search-dropdown-card']";
    public static String searchButton = "//input[@id='nav-search-submit-button']";
    public static String leftDrawer = "//div[@id='s-refinements']";

    public void navigateToAmazon() {
        navigateTo("https://www.amazon.com/");
    }

    public boolean checkIfCategoryIsDisplayed(String value) {
        boolean isDisplayed = false;
        for (int i = 1; i <= getElementSize(cards); i++) {
            String text = getInnerText("(//div[@class='a-cardui-header'])[" + i + "]");
            if (text.equals(value)) {
                isDisplayed = true;
                break;
            }
        }
        return isDisplayed;
    }

    public void searchCategory(String value) {
        click(categoriesDropdown);
        click("//option[text()='" + value + "']");
        click(searchButton);
        find(leftDrawer);
    }

}
