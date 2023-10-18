package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(name = "Addresses")
    private WebElement addressesButton;

    @FindBy(name = "Information")
    private WebElement informationButton;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddressesButton() {
        return getVisibleElement(addressesButton);
    }

    public void clickAddressesButton() {
        getAddressesButton().click();
    }

    public WebElement getInformationButton(){ return getVisibleElement(informationButton);}

    public void clickInformationButton(){
        getInformationButton().click();
    }
}
