package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.commonHelper.ElementHelper;
import utils.commonHelper.Global;
import utils.driverMange.DriverManager;

public class SignInPage {
    WebDriver driver;
    Global global;

    By loginEmail = By.xpath("//input[@data-qa='login-email']");
    By loginPassword = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[@data-qa='login-button']");

    public SignInPage() {
        this.driver = DriverManager.getDriver();
        this.global = Global.getGlobal();
    }

    public SignInPage enterLoginEmail(){
        ElementHelper.sendText(driver, loginEmail, global.getEmail());
        return this;
    }

    public SignInPage enterLoginPassword(){
        ElementHelper.sendText(driver, loginPassword, global.getPassword());
        return this;
    }

    public SignInPage clickLoginButton(){
        ElementHelper.click(driver, loginButton);
        return this;
    }
}
