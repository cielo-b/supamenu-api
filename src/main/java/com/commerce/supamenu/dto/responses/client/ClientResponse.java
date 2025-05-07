package com.commerce.supamenu.dto.responses.client;

import com.commerce.supamenu.dto.responses.restaurant.RestaurantSummaryResponse;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class ClientResponse {
    private UUID id;
    private String clientName;
    private String representative;
    private String bankAccount;
    private Set<RestaurantSummaryResponse> restaurants;
}
