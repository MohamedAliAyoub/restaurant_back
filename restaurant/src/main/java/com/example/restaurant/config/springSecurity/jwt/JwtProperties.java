package com.example.restaurant.config.springSecurity.jwt;

public class JwtProperties {
    public static final String SECRET = "secret";
    public static final int EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
}