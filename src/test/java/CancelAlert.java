import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



    public class CancelAlert extends BaseTest{


        @Test
        public void jsConfirmCancel () {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
            Alert alert = driver.switchTo().alert();
            Assert.assertEquals(alert.getText(), "I am a JS Confirm");
            alert.dismiss();
            Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Cancel");
        }
    }


