import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;

public class SignInTest extends BaseTest{
    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod
    public void setup() {
        homePage = new HomePage();
        signInPage = new SignInPage();
    }

    @Test
    public void signIn(){
        homePage.clickSignInUp();
        signInPage.enterLoginEmail()
                .enterLoginPassword()
                .clickLoginButton();
    }
}
