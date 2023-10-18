package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(css = "#addresses-link")
    private WebElement addressesButton;


    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddressesButton() {
        return getVisibleElement(addressesButton);
    }

    public void clickAddressesButton() {
        getAddressesButton().click();
    }


}
