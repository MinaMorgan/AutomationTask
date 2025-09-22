package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.commonHelper.ElementHelper;

public class SignInPage {
    WebDriver driver;

    By loginEmail = By.xpath("//input[@data-qa='login-email']");
    By loginPassword = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[@data-qa='login-button']");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignInPage enterLoginEmail(String email){
        ElementHelper.sendText(driver, loginEmail, email);
        return this;
    }

    public SignInPage enterLoginPassword(String password){
        ElementHelper.sendText(driver, loginPassword, password);
        return this;
    }

    public SignInPage clickLoginButton(){
        ElementHelper.click(driver, loginButton);
        return this;
    }
}
