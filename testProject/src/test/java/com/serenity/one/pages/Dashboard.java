package com.serenity.one.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class Dashboard extends PageObject {
    public void enterUsername() {
        $("#txtUsername").sendKeys("Admin");
    }

    public void enterPassword() {
        $("#txtPassword").sendKeys("admin123");
    }

    public void doLogin() {
        $("#btnLogin").click();
    }

    public String hasLoggedIn() {
        String heading = $("div.head h1").getText();
        return heading;
    }
}
