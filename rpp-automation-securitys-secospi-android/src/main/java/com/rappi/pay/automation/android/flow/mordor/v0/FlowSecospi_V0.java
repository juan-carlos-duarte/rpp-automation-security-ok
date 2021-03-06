package com.rappi.pay.automation.android.flow.mordor.v0;

import com.rappi.pay.automation.android.ui.mordor.v0.UISecospi_V0;
import com.rappi.pay.automation.mordor.common.dto.SecospiDTO;
import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlowSecospi_V0 {

    public boolean stepOne(AppiumDriver<?> driver, SecospiDTO demoDTO) {

        final UISecospi_V0 uiSecospi = new UISecospi_V0(driver);
        return true;
    }

}
