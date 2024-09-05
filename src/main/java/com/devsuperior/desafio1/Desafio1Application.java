package com.devsuperior.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;
//import com.devsuperior.desafio1.services.ShippingService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	public OrderService orderService;

	public Order order1 = new Order(1034,150.0,20.0);
	public Order order2 = new Order(2282,800.0,10.0);
	public Order order3 = new Order(1309,95.90,0.0);

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Pedido código: " + order1.getCode() + "   Valor total: " + orderService.total(order1));
		System.out.println("Pedido código: " + order2.getCode() + "   Valor total: " + orderService.total(order2));
		System.out.println("Pedido código: " + order3.getCode() + "   Valor total: " + orderService.total(order3));
		
	}	

}
