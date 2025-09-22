import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void Init() {
        DriverManager.setupDriver();
    }

    @AfterTest
    public void teardown() {
        DriverManager.closeDriver();
    }
}
