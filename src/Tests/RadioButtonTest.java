package Tests;

import Pages.BasePage;
import Pages.RadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends Testing{

    public RadioButtonTest()
    {
        super();
    }

    RadioButtonPage radioButtonPage;

    @Test
    public void test1()
    {
        driver.navigate().to(BasePage.getUrl()+radioButtonPage.getUrl());
        radioButtonPage.maleRadioButton(driver).click();
        radioButtonPage.checkButton(driver).click();
        Assert.assertEquals(radioButtonPage.checkButtonThesis(driver).getText(), "Radio button 'Male' is checked");
    }

    @Test
    public void test2()
    {
        radioButtonPage.grp_FemaleRadioButton(driver).click();
        radioButtonPage.grp_Age15_50_RadioButton(driver).click();
        radioButtonPage.grp_checkButton(driver).click();
        Assert.assertEquals(radioButtonPage.grp_checkButtonThesis(driver).getText(), "Sex : Female\nAge group: 15 - 50");
    }
}
