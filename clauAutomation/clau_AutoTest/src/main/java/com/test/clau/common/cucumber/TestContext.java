package com.test.clau.common.cucumber;

import com.test.clau.common.manager.DriverManager;
import com.test.clau.common.manager.PageManager;

public class TestContext {
    private DriverManager driverManager;
    private PageManager pageManager;

    public TestContext(){
        driverManager = new DriverManager();
        pageManager = new PageManager(driverManager.getDriver());
    }

    public DriverManager getDriverManager() {
        return driverManager;
    }

    public PageManager getPageManager() {
        return pageManager;
    }
}
