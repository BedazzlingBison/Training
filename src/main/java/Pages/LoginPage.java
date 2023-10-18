package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "field-email")
    private WebElement userEmailInputField;

    @FindBy(id = "field-password")
    private WebElement userPasswordInputField;

    @FindBy(id = "submit-login")
    private WebElement userSignInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUserEmailInputField() {
        return getVisibleElement(userEmailInputField);
    }

    public WebElement getUserPasswordInputField() {
        return getVisibleElement(userPasswordInputField);
    }

    public WebElement getUserSignInButton() {
        return getVisibleElement(userSignInButton);
    }

    public void loginToUserAccount(String emailName, String userPassword) {
        getUserEmailInputField().sendKeys("pgojtlzdcmtlahwncp@cwmxc.com");
        getUserPasswordInputField().sendKeys("CodersLab123");
        getUserSignInButton().click();
    }

}
