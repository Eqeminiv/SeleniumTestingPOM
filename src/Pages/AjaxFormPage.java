package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AjaxFormPage {
    private static String pageUrl = "ajax-form-submit-demo.html";

    public static WebElement submitButton (WebDriver driver)
    { return driver.findElement(By.id("btn-submit")); }

    public static WebElement nameInput (WebDriver driver)
    { return driver.findElement(By.id("title")); }

    public static WebElement descriptionInput (WebDriver driver)
    { return driver.findElement(By.id("description")); }

    public static WebElement submitControl (WebDriver driver)
    { return driver.findElement(By.id("submit-control")); }

    public static String getUrl(){
        return pageUrl;
    }
}
