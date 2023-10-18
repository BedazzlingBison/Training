package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesInAccountPage extends BasePage {

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[3]/a")
    private WebElement addNewAddress;

    public WebElement getAddNewAddress() {
        return getVisibleElement(addNewAddress);
    }

    public AddressesInAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "alert.alert-success")
    private WebElement alertAddNewAddressSuccess;

    public WebElement getAlertAddNewAddressSuccess() {
        return getVisibleElement(alertAddNewAddressSuccess);
    }

}
