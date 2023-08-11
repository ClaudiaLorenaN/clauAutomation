package com.test.clau.saucedemo.pageObject;

import com.test.clau.common.manager.ReaderManager;
import com.test.clau.dataTypes.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class
LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    // Login Elements
    @FindBy(how = How.CSS,using = "form[method='post']")
    private WebElement loginForm;

    @FindBy(how = How.ID, using = "LoginModel_Email")
    private WebElement usernameField;

    @FindBy(how = How.ID, using = "LoginModel_Password")
    private WebElement passwordField;

    @FindBy(how = How.CSS, using = "input.primary-button")
    private WebElement loginButton;

    @FindBy(how = How.ID, using = "LoginModel_RememberMe")
    private WebElement rememberCheckbox;

    @FindBy(how = How.CLASS_NAME,using = "action-link")
    private WebElement lossPasswordLink;

    @FindBy(how = How.CSS, using = "a[data-qtip='Logout']")
    private WebElement signOutlink;

    // message
    @FindBy(how = How.CSS, using = ".woocommerce-error li")
    private WebElement errorMessage;

    @FindBy(how = How.ID, using = "netlabel-1024-textEl")
    private WebElement myAccauntMessage;

    public void EnterUser(String userName) {
        usernameField.sendKeys(userName);
    }

    public void EnterPassword(String userPassword) {
        passwordField.sendKeys(userPassword);
    }


    /**
     * Get the response in case the system shows an error en the login o Register process
     * @return = return a message the system shows
     */
    public String getErrorMessage(){
        return errorMessage.getText();
    }

    public void goToURL(){
        driver.get(ReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public void clickOnLogin() {
        loginButton.click();
    }

    public void clickOnSingOutLink(){
        signOutlink.click();
    }

    public boolean getAttribute(){
        return passwordField.getAttribute("type").equals("password");
    }

    public String getMessage() {
        return myAccauntMessage.getText();
    }

    public void fill_Login(TestData testData){
        EnterUser(testData.userName);
        EnterPassword(testData.password);
    }

    public Object getLoginForm() {
        return loginForm;
    }
}
