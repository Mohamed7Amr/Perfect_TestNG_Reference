package webPages.loginForm_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webPages.PageBase;

public class LoginForm_WebElements extends PageBase {

    /****************************************CONSTRUCTORS***********************************************/
    public LoginForm_WebElements(WebDriver driver)
    {
        super(driver);
    }

    /*****************************************WEB_ELEMENTS***********************************************/
    @FindBy(id = "username")
    WebElement username_Txt;
    @FindBy(id = "password")
    WebElement password_Txt;
    @FindBy(id = "log-in")
    WebElement signIn_Btn;

}
