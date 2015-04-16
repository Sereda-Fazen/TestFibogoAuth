package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;

public class AuthError extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    @FindBy(linkText = "Log in")
    private WebElement addClickAuth;

    @FindBy(id = "email")
    private WebElement addEmail;

    @FindBy(id = "pass")
    private WebElement addPass;

    @FindBy(name = "remember")
    private WebElement addCheck;

    @FindBy(name= "login")
    private WebElement addLogin;


    //false
    @FindBy(className = "error")
    private WebElement errorName;
    //true
    @FindBy(linkText = "Account")
    private WebElement trueName;


    public AuthError(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }


    public void setClick1() {
        clickOn(addClickAuth);
    }

    public void setEmailError() {
        enter("fazen.illusix@gmail.com").into(addEmail);
    }

    public void setPassError() {
        enter("123").into(addPass);
    }

    public void setCheck1() {
        clickOn(addCheck);
    }


    public void setLoginError() {
        clickOn(addLogin);
        assertFalse("Invalid username or password", element(errorName).isPresent());
    }




}
