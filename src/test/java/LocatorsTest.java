import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorsTest extends BaseTest {

    @Test
    public void properCredentialsIsLoginTest() {
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("tomsmith");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("SuperSecretPassword!");

        WebElement pushLoginButton = driver.findElement(By.tagName("button"));
        pushLoginButton.click();

        WebElement successAlert = driver.findElement(By.id("flash"));
        String successText = successAlert.getText();

        Assert.assertTrue(successText.contains("You logged into a secure area"));

        //WebDriverWait wait = new WebDriverWait(driver, 30);
       // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("xyz")));
    }
}
