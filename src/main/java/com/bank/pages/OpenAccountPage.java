package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountTab;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrency;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;

    public void clickOnOpenAccountTab(){
        log.info("Click on open account tab");
        clickOnElement(openAccountTab);
    }

    public void clickOnProcessButton(){
        log.info("Click on process button");
        clickOnElement(processButton);
    }

    public void searchCustomer(){
        //selectByVisibleTextFromDropDown(searchCustomer, "Harry");
        log.info("Search customer");
        selectByIndexFromDropDown(searchCustomer, 2);
    }
    public void searchCurrency(){
        log.info("Search currency");
        selectByContainsTextFromDropDown(By.xpath("//select[@id='currency']"), "Pound");

    }
}
