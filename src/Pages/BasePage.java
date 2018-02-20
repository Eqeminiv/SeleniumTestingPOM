package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    static String url = "http://www.seleniumeasy.com/test/";
    public WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public static String getUrl()
    {
        return url;
    }

}
