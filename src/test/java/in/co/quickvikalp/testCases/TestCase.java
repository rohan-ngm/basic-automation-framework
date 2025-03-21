package in.co.quickvikalp.testCases;

import in.co.quickvikalp.actions.PerformSearch;
import in.co.quickvikalp.utils.AppConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {

    WebDriver driver;
    PerformSearch performSearch = new PerformSearch();
    Logger logger = LoggerFactory.getLogger(TestCase.class);

    @BeforeTest
    public void initiateBrowser() {
        logger.info("Chrome browser initiated");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void tutorial() {
        driver.manage().window().maximize();
        logger.info("Chrome browser maximized");
        driver.get(AppConstants.URI);
        logger.info("URI opened {}", AppConstants.URI);
        performSearch.enterName(driver, AppConstants.SEARCH_NAME);
        logger.info("Search performed");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        logger.info("Chrome browser closed");
    }

}
