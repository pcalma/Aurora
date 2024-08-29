package com.moncho.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//dejar si no ahi BD 
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Aurora1Application {

	public static void main(String[] args) {
		SpringApplication.run(Aurora1Application.class, args);
	}

}
