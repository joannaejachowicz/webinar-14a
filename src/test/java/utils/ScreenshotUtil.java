package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String fileName) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(System.getProperty("user.dir") + "/target/" + fileName);
        try {

            FileUtils.copyFile(screenshot,destinationFile);
        } catch(IOException e){
            e.printStackTrace();;
        }
    }
}
