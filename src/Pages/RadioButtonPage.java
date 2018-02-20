package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {

    private static String pageUrl = "basic-radiobutton-demo.html";

    public static WebElement maleRadioButton (WebDriver driver)
    { return driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']")); }

    public static WebElement checkButton (WebDriver driver)
    { return driver.findElement(By.id("buttoncheck")); }

    public static WebElement checkButtonThesis (WebDriver driver)
    { return driver.findElement(By.xpath("//p[@class='radiobutton']")); }

    public static WebElement grp_FemaleRadioButton (WebDriver driver)
    { return driver.findElement(By.xpath("//input[@value='Female' and @name='gender']")); }

    public static WebElement grp_Age15_50_RadioButton (WebDriver driver)
    { return driver.findElement(By.xpath("//input[@value='15 - 50' and @name='ageGroup']")); }

    public static WebElement grp_checkButton (WebDriver driver)
    { return driver.findElement(By.xpath("//button[@onclick='getValues();' and @type='button']")); }

    public static WebElement grp_checkButtonThesis (WebDriver driver)
    { return driver.findElement(By.xpath("//p[@class='groupradiobutton']")); }

    public static String getUrl(){
        return pageUrl;
    }
}
