import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

public class SignUpTest extends BaseTest{
    HomePage homePage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void setUp()
    {
        homePage = new HomePage();
        signUpPage = new SignUpPage();
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
