import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Form extends BaseTest{

    @Test
    public void fillingInAndSendingTheForm(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement FirstNameInput = driver.findElement(By.id("firstName"));
        FirstNameInput.sendKeys("Kunegunda");

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("Zakapior");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("joanna.jachowicz.learn@gmail.com");

        WebElement genderInput = driver.findElement(By.cssSelector("#gender-radio-2+label"));
        genderInput.click();

        WebElement mobileInput = driver.findElement(By.id("userNumber"));
        mobileInput.sendKeys("4123123123");

//        WebElement dateOFBirthInput = driver.findElement(By.id("dateOfBirthInput"));
//        dateOFBirthInput.click();
//        WebElement dateOfBirthItem = driver.findElement(By.id("#dateOfBirth .react-datepicker__week :first-child"));
//        dateOfBirthItem.click();

        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Biology");
        WebElement subjectsItem = driver.findElement(By.cssSelector("#subjectsContainer [class$=menu] :first-child"));
        subjectsItem.click();

        WebElement hobbiesInput = driver.findElement(By.cssSelector("#hobbies-checkbox-2+label"));
        hobbiesInput.click();

        WebElement imageInput = driver.findElement(By.id("uploadPicture"));
        imageInput.sendKeys("/Users/joannajachowicz/Downloads/asia.jpeg");

        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        currentAdress.sendKeys("Kwiatowa 5/12");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement state = driver.findElement(By.id("state"));
        state.click();
        WebElement stateItem = driver.findElement(By.cssSelector("#state [class$=menu] :first-child :first-child"));
        stateItem.click();


        WebElement city = driver.findElement(By.id("city"));
        city.click();
        WebElement cityItem = driver.findElement(By.cssSelector("#city [class$=menu] :first-child :first-child"));
        cityItem.click();

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

       WebElement popupWindow = driver.findElement(By.id("example-modal-sizes-title-lg"));

















    }
}
