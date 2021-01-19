package com.rappi.pay.automation.mordor.common.dto;

import com.rappi.pay.automation.annotations.FieldDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class SecospiDTO implements Serializable {

    @FieldDTO(defaultValue = "mensaje de prueba")
    private String text;

    @FieldDTO(defaultValueArray = {"element1", "element2"})
    private List<String> contacts;
}

