import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DayNightJustJoinIt extends BaseTest{

    @Test
    public void checkDifferencesBetweenDayNightScreen(){
        driver.get("https://justjoin.it/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement themeToggle = driver.findElement(By.cssSelector("[class^=MuiToolbar-root] [class^=MuiSwitch-root]"));
        themeToggle.click();

        WebElement body = driver.findElement(By.tagName("body"));
        Assert.assertEquals(body.getCssValue("background-color"),"rgba(33, 33, 33, 1)");

        themeToggle.click();

        Assert.assertEquals(body.getCssValue("background-color"),"rgba(255, 255, 255, 1)");





    }
}
