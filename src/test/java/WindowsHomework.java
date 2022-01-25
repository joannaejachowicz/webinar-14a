import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHomework extends BaseTest {
    public String switchToSecondWindow(){
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();

        allWindowHandles.forEach(windowElement -> {
            if (!windowElement.equals(mainWindow)) {
                driver.switchTo().window(windowElement);
            }

        });
        return mainWindow;
    }

    @Test
    public void multipleWindowsTests() {
        driver.get("https://demoqa.com/browser-windows");
        Assert.assertEquals(driver.findElement(By.cssSelector("#app > div > div > div.pattern-backgound.playgound-header > div")).getText(), "Browser Windows");
        driver.findElement(By.id("windowButton")).click();

        String mainWindow = switchToSecondWindow();

        Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(), "This is a sample page");
        driver.switchTo().window(mainWindow);

        driver.findElement(By.id("tabButton")).click();

        String mainWindow1 = switchToSecondWindow();

        Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText(), "This is a sample page");
        driver.switchTo().window(mainWindow1);

        driver.findElement(By.id("messageWindowButton")).click();

        String mainWindow2 = switchToSecondWindow();

        Assert.assertEquals(driver.findElement(By.cssSelector("body")).getText(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
        driver.switchTo().window(mainWindow2);


    }
}
