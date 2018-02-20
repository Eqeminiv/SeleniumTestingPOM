package Tests;

import Pages.BasePage;
import Pages.TableSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableSearchTest extends Testing{

    static String filter = "SEO tags";
    static String name = "Zieko";
    public TableSearchTest()
    {
        super();
    }

    TableSearchPage tableSearchPage;

    @Test
    public void test1()
    {
        driver.navigate().to(BasePage.getUrl()+tableSearchPage.getUrl());
        tableSearchPage.filterInputField(driver).sendKeys(filter);
        Assert.assertTrue(tableSearchPage.letsFind(driver, filter).isDisplayed());
    }

}
