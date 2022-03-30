package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        String browser = "";
        File path = new File(".");
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                try {
                    System.setProperty("webdriver.gecko.driver",
                            path.getCanonicalPath() + "\\src\\test\\resources\\drivers\\geckodriver.exe");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                driver = new FirefoxDriver();
                break;
            default:
                try {
                    System.setProperty("webdriver.chrome.driver",
                            path.getCanonicalPath() + "\\src\\test\\resources\\drivers\\chromedriver.exe");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
    }

    // constructor
    public BasePage(WebDriver driver) {

        // instanciar
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    public static void closeBrower() {
        driver.close();
    }

    private static WebElement find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public static void clickElement(String locator) {
        find(locator).click();
    }

}
