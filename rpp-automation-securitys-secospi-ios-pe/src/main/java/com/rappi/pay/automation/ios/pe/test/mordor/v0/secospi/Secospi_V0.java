package com.rappi.pay.automation.ios.pe.test.mordor.v0.secospi;

import com.rappi.pay.automation.common.util.BaseTest;
import com.rappi.pay.automation.mordor.common.dto.SecospiDTO;
import com.rappi.pay.automation.mordor.common.test.provider.ProviderDTO;
import com.rappi.pay.automation.ios.pe.flow.mordor.v0.FlowSecospi_V0;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class Secospi_V0 extends BaseTest {


    @Test(dataProvider = "SecospiDTO", dataProviderClass = ProviderDTO.class)
    public void demoStepOne(SecospiDTO demoDTO) {

        log.info("Tu DTO SecospiDTO es el siguiente : " + demoDTO);
        FlowSecospi_V0 loginFlow = new  FlowSecospi_V0();
        loginFlow.stepOne(getDriver(), demoDTO);

    }


}
