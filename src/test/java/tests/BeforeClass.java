

package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import steps.*;


import javax.validation.constraints.Size;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;


/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    /**
     *
     */
    @Managed(uniqueSession = true, driver = "chrome")



    public WebDriver driver;

    public String IEPath = "C:\\Test\\Automation testing(art-lemon)\\DriverBrowsers\\IEDriverServer.exe";
    public String ChromePath = "E:\\Test\\Browsers\\chromedriver.exe";


    /*Sign Up*/
    @Steps
    public AuthSteps signUp;
    @Steps
    public AuthSteps email;
    @Steps
    public AuthSteps pass;
    @Steps
    public AuthSteps check;
    @Steps
    public AuthSteps login;

    /*Error sign*/

    @Steps
    public AuthErrorSteps signUpError;
    @Steps
    public AuthErrorSteps emailError;
    @Steps
    public AuthErrorSteps passError;
    @Steps
    public AuthErrorSteps check1;
    @Steps
    public AuthErrorSteps login1;



    @Before
    public void myTest() throws Exception {
        System.setProperty("webdriver.ie.driver", IEPath );
        System.setProperty("webdriver.chrome.driver", ChromePath);
        signUp.start_browser();
        driver.manage().window().maximize();


    }

    @After
    public void close() throws IOException {
        driver.close();
    }




    }



