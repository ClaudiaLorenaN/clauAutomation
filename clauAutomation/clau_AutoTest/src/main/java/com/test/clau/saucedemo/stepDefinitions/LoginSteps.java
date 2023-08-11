/*package com.test.clau.saucedemo.stepDefinitions;

import com.test.clau.saucedemo.pageObject.LoginPage;
import com.test.clau.common.cucumber.TestContext;
import com.test.clau.common.manager.ReaderManager;
import com.test.clau.dataTypes.TestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    TestContext testContext;
    LoginPage loginPage;
    TestData testData;

    public LoginSteps(TestContext testContext) {
        this.testContext = testContext;
        loginPage = testContext.getPageManager().getLoginPage();
    }

    @Given("I am the main page")
    public void i_am_the_main_page() {
    }

    @When("I am in the login page")
    public void i_am_in_the_login_page() {
        loginPage.goToURL();
    }


    @And("Type my user and my pass for test {string}")
    public void type_my_user_and_my_pass_for_test(String testID) {
        testData = ReaderManager.getInstance().getJsonReader().getDataTestById(testID);
        loginPage.fill_Login(testData);
        loginPage.clickOnLogin();
    }

    @Then("The main page should be open")
    public void the_main_page_should_be_open() {
        Assert.assertEquals(testData.loginAssert,loginPage.getMessage());
    }

    @And("Type the user user and the pass password for test {string}")
    public void type_the_user_and_the_pass(String idTest) {
        ReaderManager.getInstance().getJsonReader().PathFile("\"TestData.json\"");
        testData = ReaderManager.getInstance().getJsonReader().getDataTestById(idTest);
        loginPage.fill_Login(testData);
        loginPage.clickOnLogin();

    }

    @Then("The system should show an error")
    public void the_system_should_show_the_error() {
        Assert.assertEquals(testData.loginAssert,loginPage.getErrorMessage());
    }

    @And("Type my password password for test {string}")
    public void type_my_password(String testId) {
        testData = ReaderManager.getInstance().getJsonReader().getDataTestById(testId);
        loginPage.fill_Login(testData);
    }

    @Then("The system should masked it")
    public void the_system_should_masked_it() {
        Assert.assertTrue(loginPage.getAttribute());
    }

    @And("Click on Sign out")
    public void click_on_sign_out() {
        loginPage.clickOnSingOutLink();
    }
    @And("Click on back button")
    public void click_on_back_button() {
        testContext.getDriverManager().navigateBack();
    }
    @Then("should redirect to login page")
    public void should_redirect_to_login_page() {
        Assert.assertNotNull(loginPage.getLoginForm());
    }
}
*/

package com.test.clau.saucedemo.stepDefinitions;

import com.test.clau.saucedemo.pageObject.LoginPage;
import com.test.clau.common.cucumber.TestContext;
import com.test.clau.common.manager.ReaderManager;
import com.test.clau.dataTypes.TestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    TestContext testContext;
    LoginPage loginPage;
    TestData testData;

    public MyStepdefs(TestContext testContext) {
        this.testContext = testContext;
        loginPage = testContext.getPageManager().getLoginPage();
    }

    @io.cucumber.java.en.Given("^I am the main page$")
    public void iAmTheMainPage() {
    }

    @io.cucumber.java.en.When("^I am in the login page$")
    public void iAmInTheLoginPage() {
        loginPage.goToURL();
    }

    @io.cucumber.java.en.And("^Type my user and my pass for test \"([^\"]*)\"$")
    public void typeMyUserAndMyPassForTest(String testID) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        testData = ReaderManager.getInstance().getJsonReader().getDataTestById(testID);
        loginPage.fill_Login(testData);
        loginPage.clickOnLogin();
        throw new cucumber.api.PendingException();
    }

    @io.cucumber.java.en.Then("^The main page should be open$")
    public void theMainPageShouldBeOpen() {
        Assert.assertEquals(testData.loginAssert,loginPage.getMessage());
    }

    @io.cucumber.java.en.And("^Type the user user and the pass password for test \"([^\"]*)\"$")
    public void typeTheUserUserAndThePassPasswordForTest(String idTes) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ReaderManager.getInstance().getJsonReader().PathFile("\"TestData.json\"");
        testData = ReaderManager.getInstance().getJsonReader().getDataTestById(idTest);
        loginPage.fill_Login(testData);
        loginPage.clickOnLogin();
        throw new cucumber.api.PendingException();
    }

    @io.cucumber.java.en.Then("^The system should show an error$")
    public void theSystemShouldShowAnError() {
        Assert.assertEquals(testData.loginAssert,loginPage.getErrorMessage());
    }

    @io.cucumber.java.en.And("^Type my password password for test \"([^\"]*)\"$")
    public void typeMyPasswordPasswordForTest(String testId) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        testData = ReaderManager.getInstance().getJsonReader().getDataTestById(testId);
        loginPage.fill_Login(testData);
        throw new cucumber.api.PendingException();
    }

    @io.cucumber.java.en.Then("^The system should masked it$")
    public void theSystemShouldMaskedIt() {
        Assert.assertTrue(loginPage.getAttribute());
    }

    @io.cucumber.java.en.And("^Type my password password for test \"([^\"]*)\"$")
    public void typeMyPasswordPasswordForTest(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @io.cucumber.java.en.And("^Click on Sign out$")
    public void clickOnSignOut() {
        loginPage.clickOnSingOutLink();
    }

    @io.cucumber.java.en.And("^Click on back button$")
    public void clickOnBackButton() {
        testContext.getDriverManager().navigateBack();
    }

    @io.cucumber.java.en.Then("^should redirect to login page$")
    public void shouldRedirectToLoginPage() {
        Assert.assertNotNull(loginPage.getLoginForm());
    }
}
