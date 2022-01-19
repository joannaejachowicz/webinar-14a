import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Testujexcercises extends BaseTest{

//    @Test
//   public void printPageTitle(){
//       driver.get("https://testuj.pl/");
//        String pageTitle = driver.getTitle();
//       System.out.println(pageTitle);
//
//    }
//
//    @Test
//    public void countLinks(){
//        driver.get("https://www.bbc.com");
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("The number of links is " + links.size());
//
//   }
//
//    @Test
//    public void countImages(){
//      driver.get("https://www.bbc.com");
//       List<WebElement> images = driver.findElements(By.tagName("img"));
//       System.out.println("The number of images is " + images.size());
//
//    }
//
//    @Test
//   public void loginOrange() {
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//        WebElement usernameInputa = driver.findElement(By.id("txtUsername"));
//        usernameInputa.sendKeys("Admin");
//
//        WebElement passwordInputa = driver.findElement(By.id("txtPassword"));
//        passwordInputa.sendKeys("admin123");
//
//        WebElement pushLoginButtona = driver.findElement(By.id("btnLogin"));
//        pushLoginButtona.click();
//
//        String successUrla = driver.getCurrentUrl();
//        String expectedUrla =("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
//
//        Assert.assertEquals(successUrla,expectedUrla);
//
//
//
//    }
//
//
//
//        @Test
//        public void wrongLoginOrange(){
//            driver.get("https://opensource-demo.orangehrmlive.com/");
//            WebElement usernameInputb = driver.findElement(By.id("txtUsername"));
//            usernameInputb.sendKeys("WrongUsername");
//
//            WebElement passwordInputb = driver.findElement(By.id("txtPassword"));
//            passwordInputb.sendKeys("WrongPassword");
//
//            WebElement pushLoginButtonb = driver.findElement(By.id("btnLogin"));
//            pushLoginButtonb.click();
//
//            WebElement wrongCrudentials = driver.findElement(By.id("spanMessage"));
//
//
//
//    }
//select (5)
//    @Test
//            public void selectElementsFromShop() {
//        driver.get("https://demo.guru99.com/payment-gateway/index.php");
//        WebElement selectList = driver.findElement(By.name("quantity"));
//
//        Select select = new Select(selectList);
//        select.selectByValue("3");
//        Assert.assertEquals(select.getFirstSelectedOption().getText(),"3");
//
//        WebElement buyNowButton = driver.findElement(By.cssSelector("#three > div > form > div > div.\\33 u.\\31 2u\\$\\(small\\) > ul > li > input"));
//        buyNowButton.click();
//
//        WebElement payAmount = driver.findElement(By.cssSelector("#three > div > form > div.row > div > font:nth-child(2)"));
//        Assert.assertEquals(payAmount.getText(),"$60.00");
//    }
// (6) happy path
    @Test
    public void dragAndDroppAction() {
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement acceptCookiesButton = driver.switchTo().frame("gdpr-consent-notice").findElement(By.cssSelector("#save"));
        acceptCookiesButton.click();

        driver.switchTo().parentFrame();

        WebElement orangeFirstBlocks = driver.findElement(By.cssSelector("#fourth > a"));
        WebElement greyFirstBlocks = driver.findElement(By.id("amt7"));
        Actions moveBlocks = new Actions(driver);
        moveBlocks.dragAndDrop(orangeFirstBlocks, greyFirstBlocks).pause(1000).build().perform();

        WebElement orangeSecondBlocks = driver.findElement(By.cssSelector("#credit2 > a"));
        WebElement greySecondBlocks = driver.findElement(By.cssSelector("#bank"));
        Actions moveBlocksSecond = new Actions(driver);
        moveBlocksSecond.dragAndDrop(orangeSecondBlocks, greySecondBlocks).pause(1000).build().perform();

        WebElement orangeThirdBlocks = driver.findElement(By.cssSelector("#fourth > a"));
        WebElement greyThirdBlocks = driver.findElement(By.cssSelector("#amt8"));
        Actions moveBlocksThird = new Actions(driver);
        moveBlocksThird.dragAndDrop(orangeThirdBlocks,greyThirdBlocks).pause(1000).build().perform();

        WebElement orangeFourthBlocks = driver.findElement(By.cssSelector("#credit1 > a"));
        WebElement greyFourthBlocks = driver.findElement(By.cssSelector("#loan"));
        Actions moveBlocksFourth = new Actions(driver);
        moveBlocksFourth.dragAndDrop(orangeFourthBlocks,greyFourthBlocks).pause(1000).build().perform();

        WebElement perfectButton = driver.findElement(By.cssSelector("#equal > a"));
        String perfectButtonText = perfectButton.getText();
        Assert.assertTrue(perfectButtonText.contains("Perfect!"));




    }









}
