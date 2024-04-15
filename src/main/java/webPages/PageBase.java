package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    /**************************************OBJECTS_DECLARATIONS*****************************************/
    protected WebDriver driver;

    /****************************************CONSTRUCTORS***********************************************/
    public PageBase(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
