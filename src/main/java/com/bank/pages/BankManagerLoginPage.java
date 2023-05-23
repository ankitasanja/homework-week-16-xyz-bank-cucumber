package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginTab;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postcodeField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;

    public void clickOnBankManagerLogin() {
        log.info("Click on bank manager login");
        clickOnElement(bankManagerLoginTab);
    }

    public void clickOnAddCustomerTab() {
        log.info("Click on add customer tab");
        clickOnElement(addCustomerTab);
    }

    public void enterFirstName(String fName) {
        log.info("Enter first name  " + fName + " to firstName  field " + firstNameField.toString());
        sendTextToElement(firstNameField, fName);
    }

    public void enterLastName(String lName) {
        log.info("Enter last name  " + lName + " to lastName  field " + lastNameField.toString());
        sendTextToElement(lastNameField, lName);
    }

    public void enterPostcode(String postcode) {
        log.info("Enter post code  " + postcode + " to postcode  field " + postcodeField.toString());
        sendTextToElement(postcodeField, postcode);
    }

    public void clickOnAddCustomerButton() {
        log.info("Click on add customer tab");
        clickOnElement(addCustomerButton);
    }

    public void clickOnAlertMessage(){
        log.info("Click on alert message");
        acceptAlert();
    }



}
