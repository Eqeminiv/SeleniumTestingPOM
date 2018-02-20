package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePaginationPage {

    private static String pageUrl = "table-pagination-demo.html";

    public static WebElement selectedPageButton (WebDriver driver, char pageNumber)
    { return driver.findElement(By.xpath("//a[text()='"+pageNumber+"']")); }

    public static WebElement nextPageButton (WebDriver driver)
    { return driver.findElement(By.xpath("//a[@class='next_link']")); }

    public static WebElement previousPageButton (WebDriver driver)
    { return driver.findElement(By.xpath("//a[@class='prev_link']")); }

    public static String getUrl(){
        return pageUrl;
    }
}
