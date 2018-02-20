package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableSearchPage {

    private static String pageUrl = "table-search-filter-demo.html";

    public static WebElement filterInputField (WebDriver driver)
    { return driver.findElement(By.id("task-table-filter")); }

    public static WebElement letsFind (WebDriver driver, String filter)
    { return driver.findElement(By.xpath("//td[text()='"+filter+"']")); }

    public static WebElement filterActivationButton (WebDriver driver)
    { return driver.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-filter']")); }

    public static String getUrl(){
        return pageUrl;
    }

}
