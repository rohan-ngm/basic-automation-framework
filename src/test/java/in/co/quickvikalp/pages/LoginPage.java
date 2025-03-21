package in.co.quickvikalp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;
    Logger logger = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement loginButton;


    public LoginPage(WebDriver driver) {
        logger.info("Login Page constructor initiated");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public WebElement getUsername() {
        return wait.until(ExpectedConditions.visibilityOf(username));
    }

    public WebElement getPassword() {
        return wait.until(ExpectedConditions.visibilityOf(password));
    }

    public WebElement getLoginButton() {
        return wait.until(ExpectedConditions.visibilityOf(loginButton));
    }
}
