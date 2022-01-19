import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorsTest extends BaseTest {

    @Test
            public void testExample() {
            driver.get("http://sampleshop.inqa.pl/");


        WebElement elementLink = driver.findElement(By.linkText("Kontakt z nami"));
        WebElement elementPartial = driver.findElement(By.partialLinkText("Kontakt"));

        WebElement fullXpathElement = driver.findElement(By.xpath("/html/body/main/footer/div[2]/div/div[1]/div[1]/div/div[2]/ul/li[6]/a"));
        WebElement xpathElement = driver.findElement(By.xpath("//*[@id=\"link-static-page-contact-2\"]"));

}
    @Test
    public void classNameExample() {
        driver.get("http://sampleshop.inqa.pl/");

        WebElement element = driver.findElement(By.className("cart-products-count"));
        WebElement element2 = driver.findElement(By.cssSelector(".blockcart .cart-preview .inactive"));
        String actualCount = element.getText();

        Assert.assertEquals(actualCount, "{0}");
    }

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

       String successUrl = driver.getCurrentUrl();
        String expectedUrl =("https://the-internet.herokuapp.com/secure");

        Assert.assertEquals(successUrl,expectedUrl);


        WebElement logoutButton = driver.findElement(By.cssSelector(".button.secondary.radius"));



        //WebDriverWait wait = new WebDriverWait(driver, 30);
       // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("xyz")));
    }
}
