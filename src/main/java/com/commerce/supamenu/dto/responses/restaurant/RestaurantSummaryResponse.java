package com.commerce.supamenu.dto.responses.restaurant;

import com.commerce.supamenu.enums.ERestaurantCategory;

import java.util.UUID;

public class RestaurantSummaryResponse {
    private UUID id;
    private String restoName;
    private ERestaurantCategory category;
}
