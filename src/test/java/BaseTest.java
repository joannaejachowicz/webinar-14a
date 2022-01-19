import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/joannajachowicz/Downloads/chromedriver");
        //Create instance of ChromeOptions Class
        ChromeOptions handlingSSL = new ChromeOptions();

        //Using the accept insecure cert method with true as parameter to accept the untrusted certificate
        handlingSSL.setAcceptInsecureCerts(true);

        //Creating instance of Chrome driver by passing reference of ChromeOptions object
        driver = new ChromeDriver(handlingSSL);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//do selenium 3
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
