package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    WebDriver driver;

    By loginEmail = By.xpath("//input[@data-qa='login-email']");
    By loginPassword = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[@data-qa='login-button']");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignInPage enterLoginEmail(String email){
        driver.findElement(loginEmail).sendKeys(email);
        return this;
    }

    public SignInPage enterLoginPassword(String password){
        driver.findElement(loginPassword).sendKeys(password);
        return this;
    }

    public SignInPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return this;
    }
}
