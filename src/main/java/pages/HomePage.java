package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.driverMange.DriverManager;

public class HomePage {
    WebDriver driver;

    By signInUp = By.linkText("Signup / Login");

    public HomePage() {
        this.driver = DriverManager.getDriver();
    }

    public void clickSignInUp() {
        driver.findElement(signInUp).click();
    }
}
