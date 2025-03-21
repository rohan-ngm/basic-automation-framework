package in.co.quickvikalp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoogleHomePage {

    WebDriver driver;
    Logger logger = LoggerFactory.getLogger(GoogleHomePage.class);

    @FindBy(id = "APjFqb")
    WebElement searchBox;

    public GoogleHomePage(WebDriver driver) {
        logger.info("GoogleHomePage constructor initiated");
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getSearchBox() {
        logger.info("Returned search box web element");
        return searchBox;
    }
}
