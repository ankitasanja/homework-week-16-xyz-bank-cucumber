package com.bank;

import com.bank.propertyreader.PropertyReader;
import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility {

    @Before
    public void steUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
            String screeShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screeShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }


}
