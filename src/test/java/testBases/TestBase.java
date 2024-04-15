package testBases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {

    /************************************OBJECTS_DECLARATIONS***************************/
    public WebDriver driver;

    /************************************ENVIRONMENT_DATA*******************************/
//    private String browser = LoadProperties.envConfig.getProperty("browser");
//
    String url = "https://demo.applitools.com/";
    String browser = "chrome";

    /***********************************ENVIRONMENT_CONFIGURATION*************************/
    @Parameters({"browser"})
    @BeforeMethod
    public void set_Up_Envirnoment()
    {
        switch (browser)
        {
            case "chrome": driver = new ChromeDriver();break;
            case "firefox": driver = new FirefoxDriver();break;
            case "edge": driver = new EdgeDriver();break;
            default: driver = new ChromeDriver();break;
        }

        driver.get(url);
        driver.manage().window().maximize();
    }

}
