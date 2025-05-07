package com.commerce.supamenu.dto.responses.user;

import com.commerce.supamenu.dto.responses.order.OrderSummaryResponse;
import com.commerce.supamenu.dto.responses.role.RoleResponse;

import java.util.List;
import java.util.UUID;

public class UserResponse {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private RoleResponse role;
    private List<OrderSummaryResponse> orders;
}
