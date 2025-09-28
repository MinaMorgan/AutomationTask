package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.commonHelper.ElementHelper;
import utils.commonHelper.Global;
import utils.driverMange.DriverManager;

public class SignUpPage {
    WebDriver driver;
    Global global;

    By signUpName = By.xpath("//input[@data-qa='signup-name']");
    By signUpEmail = By.xpath("//input[@data-qa='signup-email']");
    By signUpButton = By.xpath("//button[@data-qa='signup-button']");
    By signUpPassword = By.id("password");
    By daysDropdown = By.id("days");
    By monthsDropdown = By.id("months");
    By yearsDropdown = By.id("years");
    By firstName = By.id("first_name");
    By lastName = By.id("last_name");
    By address1 = By.id("address1");
    By countriesDropdown = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By zipcode = By.id("zipcode");
    By mobileNumber = By.id("mobile_number");
    By createAccountButton = By.xpath("//button[@data-qa='create-account']");

    public SignUpPage() {
        this.driver = DriverManager.getDriver();
        this.global = Global.getGlobal();
    }

    public SignUpPage enterName(String name)
    {
        ElementHelper.sendText(driver, signUpName, name);
        return this;
    }

    public SignUpPage enterEmail()
    {
        global.setEmail();
        ElementHelper.sendText(driver, signUpEmail, global.getEmail());
        return this;
    }

    public SignUpPage clickSignUpButton()
    {
        ElementHelper.click(driver, signUpButton);
        return this;
    }

    public SignUpPage chooseGender(String gender)
    {
        ElementHelper.findElementByText(driver, gender).click();
        return this;
    }

    public SignUpPage enterPassword()
    {
        global.setPassword();
        ElementHelper.sendText(driver, signUpPassword, global.getPassword());
        return this;
    }

    public SignUpPage chooseDay(String day){
        ElementHelper.selectFromDropDownByText(driver, daysDropdown, day);
        return this;
    }

    public SignUpPage chooseMonth(String month){
        ElementHelper.selectFromDropDownByText(driver, monthsDropdown, month);
        return this;
    }

    public SignUpPage chooseYear(String year){
        ElementHelper.selectFromDropDownByText(driver, yearsDropdown, year);
        return this;
    }

    public SignUpPage enterFirstName(String name)
    {
        ElementHelper.sendText(driver, firstName, name);
        return this;
    }

    public SignUpPage enterLastName(String name)
    {
        ElementHelper.sendText(driver, lastName, name);
        return this;
    }

    public SignUpPage enterAddress1(String address)
    {
        ElementHelper.sendText(driver, address1, address);
        return this;
    }

    public SignUpPage chooseCountry(String country)
    {
        ElementHelper.selectFromDropDownByText(driver, countriesDropdown, country);
        return this;
    }

    public SignUpPage enterState(String state)
    {
        ElementHelper.sendText(driver, this.state, state);
        return this;
    }

    public SignUpPage enterCity(String city)
    {
        ElementHelper.sendText(driver, this.city, city);
        return this;
    }

    public SignUpPage enterZipcode(String zipcode){
        ElementHelper.sendText(driver, this.zipcode, zipcode);
        return this;
    }

    public SignUpPage enterMobileNumber(String mobileNumber){
        ElementHelper.sendText(driver, this.mobileNumber, mobileNumber);
        return this;
    }

    public SignUpPage clickCreateAccountButton()
    {
        ElementHelper.click(driver, createAccountButton);
        return this;
    }
}
