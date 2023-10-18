package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressFormPage extends BasePage {

    @FindBy(css = "#field-alias")
    private WebElement aliasInput;

    @FindBy(css = "#field-company")
    private WebElement companyName;

    @FindBy(id = "field-vat_number")
    private WebElement addressVatInput;

    @FindBy(id = "field-address1")
    private WebElement addressAddressInput;

    @FindBy(id = "field-address2")
    private WebElement addressAddressComplementInput;

    @FindBy(id = "field-city")
    private WebElement cityInput;

    @FindBy(id = "field-postcode")
    private WebElement zipCode;

    @FindBy(id = "field-phone")
    private WebElement phoneNumber;

    @FindBy(className = "btn.btn-primary.form-control-submit.float-xs-right")
    private WebElement saveNewAddressButton;

    public AddNewAddressFormPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAliasInput() {
        return getVisibleElement(aliasInput);
    }

    public WebElement getCompanyName() {
        return getVisibleElement(companyName);
    }

    public WebElement getAddressVatInput() {
        return getVisibleElement(addressVatInput);
    }

    public WebElement getAddressAddressInput() {
        return getVisibleElement(addressAddressInput);
    }

    public WebElement getAddressAddressComplementInput() {
        return getVisibleElement(addressAddressComplementInput);
    }

    public WebElement getCityInput() {
        return getVisibleElement(cityInput);
    }

    public WebElement getZipCode() {
        return getVisibleElement(zipCode);
    }

    public WebElement getPhoneNumber() {
        return getVisibleElement(phoneNumber);
    }

    public WebElement getSaveNewAddressButton() {
        return getVisibleElement(saveNewAddressButton);
    }

    public void fillAddressForm(String aliasInput, String companyName, String addressVatInput, String addressAddressInput, String addressAddressComplementInput, String cityInput, String zipCode, String phoneNumber) {
        getAliasInput().sendKeys(aliasInput);
        getCompanyName().sendKeys(companyName);
        getAddressVatInput().sendKeys(addressVatInput);
        getAddressAddressInput().sendKeys(addressAddressInput);
        getAddressAddressComplementInput().sendKeys(addressAddressComplementInput);
        getCityInput().sendKeys(cityInput);
        getZipCode().sendKeys(zipCode);
        getPhoneNumber().sendKeys(phoneNumber);
    }

    public void submitNewAddressForm() {
        getSaveNewAddressButton().click();
    }

}
