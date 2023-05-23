package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(css = ".btn.logout")
    WebElement logOutTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-group']/label")
    WebElement VerifyText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositTab;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterAmount;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawalTab;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyDepositText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withdrawalButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement withdrawalText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='center']/strong[2]")
    WebElement balanceAmount;

    public int returnBalanceAmount() {
        log.info("return balance amount");
        String amountInString = getTextFromElement(balanceAmount);
        int amt;
        amt = Integer.parseInt(amountInString);
        return amt;
    }

    public void customerLogin() {
        log.info("Click on customer login");
        clickOnElement(customerLogin);
    }

    public void searchCustomerName() {
        // selectByVisibleTextFromDropDown(searchCustomer, "John Smith");
        log.info("search customer name from drop down");
        selectByIndexFromDropDown(searchCustomer, 2);
    }

    public void clickOnLoginButton() {
        log.info("Click on login button");
        clickOnElement(loginButton);
    }

    public String logoutText() {
        log.info("Get logout text");
        return getTextFromElement(logOutTab);
    }

    public void clickOnLogoutTab() {
        log.info("Click on logout tab");
        clickOnElement(logOutTab);
    }

    public String verifyText() {
        log.info("Verify text");
        return getTextFromElement(VerifyText);
    }

    public void clickOnDepositTab() {
        log.info("Click on deposit tab");
        clickOnElement(depositTab);
    }

    public void enterAmount(String amount) {
        log.info("Enter amount");
        sendTextToElement(enterAmount, amount);
    }

    public void clickOnDepositButton() {
        log.info("Click on deposit button");
        clickOnElement(depositButton);
    }

    public String verifyDepositText() {
        log.info("verify deposit text");
        return getTextFromElement(verifyDepositText);
    }

    public void clickOnWithdrawalTab() {
        log.info("Click on withdrawal tab");
        clickOnElement(withdrawalTab);
    }

    public void clickOnWithdrawalButton() {
        log.info("Click on withdrawal button");
        clickOnElement(withdrawalButton);
    }

    public String verifyWithdrawalText() {
        log.info("Verify withdrawal text");
        return getTextFromElement(withdrawalText);
    }
}
