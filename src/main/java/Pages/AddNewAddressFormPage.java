package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressFormPage extends BasePage {

    @FindBy(id = "field-alias")
    private WebElement addressAliasInputField;

    @FindBy(id = "field-company")
    private WebElement addressCompanyInputField;

    @FindBy(id = "field-vat_number")
    private WebElement addressVatInputField;

    @FindBy(id = "field-address1")
    private WebElement addressAddressInputField;

    @FindBy(id = "field-address2")
    private WebElement addressAddressComplementInputField;

    @FindBy(id = "field-city")
    private WebElement addressCityInputField;

    @FindBy(id = "field-postcode")
    private WebElement addressZipCodeInputField;

    @FindBy(id = "field-phone")
    private WebElement addressPhoneInputField;

    @FindBy(className = "btn.btn-primary.form-control-submit.float-xs-right")
    private WebElement saveNewAddressButton;

    public AddNewAddressFormPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddressAliasInputField() {
        return getVisibleElement(addressAliasInputField);
    }

    public WebElement getAddressCompanyInputField() {
        return getVisibleElement(addressCompanyInputField);
    }

    public WebElement getAddressVatInputField() {
        return getVisibleElement(addressVatInputField);
    }

    public WebElement getAddressAddressInputField() {
        return getVisibleElement(addressAddressInputField);
    }

    public WebElement getAddressAddressComplementInputField() {
        return getVisibleElement(addressAddressComplementInputField);
    }

    public WebElement getAddressCityInputField() {
        return getVisibleElement(addressCityInputField);
    }

    public WebElement getAddressZipCodeInputField() {
        return getVisibleElement(addressZipCodeInputField);
    }

    public WebElement getAddressPhoneInputField() {
        return getVisibleElement(addressPhoneInputField);
    }

    public WebElement getSaveNewAddressButton() {
        return getVisibleElement(saveNewAddressButton);
    }

    public void fillAddressForm(String aliasName, String companyName, String vatNumber, String addressDetails, String addressComplement, String cityName, String zipCode, String phoneNumber) {
        getAddressAliasInputField().sendKeys(aliasName);
        getAddressCompanyInputField().sendKeys(companyName);
        getAddressVatInputField().sendKeys(vatNumber);
        getAddressAddressInputField().sendKeys(addressDetails);
        getAddressAddressComplementInputField().sendKeys(addressComplement);
        getAddressCityInputField().sendKeys(cityName);
        getAddressZipCodeInputField().sendKeys(zipCode);
        getAddressPhoneInputField().sendKeys(phoneNumber);
    }

    public void submitNewAddressForm() {
        getSaveNewAddressButton().click();
    }

}
