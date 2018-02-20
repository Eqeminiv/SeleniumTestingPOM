package Tests;

import Pages.BasePage;
import Pages.CheckboxDemoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxDemoTest extends Testing{
    public CheckboxDemoTest()
    {
        super();
    }

    CheckboxDemoPage checkboxDemoPage;

    @Test
    public void test1()
    {
        driver.navigate().to(BasePage.getUrl()+checkboxDemoPage.getUrl());
        checkboxDemoPage.checkboxIsSelected(driver).click();
        Assert.assertTrue(checkboxDemoPage.resultText(driver).getText().equals("Success - Check box is checked"));
    }

    @Test
    public void test2()
    {
        checkboxDemoPage.grpCheckbox1(driver).click();
        checkboxDemoPage.grpCheckbox2(driver).click();
        checkboxDemoPage.grpCheckbox3(driver).click();
        checkboxDemoPage.grpCheckbox4(driver).click();

        Assert.assertFalse(checkboxDemoPage.areCheckedCheckbox(driver).getAttribute("value").equals("true"));
    }
}
