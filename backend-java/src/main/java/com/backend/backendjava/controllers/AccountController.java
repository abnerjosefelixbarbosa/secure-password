package com.backend.backendjava.controllers;

import com.backend.backendjava.dtos.requests.AccountRequest;
import com.backend.backendjava.services.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService service;

    @PostMapping("/validate-password")
    public ResponseEntity<Void> validatePassword(@RequestBody @Valid AccountRequest request) {
        service.validateAccount(request);
        return ResponseEntity.status(204).body(null);
    }
}
