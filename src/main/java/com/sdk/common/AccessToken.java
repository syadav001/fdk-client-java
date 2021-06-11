package com.sdk.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessToken {

    private String token;

    private Long expiresIn;

    private boolean isExpired;

    private String refreshToken;

}
