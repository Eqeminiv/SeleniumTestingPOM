package Tests;

import Pages.AjaxFormPage;
import Pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AjaxFormTest extends Testing{
    public static long tolerance = 3000;
    public AjaxFormTest()
    {
        super();
    }

    AjaxFormPage ajaxFormPage;

    @Test
    public void test1()
    {
        driver.navigate().to(BasePage.getUrl()+ajaxFormPage.getUrl());
        ajaxFormPage.submitButton(driver).click();
        ajaxFormPage.nameInput(driver).sendKeys("Name");
        ajaxFormPage.descriptionInput(driver).sendKeys("Comment");
        ajaxFormPage.submitButton(driver).click();

        try{
            Thread.sleep(tolerance);
        }catch(InterruptedException ie){}

        Assert.assertTrue(ajaxFormPage.submitControl(driver).getText().equals("Form submited Successfully!"));
    }
}
