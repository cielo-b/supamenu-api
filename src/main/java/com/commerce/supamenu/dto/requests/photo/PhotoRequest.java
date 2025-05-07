package com.commerce.supamenu.dto.requests.photo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PhotoRequest {
    @NotBlank(message = "URL is required")
    private String url;

    @Size(max = 100, message = "Alt text cannot exceed 100 characters")
    private String altText;
}
