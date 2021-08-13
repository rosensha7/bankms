package com.nice.bankms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BankmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankmsApplication.class, args);
	}

}
