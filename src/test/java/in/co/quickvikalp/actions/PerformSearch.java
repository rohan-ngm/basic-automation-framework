package in.co.quickvikalp.actions;

import in.co.quickvikalp.pages.GoogleHomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformSearch {

    Logger logger = LoggerFactory.getLogger(PerformSearch.class);

    public void enterName(WebDriver driver, String name) {
        logger.info("Name to be searched for is {}", name);
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchBox().sendKeys(name);
        googleHomePage.getSearchBox().sendKeys(Keys.ENTER);
        logger.info("Enter button clicked");
    }
}
