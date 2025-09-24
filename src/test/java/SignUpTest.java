import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;
import utils.driverMange.DriverManager;

public class SignUpTest extends BaseTest{
    HomePage homePage;
    SignUpPage signUpPage;

    @BeforeTest
    public void setUp()
    {
        homePage = new HomePage(DriverManager.getDriver());
        signUpPage = new SignUpPage(DriverManager.getDriver());
    }

    @Test
    public void signUp()
    {
        homePage.clickSignInUp();
        signUpPage.enterName()
                .enterEmail()
                .clickSignUpButton()
                .chooseGender("Mr")
                .enterPassword()
                .chooseDay("15")
                .chooseMonth("June")
                .chooseYear("2020")
                .enterFirstName("Mina")
                .enterLastName("Morgan")
                .enterAddress1()
                .chooseCountry("United States")
                .enterState("CA")
                .enterCity()
                .enterZipcode()
                .enterMobileNumber()
                .clickCreateAccountButton();
    }
}
