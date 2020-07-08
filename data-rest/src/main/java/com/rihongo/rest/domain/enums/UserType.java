package com.rihongo.rest.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum UserType {
    PERSONAL("개인"), COMPANY("회사");

    @Getter
    private String value;
}
