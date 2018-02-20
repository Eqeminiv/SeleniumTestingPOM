package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableFilterPage {

    private static String pageUrl = "table-records-filter-demo.html";

    public static WebElement pagadoFilterButton (WebDriver driver)
    { return driver.findElement(By.xpath("//button[@data-target='pagado']")); }

    public static WebElement pendienteElement (WebDriver driver)
    { return driver.findElement(By.xpath("//tr[@data-status='pendiente']")); }

    public static WebElement pagadoElement (WebDriver driver)
    { return driver.findElement(By.xpath("//tr[@data-status='pagado']")); }

    public static WebElement canceladoElement (WebDriver driver)
    { return driver.findElement(By.xpath("//tr[@data-status='cancelado']")); }

    public static String getUrl(){
        return pageUrl;
    }

}
