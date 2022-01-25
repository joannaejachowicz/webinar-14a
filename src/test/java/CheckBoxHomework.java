import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxHomework extends BaseTest{

    @Test
    public void checkBoxesTests (){
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        WebElement iHaveABikeButton = driver.findElement(By.xpath("//*[@id=\"post-909\"]/div/div[1]/div/div[3]/div/div[1]/div[8]/div/div/div/form/input[1]"));
        iHaveABikeButton.click();
        Assert.assertEquals(iHaveABikeButton.getAttribute("value"),"Bike");
        iHaveABikeButton.click();
        WebElement iHaveACarButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/article/div/div[1]/div/div[3]/div/div[1]/div[8]/div/div/div/form/input[2]"));
        iHaveACarButton.click();
        iHaveACarButton.click();

        Assert.assertEquals(driver.findElements(By.cssSelector("input[type=checkbox]:checked")).size(), 0);



    }
}
