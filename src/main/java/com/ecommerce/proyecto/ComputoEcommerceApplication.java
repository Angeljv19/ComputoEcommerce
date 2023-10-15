package com.ecommerce.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ComputoEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputoEcommerceApplication.class, args);
	}

}
