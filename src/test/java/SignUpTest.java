import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;

import pages.HomePage;
import pages.SignUpPage;

import utils.datareaders.DataProviderUtils;
import utils.extentReport.ExtentReportListener;

@Listeners(ExtentReportListener.class)
public class SignUpTest extends BaseTest{
    HomePage homePage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void setUp()
    {
        homePage = new HomePage();
        signUpPage = new SignUpPage();
    }

    @DataProvider
    public Iterator<Object[]> getData() throws IOException {
        return DataProviderUtils.getData("src/test/resources/SignupTestData.json");
    }

    @Test(testName = "Sign Up Test", dataProvider = "getData")
    public void signUp(String Name, String Gender, String Day, String Month, String Year, String FirstName, String LastName, String Address, String Country, String State, String City, String ZipCode, String MobileNumber)
    {
        homePage.clickSignInUp();
        signUpPage.enterName(Name)
                .enterEmail()
                .clickSignUpButton()
                .chooseGender(Gender)
                .enterPassword()
                .chooseDay(Day).chooseMonth(Month).chooseYear(Year)
                .enterFirstName(FirstName)
                .enterLastName(LastName)
                .enterAddress1(Address)
                .chooseCountry(Country)
                .enterState(State)
                .enterCity(City)
                .enterZipcode(ZipCode)
                .enterMobileNumber(MobileNumber)
                .clickCreateAccountButton();
    }
}
