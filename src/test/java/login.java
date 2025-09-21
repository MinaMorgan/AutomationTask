import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/login");

    }

    @Test
    public void signInTest(){
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("emaill@email.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.automationexercise.com/";
        Assert.assertEquals(actualURL, expectedURL, "Failed to login");
    }

    @Test
    public void signUpTest(){

        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Mina");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("emaill@email.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("1234");
        WebElement Days = driver.findElement(By.id("days"));

        // Date of Birth Dropdown
        Select day = new Select(Days);
        day.selectByVisibleText("15");
        WebElement Months = driver.findElement(By.id("months"));
        Select month = new Select(Months);
        month.selectByIndex(6);
        WebElement Years = driver.findElement(By.id("years"));
        Select year = new Select(Years);
        year.selectByValue("2020");

        driver.findElement(By.id("first_name")).sendKeys("Mina");
        driver.findElement(By.id("last_name")).sendKeys("Morgan");
        driver.findElement(By.id("address1")).sendKeys("Earth");

        // Country Dropdown
        WebElement countries = driver.findElement(By.id("country"));
        Select country = new Select(countries);
        country.selectByVisibleText("United States");

        driver.findElement(By.id("state")).sendKeys("Earth State");
        driver.findElement(By.id("city")).sendKeys("Center of the Earth");
        driver.findElement(By.id("zipcode")).sendKeys("12345");
        driver.findElement(By.id("mobile_number")).sendKeys("0666666");
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.automationexercise.com/account_created";
        Assert.assertEquals(actualURL, expectedURL, "Failed to sign up");
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
