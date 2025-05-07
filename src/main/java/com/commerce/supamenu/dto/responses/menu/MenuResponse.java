package com.commerce.supamenu.dto.responses.menu;

import com.commerce.supamenu.dto.responses.menu.item.MenuItemResponse;
import com.commerce.supamenu.dto.responses.restaurant.RestaurantSummaryResponse;

import java.util.Set;
import java.util.UUID;

public class MenuResponse {
    private UUID id;
    private RestaurantSummaryResponse restaurant;
    private Set<MenuItemResponse> items;
}
