package com.teamMakeApp.order;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/order/{orderId}")
    public String getOrder(@PathVariable String orderId) {
        return orderService.getOrder(orderId);
    }
}



