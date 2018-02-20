package Tests;

import Pages.BasePage;
import Pages.InputFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputFormTest extends Testing{

    static String firstName = "John";
    static String lastName = "Kentucky";
    static String email = "as@s";
    static String phone = "2313132312";
    static String address = "9/11; Manhattan";
    static String city = "New York";
    static String state = "New York";
    static String zipCode = "1234";
    static String website = "google.com";
    static String projectDescription = "Example description";
    public InputFormTest()
    {
        super();
    }

    InputFormPage inputFormPage;

    @Test
    public void test1()
    {
        driver.navigate().to(BasePage.getUrl()+inputFormPage.getUrl());
        inputFormPage.inputPicker(driver, "first_name").sendKeys(firstName);
        inputFormPage.inputPicker(driver, "last_name").sendKeys(lastName);
        inputFormPage.inputPicker(driver, "email").sendKeys(email);
        inputFormPage.inputPicker(driver, "phone").sendKeys(phone);
        inputFormPage.inputPicker(driver, "address").sendKeys(address);
        inputFormPage.inputPicker(driver, "city").sendKeys(city);
        inputFormPage.inputPicker(driver, "zip").sendKeys(zipCode);
        inputFormPage.inputPicker(driver, "website").sendKeys(website);
        inputFormPage.inputPicker(driver, "comment").sendKeys(projectDescription);

        Assert.assertNotEquals(inputFormPage.submitButton(driver).getAttribute("disabled"),"disabled");
    }
}
