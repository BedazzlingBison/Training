package stepDefinition;

import Pages.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.autofill.model.Address;

import java.time.Duration;

public class LongWayAround {
    private WebDriver driver;

//    private AddNewAddressFormPage addNewAddressFormPage;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


    }


    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?");

    }

    @When("signin button is clicked")
    public void signinButtonIsClicked() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickUserLoginButton();
    }

    @And("user logs into their account")
    public void userLogsIntoTheirAccount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToUserAccount("pgojtlzdcmtlahwncp@cwmxc.com","CodersLab123");

    }

    @And("addresses button is clicked")
    public void addressesButtonIsClicked() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickAddressesButton();

    }

    @And("add new address button is clicked")
    public void addNewAddressButtonIsClicked() {
        AddressesInAccountPage addressesInAccountPage = new AddressesInAccountPage(driver);
        addressesInAccountPage.getAddNewAddress().click();
    }



    @And("address form is filled with {}{}{}{}{}{}{}{}")
    public void addressFormIsFilledWith(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
//        var div = wait.Until(ExpectedConditions.ElementIsVisible(By.ClassName("display-length")));
        AddNewAddressFormPage addNewAddressFormPage1 = new AddNewAddressFormPage(driver);
        addNewAddressFormPage1.fillAddressForm(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        addNewAddressFormPage1.submitNewAddressForm();

    }

//    @And("save new address button is clicked")
//    public void saveNewAddressButtonIsClicked() {
//        add
//
//    }
//
//    @Then("a success message is displayed")
//    public void aSuccessMessageIsDisplayed() {
//        AddressesInAccountPage addressesInAccountPage = new AddressesInAccountPage(driver);
//        String successText = addressesInAccountPage.getAlertAddNewAddressSuccess().getText();
//        Assert.assertEquals("Address successfully added!",successText);
//    }
}
