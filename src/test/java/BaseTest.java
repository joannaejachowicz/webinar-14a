import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/joannajachowicz/Downloads/chromedriver");

        driver = new ChromeDriver();

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}