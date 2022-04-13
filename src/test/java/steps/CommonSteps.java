package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BasePage;

public class CommonSteps {

    @Before
    public static void startNavigation(Scenario scenario) {
        BasePage.openBrowser();
    }

    @After
    public static void closeNavigation(Scenario scenario) {
        if (scenario.isFailed()) {
            BasePage.takeScreenshot(scenario);
        }
        BasePage.closeBrower();
    }
    
}
