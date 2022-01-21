import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class IFrameTest extends BaseTest{

    @Test
    public void checkTextInIFrame(){
        driver.get("http://the-internet.herokuapp.com/iframe");
        //sprawdzenie czy zawiera nagłówek h3 TinyMCE WYSIWYG

        Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().contains("TinyMCE WYSIWYG"));
        WebElement iFrame = driver.findElement((By.id("mce_0_ifr")));

        List<WebElement> iframeList = driver.findElements(By.tagName("iframe"));

        driver.switchTo().frame(iFrame);

        Assert.assertNotNull(driver.findElement(By.id("tinymce")));

        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        Assert.assertTrue(driver.findElement(By.tagName("h3")).getText().contains("TinyMCE WYSIWYG"));
    }



}
