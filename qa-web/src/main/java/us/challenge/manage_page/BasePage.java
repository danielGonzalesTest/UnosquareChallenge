package us.challenge.manage_page;

import us.challenge.driver_manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    /**
     * This method is the constructor class.
     */
    public BasePage() {
        webDriver = DriverManager.getInstance().getWebDriver();
        webDriverWait = DriverManager.getInstance().getWebDriverWait();
        PageFactory.initElements(webDriver, this);
        webDriver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        webDriver.get(url);
    }

}
