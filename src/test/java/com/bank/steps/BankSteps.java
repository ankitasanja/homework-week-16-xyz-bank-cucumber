package com.bank.steps;

import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class BankSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on bank manager login tab$")
    public void iClickOnBankManagerLoginTab() {
        new BankManagerLoginPage().clickOnBankManagerLogin();
    }

    @And("^I click on add customer tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^I enter below details in customer page$")
    public void iEnterBelowDetailsInCustomerPage(DataTable dataTable) {
        List<List<String>> details = dataTable.asLists(String.class);

        for (List<String> e : details) {
            String fName = e.get(0);
            new BankManagerLoginPage().enterFirstName(fName);
            String lName = e.get(1);
            new BankManagerLoginPage().enterLastName(lName);
            String postCode = e.get(2);
            new BankManagerLoginPage().enterPostcode(postCode);
        }

    }

    @Then("^I click on add customer button$")
    public void iClickOnAddCustomerButton() {
        new BankManagerLoginPage().clickOnAddCustomerButton();
    }

    @And("^Popup displayed$")
    public void popupDisplayed() {
    }

    @Then("^I can verify message \"([^\"]*)\"$")
    public void iCanVerifyMessage(String arg0) {
        Assert.assertEquals(new BankManagerLoginPage().getTextFromAlert(),"Customer added successfully with customer id :6","Error message");
    }

    @And("^I click on ok button on pop up$")
    public void iClickOnOkButtonOnPopUp() {
        new OpenAccountPage().acceptAlert();
    }

    @And("^I click on open account button$")
    public void iClickOnOpenAccountButton() {
        new OpenAccountPage().clickOnOpenAccountTab();
    }

    @And("^I search customer that created in first test$")
    public void iSearchCustomerThatCreatedInFirstTest() throws InterruptedException {
        Thread.sleep(2000);
        new OpenAccountPage().searchCustomer();
    }

    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        new OpenAccountPage().searchCurrency();
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @And("^I am able to verify message \"([^\"]*)\"$")
    public void iAmAbleToVerifyMessage(String arg0) {
        Assert.assertEquals(new BankManagerLoginPage().getTextFromAlert(),"Account created successfully with account Number :1016","Error message");
    }

    @When("^I click on customer login tab$")
    public void iClickOnCustomerLoginTab() {
        new CustomerLoginPage().customerLogin();
    }

    @And("^I search customer that you created$")
    public void iSearchCustomerThatYouCreated() throws InterruptedException {
        Thread.sleep(2000);
        new CustomerLoginPage().searchCustomerName();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @And("^I can verify \"([^\"]*)\" tab displayed$")
    public void iCanVerifyTabDisplayed(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new CustomerLoginPage().logoutText(),"Logout","Error message");
    }

    @And("^I click on logout$")
    public void iClickOnLogout() {
        new CustomerLoginPage().clickOnLogoutTab();
    }

    @Then("^I am able to verify text \"([^\"]*)\" displayed$")
    public void iAmAbleToVerifyTextDisplayed(String arg0) {
        Assert.assertEquals(new CustomerLoginPage().verifyText(),"Your Name :","Error message");
    }

    @And("^I click on deposit tab$")
    public void iClickOnDepositTab() {
        new CustomerLoginPage().clickOnDepositTab();
    }

    @And("^I enter amount (\\d+)$")
    public void iEnterAmount(int arg0) {
        new CustomerLoginPage().enterAmount("100");
    }

    @And("^I click on deposit button$")
    public void iClickOnDepositButton() throws InterruptedException {
        Thread.sleep(2000);
        new CustomerLoginPage().clickOnDepositButton();
    }

    @Then("^I should be able to verify message \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyMessage(String arg0) {
       Assert.assertEquals(new CustomerLoginPage().verifyDepositText(),"Deposit Successful","Error message");
    }

    @And("^I click on withdrawal tab$")
    public void iClickOnWithdrawalTab() throws InterruptedException {
        Thread.sleep(2000);
        new CustomerLoginPage().clickOnWithdrawalTab();
    }

    @And("^I enter amount (\\d+) in customer login page$")
    public void iEnterAmountInCustomerLoginPage(int arg0) throws InterruptedException {
        Thread.sleep(2000);
        new CustomerLoginPage().enterAmount("50");
    }

    @And("^I click on withdraw button$")
    public void iClickOnWithdrawButton() throws InterruptedException {
        Thread.sleep(2000);
        new CustomerLoginPage().clickOnWithdrawalButton();
    }

    @Then("^I am able to verify message \"([^\"]*)\" on customer login page$")
    public void iAmAbleToVerifyMessageOnCustomerLoginPage(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new CustomerLoginPage().verifyWithdrawalText(),"Transaction successful","Error message");
    }
}
