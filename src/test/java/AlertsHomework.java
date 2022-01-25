import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsHomework extends BaseTest{

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://demoqa.com/alerts");
    }

    @Test
        public void alertsMethods() {
        try {
            driver.findElement(By.id("alertButton")).click();
            Alert alert = driver.switchTo().alert();
            Assert.assertEquals(alert.getText(), "You clicked a button");
            alert.accept();

            driver.findElement(By.id("timerAlertButton")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Alert alertFirst = driver.switchTo().alert();
            Assert.assertEquals(alertFirst.getText(), "This alert appeared after 5 seconds");
            alertFirst.accept();

            driver.findElement(By.id("confirmButton")).click();
            Alert alertSecond = driver.switchTo().alert();
            Assert.assertEquals(alertSecond.getText(), "Do you confirm action?");
            alertSecond.accept();
            WebElement confirmResult = driver.findElement(By.id("confrimResult"));
            Assert.assertEquals(confirmResult.getText(), "You selected Ok");

            driver.findElement(By.id("confirmButton")).click();
            Alert alertThird = driver.switchTo().alert();
            Assert.assertEquals(alertThird.getText(), "Do you confirm action?");
            alertThird.dismiss();
            WebElement confirmResult1 = driver.findElement(By.id("confrimResult"));
            Assert.assertEquals(confirmResult1.getText(), "You selected Cancel");

            driver.findElement(By.id("promtButton")).click();
            Alert alertFourth = driver.switchTo().alert();
            Assert.assertEquals(alert.getText(), "Please enter your name");
            alertFourth.sendKeys("Asia");
            alertFourth.accept();
            WebElement confirmResult2 = driver.findElement(By.id("promtResult"));
            Assert.assertEquals(confirmResult2.getText(), "You entered Asia");


            driver.findElement(By.id("promtButton")).click();
            Alert alertFifth = driver.switchTo().alert();
            Assert.assertEquals(alertFifth.getText(), "Please enter your name");
            alertFifth.sendKeys("Asia");
            alertFifth.dismiss();

        } catch(Exception ex){
            System.out.println(ex.toString());
        }
        }

}


