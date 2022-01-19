import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemoqa extends BaseTest{

    @Test
    public void expandListAndSelectValue(){

    driver.get("https://demoqa.com/checkbox");
    WebElement listButton = driver.findElement(By.cssSelector("#tree-node > ol > li > span > button"));
    listButton.click();
    WebElement downloadsButton = driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > span > label > span.rct-checkbox"));
    downloadsButton.click();
    WebElement result = driver.findElement(By.cssSelector("#result"));
    String resultText = result.getText();
    Assert.assertTrue(resultText.contains("downloads"));




    }
}
