package com.example.spring_fundamentals;

import com.example.spring_fundamentals.entity.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//Spring Framwork vs Spring Boot
//Spring Boot => Annonatation Based Configuration. Spring Framwork => XML Based Configuration
//Auto Configurable
//Spring Boot great Standolone api future
//Dependency Management


//Spring Magic
//Spring Bean => instance of a class which managed by Spring IoC container


@SpringBootApplication
public class SpringFundamentalsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringFundamentalsApplication.class, args);


	}

	@Bean
	public String getCity(){
		return "İstanbul";
	}
}


