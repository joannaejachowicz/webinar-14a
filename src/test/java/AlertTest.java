import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class AlertTest extends BaseTest{






    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test

    public void jsPromptTest() {
try {


    String value = Files.readString(Path.of("/Users/joannajachowicz/IdeaProjects/webinar-14a/alert.txt"));
    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
    Alert alert = driver.switchTo().alert();
    Assert.assertEquals(alert.getText(), "I am a JS prompt");
    alert.sendKeys(value);
    Thread.sleep(4000);
    alert.accept();
    Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: testuj.pl");

}

catch(
    Exception e) {
        e.printStackTrace();
    }
}

    @Test
    public void jsConfirmOkTest() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Confirm");
        alert.accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Ok");
    }

    @Test
    public void jsAlertTest() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert");
        alert.accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You successfully clicked an alert");
    }
}

