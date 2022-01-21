import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesHomework extends BaseTest{

    @Test
    public void checkTextInIFrames(){
        driver.get("https://demoqa.com/frames");
        Assert.assertEquals(driver.findElement(By.cssSelector("#app > div > div > div.pattern-backgound.playgound-header > div")).getText(),"Frames");
        WebElement frameFirst = driver.findElement((By.id("frame1")));
        driver.switchTo().frame(frameFirst);
        WebElement frameFirstText = driver.findElement(By.id("sampleHeading"));
        Assert.assertEquals(frameFirstText.getText(),"This is a sample page");
        driver.switchTo().defaultContent();

        WebElement frameSecond = driver.findElement((By.id("frame2")));
        driver.switchTo().frame(frameSecond);
        WebElement frameSecondText = driver.findElement(By.id("sampleHeading"));
        Assert.assertEquals(frameSecondText.getText(),"This is a sample page");
        driver.switchTo().defaultContent();




    }
}
