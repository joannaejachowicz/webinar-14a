import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainMenu extends BaseTest{

    @Test
    public void selectSubItem() {


        driver.get("https://demoqa.com/menu");
        WebElement menuItem = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > a"));
        Actions action = new Actions(driver);
        WebElement subItem = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul > li:nth-child(3) > a"));
        WebElement subSubItem = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(1) > a"));
        action.moveToElement(menuItem)
                .pause(1000)
                .moveToElement(subItem)
                .pause(1000)
                .moveToElement(subSubItem)
                .click()
                .pause(1000)
                .build()
                .perform();


    }
}
