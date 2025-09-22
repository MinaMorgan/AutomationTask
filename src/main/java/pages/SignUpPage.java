package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    WebDriver driver;

    By signUpName = By.xpath("//input[@data-qa='signup-name']");
    By signUpEmail = By.xpath("//input[@data-qa='signup-email']");
    By signUpButton = By.xpath("//button[@data-qa='signup-button']");
    By maleGender = By.id("id_gender1");
    By femaleGender = By.id("id_gender2");
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


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPage enterName(String name)
    {
        driver.findElement(signUpName).sendKeys(name);
        return this;
    }

    public SignUpPage enterEmail(String email)
    {
        driver.findElement(signUpEmail).sendKeys(email);
        return this;
    }

    public SignUpPage clickSignUpButton()
    {
        driver.findElement(signUpButton).click();
        return this;
    }

    public SignUpPage chooseGender()
    {
        driver.findElement(maleGender).click();
        return this;
    }

    public SignUpPage enterPassword(String password)
    {
        driver.findElement(signUpPassword).sendKeys(password);
        return this;
    }

    public SignUpPage chooseDay(String day){
        WebElement daysElement = driver.findElement(daysDropdown);
        Select days = new Select(daysElement);
        days.selectByVisibleText(day);
        return this;
    }

    public SignUpPage chooseMonth(String month){
        WebElement monthsElement = driver.findElement(monthsDropdown);
        Select months = new Select(monthsElement);
        months.selectByVisibleText(month);
        return this;
    }

    public SignUpPage chooseYear(String year){
        WebElement yearsElement = driver.findElement(yearsDropdown);
        Select years = new Select(yearsElement);
        years.selectByVisibleText(year);
        return this;
    }

    public SignUpPage enterFirstName(String firstName)
    {
        driver.findElement(this.firstName).sendKeys(firstName);
        return this;
    }

    public SignUpPage enterLastName(String lastName)
    {
        driver.findElement(this.lastName).sendKeys(lastName);
        return this;
    }

    public SignUpPage enterAddress1(String address1)
    {
        driver.findElement(this.address1).sendKeys(address1);
        return this;
    }

    public SignUpPage chooseCountry(String country)
    {
        WebElement countryElement = driver.findElement(countriesDropdown);
        Select countries = new Select(countryElement);
        countries.selectByVisibleText(country);
        return this;
    }

    public SignUpPage enterState(String state)
    {
        driver.findElement(this.state).sendKeys(state);
        return this;
    }

    public SignUpPage enterCity(String city)
    {
        driver.findElement(this.city).sendKeys(city);
        return this;
    }

    public SignUpPage enterZipcode(String zipcode){
        driver.findElement(this.zipcode).sendKeys(zipcode);
        return this;
    }

    public SignUpPage enterMobileNumber(String mobileNumber){
        driver.findElement(this.mobileNumber).sendKeys(mobileNumber);
        return this;
    }

    public SignUpPage clickCreateAccountButton()
    {
        driver.findElement(createAccountButton).click();
        return this;
    }
}
