package com.commerce.supamenu.dto.responses.auth;

import com.commerce.supamenu.dto.responses.user.UserSummaryResponse;

public class AuthResponse {
    private String accessToken;
    private String refreshToken;
    private Long expiresIn;
    private UserSummaryResponse user;
}