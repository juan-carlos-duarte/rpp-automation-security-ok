package com.rappi.pay.automation.mordor.common.test.provider;

import com.rappi.pay.automation.mordor.common.dto.SecospiDTO;
import com.rappi.pay.automation.common.util.JsonUtil;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class ProviderDTO {

    @DataProvider(name = "SecospiDTO")
    public static Object[][] secospiDTO(final ITestContext testContext) throws IOException {
        return new Object[][]{ { JsonUtil.jsonToObject(testContext, SecospiDTO.class) } };
    }


}
