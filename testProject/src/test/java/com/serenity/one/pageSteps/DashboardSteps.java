package com.serenity.one.pageSteps;

import org.junit.jupiter.api.Assertions;

import com.serenity.one.pages.Dashboard;

import net.thucydides.core.annotations.Step;

public class DashboardSteps {

    private Dashboard dashboardPage;

    @Step
    public void isOnLoginPage() {
        dashboardPage.open();
    }

    @Step
    public void userEntersUsername() {
        dashboardPage.enterUsername();
    }

    @Step
    public void userEntersPassword() {
        dashboardPage.enterPassword();
    }

    @Step
    public void userClicksLogin() {
        dashboardPage.doLogin();
    }

    @Step
    public void userShouldBeLoggedIn() {
        Assertions.assertTrue(dashboardPage.hasLoggedIn().equals("Dashboard"));
    }
}
