package utils.commonHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementHelper {
    public static void click(WebDriver driver, By locator) {
        WaitHelper.waitForVisibility(driver, locator).click();
    }

    public static void sendText(WebDriver driver, By locator, String text) {
        WebElement element = WaitHelper.waitForVisibility(driver, locator);
        element.clear();
        element.sendKeys(text);
    }

    public static String getText(WebDriver driver, By locator) {
        WebElement element = WaitHelper.waitForVisibility(driver, locator);
        return element.getText();
    }

    public static WebElement findElementByText(WebDriver driver, String text) {
        By locator = By.xpath("//*[text()[contains(.,'" + text + "')]]");
        return WaitHelper.waitForVisibility(driver, locator);
    }

    public static void selectFromDropDownByText(WebDriver driver, By locator, String text) {
        WebElement element = WaitHelper.waitForClickable(driver, locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void selectFromDropDownByValue(WebDriver driver, By locator, String value){
        WebElement element = WaitHelper.waitForClickable(driver, locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void selectFromDropDownByIndex(WebDriver driver, By locator, int index){
        WebElement element = WaitHelper.waitForClickable(driver, locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
}
