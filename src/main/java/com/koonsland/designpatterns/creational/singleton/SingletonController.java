package com.koonsland.designpatterns.creational.singleton;

import com.koonsland.designpatterns.creational.singleton.dto.OrderDto;
import com.koonsland.designpatterns.creational.singleton.example.BillPughSingleton;
import com.koonsland.designpatterns.creational.singleton.example.DoubleCheckedLockingSingleton;
import com.koonsland.designpatterns.creational.singleton.example.EagerSingleton;
import com.koonsland.designpatterns.creational.singleton.example.LazySingleton;
import com.koonsland.designpatterns.creational.singleton.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/creational/singleton")
public class SingletonController {
    private final OrderService orderService;

    public SingletonController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/eager")
    public String getSingleton() {
        EagerSingleton instance = EagerSingleton.getInstance();
        return "Singleton Instance: " + instance.toString();
    }

    @GetMapping("/double-checked-locking")
    public String getDoubleCheckedLocking() {
        DoubleCheckedLockingSingleton instance = DoubleCheckedLockingSingleton.getInstance();
        return "Double Checked Locking Intance: " + instance.toString();
    }

    @GetMapping("/lazy")
    public String getLazy() {
        LazySingleton instance = LazySingleton.getInstance();
        return "Lazy Instance: " + instance.toString();
    }

    @GetMapping("/bill-pugh")
    public String getBillPugh() {
        BillPughSingleton instance = BillPughSingleton.getInstance();
        return "Bill Pugh Instance: " + instance.toString();
    }

    @GetMapping("/orders")
    public List<OrderDto> getOrders() {
        return orderService.getOrders()
                .stream()
                .map(OrderDto::new)
                .toList();
    }

    @PostMapping("/orders")
    public void placeOrder(@RequestBody OrderDto orderDto) {
        orderService.placeOrder(orderDto.getName());
    }
}
