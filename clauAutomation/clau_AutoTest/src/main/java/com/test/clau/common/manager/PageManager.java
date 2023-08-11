package com.test.clau.common.manager;

import com.test.clau.saucedemo.pageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageManager {
    private WebDriver driver;
    private LoginPage loginPage;


    public PageManager(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

}

