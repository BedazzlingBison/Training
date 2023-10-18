package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

    @FindBy(xpath = "/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a/span")
    private WebElement userLoginButton;

    public HeaderPage(WebDriver driver){
        super(driver);
    }

    public WebElement getUserLoginButton(){
        return getVisibleElement(userLoginButton);
    }

    public void clickUserLoginButton(){
        getUserLoginButton().click();
    }

}
