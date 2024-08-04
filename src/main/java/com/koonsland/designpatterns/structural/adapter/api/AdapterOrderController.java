package com.koonsland.designpatterns.structural.adapter.api;

import com.koonsland.designpatterns.structural.adapter.after.Coffee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/structural/adapters")
public class AdapterOrderController {

    private final AdapterOrderService adapterOrderService;

    public AdapterOrderController(AdapterOrderService adapterOrderService) {
        this.adapterOrderService = adapterOrderService;
    }

    @PostMapping("orders")
    public ResponseEntity<String> orderCoffee(@RequestBody AdapterOrderRequest adapterOrderRequest) {
        Coffee coffee = adapterOrderService.orderCoffee(adapterOrderRequest.type(), adapterOrderRequest.temperature());

        return ResponseEntity.ok(coffee.toString());
    }
}
