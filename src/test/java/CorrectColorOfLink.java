import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ScreenshotUtil;

import java.time.Duration;

public class CorrectColorOfLink extends BaseTest{

    @Test
    public void checkColorOfLink() {
        driver.get("http://the-internet.herokuapp.com/entry_ad");
        //GDYBY MODAL SIĘ POJAWIŁ
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement modal = driver.findElement(By.cssSelector("#modal > div.modal > div.modal-footer > p"));
//        modal.click();
        WebElement linkColorWithoutHovering = driver.findElement(By.id("restart-ad"));
        ScreenshotUtil.takeScreenshot(driver, "color.jpg");
        String fontLinkColorWithoutHovering = linkColorWithoutHovering.getCssValue("color");
        String fontLinkColorWithoutHoveringHex = Color.fromString(fontLinkColorWithoutHovering).asHex();
        System.out.println(fontLinkColorWithoutHoveringHex);
        Assert.assertEquals(fontLinkColorWithoutHoveringHex, "#2ba6cb");
    }

        @Test
        public void colorOfLinkAfterHovering(){
            driver.get("http://the-internet.herokuapp.com/entry_ad");
            WebElement linkColorAfterHovering = driver.findElement(By.id("restart-ad"));
            Actions act = new Actions(driver);
            act.moveToElement(linkColorAfterHovering).perform();
            String fontLinkColorAfterHovering = linkColorAfterHovering.getCssValue("color");
            String fontLinkColorAfterHoveringHex = Color.fromString(fontLinkColorAfterHovering).asHex();
            System.out.println(fontLinkColorAfterHoveringHex);


        }













}
