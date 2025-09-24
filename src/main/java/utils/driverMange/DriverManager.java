package utils.driverMange;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.config.LoadProperties;

import java.time.Duration;

public class DriverManager {
    static WebDriver driver;
    static String browser = LoadProperties.BROWSER;
    static String baseUrl = LoadProperties.URL;

    private DriverManager() {}

    public static void setupDriver() {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // Implicit wait
        driver.get(baseUrl);
    }

    public static WebDriver getDriver() {
        if(driver == null) {
            setupDriver();
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
    }
}
