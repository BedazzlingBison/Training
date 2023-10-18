package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesInAccountPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/a/span")
    private WebElement addNewAddress;

    public WebElement getAddNewAddress() {
        return getVisibleElement(addNewAddress);
    }

    public void clickAddNewAddressButton(){
        getAddNewAddress().click();
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
