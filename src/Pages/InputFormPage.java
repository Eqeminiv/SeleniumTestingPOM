package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {

    private static String pageUrl = "input-form-demo.html";
    public static WebElement inputPicker (WebDriver driver, String name)
    { return driver.findElement(By.name(name)); }

    public static WebElement statePicker (WebDriver driver)
    { return driver.findElement(By.name("state")); }

    public static WebElement submitButton (WebDriver driver)
    { return driver.findElement(By.xpath("//button[@type='submit']")); }

    public static String getUrl(){
        return pageUrl;
    }
}
