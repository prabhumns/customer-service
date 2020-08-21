package com.prabhu.customerservice;

import com.prabhu.customerservice.entity.Customer;
import com.prabhu.customerservice.repos.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class CustomerServiceApplication implements CommandLineRunner {

	private CustomerRepo customerDao;

	public CustomerServiceApplication(CustomerRepo customerDao) {
		super();
		this.customerDao = customerDao;
	}


	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	public ModelMapper getMapper(){
		ModelMapper mapper = new ModelMapper();
		//Hellomama

		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper;
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
