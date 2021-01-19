package com.rappi.pay.automation.ios.ui.mordor.v0;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class UISecospi_V0 {

    //Selectors goes here 
    @iOSXCUITFindBy(id = "Some iOS selector")
    private MobileElement someSelector;

    public UISecospi_V0(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
}
