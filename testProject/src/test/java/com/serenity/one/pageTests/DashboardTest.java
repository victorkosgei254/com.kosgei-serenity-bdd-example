package com.serenity.one.pageTests;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.one.pageSteps.DashboardSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class DashboardTest {

    @Steps
    DashboardSteps dashboardSteps;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Test
    public void userLogin() {
        dashboardSteps.isOnLoginPage();
        dashboardSteps.userEntersUsername();
        dashboardSteps.userEntersPassword();
        dashboardSteps.userClicksLogin();
        dashboardSteps.userShouldBeLoggedIn();

    }

}
