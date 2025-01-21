package com.example.hiber_api.dto.auth;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"username, message, jwt", "status"})
public record AuthResponse(
    String username, 
    String message,
    String jwt,
    boolean status
    ) {

}
