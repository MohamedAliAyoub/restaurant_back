package com.example.restaurant.util;

import java.util.UUID;

public class UserCode {
    public String getCode() {
        return UUID.randomUUID().toString();
    }
}