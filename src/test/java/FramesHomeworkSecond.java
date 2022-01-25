import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesHomeworkSecond extends BaseTest{

    @Test
    public void switchBetweenFrames(){
        driver.get("https://demoqa.com/nestedframes");
        Assert.assertEquals(driver.findElement(By.className("main-header")).getText(),"Nested Frames");
        WebElement frameParent = driver.findElement((By.id("frame1")));
        driver.switchTo().frame(frameParent);
        WebElement frameParentText = driver.findElement(By.cssSelector("body"));
        Assert.assertEquals(frameParentText.getText(),"Parent frame");
        WebElement frameChild = driver.findElement((By.cssSelector("body > iframe")));
        driver.switchTo().frame(frameChild);
        WebElement frameChildText = driver.findElement(By.cssSelector("body"));
        Assert.assertEquals(frameChildText.getText(),"Child Iframe");
        driver.switchTo().defaultContent();



    }

}
