package Tests;

import Pages.BasePage;
import Pages.SingleInputPage;
import org.testng.Assert;
import org.testng.annotations.*;



public class SingleInputTest extends Testing {

    public int num1;
    public int num2;
    public String text;

    public SingleInputTest()
    {
        super();
        text = "Example";
        num1 = 2;
        num2 = 3;
    }


    SingleInputPage singleInputPage;

    @Test
    public void test1()
    {
        driver.navigate().to(BasePage.getUrl()+singleInputPage.getUrl());
        singleInputPage.messageInput(driver).sendKeys(text);
        singleInputPage.showMessageButton(driver).click();
        Assert.assertEquals(singleInputPage.yourMessageField(driver).getText(), text);
    }

    @Test
    public void test2()
    {
        singleInputPage.firstSumInput(driver).sendKeys(String.valueOf(num1));
        singleInputPage.secondSumInput(driver).sendKeys(String.valueOf(num2));
        singleInputPage.sumButton(driver).click();
        Assert.assertEquals(singleInputPage.sumField(driver).getText(), String.valueOf(num1+num2));
    }
}
