import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

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
    public void signUpTest()
    {
        homePage.clickSignInUp();
        signUpPage.enterName("Mina")
                .enterEmail("mina@email.com")
                .clickSignUpButton()
                .chooseGender("Mr")
                .enterPassword("1234")
                .chooseDay("15")
                .chooseMonth("June")
                .chooseYear("2020")
                .enterFirstName("Mina")
                .enterLastName("Morgan")
                .enterAddress1("Earth")
                .chooseCountry("United States")
                .enterState("CA")
                .enterCity("Los Angeles")
                .enterZipcode("12345")
                .enterMobileNumber("0666666")
                .clickCreateAccountButton();
    }
}
