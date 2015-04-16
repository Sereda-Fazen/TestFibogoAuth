package tests;


import jdk.nashorn.internal.ir.annotations.Ignore;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Application;


@Story(Application.TestAuth.Compare.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
public class TestAuth extends BeforeClass {
    @ManagedPages(defaultUrl = "http://fibogo.trustingdomains.com")
    public Pages pages;



    @WithTag("Sign Up")
    @Test
    public void TestAuth() throws InterruptedException {

        signUp.addClickAuth();
        email.addEmail();
        pass.addP();
        check.addCheck();
        login.addEn();
        Thread.sleep(3000);

    }
    @WithTag("Sign Up Error")
    @Test
    public void TwoTestAuth() throws InterruptedException {

        signUpError.addClickAuth();
        email.addEmail();
        passError.addPassError();
        check1.addCheck();
        login1.addError();


    }

}



