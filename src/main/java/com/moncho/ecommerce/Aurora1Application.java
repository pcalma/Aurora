package com.moncho.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//dejar si no ahi BD 
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class Aurora1Application {

	public static void main(String[] args) {
		SpringApplication.run(Aurora1Application.class, args);
	}

}
