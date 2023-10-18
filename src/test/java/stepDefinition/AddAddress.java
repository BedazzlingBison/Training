package stepDefinition;

import Pages.HeaderPage;
import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.AddNewAddressFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class AddAddress {

    private WebDriver driver;

    private AddNewAddressFormPage addNewAddressFormPage;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Given("the user on the account page, successfully logged in")
    public void theUserOnTheAccountPageSuccessfullyLoggedIn() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?");
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickUserLoginButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToUserAccount("pgojtlzdcmtlahwncp@cwmxc.com", "CodersLab123");


    }


    @When("Addresses button is clicked")
    public void addressesButtonIsClicked() {
    }

    @And("Add New Address button is clicked")
    public void addNewAddressButtonIsClicked() {
    }

    @And("the Form is filled {} {} {} {} {} {}{}{}")
    public void theFormIsFilled(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
    }

    @And("the Save Address Button ic clicked")
    public void theSaveAddressButtonIcClicked() {
    }

    @Then("a {string} message is displayed")
    public void aMessageIsDisplayed(String arg0) {
    }
}
