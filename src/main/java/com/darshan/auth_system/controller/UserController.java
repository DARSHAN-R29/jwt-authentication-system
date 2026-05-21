package com.darshan.auth_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user/profile")
    public String userProfile() {
        return "Welcome to User Profile!";
    }

    @GetMapping("/api/admin/dashboard")
    public String adminDashboard() {
        return "Welcome to Admin Dashboard!";
    }
}