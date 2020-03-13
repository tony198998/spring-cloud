package com.wode.controller;

import com.wode.entity.Order;
import com.wode.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/order/{orderId}")
    public Order queryOrderById(@PathVariable("orderId") String orderId) {
        log.info("8082--order"+orderId);
        return this.orderService.queryOrderById(orderId);
    }
}
