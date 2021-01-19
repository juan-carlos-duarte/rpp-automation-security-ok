package com.rappi.pay.automation.android.ui.mordor.v0;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class UISecospi_V0 {

    //Selectors
    @AndroidFindBy(id = "Some selecteor")
    public static MobileElement text_addAddress;

    public UISecospi_V0(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
}

