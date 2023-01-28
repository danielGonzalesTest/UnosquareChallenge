package us.challenge.commons;

import org.openqa.selenium.interactions.Actions;
import us.challenge.driver_manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonInteractions {
    private static final Logger LOGGER = LogManager.getLogger(CommonInteractions.class.getSimpleName());

    private static WebDriver driver = DriverManager.getInstance().getWebDriver();
    private static WebDriverWait wait = DriverManager.getInstance().getWebDriverWait();
    private static Actions actionsInstance = null;

    public static void click(WebElement webElement) {
        webElement.click();
    }

    public static String getText(final WebElement webElement) {
        return webElement.getText();
    }

    public static WebElement getWebElementWithCss(final String cssLocator) {
        return driver.findElement(By.cssSelector(cssLocator));
    }

    /**
     * This method retrieves actions.
     *
     * @return Actions
     */
    private static Actions getActions() {
        if (actionsInstance == null) {
            actionsInstance = new Actions(driver);
        }
        return actionsInstance;
    }

    public static boolean isElementPresent(final WebElement webElement) {
        try {
            webElement.getTagName();
            return true;
        } catch (WebDriverException e) {
            LOGGER.warn("Web element not found " + e.getMessage());
            return false;
        }
    }

    public static void waitUntilElementNotDisplayed(final WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static boolean isElementDisplayed(final WebElement webElement) {
        try {
            webElement.isDisplayed();
            return true;
        } catch (WebDriverException e) {
            LOGGER.warn("Web element not displayed" + e.getMessage());
            return false;
        }
    }

    public static void setText(WebElement searchTextField, String text) { searchTextField.sendKeys(text); }

    public static void hoverOverWebElement(final WebElement element) {
        getActions().moveToElement(element).perform();
    }

    public static void waitUntilClickable(final WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
