import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.driverMange.DriverManager;

public class BaseTest {
    @BeforeClass
    public void Init() {
        DriverManager.getDriver();
    }

    @AfterClass
    public void teardown() {
        DriverManager.closeDriver();
    }
}
