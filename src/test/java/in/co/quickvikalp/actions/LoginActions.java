package in.co.quickvikalp.actions;

import in.co.quickvikalp.pages.LoginPage;
import in.co.quickvikalp.utils.AppConstants;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginActions {

    Logger logger = LoggerFactory.getLogger(LoginActions.class);

    public void enterUsername(WebDriver driver, String username) {
        logger.info("Username to be entered is {}", username);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsername().sendKeys(AppConstants.USERNAME);
        logger.info("Username entered successfully");
    }

    public void enterPassword(WebDriver driver, String password) {
        logger.info("Password to be entered is {}", password);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getPassword().sendKeys(AppConstants.PASSWORD);
        logger.info("Password entered successfully");
    }

    public void clickLoginButton(WebDriver driver) {
        logger.info("Clicking the login button");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getLoginButton().click();
        logger.info("Login button clicked successfully");
    }
}