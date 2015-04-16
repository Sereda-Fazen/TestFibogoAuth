package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.AuthError;


public class AuthErrorSteps extends ScenarioSteps {
    AuthError authErrorPage;

    public AuthErrorSteps(Pages pages) {
        super(pages);
    }

    @Step("Launch your web browser - 'Chrome'")
    public void start_browser() {
        AuthError loginPage = getPages().get(AuthError.class);
        loginPage.open();
    }

    @Step("Clicked 'Log in'")
    public void addClickAuth() {
        authErrorPage.setClick1();
    }

    @Step("Enter data 'Email'")
    public void addEmail() {
        authErrorPage.setEmailError();
    }

    @Step("Enter data 'Password'")
    public void addPassError() {
        authErrorPage.setPassError();
    }

    @Step("Clicked checkBox")
    public void addCheck() {
        authErrorPage.setCheck1();
    }


    @Step("Pushed 'Login'")
    public void addError() {
        authErrorPage.setLoginError();
    }


}


