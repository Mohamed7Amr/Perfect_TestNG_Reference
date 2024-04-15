package webPages.loginForm_Page;

import org.openqa.selenium.WebDriver;

public class LoginForm_Actions extends LoginForm_WebElements{

    /****************************************CONSTRUCTORS***********************************************/
    public LoginForm_Actions(WebDriver driver) {
        super(driver);
    }

    /*****************************************ACTIONS***************************************************/
    public void insert_Username()
    {
        username_Txt.sendKeys("hamada");
    }
    public void insert_Password()
    {
        password_Txt.sendKeys("123");
    }
    public void click_SignIn()
    {
        signIn_Btn.click();
    }
}
