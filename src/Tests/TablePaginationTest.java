package Tests;

import Pages.BasePage;
import Pages.TablePaginationPage;
import Pages.TableSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TablePaginationTest extends Testing{

    public TablePaginationTest()
    {
        super();
    }

    TablePaginationPage tablePaginationPage;

    @Test
    public void test1()
    {
        driver.navigate().to(BasePage.getUrl()+tablePaginationPage.getUrl());
        tablePaginationPage.selectedPageButton(driver, '3').click();
        Assert.assertFalse(tablePaginationPage.nextPageButton(driver).isDisplayed() && !tablePaginationPage.previousPageButton(driver).isDisplayed());
    }
}
