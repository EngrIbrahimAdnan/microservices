package com.example.demo.controller;

import com.example.demo.bo.AccountResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class AccountController {
    private final RestTemplate restTemplate;

    private static final String STOCK_API = "http://localhost:8080/api/getStock";

    public AccountController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/account")
    public AccountResponse getAccount() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<AccountResponse> responseEntity = restTemplate.getForEntity(STOCK_API, AccountResponse.class);
        AccountResponse allStock = responseEntity.getBody();

        return allStock;
    }
}
