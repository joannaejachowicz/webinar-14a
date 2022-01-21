import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHomework extends BaseTest {
    @Test
    public void multipleWindowsTests() {
        driver.get("https://demoqa.com/browser-windows");
        Assert.assertEquals(driver.findElement(By.cssSelector("#app > div > div > div.pattern-backgound.playgound-header > div")).getText(), "Browser Windows");
        driver.findElement(By.id("windowButton")).click();

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();

        allWindowHandles.forEach(windowElement -> {
            if (!windowElement.equals(mainWindow)) {
                driver.switchTo().window(windowElement);
            }

        });
        Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(), "This is a sample page");
        driver.switchTo().window(mainWindow);

        driver.findElement(By.id("tabButton")).click();

        String mainWindow1 = driver.getWindowHandle();
        Set<String> allWindowHandles1 = driver.getWindowHandles();

        allWindowHandles1.forEach(windowElement -> {
            if (!windowElement.equals(mainWindow1)) {
                driver.switchTo().window(windowElement);
            }

        });
        Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(), "This is a sample page");
        driver.switchTo().window(mainWindow1);

        driver.findElement(By.id("messageWindowButton")).click();

        String mainWindow2 = driver.getWindowHandle();
        Set<String> allWindowHandles2 = driver.getWindowHandles();

        allWindowHandles2.forEach(windowElement -> {
            if (!windowElement.equals(mainWindow2)) {
                driver.switchTo().window(windowElement);
            }

        });
        Assert.assertEquals(driver.findElement(By.cssSelector("body")).getText(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
        driver.switchTo().window(mainWindow2);


    }
}
