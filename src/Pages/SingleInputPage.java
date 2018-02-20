package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleInputPage {

    private static String pageUrl = "basic-first-form-demo.html";

    public static WebElement messageInput (WebDriver driver)
    { return driver.findElement(By.id("user-message")); }

    public static WebElement showMessageButton (WebDriver driver)
    { return driver.findElement(By.xpath("//button[@type='button' and @onclick='showInput();']")); }

    public static WebElement yourMessageField (WebDriver driver)
    { return driver.findElement(By.xpath("//span[@id='display']")); }

    public static WebElement firstSumInput (WebDriver driver)
    { return driver.findElement(By.id("sum1")); }

    public static WebElement secondSumInput (WebDriver driver)
    { return driver.findElement(By.id("sum2")); }

    public static WebElement sumButton (WebDriver driver)
    { return driver.findElement(By.xpath("//button[@type='button' and @onclick='return total()']")); }

    public static WebElement sumField (WebDriver driver)
    { return driver.findElement(By.xpath("//span[@id='displayvalue']")); }



    public static String getUrl(){
        return pageUrl;
    }
}
