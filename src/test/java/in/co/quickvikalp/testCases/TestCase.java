package in.co.quickvikalp.testCases;

import in.co.quickvikalp.actions.LoginActions;
import in.co.quickvikalp.utils.AppConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {

    WebDriver driver;
    LoginActions loginActions = new LoginActions();
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
        loginActions.enterUsername(driver, AppConstants.USERNAME);
        loginActions.enterPassword(driver, AppConstants.PASSWORD);
        loginActions.clickLoginButton(driver);
        logger.info("Login initiated, now waiting for 5 seconds");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        logger.info("Chrome browser closed");
    }

}
