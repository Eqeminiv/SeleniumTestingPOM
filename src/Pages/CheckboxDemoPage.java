package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxDemoPage {


    private static String pageUrl = "basic-checkbox-demo.html";

    public static WebElement checkboxIsSelected (WebDriver driver)
    { return driver.findElement(By.id("isAgeSelected")); }

    public static WebElement resultText (WebDriver driver)
    { return driver.findElement(By.id("txtAge")); }

    public static WebElement grpCheckbox1 (WebDriver driver)
    { return driver.findElement(By.xpath("//label[text()='Option 1']")); }

    public static WebElement grpCheckbox2 (WebDriver driver)
    { return driver.findElement(By.xpath("//label[text()='Option 2']")); }

    public static WebElement grpCheckbox3 (WebDriver driver)
    { return driver.findElement(By.xpath("//label[text()='Option 3']")); }

    public static WebElement grpCheckbox4 (WebDriver driver)
    { return driver.findElement(By.xpath("//label[text()='Option 4']")); }

    public static WebElement areCheckedCheckbox (WebDriver driver)
    { return driver.findElement(By.id("isChkd")); }

    public static String getUrl(){
        return pageUrl;
    }

}
