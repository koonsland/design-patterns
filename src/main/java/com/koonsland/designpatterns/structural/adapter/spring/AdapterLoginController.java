package com.koonsland.designpatterns.structural.adapter.spring;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/structural/adapters")
public class AdapterLoginController {

    private final AdapterLoginService adapterLoginService;

    public AdapterLoginController(AdapterLoginService adapterLoginService) {
        this.adapterLoginService = adapterLoginService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AdapterLoginRequest request) {
        String login = adapterLoginService.login(request.email(), request.password());
        return ResponseEntity.ok(login);
    }
}
