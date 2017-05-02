package com.manoj.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manoj.config.TenantContext;
import com.manoj.domain.Order;
import com.manoj.domain.OrderRepository;

@Controller
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;

	@RequestMapping(path = "/orders/{tenantId}", method = RequestMethod.POST)
	public ResponseEntity<?> createSampleOrder(@PathVariable("tenantId") String tenantName) {
		TenantContext.setCurrentTenant(tenantName);

		Order newOrder = new Order(new Date());
		orderRepository.save(newOrder);

		return ResponseEntity.ok(newOrder);
	}
}
