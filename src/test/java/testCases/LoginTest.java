package testCases;

import org.testng.annotations.Test;
import testBases.TestBase;
import webPages.loginForm_Page.LoginForm_Actions;

public class LoginTest extends TestBase {

    /*************************************OBJECTS_DECLARATIONS************************************/
    LoginForm_Actions lfa;


    /*************************************TEST_DATA**********************************************/




    /***************************************TEST_CASES*********************************************/

    @Test
    public void login()
    {
        lfa = new LoginForm_Actions(driver);

        lfa.insert_Username();
        lfa.insert_Password();
        lfa.click_SignIn();
    }
}
