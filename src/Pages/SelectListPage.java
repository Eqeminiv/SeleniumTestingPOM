package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectListPage {

    private static String pageUrl = "basic-select-dropdown-demo.html";

    public static WebElement selector (WebDriver driver)
    { return driver.findElement(By.id("select-demo")); }

    public static WebElement multiSelector (WebDriver driver)
    { return driver.findElement(By.id("multi-select")); }

    public static WebElement firstSelectedButton (WebDriver driver)
    { return driver.findElement(By.id("printMe")); }

    public static WebElement allSelectedButton (WebDriver driver)
    { return driver.findElement(By.id("printAll")); }

    public static String getUrl(){
        return pageUrl;
    }
}
