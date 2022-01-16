import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Testujexcercises extends BaseTest{

    @Test
   public void printPageTitle(){
       driver.get("https://testuj.pl/");
        String pageTitle = driver.getTitle();
       System.out.println(pageTitle);

    }

    @Test
    public void countLinks(){
        driver.get("https://www.bbc.com");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The number of links is " + links.size());

   }

    @Test
    public void countImages(){
      driver.get("https://www.bbc.com");
       List<WebElement> images = driver.findElements(By.tagName("img"));
       System.out.println("The number of images is " + images.size());

    }

    @Test
   public void loginOrange() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement usernameInputa = driver.findElement(By.id("txtUsername"));
        usernameInputa.sendKeys("Admin");

        WebElement passwordInputa = driver.findElement(By.id("txtPassword"));
        passwordInputa.sendKeys("admin123");

        WebElement pushLoginButtona = driver.findElement(By.id("btnLogin"));
        pushLoginButtona.click();

        String successUrla = driver.getCurrentUrl();
        String expectedUrla =("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

        Assert.assertEquals(successUrla,expectedUrla);

    }



        @Test
        public void wrongLoginOrange(){
            driver.get("https://opensource-demo.orangehrmlive.com/");
            WebElement usernameInputb = driver.findElement(By.id("txtUsername"));
            usernameInputb.sendKeys("WrongUsername");

            WebElement passwordInputb = driver.findElement(By.id("txtPassword"));
            passwordInputb.sendKeys("WrongPassword");

            WebElement pushLoginButtonb = driver.findElement(By.id("btnLogin"));
            pushLoginButtonb.click();

            WebElement wrongCrudentials = driver.findElement(By.id("spanMessage"));



    }

}
