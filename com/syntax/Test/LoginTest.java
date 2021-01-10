package com.syntax.Test;

import com.syntax.TestBase.BaseClass;
import com.syntax.pages.LoginPage;

public class LoginTest {


    public static void main(String[] args) throws InterruptedException {
        BaseClass.setUp();
        LoginPage loginPage = new LoginPage();
        loginPage.usernameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();
        Thread.sleep(2000);

        BaseClass.tearDown();
    }
}
