import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SelectMenu extends BaseTest{
    @Test(priority=1)
    public void WidgetsTesting() {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectValue = driver.findElement(By.cssSelector("#withOptGroup > div > div.css-1hwfws3"));
        selectValue.click();
        String sourceFirst = driver.getPageSource();

        WebElement firstValueFromTheList = driver.findElement(By.id("react-select-2-option-0-0"));
        firstValueFromTheList.click();

        WebElement selectOne = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[4]/div/div/div/div[1]"));
        selectOne.click();

        String source = driver.getPageSource();

        WebElement selectOneValue = driver.findElement(By.id("react-select-3-option-0-2"));
        selectOneValue.click();


        WebElement selectOldStyles = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(selectOldStyles);
        select.selectByValue("3");
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Yellow");

        WebElement multiselectDropDown = driver.findElement(By.cssSelector("#selectMenuContainer > div:nth-child(7) > div > div > div"));
        multiselectDropDown.click();
        String sourceSecond = driver.getPageSource();

        WebElement colour = driver.findElement(By.id("react-select-4-option-0"));
        colour.click();
        WebElement multiselectDropDownNext = driver.findElement(By.cssSelector("#selectMenuContainer > div:nth-child(7) > div > div > div"));
        WebElement colourNext = driver.findElement(By.id("react-select-4-option-1"));
        colourNext.click();

        WebElement standardMultiSelect = driver.findElement(By.id("cars"));
        Select selectCars = new Select(standardMultiSelect);
        selectCars.selectByValue("audi");
        selectCars.selectByValue("volvo");
        WebDriverWait waitForSelect = new WebDriverWait(driver, Duration.ofSeconds(20));
        Assert.assertEquals(selectCars.getFirstSelectedOption().getText(),"Volvo");










    }
}
