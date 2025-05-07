package com.commerce.supamenu.dto.requests.menu;

import com.commerce.supamenu.dto.requests.menu.item.MenuItemRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Set;
import java.util.UUID;

public class MenuRequest {
    @NotNull(message = "Restaurant ID is required")
    private UUID restaurantId;

    @Valid
    @NotEmpty(message = "Menu items cannot be empty")
    private Set<MenuItemRequest> items;
}
