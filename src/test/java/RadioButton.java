import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends BaseTest {

    @Test(priority = 1)
    public void clickOnRadioButton() {
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        WebElement yesButton = driver.findElement(By.cssSelector("#yesRadio"));
        boolean IsEnabledYesButton = yesButton.isEnabled();
        if (IsEnabledYesButton == true) {
            WebElement yesButtonLabel = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(2) > label"));
            yesButtonLabel.click();


        }

        WebElement yesButtonConfirmation = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > p"));
        String yesButtonConfirmationText = yesButtonConfirmation.getText();
        Assert.assertTrue(yesButtonConfirmationText.contains("Yes"));

    }

    @Test (priority = 2)
    public void clickOnImpressiveButton() {
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        WebElement impressiveButton = driver.findElement(By.id("impressiveRadio"));
        boolean IsEnabledImpressiveButton = impressiveButton.isEnabled();
        if (IsEnabledImpressiveButton == true) {
            WebElement impressiveButtonLabel = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div:nth-child(3) > label"));
            impressiveButtonLabel.click();

        }

        WebElement impressivwButtonConfirmation = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > p"));
        String impressiveButtonConfirmationText = impressivwButtonConfirmation.getText();
        Assert.assertTrue(impressiveButtonConfirmationText.contains("Impressive"));


    }

    @Test (priority = 3)
    public void clickOnNoButton() {
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        WebElement noButton = driver.findElement(By.id("noRadio"));
        boolean IsEnabledNoButton = noButton.isEnabled();
        if (IsEnabledNoButton == true) {
            WebElement noButtonLabel = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(1) > div.custom-control.disabled.custom-radio.custom-control-inline > label"));
            noButtonLabel.click();


        } else {
            return;
        }


    }
}
