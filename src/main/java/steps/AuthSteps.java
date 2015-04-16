package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Auth;


public class AuthSteps extends ScenarioSteps {
    Auth authPage;

    public AuthSteps(Pages pages) {
        super(pages);
    }

    @Step("Launch your web browser - 'Chrome'")
    public void start_browser() {
        Auth loginPage = getPages().get(Auth.class);
        loginPage.open();
    }

    @Step("Clicked 'Log in'")
    public void addClickAuth() {
        authPage.setClick();
    }

    @Step("Enter data 'Email'")
    public void addEmail() {
        authPage.setEmail();
    }

    @Step("Enter data 'Password'")
    public void addP() {
        authPage.setPass();
    }

    @Step("Clicked 'CheckBox'")
    public void addCheck() {
        authPage.setCheck();
    }

    @Step("Pushed 'Login'")
    public void addEn() {
        authPage.setLogin();
    }



}


