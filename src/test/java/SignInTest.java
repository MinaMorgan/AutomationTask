import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;

public class SignInTest extends BaseTest{
    HomePage homePage;
    SignInPage signInPage;

    @BeforeTest
    public void setup() {
        homePage = new HomePage(DriverManager.getDriver());
        signInPage = new SignInPage(DriverManager.getDriver());
    }

    @Test
    public void signInTest(){
        homePage.clickSignInUp();
        signInPage.enterLoginEmail("mina@email.com")
                .enterLoginPassword("1234")
                .clickLoginButton();
    }
}
