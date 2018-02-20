package Tests;

import Pages.BasePage;
import Pages.TableFilterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableFilterTest extends Testing {

    public TableFilterTest()
    {
        super();
    }

    TableFilterPage tableFilterPage;

    @Test
    public void test1()
    {
        driver.navigate().to(BasePage.getUrl()+tableFilterPage.getUrl());
        tableFilterPage.pagadoFilterButton(driver).click();

        Assert.assertTrue(tableFilterPage.pagadoElement(driver).isDisplayed() &&
                                !tableFilterPage.pendienteElement(driver).isDisplayed() &&
                                !tableFilterPage.canceladoElement(driver).isDisplayed());
    }
}
